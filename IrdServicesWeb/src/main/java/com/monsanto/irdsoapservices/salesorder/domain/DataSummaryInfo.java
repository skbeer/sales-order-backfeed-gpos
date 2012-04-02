package com.monsanto.irdsoapservices.salesorder.domain;

import java.math.BigDecimal;

/**
 * Created by IntelliJ IDEA.
 * User: caggarw
 * Date: Mar 30, 2012
 * Time: 2:20:13 PM
 * To change this template use File | Settings | File Templates.
 */
public class DataSummaryInfo {

    long totalInvoices;
    long totalLineItems;
    long totalDealers;
    long totalGrowers;
    BigDecimal totalEquivalentQuantity;

    public long getTotalInvoices() {
        return totalInvoices;
    }

    public void setTotalInvoices(long totalInvoices) {
        this.totalInvoices = totalInvoices;
    }

    public long getTotalLineItems() {
        return totalLineItems;
    }

    public void setTotalLineItems(long totalLineItems) {
        this.totalLineItems = totalLineItems;
    }

    public long getTotalDealers() {
        return totalDealers;
    }

    public void setTotalDealers(long totalDealers) {
        this.totalDealers = totalDealers;
    }

    public long getTotalGrowers() {
        return totalGrowers;
    }

    public void setTotalGrowers(long totalGrowers) {
        this.totalGrowers = totalGrowers;
    }

    public BigDecimal getTotalEquivalentQuantity() {
        return totalEquivalentQuantity;
    }

    public void setTotalEquivalentQuantity(BigDecimal totalEquivalentQuantity) {
        this.totalEquivalentQuantity = totalEquivalentQuantity;
    }
}
