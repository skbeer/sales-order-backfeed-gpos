package com.monsanto.irdsoapservices.salesorder.domain;

import java.util.List;
import java.util.ArrayList;
import java.util.Date;

/**
 * Created by IntelliJ IDEA.
 * User: MKUCHIP
 * Date: Jun 8, 2010
 * Time: 9:47:02 AM
 * To change this template use File | Settings | File Templates.
 */
public class PPOSOrderInfo {
    String crmOrderNumber;
    String orderNumber;
    String orderType;
    String orderFiscalYear;
    Date orderDate;
    PartnerInfo dealerInfo;
    PartnerInfo growerInfo;
    List<LineItemInfo> lineItems = new ArrayList<LineItemInfo>();
    LineItemInfo tempLineItem;

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

    public PartnerInfo getDealerInfo() {
        return dealerInfo;
    }

    public void setDealerInfo(PartnerInfo dealerInfo) {
        this.dealerInfo = dealerInfo;
    }

    public PartnerInfo getGrowerInfo() {
        return growerInfo;
    }

    public void setGrowerInfo(PartnerInfo growerInfo) {
        this.growerInfo = growerInfo;
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
