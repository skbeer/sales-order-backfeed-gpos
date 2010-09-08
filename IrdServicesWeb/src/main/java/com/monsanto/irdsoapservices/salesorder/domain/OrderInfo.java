package com.monsanto.irdsoapservices.salesorder.domain;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * Created by IntelliJ IDEA.
 * User: MKUCHIP
 * Date: Jun 22, 2010
 * Time: 10:04:02 AM
 * To change this template use File | Settings | File Templates.
 */
public abstract class OrderInfo {
    String crmOrderNumber;
    String orderNumber;
    String orderType;
    String orderFiscalYear;
    Date orderDate;
    List<LineItemInfo> lineItems = new ArrayList<LineItemInfo>();
    LineItemInfo tempLineItem;
    PartnerInfo dealerInfo;

    public PartnerInfo getDealerInfo() {
        return dealerInfo;
    }

    public void setDealerInfo(PartnerInfo dealerInfo) {
        this.dealerInfo = dealerInfo;
    }

    public String getCrmOrderNumber() {
        return crmOrderNumber;
    }

    public void setCrmOrderNumber(String crmOrderNumber) {
        this.crmOrderNumber = crmOrderNumber;
    }

    public String getOrderNumber() {
        return orderNumber;
    }

    public void setOrderNumber(String orderNumber) {
        this.orderNumber = orderNumber;
    }

    public String getOrderType() {
        return orderType;
    }

    public void setOrderType(String orderType) {
        this.orderType = orderType;
    }

    public String getOrderFiscalYear() {
        return orderFiscalYear;
    }

    public void setOrderFiscalYear(String orderFiscalYear) {
        this.orderFiscalYear = orderFiscalYear;
    }

    public Date getOrderDate() {
        return orderDate;
    }

    public void setOrderDate(Date orderDate) {
        this.orderDate = orderDate;
    }

    public List<LineItemInfo> getLineItems() {
        return lineItems;
    }

    public void setLineItems(List<LineItemInfo> lineItems) {
        this.lineItems = lineItems;
    }

    public LineItemInfo getTempLineItem() {
        return tempLineItem;
    }

    public void setTempLineItem(LineItemInfo tempLineItem) {
        this.tempLineItem = tempLineItem;
    }
}
