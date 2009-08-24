package com.monsanto.irdsoapservices.to;

import com.monsanto.irdsoapservices.brands.schema.BrandType;

/**
 * Created by IntelliJ IDEA.
 * User: MKUCHIP
 * Date: Apr 1, 2009
 * Time: 3:31:59 PM
 * To change this template use File | Settings | File Templates.
 */
public class BrandInfo {
    private String specieName;
    private long brandId;
    private String brandDescr;
    private long seedCompanyAccountId;
    private String seedCompanyName;
    private String accountAttribute;
    private String sapBrandChannel;

    public long getSeedCompanyAccountId() {
        return seedCompanyAccountId;
    }

    public void setSeedCompanyAccountId(long seedCompanyAccountId) {
        this.seedCompanyAccountId = seedCompanyAccountId;
    }

    public String getSeedCompanyName() {
        return seedCompanyName;
    }

    public void setSeedCompanyName(String seedCompanyName) {
        this.seedCompanyName = seedCompanyName;
    }

    public String getAccountAttribute() {
        return accountAttribute;
    }

    public void setAccountAttribute(String accountAttribute) {
        this.accountAttribute = accountAttribute;
    }

    public String getSapBrandChannel() {
        return sapBrandChannel;
    }

    public void setSapBrandChannel(String sapBrandChannel) {
        this.sapBrandChannel = sapBrandChannel;
    }

    public String getSpecieName() {
        return specieName;
    }

    public void setSpecieName(String specieName) {
        this.specieName = specieName;
    }

    public long getBrandId() {
        return brandId;
    }

    public void setBrandId(long brandId) {
        this.brandId = brandId;
    }

    public String getBrandDescr() {
        return brandDescr;
    }

    public void setBrandDescr(String brandDescr) {
        this.brandDescr = brandDescr;
    }

    public BrandType extractBrandType() throws Exception {
        BrandType brandType = new BrandType();
        brandType.setBrandId(getBrandId());
        brandType.setBrandDescription(getBrandDescr());
        brandType.setSeedCompanyAccountId(getSeedCompanyAccountId());
        brandType.setSeedCompanyName(getSeedCompanyName());
        brandType.setSeedCompanyAccountAttribute(getAccountAttribute());
        brandType.setSAPBrandChannel(getSapBrandChannel());
        return brandType;
    }

    @Override
    public String toString() {
        return "BrandInfo{" +
                "specieName='" + specieName + '\'' +
                ", brandId=" + brandId +
                ", brandDescr='" + brandDescr + '\'' +
                ", seedCompanyAccountId=" + seedCompanyAccountId +
                ", seedCompanyName='" + seedCompanyName + '\'' +
                ", accountAttribute='" + accountAttribute + '\'' +
                ", sapBrandChannel='" + sapBrandChannel + '\'' +
                '}';
    }
}
