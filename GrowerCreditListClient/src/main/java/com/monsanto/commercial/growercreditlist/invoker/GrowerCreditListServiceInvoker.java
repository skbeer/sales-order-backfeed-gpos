package com.monsanto.commercial.growercreditlist.invoker;

import com.monsanto.commercial.growercreditlist.domain.GrowerInfo;
import com.monsanto.commercial.growercreditlist.domain.ClientInfo;
import com.monsanto.commercial.growercreditlist.exception.ServiceException;
import com.monsanto.commercial.growercreditlist.gen.creditlist.schema.GrowerCreditListListType;
import com.monsanto.commercial.growercreditlist.gen.creditlist.service.GrowerCreditList_Service;
import com.monsanto.commercial.growercreditlist.requestbuilder.GrowerCreditListRequestBuilder;
import com.monsanto.commercial.growercreditlist.util.ClientFactory;

import java.util.List;

import org.apache.log4j.Logger;

/**
 * Created by IntelliJ IDEA.
 * User: MKUCHIP
 * Date: Aug 16, 2012
 * Time: 10:19:47 AM
 * To change this template use File | Settings | File Templates.
 */
public class GrowerCreditListServiceInvoker {
    Logger logger = Logger.getLogger(this.getClass());

    public void invokeService(List<GrowerInfo> growerInfoList, ClientInfo clientInfo) throws ServiceException {
        logger.info("Beginning to send Credit List for "+clientInfo.getPartnerName()+" with "+growerInfoList.size()+" Growers");
        GrowerCreditListListType creditListReqType = new GrowerCreditListRequestBuilder().createRequestType(growerInfoList, clientInfo);
        GrowerCreditList_Service service = new ClientFactory().getGrowerCreditListService(clientInfo.getEnvironment());
        service.getGrowerCreditListPort().growerCreditList(creditListReqType);
        logger.info("Sent GrowerCreditList Successfully.");
    }
}
