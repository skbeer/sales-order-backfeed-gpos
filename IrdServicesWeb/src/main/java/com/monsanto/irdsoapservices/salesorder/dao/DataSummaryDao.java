package com.monsanto.irdsoapservices.salesorder.dao;

import com.monsanto.irdsoapservices.salesorder.domain.DataSummaryInfo;
import com.monsanto.irdsoapservices.salesorder.domain.DataSummaryTotals;

import java.util.Date;

/**
 * Created by IntelliJ IDEA.
 * User: caggarw
 * Date: Mar 30, 2012
 * Time: 2:12:01 PM
 * To change this template use File | Settings | File Templates.
 */
public interface DataSummaryDao {

    DataSummaryInfo getDataSummaryInfoDirect(Date startDate, String groupCode) throws Exception;

    //CUSTPLT-632 - Introducing new Partner  Agdata
    DataSummaryInfo getDataSummaryInfoAgdata(Date startDate, String groupCode) throws Exception;

    //OTT 92172 - Seed GPOS Interface to Agdata for Bayer  - Introducing new Partner Agdata2021
    DataSummaryInfo getDataSummaryInfoAgdata2021(Date startDate, String groupCode) throws Exception;


    DataSummaryInfo getDataSummaryInfoXML(Date startDate, String groupCode) throws Exception;

    DataSummaryInfo getDataSummaryInfoAgrmine(Date startDate, String groupCode) throws Exception;

    DataSummaryTotals getDataSummaryTotalsDirect(Date startDate, String groupCode) throws Exception;

    //CUSTPLT-632 - Introducing new Partner Agdata
    DataSummaryTotals getDataSummaryTotalsAgdata(Date startDate, String groupCode) throws Exception;

    //OTT 92172 - Seed GPOS Interface to Agdata for Bayer  - Introducing new Partner Agdata2021
    DataSummaryTotals getDataSummaryTotalsAgdata2021(Date startDate, String groupCode) throws Exception;

    DataSummaryTotals getDataSummaryTotalsXML(Date startDate, String groupCode) throws Exception;

    DataSummaryTotals getDataSummaryTotalsAgrimine(Date startDate, String groupCode) throws Exception;
}
