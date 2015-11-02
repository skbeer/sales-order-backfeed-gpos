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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        ZoneInfo zoneInfo = (ZoneInfo) o;

        if (!cropCode.equals(zoneInfo.cropCode)) return false;
        if (!cropName.equals(zoneInfo.cropName)) return false;
        if (!zoneId.equals(zoneInfo.zoneId)) return false;
        if (!zoneName.equals(zoneInfo.zoneName)) return false;
        if (!zoneType.equals(zoneInfo.zoneType)) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = zoneId.hashCode();
        result = 31 * result + zoneType.hashCode();
        result = 31 * result + zoneName.hashCode();
        result = 31 * result + cropCode.hashCode();
        result = 31 * result + cropName.hashCode();
        return result;
    }
}
