package com.monsanto.commercial.growercreditlist.invoker;

import com.monsanto.commercial.growercreditlist.domain.GrowerCreditInfo;
import com.monsanto.commercial.growercreditlist.domain.ClientInfo;
import com.monsanto.commercial.growercreditlist.exception.ServiceException;
import com.monsanto.commercial.growercreditlist.gen.creditinfo.schema.GrowerCreditRequestType;
import com.monsanto.commercial.growercreditlist.gen.creditinfo.schema.GrowerCreditResponseType;
import com.monsanto.commercial.growercreditlist.requestbuilder.GetGrowerCreditRequestBuilder;
import com.monsanto.commercial.growercreditlist.util.ClientFactory;
import com.monsanto.commercial.growercreditlist.responseparser.GetGrowerCreditResponseParser;

import java.util.List;

import org.apache.log4j.Logger;

/**
 * Created by IntelliJ IDEA.
 * User: MKUCHIP
 * Date: Aug 13, 2012
 * Time: 10:55:03 AM
 * To change this template use File | Settings | File Templates.
 */
public class GetCreditInfoServiceInvoker {
    Logger logger = Logger.getLogger(this.getClass());

    public List<GrowerCreditInfo> getGrowerCreditInfo(List<String> growerAccountIds, ClientInfo clientInfo) throws ServiceException {
        logger.info("Calling GrowerCredit service with "+growerAccountIds.size()+" Grower Accounts");
        GrowerCreditRequestType requestType = getRequestBuilder().createRequest(growerAccountIds, clientInfo);
        GrowerCreditResponseType responseType = getClientFactory().getCreditInfoService(clientInfo.getEnvironment()).getGrowerCreditPort().growerCredit(requestType);
        logger.info("Got Response from Service");
        List<GrowerCreditInfo> growerList = getResponseParser().parse(responseType);
        logger.info("Received Credit info for "+growerList.size()+" Grower Accounts");
        return growerList;           
    }

    private GetGrowerCreditResponseParser getResponseParser() {
        return new GetGrowerCreditResponseParser();
    }

    private ClientFactory getClientFactory() {
        return new ClientFactory();
    }

    private GetGrowerCreditRequestBuilder getRequestBuilder() {
        return new GetGrowerCreditRequestBuilder();
    }

}
