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
public class PPOSOrderInfo extends OrderInfo {
    PartnerInfo dealerInfo;
    PartnerInfo growerInfo;

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
}
