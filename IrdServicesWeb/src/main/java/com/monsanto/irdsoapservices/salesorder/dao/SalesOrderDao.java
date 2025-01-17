package com.monsanto.irdsoapservices.salesorder.dao;

import com.monsanto.irdsoapservices.salesorder.domain.COSOrderInfo;
import com.monsanto.irdsoapservices.salesorder.domain.GPOSOrderInfo;
import com.monsanto.irdsoapservices.salesorder.domain.PPOSOrderInfo;

import java.util.Date;
import java.util.List;

/**
 * Created by IntelliJ IDEA.
 * User: MKUCHIP
 * Date: Jun 8, 2010
 * Time: 2:19:32 PM
 * To change this template use  File | Settings | File Templates.
 */
public interface SalesOrderDao {
    List<PPOSOrderInfo> getPPOSOrders(Date startDate, String groupCode) throws Exception;

    List<COSOrderInfo> getCOSOrders(Date startDate, String groupCode) throws Exception;

    List<GPOSOrderInfo> getGPOSOrders(Date startDate, String groupCode) throws Exception;

    List<GPOSOrderInfo> getGPOSDirectOrders(Date startDate, String groupCode) throws Exception;

    List<GPOSOrderInfo> getGPOSDirectOrders(Date startDate, String groupCode, String companyCode) throws Exception;

    List<GPOSOrderInfo> getGPOSXMLOrders(Date startDate, String groupCode) throws Exception;

    List<GPOSOrderInfo> getGPOSXMLOrders(Date startDate, String groupCode, String companyCode) throws Exception;

    List<GPOSOrderInfo> getGPOSAgrimineOrders(Date startDate, String groupCode) throws Exception;

    //CUSTPLT-632 - Introducing new Partner Agdata
    List<GPOSOrderInfo> getGPOSAgDataOrders(Date startDate, String groupCode) throws Exception;

    List<GPOSOrderInfo> getGPOSAgDataOrders(Date startDate, String groupCode, String companyCode) throws Exception;

    //OTT 92172 - Seed GPOS Interface to Agdata for Bayer  - Introducing new Partner Agdata2021
    List<GPOSOrderInfo> getGPOSAgDataOrders2021(Date startDate, String groupCode) throws Exception;

    List<GPOSOrderInfo> getGPOSAgDataOrders2021(Date startDate, String groupCode, String companyCode) throws Exception;
}
