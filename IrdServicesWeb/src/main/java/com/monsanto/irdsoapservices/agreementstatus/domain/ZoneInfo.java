package com.monsanto.irdsoapservices.agreementstatus.domain;

/**
 * Created by IntelliJ IDEA.
 * User: MKUCHIP
 * Date: Jul 9, 2010
 * Time: 1:46:41 PM
 * To change this template use File | Settings | File Templates.
 */
public class ZoneInfo {
    String zoneId;
    String zoneType;
    String zoneName;
    String cropCode;
    String cropName;

    public String getCropCode() {
        return cropCode;
    }

    public void setCropCode(String cropCode) {
        this.cropCode = cropCode;
    }

    public String getCropName() {
        return cropName;
    }

    public void setCropName(String cropName) {
        this.cropName = cropName;
    }

    public String getZoneId() {
        return zoneId;
    }

    public void setZoneId(String zoneId) {
        this.zoneId = zoneId;
    }

    public String getZoneType() {
        return zoneType;
    }

    public void setZoneType(String zoneType) {
        this.zoneType = zoneType;
    }

    public String getZoneName() {
        return zoneName;
    }

    public void setZoneName(String zoneName) {
        this.zoneName = zoneName;
    }
}
