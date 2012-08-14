package com.monsanto.commercial.growercreditlist.domain;

/**
 * Created by IntelliJ IDEA.
 * User: MKUCHIP
 * Date: Aug 9, 2012
 * Time: 2:29:51 PM
 * To change this template use File | Settings | File Templates.
 */
public class GrowerCreditInfo {
    private String growerAccountId;
    private double creditApproved;
    private double creditAvailable;

    public String getGrowerAccountId() {
        return growerAccountId;
    }

    public void setGrowerAccountId(String growerAccountId) {
        this.growerAccountId = growerAccountId;
    }

    public double getCreditApproved() {
        return creditApproved;
    }

    public void setCreditApproved(double creditApproved) {
        this.creditApproved = creditApproved;
    }

    public double getCreditAvailable() {
        return creditAvailable;
    }

    public void setCreditAvailable(double creditAvailable) {
        this.creditAvailable = creditAvailable;
    }
}
