package com.monsanto.irdsoapservices.helper;

import com.monsanto.irdsoapservices.constants.DBConstants;
import com.monsanto.irdsoapservices.dao.IrdDao;
import com.monsanto.irdsoapservices.exception.IrdSoapServicesException;
import com.monsanto.irdsoapservices.schema.*;
import com.monsanto.irdsoapservices.service.AccountInformationFault;
import com.monsanto.irdsoapservices.to.EmployeeInfo;
import com.monsanto.irdsoapservices.to.LfaGrowerDetails;
import org.apache.log4j.Logger;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by IntelliJ IDEA.
 * User: mkuchip
 * Date: Mar 17, 2009
 * To change this template use File | Settings | File Templates.
 */
public class AccountDetailsHelper extends AbstractHelper {
	Logger logger = Logger.getLogger(this.getClass());
	private IrdDao dao = null;
	
	public GetAccountDetailsResponseType getAccountDetails(GetAccountDetailsRequestType request) throws AccountInformationFault {
		GetAccountDetailsResponseType responseType = new GetAccountDetailsResponseType();
        long growerAccountId = 0;
		try {
            responseType.setGetAccountDetailsResponseBody(new GetAccountDetailsResponseBodyType());
			growerAccountId = getValidatedGrowerAccountId(request);
			logger.info("Finding Account Details for Grower w/AcctId: "+growerAccountId);
			LfaGrowerDetails growerDetails = dao.getAccountDetails(growerAccountId);
			if(growerDetails != null) {
				responseType.getGetAccountDetailsResponseBody().setAccountDetails(growerDetails.extractTypeObject());
			}
			logger.info("Returning Account Details for Grower w/AcctId: "+growerDetails);
            responseType.setHeader(getResponseHeader(request.getHeader()));

		} catch (Throwable e) {
            throwAccountInformationFault(e, logger, "getAccountDetails");
        }
        logger.debug("End: getAccountDetails()");
		return responseType;
	}
	
	public SaveAccountDetailsResponseType saveAccountDetails(SaveAccountDetailsRequestType request) throws AccountInformationFault {
        SaveAccountDetailsResponseType response = new SaveAccountDetailsResponseType();
		try {
			logger.info("Initiating operation saveAccountDetails");			
			LfaGrowerDetails lfaDetails = getValidatedLfaDetails(request);
			logger.info("Saving Account Details for Grower w/AcctId: "+lfaDetails.getAccountId());
			if(lfaDetails.getDatabaseAction().equalsIgnoreCase(DBConstants.DELETE_ACTION_TYPE)) {
				dao.deleteAccountDetails(lfaDetails.getAccountId());
			} else {
				dao.saveAccountDetails(lfaDetails);
			}
			logger.info("Successfully updated Details for Grower w/AcctId: "+lfaDetails.getAccountId());
            response.setSaveAccountDetailsResponseBody(getSuccessResponse());
            response.setHeader(getResponseHeader(request.getHeader()));

		} catch (Throwable e) {
            throwAccountInformationFault(e, logger, "saveAccountDetails");
        }
        logger.debug("End: saveAccountDetails()");
		return response;
	}

    public GetAssociatedEmployeesResponseType getAssociatedEmployees(GetAssociatedEmployeesRequestType request) throws AccountInformationFault {
        GetAssociatedEmployeesResponseType response = new GetAssociatedEmployeesResponseType();
        try {
            validateGetAssociatedEmployeesRequest(request);
            long accountId = getAcctIdFromAliasId(request.getGetAssociatedEmployeesRequestBody().getAccountIdentifier());
            logger.info("Searching for Associated Employees for AcctId: "+accountId);
            List<EmployeeInfo> employees = dao.getAssociatedEmployees(accountId);
            GetAssociatedEmployeesResponseBodyType responseBody = new GetAssociatedEmployeesResponseBodyType();
            List<EmployeeType> employeeTypeList = new ArrayList<EmployeeType>();
            for (int index = 0; index < employees.size(); index++) {
                EmployeeInfo employeeInfo = employees.get(index);
                employeeTypeList.add(employeeInfo.extractEmployeeType());
            }
            response.setHeader(getResponseHeader(request.getHeader()));
            logger.info("Found "+employeeTypeList.size()+" Associated Employees for AcctId: "+accountId);
            responseBody.getEmployee().addAll(employeeTypeList);
            response.setGetAssociatedEmployeesResponseBody(responseBody);
        } catch (Throwable e) {
            throwAccountInformationFault(e, logger, "getAssociatedEmployees");
        }
        logger.debug("End: getAssociatedEmployees()");
		return response;
    }

    private long getAcctIdFromAliasId(AccountIdentifierType acctIdentifier) throws Exception {
        long acctId = 0;
        if(!AccountTypeAttribute.ACCTID.equals(acctIdentifier.getType())) {
            acctId = dao.getAccountIdByAlias(acctIdentifier.getType().toString(), acctIdentifier.getValue());
        } else {
            acctId = Long.parseLong(acctIdentifier.getValue());
        }
        if(acctId <= 0) {
            throw new Exception("Unable to find matching ACCT_ID for Account Identifier Type="+acctIdentifier.getType()+" Id="+acctIdentifier.getValue());
        }
        return acctId;
    }


    protected void validateGetAssociatedEmployeesRequest(GetAssociatedEmployeesRequestType request) throws Exception {
		if(request == null || request.getGetAssociatedEmployeesRequestBody()==null || request.getGetAssociatedEmployeesRequestBody().getAccountIdentifier() == null) {
			throw new IrdSoapServicesException("Recieved in-valid request for operation: getAssociatedEmployees");
		}
	}

	protected long getValidatedGrowerAccountId(GetAccountDetailsRequestType request) throws Exception {
		if(request == null || request.getGetAccountDetailsRequestBody().getGrowerAccountId()<=0) {
			throw new IrdSoapServicesException("Recieved in-valid request for operation: getAccountDetails");
		}
		return request.getGetAccountDetailsRequestBody().getGrowerAccountId();
	}

	protected LfaGrowerDetails getValidatedLfaDetails(SaveAccountDetailsRequestType request) throws Exception {
		if(request == null || request.getSaveAccountDetailsRequestBody().getAccountDetails()==null) {
			throw new IrdSoapServicesException("Recieved in-valid request for operation: saveAccountDetails");
		}
		LfaGrowerDetails lfaDetails = LfaGrowerDetails.parse(request.getSaveAccountDetailsRequestBody().getAccountDetails());
		if(lfaDetails.getAccountId()<=0) {
			throw new IrdSoapServicesException("Recieved in-valid growerAccountId ["+lfaDetails.getAccountId()+"] for operation: saveAccountDetails");
		}
		lfaDetails.setDatabaseAction(request.getSaveAccountDetailsRequestBody().getDatabaseAction().toString());
		return lfaDetails;
	}
	
	public void setDao(IrdDao dao) {
		this.dao = dao;
	}

}
