package com.monsanto.irdsoapservices.to;

import com.monsanto.irdsoapservices.agreements.schema.AccountIdentifierType;
import com.monsanto.irdsoapservices.agreements.schema.AccountTypeAttribute;
import com.monsanto.irdsoapservices.agreements.schema.AddressInformationType;
import com.monsanto.irdsoapservices.agreements.schema.SignerInformationType;

/**
 * Created by IntelliJ IDEA.
 * User: caggarw
 * Date: Mar 17, 2010
 * Time: 2:35:24 PM
 * To change this template use File | Settings | File Templates.
 */
public class SignerInformation {

    private long signerAccountId;
    private String signerAliasId;
    private String signerAccountName;
    private String addressLine;
    private String cityName;
    private String stateOrProvince;
    private String postalCode;

    public long getSignerAccountId() {
        return signerAccountId;
    }

    public void setSignerAccountId(long signerAccountId) {
        this.signerAccountId = signerAccountId;
    }

    public String getSignerAccountName() {
        return signerAccountName;
    }

    public void setSignerAccountName(String signerAccountName) {
        this.signerAccountName = signerAccountName;
    }

   public String getAddressLine() {
        return addressLine;
    }

    public void setAddressLine(String addressLine) {
        this.addressLine = addressLine;
    }

    public String getCityName() {
        return cityName;
    }

    public void setCityName(String cityName) {
        this.cityName = cityName;
    }

    public String getStateOrProvince() {
        return stateOrProvince;
    }

    public void setStateOrProvince(String stateOrProvince) {
        this.stateOrProvince = stateOrProvince;
    }

    public String getPostalCode() {
        return postalCode;
    }

    public void setPostalCode(String postalCode) {
        this.postalCode = postalCode;
    }

    public String getSignerAliasId() {
        return signerAliasId;
    }

    public void setSignerAliasId(String signerAliasId) {
        this.signerAliasId = signerAliasId;
    }

    public SignerInformationType extractSignerInformationType() throws Exception {
        SignerInformationType signerInformationType = new SignerInformationType();

        AccountIdentifierType acctIdentifier = new AccountIdentifierType();
        acctIdentifier.setType(AccountTypeAttribute.ACCTID);
        acctIdentifier.setValue(getSignerAccountId()+"");
        signerInformationType.setSignerAccountIdentifier(acctIdentifier);

        AccountIdentifierType aliasIdentifier = new AccountIdentifierType();
        aliasIdentifier.setType(AccountTypeAttribute.SAP);
        aliasIdentifier.setValue(getSignerAliasId());
        signerInformationType.setSignerAliasIdentifier(aliasIdentifier);

        signerInformationType.setSignerAccountName(getSignerAccountName());
        
        AddressInformationType addressInformation =  new AddressInformationType();
        addressInformation.getAddressLine().add(getAddressLine());
        addressInformation.setCityName(getCityName());
        addressInformation.setStateOrProvince(getStateOrProvince());
        addressInformation.setPostalCode(getPostalCode());
        signerInformationType.setAddressInformation(addressInformation);
        return signerInformationType;
    }

}
