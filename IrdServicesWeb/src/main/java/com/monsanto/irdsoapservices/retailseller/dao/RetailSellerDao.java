package com.monsanto.irdsoapservices.retailseller.dao;

import com.monsanto.irdsoapservices.retailseller.domain.SellerInfo;

import java.util.List;

/**
 * Created by IntelliJ IDEA.
 * User: MKUCHIP
 * Date: Jun 28, 2010
 * Time: 11:19:47 AM
 * To change this template use File | Settings | File Templates.
 */
public interface RetailSellerDao {
    int insertSellers(List<SellerInfo> sellerList) throws Exception;
}
