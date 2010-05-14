package com.monsanto.irdsoapservices.to;

import java.sql.Timestamp;
import java.io.Serializable;

/**
 * Created by IntelliJ IDEA.
 * User: SVADLAM
 * Date: Apr 19, 2010
 * Time: 1:02:59 PM
 * To change this template use File | Settings | File Templates.
 */
public class ProcessorTO implements Serializable{
    private String acctId;
    private String ebId;
    private String processorCode;
    private String activeFlag;
    private String acctName;
    private String address;
    private String city;
    private String state;
    private String zipCode;
    private Timestamp acctLastModifiedDateTime;

    public String getAcctId() {
        return acctId;
    }

    public void setAcctId(String acctId) {
        this.acctId = acctId;
    }

    public String getEbId() {
        return ebId;
    }

    public void setEbId(String ebId) {
        this.ebId = ebId;
    }

    public String getProcessorCode() {
        return processorCode;
    }

    public void setProcessorCode(String processorCode) {
        this.processorCode = processorCode;
    }

    public String getActiveFlag() {
        return activeFlag;
    }

    public void setActiveFlag(String activeFlag) {
        this.activeFlag = activeFlag;
    }

    public String getAcctName() {
        return acctName;
    }

    public void setAcctName(String acctName) {
        this.acctName = acctName;
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

    public String getZipCode() {
        return zipCode;
    }

    public void setZipCode(String zipCode) {
        this.zipCode = zipCode;
    }

    public Timestamp getAcctLastModifiedDateTime() {
        return acctLastModifiedDateTime;
    }

    public void setAcctLastModifiedDateTime(Timestamp acctLastModifiedDateTime) {
        this.acctLastModifiedDateTime = acctLastModifiedDateTime;
    }
}
