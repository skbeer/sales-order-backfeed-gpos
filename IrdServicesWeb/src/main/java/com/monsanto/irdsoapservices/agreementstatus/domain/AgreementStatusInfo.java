package com.monsanto.irdsoapservices.agreementstatus.domain;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by IntelliJ IDEA.
 * User: MKUCHIP
 * Date: Jul 9, 2010
 * Time: 1:47:30 PM
 * To change this template use File | Settings | File Templates.
 */
public class AgreementStatusInfo {
    String gln;
    String acctId;
    String partnerName;
    String contactName;
    String speciesCode;
    AgreementInfo tempAgreement;
    List<AgreementInfo> agreements = new ArrayList<AgreementInfo>();

    public String getGln() {
        return gln;
    }

    public void setGln(String gln) {
        this.gln = gln;
    }

    public String getAcctId() {
        return acctId;
    }

    public void setAcctId(String acctId) {
        this.acctId = acctId;
    }

    public String getPartnerName() {
        return partnerName;
    }

    public void setPartnerName(String partnerName) {
        this.partnerName = partnerName;
    }

    public String getContactName() {
        return contactName;
    }

    public void setContactName(String contactName) {
        this.contactName = contactName;
    }

    public String getSpeciesCode() {
        return speciesCode;
    }

    public void setSpeciesCode(String speciesCode) {
        this.speciesCode = speciesCode;
    }

    public AgreementInfo getTempAgreement() {
        return tempAgreement;
    }

    public void setTempAgreement(AgreementInfo tempAgreement) {
        this.tempAgreement = tempAgreement;
    }

    public List<AgreementInfo> getAgreements() {
        return agreements;
    }

    public void setAgreements(List<AgreementInfo> agreements) {
        this.agreements = agreements;
    }
}
