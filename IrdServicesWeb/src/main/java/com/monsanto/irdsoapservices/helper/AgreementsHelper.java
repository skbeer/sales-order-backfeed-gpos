package com.monsanto.irdsoapservices.helper;

import com.monsanto.irdsoapservices.agreements.schema.*;
import com.monsanto.irdsoapservices.dao.AgreementsDao;
import com.monsanto.irdsoapservices.dao.IrdDao;
import com.monsanto.irdsoapservices.service.AccountAgreementsFault;
import com.monsanto.irdsoapservices.to.AgreementHierarchyInfo;
import com.monsanto.irdsoapservices.to.AgreementInfo;
import com.monsanto.irdsoapservices.utils.StringUtils;
import com.monsanto.irdsoapservices.utils.XmlDateTimeUtil;
import com.monsanto.isdcommon.header.schema.PartnerIdentifierType;
import com.monsanto.isdcommon.header.schema.PartnerTypeAttribute;
import org.apache.log4j.Logger;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

/**
 * Created by IntelliJ IDEA.
 * User: mkuchip
 * Date: Mar 30, 2009
 * Time: 4:07:46 PM
 * To change this template use File | Settings | File Templates.
 */
public class AgreementsHelper extends AbstractHelper {
    private AgreementsDao agreementsDao;
    private IrdDao irdDao;
    Logger logger = Logger.getLogger(this.getClass());

    public GetAgreementsResponseType getAgreements(GetAgreementsRequestType request) throws AccountAgreementsFault {
        GetAgreementsResponseType response = new GetAgreementsResponseType();
        try {
            logger.debug("Validating getAgreementsRequest");
            validateGetAgreementsRequest(request);
            GetAgreementsResponseBodyType responseBody = new GetAgreementsResponseBodyType();
            GetAgreementsRequestBodyType requestBody = request.getGetAgreementsRequestBody();

            List<AgreementInfo> agreements = null;
            AccountTypeAttribute resultAcctType;
            if(request.getGetAgreementsRequestBody().getAccountIdentifier() != null) {
                logger.info("Retreiving Agreements by Account Id");
                resultAcctType = requestBody.getAccountIdentifier().getType();
                agreements = agreementsDao.getAgreementsByAccountId(getAcctIdFromAliasId(requestBody.getAccountIdentifier()), requestBody.getAgreementCode(), resultAcctType.toString());
            } else {
                logger.info("Retreiving Agreements by Signer Account Id");
                resultAcctType = requestBody.getSignerAccountIdentifier().getType();
                agreements = agreementsDao.getAgreementsBySignerAccountId(getAcctIdFromAliasId(requestBody.getSignerAccountIdentifier()), requestBody.getAgreementCode(), resultAcctType.toString());
            }
            for(AgreementInfo agreementInfo : agreements) {
                responseBody.getAgreementInformation().add(agreementInfo.extractAgreementInfoType(resultAcctType));
            }
            response.setGetAgreementsResponseBody(responseBody);
            response.setHeader(getResponseHeader(request.getHeader()));
            logger.info("Found "+agreements.size()+" Agreements. Sending back to the client.");
        } catch (Exception e) {
            handleException(e, "getAgreements");
        }
        logger.debug("End: getAgreements()");
        return response;
    }

    public UpdateAgreementResponseType updateAgreement(UpdateAgreementRequestType request) throws AccountAgreementsFault {
        UpdateAgreementResponseType response = new UpdateAgreementResponseType();
        try {
            AgreementInfo agreementInfo = getValidatedAgreementInfo(request);
            logger.info("Got request for UpdateAgreement (ID_TYPE, ID_VALUE, AGR_CODE): ("+agreementInfo.getIdentifierType()+", "+agreementInfo.getIdentifierValue()+", "+agreementInfo.getAgreementCode()+")");
            PartnerIdentifierType requestingPartner = request.getHeader().getFrom().getPartnerIdentifier();
            response.setHeader(getResponseHeader(request.getHeader()));
            if(agreementInfo.getIdentifierType().equals(AccountTypeAttribute.ACCTID.toString())) {
                agreementInfo.setAccountId(Long.parseLong(agreementInfo.getIdentifierValue()));
            } else {
                agreementInfo.setAccountId(irdDao.getAccountIdByAlias(agreementInfo.getIdentifierType(), agreementInfo.getIdentifierValue()));
                if(agreementInfo.getAccountId()<= 0) {
                    throw new Exception("Unable to find matching ACCT_ID for Account Identifier Type="+agreementInfo.getIdentifierType()+" Id="+agreementInfo.getIdentifierValue());
                }
                logger.info("Initiating UpdateAgreement for (ACCT_ID, AGR_CODE, END_DATE): ("+agreementInfo.getAccountId()+", "+agreementInfo.getAgreementCode()+", "+agreementInfo.getEndDate()+")");
            }
            if((requestingPartner != null) && (PartnerTypeAttribute.USER_ID.equals(requestingPartner.getType())) && !StringUtils.isNullOrEmpty(requestingPartner.getValue())) {
                agreementInfo.setRowUserId(requestingPartner.getValue());
            }
            agreementsDao.updateAgreement(agreementInfo);
            response.setUpdateAgreementResponseBody(getUpdateAgreementResponseBody());
        } catch (Exception e) {
            handleException(e, "updateAgreement");
        }
        logger.debug("End: updateAgreement()");
        return response;
    }

    public GetAgreementHierarchyResponseType getAgreementHierarchy(GetAgreementHierarchyRequestType request) throws AccountAgreementsFault {
        GetAgreementHierarchyResponseType response = new GetAgreementHierarchyResponseType();
        try {
            validateGetAgreementHierarchyRequest(request);
            GetAgreementHierarchyResponseBodyType responseBody = new GetAgreementHierarchyResponseBodyType();
            long accountId = request.getGetAgreementHierarchyRequestBody().getAccountId();
            String licensedBy = request.getGetAgreementHierarchyRequestBody().getAgreementLicensedBy().toString();
            logger.info("Retrieving Agreement Hierarchy for AccountId: "+accountId);
            List<AgreementHierarchyInfo> agrHierarchyInfo = agreementsDao.getAgreementHierarchy(accountId, licensedBy);
            logger.info("Found "+agrHierarchyInfo.size()+" Genetics/Trait Agreements for AccountId: "+accountId);
            responseBody.getAgreementCategory().addAll(extractAgreementCategories(agrHierarchyInfo));
            response.setHeader(getResponseHeader(request.getHeader()));
            response.setGetAgreementHierarchyResponseBody(responseBody);
        } catch (Exception e) {
            handleException(e, "getAgreementHierarchy");
        }
        logger.debug("End: getAgreementHierarchy()");
        return response;
    }

    private List<AgreementCategoryType> extractAgreementCategories(List<AgreementHierarchyInfo> agreements) throws Exception {
        List<AgreementCategoryType> agreementCategoryList = new ArrayList<AgreementCategoryType>();
        if(agreements.size() > 0) {
            AgreementCategoryType traitAgreementCategory = new AgreementCategoryType();
            traitAgreementCategory.setCategoryName(AgreementCategoryNameType.MONSANTO_TRAIT_AGREEMENT);
            AgreementCategoryType geneticsAgreementCategory = new AgreementCategoryType();
            geneticsAgreementCategory.setCategoryName(AgreementCategoryNameType.COMMERCIAL_AGREEMENT);

            List<AgreementHierarchyInfo> traitAgreements = new ArrayList<AgreementHierarchyInfo>();
            List<AgreementHierarchyInfo> geneticAgreements = new ArrayList<AgreementHierarchyInfo>();

            for(AgreementHierarchyInfo agrInfo : agreements) {
                if((agrInfo != null) && !StringUtils.isNullOrEmpty(agrInfo.getCommercialAgreement())) {
                    geneticAgreements.add(agrInfo);
                } else if((agrInfo != null) && !StringUtils.isNullOrEmpty(agrInfo.getMonsantoTraitAgreement())) {
                    traitAgreements.add(agrInfo);
                }
            }
            traitAgreementCategory.getAgreementsBySpecie().addAll(extractAgreementBySpecies(traitAgreements));
            geneticsAgreementCategory.getAgreementsBySpecie().addAll(extractAgreementBySpecies(geneticAgreements));
            agreementCategoryList.add(traitAgreementCategory);
            agreementCategoryList.add(geneticsAgreementCategory);
        }
        return agreementCategoryList;
    }

    private List<AgreementsBySpecieType> extractAgreementBySpecies(List<AgreementHierarchyInfo> agreements) throws Exception {
        List<AgreementsBySpecieType> specieAgreements = new ArrayList<AgreementsBySpecieType>();
        AgreementsBySpecieType cornAgreements = new AgreementsBySpecieType();
        cornAgreements.setSpecieName(SpecieNameType.CORN);
        AgreementsBySpecieType soybeanAgreements = new AgreementsBySpecieType();
        soybeanAgreements.setSpecieName(SpecieNameType.SOYBEAN);
        for(AgreementHierarchyInfo agreementInfo : agreements) {
            if(agreementInfo!= null && "Y".equalsIgnoreCase(agreementInfo.getCornAgreementFlag())) {
                cornAgreements.getAgreement().add(extractAgreementType(agreementInfo));
            } else if(agreementInfo!= null && "Y".equalsIgnoreCase(agreementInfo.getSoybeanAgreementFlag())) {
                soybeanAgreements.getAgreement().add(extractAgreementType(agreementInfo));
            }
        }
        specieAgreements.add(cornAgreements);
        specieAgreements.add(soybeanAgreements);
        return specieAgreements;
    }

    private long getAcctIdFromAliasId(AccountIdentifierType acctIdentifier) throws Exception {
        long acctId = 0;
        if(!AccountTypeAttribute.ACCTID.equals(acctIdentifier.getType())) {
            acctId = irdDao.getAccountIdByAlias(acctIdentifier.getType().toString(), acctIdentifier.getValue());
        } else {
            acctId = Long.parseLong(acctIdentifier.getValue());
        }
        if(acctId <= 0) {
            throw new Exception("Unable to find matching ACCT_ID for Account Identifier Type="+acctIdentifier.getType()+" Id="+acctIdentifier.getValue());
        }
        return acctId;
    }

    private AgreementType extractAgreementType(AgreementHierarchyInfo agreementInfo) {
        AgreementType agrType = new AgreementType();
        agrType.setAgreementCode(agreementInfo.getAgreementCode());
        agrType.setAgreementDescr(agreementInfo.getAgreementDescr());
        return agrType;
    }

    public void setAgreementsDao(AgreementsDao agreementsDao) {
        this.agreementsDao = agreementsDao;
    }

    public void setIrdDao(IrdDao irdDao) {
        this.irdDao = irdDao;
    }

    private AgreementInfo getValidatedAgreementInfo(UpdateAgreementRequestType request) throws Exception {
        if((request==null) ||
                (request.getUpdateAgreementRequestBody()==null)) {
            throw new Exception("Recieved in-valid UpdateAgreementRequest object");
        }
        UpdateAgreementRequestBodyType requestBody = request.getUpdateAgreementRequestBody();
        if(requestBody.getAccountIdentifier()== null || requestBody.getAgreementCode() == null || requestBody.getEndDate() == null) {
            throw new Exception("Recieved in-valid UpdateAgreementRequest object");
        }
        AgreementInfo agreementInfo = new AgreementInfo();
        agreementInfo.setIdentifierType(requestBody.getAccountIdentifier().getType().toString());
        agreementInfo.setIdentifierValue(requestBody.getAccountIdentifier().getValue());
        agreementInfo.setAgreementCode(requestBody.getAgreementCode());
        agreementInfo.setEndDate(XmlDateTimeUtil.transformFromXmlGregorianCalendar(requestBody.getEndDate()));
        return agreementInfo;
    }

    private void validateGetAgreementsRequest(GetAgreementsRequestType request) throws Exception {
        if((request == null) ||
                (request.getGetAgreementsRequestBody() == null) ||
                ((request.getGetAgreementsRequestBody().getAccountIdentifier()==null) && (request.getGetAgreementsRequestBody().getSignerAccountIdentifier()==null)) ||
                (StringUtils.isNullOrEmpty(request.getGetAgreementsRequestBody().getAgreementCode()))
           ) {
            throw new Exception("Received in-complete GetAgreementsRequest object");
        }
    }

    private void validateGetAgreementHierarchyRequest(GetAgreementHierarchyRequestType request) throws Exception {
        if((request == null) || (request.getGetAgreementHierarchyRequestBody() == null)
            || (request.getGetAgreementHierarchyRequestBody().getAccountId()<=0)
            || (request.getGetAgreementHierarchyRequestBody().getAgreementLicensedBy()==null)) {
            throw new Exception("Received in-complete GetAgreementHierarchyRequest object");            
        }
    }

    private void handleException(Throwable error, String operationName) throws AccountAgreementsFault {
        logException(error, logger, operationName);
        ExceptionType exception = new ExceptionType();
        exception.setFaultCode(error.getMessage());
        exception.setFaultMessage(getStackTrace(error));
        throw new AccountAgreementsFault("Error occurred during operation: "+operationName, exception, error);
    }

    protected SuccessResponseType getUpdateAgreementResponseBody() throws Exception {
        SuccessResponseType successResponse = new SuccessResponseType();
        successResponse.setStatus("Success");
        successResponse.setLastModifiedDate(XmlDateTimeUtil.transformToXmlGregorianCalendar(Calendar.getInstance()));
        return successResponse;
    }

}
