package com.monsanto.irdsoapservices.salesorder.dao;

import com.monsanto.irdsoapservices.salesorder.domain.DataSummaryInfo;
import com.monsanto.irdsoapservices.salesorder.domain.DataSummaryTotals;
import com.monsanto.irdsoapservices.salesorder.domain.GPOSOrderInfo;

import java.util.Date;
import java.util.List;

/**
 * Created by IntelliJ IDEA.
 * User: caggarw
 * Date: Mar 30, 2012
 * Time: 2:12:01 PM
 * To change this template use File | Settings | File Templates.
 */
public interface DataSummaryDao {

    DataSummaryInfo getDataSummaryInfoDirect(Date startDate, String groupCode) throws Exception;

    DataSummaryInfo getDataSummaryInfoXML(Date startDate, String groupCode) throws Exception;

    DataSummaryInfo getDataSummaryInfoAgrmine(Date startDate, String groupCode) throws Exception;

    DataSummaryTotals getDataSummaryTotalsDirect(Date startDate, String groupCode) throws Exception;

    DataSummaryTotals getDataSummaryTotalsXML(Date startDate, String groupCode) throws Exception;

    DataSummaryTotals getDataSummaryTotalsAgrimine(Date startDate, String groupCode) throws Exception;
}
