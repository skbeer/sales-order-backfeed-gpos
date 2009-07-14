package com.monsanto.irdsoapservices.to;

/**
 * Created by IntelliJ IDEA.
 * User: mkuchip
 * Date: Apr 20, 2009
 * Time: 10:40:34 AM
 * To change this template use File | Settings | File Templates.
 */
public class AgreementHierarchyInfo {
    private String agreementCode;
    private String agreementDescr;
    private String commercialAgreement;
    private String monsantoTraitAgreement;
    private String cornAgreementFlag;
    private String soybeanAgreementFlag;

    public String getAgreementCode() {
        return agreementCode;
    }

    public void setAgreementCode(String agreementCode) {
        this.agreementCode = agreementCode;
    }

    public String getAgreementDescr() {
        return agreementDescr;
    }

    public void setAgreementDescr(String agreementDescr) {
        this.agreementDescr = agreementDescr;
    }

    public String getCommercialAgreement() {
        return commercialAgreement;
    }

    public void setCommercialAgreement(String commercialAgreement) {
        this.commercialAgreement = commercialAgreement;
    }

    public String getMonsantoTraitAgreement() {
        return monsantoTraitAgreement;
    }

    public void setMonsantoTraitAgreement(String monsantoTraitAgreement) {
        this.monsantoTraitAgreement = monsantoTraitAgreement;
    }

    public String getCornAgreementFlag() {
        return cornAgreementFlag;
    }

    public void setCornAgreementFlag(String cornAgreementFlag) {
        this.cornAgreementFlag = cornAgreementFlag;
    }

    public String getSoybeanAgreementFlag() {
        return soybeanAgreementFlag;
    }

    public void setSoybeanAgreementFlag(String soybeanAgreementFlag) {
        this.soybeanAgreementFlag = soybeanAgreementFlag;
    }
}
