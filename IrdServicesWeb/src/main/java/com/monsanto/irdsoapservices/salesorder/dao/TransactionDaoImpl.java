package com.monsanto.irdsoapservices.salesorder.dao;

import com.monsanto.irdsoapservices.salesorder.domain.TransactionInfo;
import org.springframework.orm.ibatis.support.SqlMapClientDaoSupport;

import java.util.List;

/**
 * Created by IntelliJ IDEA.
 * User: mkuchip
 * Date: Jun 7, 2010
 * Time: 10:44:35 AM
 * To change this template use File | Settings | File Templates.
 */
public class TransactionDaoImpl extends SqlMapClientDaoSupport implements TransactionDao {

    public List<TransactionInfo> getTransactionsToBeProcessed() throws Exception {
        return (List<TransactionInfo>)getSqlMapClientTemplate().queryForList("BackfeedData.getTransactionsToBeProcessed", null);
    }

    public List<TransactionInfo> getTransactionsByType(String tranType) throws Exception {
        TransactionInfo transactionInfo = new TransactionInfo();
        transactionInfo.setTransactionType(tranType);
        return (List<TransactionInfo>)getSqlMapClientTemplate().queryForList("BackfeedData.getTransactionsToBeProcessed", transactionInfo);
    }

    public int updateLastTransactionStats(TransactionInfo transaction) throws Exception {
        return getSqlMapClientTemplate().update("BackfeedData.updateLastTransactionStats", transaction);
    }

    public int updateLastTransactionNumber(TransactionInfo transaction) throws Exception {
        return getSqlMapClientTemplate().update("BackfeedData.updateLastTransactionNumber", transaction);
    }

    public int updateSentToAgdata(String lineIdentifier) throws Exception{
        Long transactionID = Long.parseLong(lineIdentifier);
        //logger.info("Inside TransactionDaoImpl.updateSentToAgdata.....transaction Id: "+transactionID+" .. of type "+transactionID.getClass().getSimpleName());
        return getSqlMapClientTemplate().update("BackfeedData.updateSentToAgdata",transactionID);
    }
    
}
