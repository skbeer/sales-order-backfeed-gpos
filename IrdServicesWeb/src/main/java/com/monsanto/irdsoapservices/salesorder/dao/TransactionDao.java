package com.monsanto.irdsoapservices.salesorder.dao;

import com.monsanto.irdsoapservices.salesorder.domain.TransactionInfo;

import java.util.List;

/**
 * Created by IntelliJ IDEA.
 * User: mkuchip
 * Date: Jun 7, 2010
 * Time: 10:54:12 AM
 * To change this template use File | Settings | File Templates.
 */
public interface TransactionDao {
    List<TransactionInfo> getTransactionsToBeProcessed() throws Exception;

    int updateLastTransactionStats(TransactionInfo transaction) throws Exception;

    int updateLastTransactionNumber(TransactionInfo transaction) throws Exception;

    List<TransactionInfo> getTransactionsByType(String tranType) throws Exception;
}
