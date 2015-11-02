package com.monsanto.irdsoapservices.agreementstatus.domain;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by IntelliJ IDEA.
 * User: MKUCHIP
 * Date: Jul 9, 2010
 * Time: 1:52:56 PM
 * To change this template use File | Settings | File Templates.
 */
public class AgreementInfo {
    String agreementName;
    String agreementStatus;
    String licenseNumber;
    ZoneInfo tempZone;
    List<ZoneInfo> zones = new ArrayList<ZoneInfo>();

    public String getAgreementName() {
        return agreementName;
    }

    public void setAgreementName(String agreementName) {
        this.agreementName = agreementName;
    }

    public String getAgreementStatus() {
        return agreementStatus;
    }

    public void setAgreementStatus(String agreementStatus) {
        this.agreementStatus = agreementStatus;
    }

    public String getLicenseNumber() {
        return licenseNumber;
    }

    public void setLicenseNumber(String licenseNumber) {
        this.licenseNumber = licenseNumber;
    }

    public ZoneInfo getTempZone() {
        return tempZone;
    }

    public void setTempZone(ZoneInfo tempZone) {
        this.tempZone = tempZone;
    }

    public List<ZoneInfo> getZones() {
        return zones;
    }

    public void setZones(List<ZoneInfo> zones) {
        this.zones = zones;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        AgreementInfo that = (AgreementInfo) o;

        if (!agreementName.equals(that.agreementName)) return false;

        return true;
    }

    @Override
    public int hashCode() {
        return agreementName.hashCode();
    }
}
