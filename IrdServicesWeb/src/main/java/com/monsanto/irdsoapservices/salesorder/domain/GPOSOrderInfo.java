package com.monsanto.irdsoapservices.salesorder.domain;

/**
 * Created by IntelliJ IDEA.
 * User: MKUCHIP
 * Date: Jun 8, 2010
 * Time: 9:47:02 AM
 * To change this template use File | Settings | File Templates.
 */
public class GPOSOrderInfo extends OrderInfo {
    PartnerInfo growerInfo;
    PartnerInfo salesRepWinfield;

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

    public PartnerInfo getSalesRepWinfield() {
        return salesRepWinfield;
    }

    public void setSalesRepWinfield(PartnerInfo salesRepWinfield) {
        this.salesRepWinfield = salesRepWinfield;
    }
}
