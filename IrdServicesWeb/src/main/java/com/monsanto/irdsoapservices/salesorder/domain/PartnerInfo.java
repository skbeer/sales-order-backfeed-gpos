package com.monsanto.irdsoapservices.salesorder.domain;

/**
 * Created by IntelliJ IDEA.
 * User: MKUCHIP
 * Date: Jun 8, 2010
 * Time: 11:12:43 AM
 * To change this template use File | Settings | File Templates.
 */
public class PartnerInfo {
    String acctId;
    String ebid;
    String gln;
    String napd;
    String buyerId;
    String partnerName;
    String contactName;
    String address;
    String address2;
    String city;
    String state;
    String zip;
    String county;
    String postalCountry = "US";
    String techId;

    public String getTechId() {
        return techId;
    }

    public void setTechId(String techId) {
        this.techId = techId;
    }

    public String getPostalCountry() {
        return postalCountry;
    }

    public void setPostalCountry(String postalCountry) {
        this.postalCountry = postalCountry;
    }

    public String getBuyerId() {
        return buyerId;
    }

    public void setBuyerId(String buyerId) {
        this.buyerId = buyerId;
    }

    public String getAddress2() {
        return address2;
    }

    public void setAddress2(String address2) {
        this.address2 = address2;
    }

    public String getNapd() {
        return napd;
    }

    public void setNapd(String napd) {
        this.napd = napd;
    }

    public String getContactName() {
        return contactName;
    }

    public void setContactName(String contactName) {
        this.contactName = contactName;
    }

    public String getAcctId() {
        return acctId;
    }

    public void setAcctId(String acctId) {
        this.acctId = acctId;
    }

    public String getEbid() {
        return ebid;
    }

    public void setEbid(String ebid) {
        this.ebid = ebid;
    }

    public String getGln() {
        return gln;
    }

    public void setGln(String gln) {
        this.gln = gln;
    }

    public String getPartnerName() {
        return partnerName;
    }

    public void setPartnerName(String name) {
        this.partnerName = name;
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

    public String getCounty() {
        return county;
    }

    public void setCounty(String county) {
        this.county = county;
    }
}
