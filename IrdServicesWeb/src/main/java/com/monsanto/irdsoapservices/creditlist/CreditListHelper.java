package com.monsanto.irdsoapservices.creditlist;

import com.monsanto.commercial.growercreditlist.invoker.GrowerCreditListServiceInvoker;
import com.monsanto.commercial.growercreditlist.invoker.GetCreditInfoServiceInvoker;
import com.monsanto.commercial.growercreditlist.domain.GrowerInfo;
import com.monsanto.commercial.growercreditlist.domain.ClientInfo;
import com.monsanto.commercial.growercreditlist.domain.GrowerCreditInfo;
import com.monsanto.commercial.growercreditlist.util.EnvironmentEnum;
import com.monsanto.commercial.growercreditlist.exception.ServiceException;
import com.monsanto.irdsoapservices.salesorder.domain.TransactionInfo;
import com.monsanto.Util.EnvironmentHelper;
import org.apache.log4j.Logger;

import java.util.List;
import java.util.HashMap;
import java.util.ArrayList;

/**
 * Created by IntelliJ IDEA.
 * User: MKUCHIP
 * Date: Aug 16, 2012
 * Time: 10:49:50 AM
 * To change this template use File | Settings | File Templates.
 */
public class CreditListHelper {
    CreditListDAO creditListDAO;
    GetCreditInfoServiceInvoker getCreditInfoServiceInvoker;
    GrowerCreditListServiceInvoker creditListServiceInvoker;
    Logger logger = Logger.getLogger(this.getClass());

    public int processCreditListTransaction(TransactionInfo transactionInfo) throws Exception {
        logger.info("Processing Credit List Transaction for Group Code:"+transactionInfo.getGroupCode()+" Company:"+transactionInfo.getName());
        List<GrowerInfo> growerList = creditListDAO.getGrowerList(transactionInfo.getGroupCode());
        logger.info("Found "+growerList.size()+" Growers. Checking credit info for these Growers");
        ClientInfo clientInfo = getClientInfo(transactionInfo);
        List<GrowerInfo> growerCreditList = getCreditInfo(growerList, clientInfo);
        logger.info("Starting FPOS Backfeed for "+transactionInfo.getName());
        creditListServiceInvoker.invokeService(growerCreditList, clientInfo);
        logger.info("End of Processing Credit List.");
        return growerCreditList.size();
    }

    protected List<GrowerInfo> getCreditInfo(List<GrowerInfo> growerList, ClientInfo clientInfo) throws ServiceException {
        List<GrowerInfo> growerCreditList = new ArrayList<GrowerInfo>();
        HashMap<String, GrowerInfo> growerMap = getGrowerMap(growerList);
        List<GrowerCreditInfo> growerCreditInfo = getCreditInfoServiceInvoker.getGrowerCreditInfo((List<String>) new ArrayList(growerMap.keySet()), clientInfo);
        logger.info("Found Credit Information for "+growerCreditInfo.size()+" Growers");
        for(GrowerCreditInfo creditInfo : growerCreditInfo) {
            GrowerInfo growerInfo = growerMap.get(creditInfo.getGrowerAccountId());
            if(growerInfo!= null) {
                growerInfo.setCreditApproved(creditInfo.getCreditApproved());
                growerInfo.setCreditAvailable(creditInfo.getCreditAvailable());
                growerCreditList.add(growerInfo);
            }
        }
        return growerCreditList;
    }

    private HashMap<String, GrowerInfo> getGrowerMap(List<GrowerInfo> growerList) {
        HashMap<String, GrowerInfo> growerMap = new HashMap<String, GrowerInfo>();
        for(GrowerInfo growerInfo : growerList) {
            growerMap.put(growerInfo.getSapId(), growerInfo);
        }
        return growerMap;
    }

    private ClientInfo getClientInfo(TransactionInfo transactionInfo) {
        ClientInfo clientInfo = new ClientInfo();
        clientInfo.setDocIdentifier("FPOS-CREDITLIST-"+transactionInfo.getGroupCode());
        clientInfo.setPartnerId(transactionInfo.getCompanyCode());
        clientInfo.setPartnerName(transactionInfo.getName());
        clientInfo.setEnvironment(EnvironmentEnum.valueOf("win".equalsIgnoreCase(EnvironmentHelper.getFunction()) ? "DEV": EnvironmentHelper.getFunction().toUpperCase()));
        return clientInfo;
    }

    public void setCreditListDAO(CreditListDAO creditListDAO) {
        this.creditListDAO = creditListDAO;
    }

    public void setGetCreditInfoServiceInvoker(GetCreditInfoServiceInvoker getCreditInfoServiceInvoker) {
        this.getCreditInfoServiceInvoker = getCreditInfoServiceInvoker;
    }

    public void setCreditListServiceInvoker(GrowerCreditListServiceInvoker creditListServiceInvoker) {
        this.creditListServiceInvoker = creditListServiceInvoker;
    }
}
