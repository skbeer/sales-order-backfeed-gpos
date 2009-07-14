package com.monsanto.irdsoapservices.helper;

import com.monsanto.irdsoapservices.constants.DBConstants;
import com.monsanto.irdsoapservices.dao.IrdDao;
import com.monsanto.irdsoapservices.exception.IrdSoapServicesException;
import com.monsanto.irdsoapservices.schema.*;
import com.monsanto.irdsoapservices.service.AccountInformationFault;
import com.monsanto.irdsoapservices.to.AcctToAttr;
import org.apache.log4j.Logger;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by IntelliJ IDEA.
 * User: mkuchip
 * Date: Mar 17, 2009
 * To change this template use File | Settings | File Templates.
 */
public class AccountAttributesHelper extends AbstractHelper {
	Logger logger = Logger.getLogger(this.getClass());
	private IrdDao dao = null;
	
	public GetAccountAttributesResponseType getAccountAttributes(GetAccountAttributesRequestType request) throws AccountInformationFault {
		GetAccountAttributesResponseType responseType = new GetAccountAttributesResponseType();
        long growerAccountId = 0;
		try {
			growerAccountId = getValidatedGrowerAccountId(request);
			logger.info("Retreiving AccountAttributes for GrowerId: "+growerAccountId);
			List<AcctToAttr> growerAttrs = dao.getAttributesByAcctId(growerAccountId);
			List<String> growerAttributes = new ArrayList<String>();
			for(AcctToAttr attrs : growerAttrs) {
				growerAttributes.add(attrs.getAttrCode());
			}
            responseType.setGetAccountAttributesResponseBody(new GetAccountAttributesResponseBodyType());
			responseType.getGetAccountAttributesResponseBody().getAttributeCode().addAll(growerAttributes);
            responseType.setHeader(getResponseHeader(request.getHeader()));
			logger.info("Returning "+growerAttributes.size()+" Attributes for GrowerId: "+growerAccountId);
		} catch (Throwable e) {
            throwAccountInformationFault(e, logger, "getAccountAttributes");
        }
        logger.debug("End: getAccountAttributes()");
		return responseType;
	}
	
	public SaveAccountAttributesResponseType saveAccountAttributes(SaveAccountAttributesRequestType request) throws AccountInformationFault {
        SaveAccountAttributesResponseType response = new SaveAccountAttributesResponseType();
		long growerAccountId = 0;
		AcctToAttr acctToAttr = null;
		try {
			growerAccountId = getValidatedGrowerAccountId(request);
			logger.info("Saving Account Attributes for Grower w/AcctId: "+growerAccountId);
			List<PersistableAttributeInfoType> persistableAttributesList = request.getSaveAccountAttributesRequestBody().getPersistableAttributeInfo();
			for(PersistableAttributeInfoType pAttribute: persistableAttributesList) {
				acctToAttr = AcctToAttr.parse(pAttribute, growerAccountId);
				if(acctToAttr.getDatabaseAction().equalsIgnoreCase(DBConstants.ADD_ACTION_TYPE)) {
					dao.insertAccountAttribute(acctToAttr);
				} else if(acctToAttr.getDatabaseAction().equalsIgnoreCase(DBConstants.DELETE_ACTION_TYPE)){
					dao.deleteAccountAttribute(acctToAttr);
				} else {
					throw new IrdSoapServicesException("Recieved un-supported Database Action type: "+acctToAttr.getDatabaseAction()+" for Attribute: "+acctToAttr);
				}
			}
			logger.info("Successfully updated "+persistableAttributesList.size()+" attributes for Grower w/AcctId: "+growerAccountId);
            response.setHeader(getResponseHeader(request.getHeader()));
            response.setSaveAccountAttributesResponseBody(getSuccessResponse());
		} catch (Throwable e) {
            throwAccountInformationFault(e, logger, "saveAccountAttributes");
        }
        logger.debug("End: saveAccountAttributes()");

		return response;
	}

    protected long getValidatedGrowerAccountId(GetAccountAttributesRequestType request) throws Exception {
		if(request == null || request.getGetAccountAttributesRequestBody().getGrowerAccountId() <=0) {
			throw new IrdSoapServicesException("Recieved in-valid Request for operation: getAccountAttributes");
		}
		return request.getGetAccountAttributesRequestBody().getGrowerAccountId();
	}
	
	protected long getValidatedGrowerAccountId(SaveAccountAttributesRequestType request) throws Exception {
		if(request == null || request.getSaveAccountAttributesRequestBody().getGrowerAccountId()<=0) {
			throw new IrdSoapServicesException("Recieved in-valid Request for operation: saveAccountAttributes");
		}
		return request.getSaveAccountAttributesRequestBody().getGrowerAccountId();
	}

	public void setDao(IrdDao dao) {
		this.dao = dao;
	}
	
}
