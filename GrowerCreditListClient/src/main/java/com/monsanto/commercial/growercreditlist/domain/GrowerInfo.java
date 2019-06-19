package com.monsanto.commercial.growercreditlist.domain;

import java.util.Date;

/**
 * Created by IntelliJ IDEA.
 * User: MKUCHIP
 * Date: Aug 15, 2012
 * Time: 2:22:32 PM
 * To change this template use File | Settings | File Templates.
 */
public class GrowerInfo {
    private String accountId;
    private String gln;
    //DDP-1877 Changes made by VVVL as part of this JIRA
    private  String dealer_gln;
    private String sapId;
    private String name;
    private String address;
    private String city;
    private String state;
    private String zip;
    private String creditType;
    private double creditApproved;
    private double creditAvailable;
    private Date dateApproved;
    private String dealerAccountId;

    public String getSapId() {
        return sapId;
    }

    public void setSapId(String sapId) {
        this.sapId = sapId;
    }

    public String getAccountId() {
        return accountId;
    }

    public void setAccountId(String accountId) {
        this.accountId = accountId;
    }

    //DDP-1877 Changes made by VVVL as part of this JIRA
    public String getDealer_gln() {
        return dealer_gln;
    }

    public void setDealer_gln(String dealer_gln) {
        this.dealer_gln = dealer_gln;
    }

    public String getGln() {
        return gln;
    }

    public void setGln(String gln) {
        this.gln = gln;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getZip() {
        return zip;
    }

    public void setZip(String zip) {
        this.zip = zip;
    }

    public String getCreditType() {
        return creditType;
    }

    public void setCreditType(String creditType) {
        this.creditType = creditType;
    }

    public Date getDateApproved() {
        return dateApproved;
    }

    public void setDateApproved(Date dateApproved) {
        this.dateApproved = dateApproved;
    }

    public String getDealerAccountId() {
        return dealerAccountId;
    }

    public void setDealerAccountId(String dealerAccountId) {
        this.dealerAccountId = dealerAccountId;
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


 

