package com.monsanto.irdsoapservices.helper;

import com.monsanto.cidx.header.schema.*;
import com.monsanto.irdsoapservices.dao.VistiveProcessorDAO;
import com.monsanto.irdsoapservices.service.VistiveProcessorListFault;
import com.monsanto.irdsoapservices.to.ProcessorTO;
import com.monsanto.irdsoapservices.utils.Configuration;
import com.monsanto.irdsoapservices.utils.StringUtils;
import com.monsanto.irdsoapservices.utils.XmlDateTimeUtil;
import com.monsanto.irdsoapservices.vistiveprocessorlist.schema.*;
import org.apache.log4j.Logger;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

/**
 * Created by IntelliJ IDEA.
 * User: SVADLAM
 * Date: Apr 19, 2010
 * Time: 1:33:11 PM
 * To change this template use File | Settings | File Templates.
 */
public class VistiveProcessorHelper extends AbstractHelper{
    Logger logger = Logger.getLogger(this.getClass());
    private VistiveProcessorDAO vistiveProcessorDAO;

    public VistiveProcessorListType getVistiveProcessorList(VistiveProcessorListRequestType request)   throws VistiveProcessorListFault{
        VistiveProcessorListType processorListType = new VistiveProcessorListType();
        try {
            processorListType.setHeader(getResponseHeader(request.getHeader()));
            VistiveProcessorListBodyType processorListBodyType = new VistiveProcessorListBodyType();
            logger.info("getting Vistive Processors from Database");
            List<ProcessorTO> vistiveProcessorList = vistiveProcessorDAO.getVistiveProcessorListFromDB();
            logger.info("count of Vistive Processors from Database:"+vistiveProcessorList.size());
            List<VistiveProcessorEntityType> processorEntityTypesList = new ArrayList();
            for(ProcessorTO processorTO : vistiveProcessorList) {
                VistiveProcessorEntityType processorEntityType = new VistiveProcessorEntityType();
                processorEntityType.setActiveFlag(getAcctActiveFlag(processorTO.getActiveFlag()));
                processorEntityType.setVistiveProcessorCode(processorTO.getProcessorCode());
                processorEntityType.setLastModifiedDateTime(XmlDateTimeUtil.transformToXmlGregorianCalendar
                        (new Date(processorTO.getAcctLastModifiedDateTime().getTime())));
                processorEntityType.setPartnerInformation(getPartnerInformation(processorTO));
                processorEntityTypesList.add(processorEntityType);
            }
            processorListBodyType.getVistiveProcessorEntity().addAll(processorEntityTypesList);
            processorListType.setVistiveProcessorListBody(processorListBodyType);
        }catch(Exception e)   {
            handleException(e,"getVistiveProcessorListFromDB");
        }
        return processorListType;


    }

     private void handleException(Throwable error, String operationName) throws VistiveProcessorListFault {
        logException(error, logger, operationName);
        VistiveProcessorListFaultType exception = new VistiveProcessorListFaultType();
        exception.setProblem(getStackTrace(error));
        throw new VistiveProcessorListFault("Error occurred during operation: "+operationName, exception, error);
    }

    private PartnerInformationType getPartnerInformation(ProcessorTO processorTO) {
        PartnerInformationType partnerInformationType = new PartnerInformationType();
        partnerInformationType.getPartnerIdentifier().add(getPartnerIdentifierType(processorTO.getEbId()));
        partnerInformationType.getPartnerName().add(processorTO.getAcctName());
        partnerInformationType.setPartnerReference(getPartnerReference(processorTO.getAcctId()));
        partnerInformationType.setAddressInformation(getAddressInformation(processorTO));
        return partnerInformationType;
    }

    private PartnerIdentifierType getPartnerIdentifierType(String ebId)    {
        if(!StringUtils.isNullOrEmpty(ebId))    {
            PartnerIdentifierType partnerIdentifierType = new PartnerIdentifierType();
            partnerIdentifierType.setAgency(CidxListPartnerAgencyAttribute.AGIIS_EBID);
            partnerIdentifierType.setValue(ebId);
            return partnerIdentifierType;
        }
        return null;
    }

    private PartnerReferenceType getPartnerReference(String acctId)  {
        PartnerReferenceType partnerReferenceType = new PartnerReferenceType();
        PartnerIdentifierType partnerIdentifierType = new PartnerIdentifierType();
        partnerIdentifierType.setAgency(CidxListPartnerAgencyAttribute.ASSIGNED_BY_SELLER);
        partnerIdentifierType.setValue(acctId);
        partnerReferenceType.setPartnerIdentifier(partnerIdentifierType);
        return partnerReferenceType;
    }

    private AddressInformationType getAddressInformation(ProcessorTO processorTO)  {
        AddressInformationType addressInformationType = new AddressInformationType();
        addressInformationType.getAddressLine().add(processorTO.getAddress());
        addressInformationType.setCityName(processorTO.getCity());
        addressInformationType.setStateOrProvince(processorTO.getState());
        addressInformationType.setPostalCode(processorTO.getZipCode());
        return addressInformationType;
    }

    private ActiveFlagType getAcctActiveFlag(String activeFlag) {
        return "Y".equalsIgnoreCase(activeFlag) ? ActiveFlagType.TRUE:ActiveFlagType.FALSE;
    }

    public void setVistiveProcessorDAO(VistiveProcessorDAO vistiveProcessorDAO) {
        this.vistiveProcessorDAO = vistiveProcessorDAO;
    }

    protected HeaderType getResponseHeader(HeaderType requestHeader) throws Exception {
           HeaderType responseHeader = new HeaderType();
           if(requestHeader == null || StringUtils.isNullOrEmpty(requestHeader.getThisDocumentIdentifier().getDocumentIdentifier())) {
               throw new Exception("Invalid Header element in the in-coming Request.");
           }
           logger.info("Request DocumentIdentifier: "+requestHeader.getThisDocumentIdentifier().getDocumentIdentifier());
           logger.info("Request Partner Name: "+requestHeader.getFrom().getPartnerInformation().getPartnerName().get(0));
           responseHeader.setThisDocumentIdentifier(requestHeader.getThisDocumentIdentifier());
           responseHeader.setThisDocumentDateTime(getThisDocumentDateTimeType());
           ToType toType = new ToType();
           toType.setPartnerInformation(requestHeader.getFrom().getPartnerInformation());
           responseHeader.setTo(toType);
           FromType fromType = new FromType();
           fromType.setPartnerInformation(getMonsantoPartnerInformationType());
           responseHeader.setFrom(fromType);
           return responseHeader;
    }

    private ThisDocumentDateTimeType getThisDocumentDateTimeType()  throws Exception{
        ThisDocumentDateTimeType documentDateTimeType = new ThisDocumentDateTimeType();
        DateTimeType dateTimeType = new DateTimeType();
        dateTimeType.setValue(XmlDateTimeUtil.transformToXmlGregorianCalendar(Calendar.getInstance()));
        documentDateTimeType.setDateTime(dateTimeType);
        return documentDateTimeType;
    }

    private PartnerInformationType getMonsantoPartnerInformationType() throws Exception {
        PartnerInformationType partnerInfo = new PartnerInformationType();
        partnerInfo.getPartnerName().add(Configuration.getInstance().getProperty(Configuration.PARTNER_NAME));
        ContactInformationType contactInfo = new ContactInformationType();
        contactInfo.getEmailAddress().add(Configuration.getInstance().getProperty(Configuration.PARTNER_EMAIL));
        partnerInfo.getContactInformation().add(contactInfo);
        return partnerInfo;
    }

}
