package com.monsanto.irdsoapservices.retailseller.domain;

/**
 * Created by IntelliJ IDEA.
 * User: MKUCHIP
 * Date: Jun 28, 2010
 * Time: 9:34:09 AM
 * To change this template use File | Settings | File Templates.
 */
public class SellerInfo {
    String aliasCode;
    String firstName;
    String lastName;
    String addressLine1;
    String addressLine2;
    String city;
    String state;
    String zip;
    String country;
    String ebid;
    String hqEbid;
    String rowTaskId;
    String phoneNumber;

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getAliasCode() {
        return aliasCode;
    }

    public void setAliasCode(String aliasCode) {
        this.aliasCode = aliasCode;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getAddressLine1() {
        return addressLine1;
    }

    public void setAddressLine1(String addressLine1) {
        this.addressLine1 = addressLine1;
    }

    public String getAddressLine2() {
        return addressLine2;
    }

    public void setAddressLine2(String addressLine2) {
        this.addressLine2 = addressLine2;
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

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getEbid() {
        return ebid;
    }

    public void setEbid(String ebid) {
        this.ebid = ebid;
    }

    public String getHqEbid() {
        return hqEbid;
    }

    public void setHqEbid(String hqEbid) {
        this.hqEbid = hqEbid;
    }

    public String getRowTaskId() {
        return rowTaskId;
    }

    public void setRowTaskId(String rowTaskId) {
        this.rowTaskId = rowTaskId;
    }
}
