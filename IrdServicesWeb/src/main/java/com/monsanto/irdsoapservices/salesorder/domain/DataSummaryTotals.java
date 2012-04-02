package com.monsanto.irdsoapservices.salesorder.domain;

import java.math.BigInteger;

/**
 * Created by IntelliJ IDEA.
 * User: caggarw
 * Date: Apr 2, 2012
 * Time: 3:34:17 PM
 * To change this template use File | Settings | File Templates.
 */
public class DataSummaryTotals {
    String totalOpenInvoices;
    String totalDailyOpenInvoices;

    public String getTotalOpenInvoices() {
        return totalOpenInvoices;
    }

    public void setTotalOpenInvoices(String totalOpenInvoices) {
        this.totalOpenInvoices = totalOpenInvoices;
    }

    public String getTotalDailyOpenInvoices() {
        return totalDailyOpenInvoices;
    }

    public void setTotalDailyOpenInvoices(String totalDailyOpenInvoices) {
        this.totalDailyOpenInvoices = totalDailyOpenInvoices;
    }
}
