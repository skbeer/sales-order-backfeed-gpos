package com.monsanto.irdsoapservices.helper;

import com.monsanto.irdsoapservices.schema.ExceptionType;
import com.monsanto.irdsoapservices.schema.SuccessResponseType;
import com.monsanto.irdsoapservices.service.AccountInformationFault;
import com.monsanto.irdsoapservices.utils.Configuration;
import com.monsanto.irdsoapservices.utils.ErrorEmailer;
import com.monsanto.irdsoapservices.utils.StringUtils;
import com.monsanto.irdsoapservices.utils.XmlDateTimeUtil;
import com.monsanto.isdcommon.header.schema.ContactInformationType;
import com.monsanto.isdcommon.header.schema.HeaderType;
import com.monsanto.isdcommon.header.schema.PartnerInformationType;
import org.apache.log4j.Logger;

import java.util.Calendar;

/**
 * Created by IntelliJ IDEA.
 * User: mkuchip
 * Date: Mar 23, 2009
 * Time: 11:16:06 AM
 * To change this template use File | Settings | File Templates.
 */
public abstract class AbstractHelper {
    Logger logger = Logger.getLogger(this.getClass());

    protected SuccessResponseType getSuccessResponse() throws Exception {
        SuccessResponseType successResponse = new SuccessResponseType();
        successResponse.setStatus("Success");
        successResponse.setLastModifiedDate(XmlDateTimeUtil.transformToXmlGregorianCalendar(Calendar.getInstance()));
        return successResponse;
    }

    protected HeaderType getResponseHeader(HeaderType requestHeader) throws Exception {
        HeaderType responseHeader = new HeaderType();
        if(requestHeader == null || StringUtils.isNullOrEmpty(requestHeader.getDocumentIdentifier())) {
            throw new Exception("Invalid Header element in the in-coming Request.");
        }
        logger.info("Request DocumentIdentifier: "+requestHeader.getDocumentIdentifier());
        logger.info("Request Partner Name: "+requestHeader.getFrom().getPartnerName().toString());
        responseHeader.setDocumentIdentifier(requestHeader.getDocumentIdentifier());
        responseHeader.setDocumentDateTime(XmlDateTimeUtil.transformToXmlGregorianCalendar(Calendar.getInstance()));
        responseHeader.setTo(requestHeader.getFrom());
        responseHeader.setFrom(getPartnerInformationType());
        return responseHeader;
    }
    
    protected void logException(Throwable exception, Logger logger, String operationName) {
        logger.error(exception);
        new ErrorEmailer().sendErrorEmail(exception, "Error occurred during operation: " + operationName);
    }
    
    protected String getStackTrace(Throwable error) {
        StringBuffer stringBuffer = new StringBuffer();
        for (int index = 0; index < error.getStackTrace().length; index++) {
            stringBuffer.append(error.getStackTrace()[index].toString());
            stringBuffer.append("\n");
        }
        return stringBuffer.toString();
    }

    protected void throwAccountInformationFault(Throwable error, Logger logger, String operationName) throws AccountInformationFault {
        logger.error(error);
        new ErrorEmailer().sendErrorEmail(error, "Error occurred during operation: " + operationName);
        ExceptionType exception = new ExceptionType();
        exception.setFaultCode(error.getMessage());
        exception.setFaultMessage(getStackTrace(error));
        throw new AccountInformationFault("Error occurred during operation: " + operationName, exception, error);
    }

    private PartnerInformationType getPartnerInformationType() throws Exception {
        PartnerInformationType partnerInfo = new PartnerInformationType();
        partnerInfo.setPartnerName(Configuration.getInstance().getProperty(Configuration.PARTNER_NAME));
        ContactInformationType contactInfo = new ContactInformationType();
        contactInfo.getEmailAddress().add(Configuration.getInstance().getProperty(Configuration.PARTNER_EMAIL));
        partnerInfo.setContactInformation(contactInfo);
        return partnerInfo;
    }


}
