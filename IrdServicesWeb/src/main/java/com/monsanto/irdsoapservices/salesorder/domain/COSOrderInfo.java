package com.monsanto.irdsoapservices.salesorder.domain;

/**
 * Created by IntelliJ IDEA.
 * User: MKUCHIP
 * Date: Jun 22, 2010
 * Time: 10:05:31 AM
 * To change this template use File | Settings | File Templates.
 */
public class COSOrderInfo extends OrderInfo {
    PartnerInfo shipTo;
    PartnerInfo billTo;
    String rejectReason;

    public String getRejectReason() {
        return rejectReason;
    }

    public void setRejectReason(String rejectReason) {
        this.rejectReason = rejectReason;
    }

    public PartnerInfo getShipTo() {
        return shipTo;
    }

    public void setShipTo(PartnerInfo shipTo) {
        this.shipTo = shipTo;
    }

    public PartnerInfo getBillTo() {
        return billTo;
    }

    public void setBillTo(PartnerInfo billTo) {
        this.billTo = billTo;
    }
}
