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
        return (List<TransactionInfo>)getSqlMapClientTemplate().queryForList("BackfeedData.getTransactionsToBeProcessed");
    }

    public int updateLastTransactionStats(TransactionInfo transaction) throws Exception {
        return getSqlMapClientTemplate().update("BackfeedData.updateLastTransactionStats", transaction);
    }
    
}
