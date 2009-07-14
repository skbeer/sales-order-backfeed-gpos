package com.monsanto.irdsoapservices.to;

import com.monsanto.irdsoapservices.agreements.schema.AccountIdentifierType;
import com.monsanto.irdsoapservices.agreements.schema.AccountTypeAttribute;
import com.monsanto.irdsoapservices.agreements.schema.AgreementInformationType;
import com.monsanto.irdsoapservices.utils.XmlDateTimeUtil;

import java.util.Date;

/**
 * Created by IntelliJ IDEA.
 * User: mkuchip
 * Date: Mar 30, 2009
 * Time: 4:09:37 PM
 * To change this template use File | Settings | File Templates.
 */
public class AgreementInfo {
    private long accountId;
    private long signerAccountId;
    private String agreementCode;
    private Date beginDate;
    private Date endDate;
    private Date rowEntryDate;
    private Date rowModifyDate;
    private String rowTaskId;
    private String rowUserId;
    private String identifierType;
    private String identifierValue;
    private String accountAliasId;
    private String signerAliasId;

    public String getAccountAliasId() {
        return accountAliasId;
    }

    public void setAccountAliasId(String accountAliasId) {
        this.accountAliasId = accountAliasId;
    }

    public String getSignerAliasId() {
        return signerAliasId;
    }

    public void setSignerAliasId(String signerAliasId) {
        this.signerAliasId = signerAliasId;
    }

    public String getIdentifierType() {
        return identifierType;
    }

    public void setIdentifierType(String identifierType) {
        this.identifierType = identifierType;
    }

    public String getIdentifierValue() {
        return identifierValue;
    }

    public void setIdentifierValue(String identifierValue) {
        this.identifierValue = identifierValue;
    }

    public long getAccountId() {
        return accountId;
    }

    public void setAccountId(long accountId) {
        this.accountId = accountId;
    }

    public long getSignerAccountId() {
        return signerAccountId;
    }

    public void setSignerAccountId(long signerAccountId) {
        this.signerAccountId = signerAccountId;
    }

    public String getAgreementCode() {
        return agreementCode;
    }

    public void setAgreementCode(String agreementCode) {
        this.agreementCode = agreementCode;
    }

    public Date getBeginDate() {
        return beginDate;
    }

    public void setBeginDate(Date beginDate) {
        this.beginDate = beginDate;
    }

    public Date getEndDate() {
        return endDate;
    }

    public void setEndDate(Date endDate) {
        this.endDate = endDate;
    }

    public Date getRowEntryDate() {
        return rowEntryDate;
    }

    public void setRowEntryDate(Date rowEntryDate) {
        this.rowEntryDate = rowEntryDate;
    }

    public Date getRowModifyDate() {
        return rowModifyDate;
    }

    public void setRowModifyDate(Date rowModifyDate) {
        this.rowModifyDate = rowModifyDate;
    }

    public String getRowTaskId() {
        return rowTaskId;
    }

    public void setRowTaskId(String rowTaskId) {
        this.rowTaskId = rowTaskId;
    }

    public String getRowUserId() {
        return rowUserId;
    }

    public void setRowUserId(String rowUserId) {
        this.rowUserId = rowUserId;
    }

    @Override
    public String toString() {
        return "AgreementInfo{" +
                "accountId=" + accountId +
                ", signerAccountId=" + signerAccountId +
                ", agreementCode='" + agreementCode + '\'' +
                ", beginDate=" + beginDate +
                ", endDate=" + endDate +
                '}';
    }

    public String getAppropriateAccountId(AccountTypeAttribute acctType) {
        if(AccountTypeAttribute.ACCTID.equals(acctType)) {
            return getAccountId()+"";
        } else {
            return getAccountAliasId();
        }
    }

    public String getAppropriateSignerAccountId(AccountTypeAttribute acctType) {
        if(AccountTypeAttribute.ACCTID.equals(acctType)) {
            return getSignerAccountId()+"";
        } else {
            return getSignerAliasId();
        }
    }

    public AgreementInformationType extractAgreementInfoType(AccountTypeAttribute acctTypeAttr) throws Exception {
        AgreementInformationType agreementType = new AgreementInformationType();

        AccountIdentifierType acctIdentifier = new AccountIdentifierType();
        acctIdentifier.setType(acctTypeAttr);
        acctIdentifier.setValue(getAppropriateAccountId(acctTypeAttr));
        agreementType.setAccountIdentifier(acctIdentifier);

        AccountIdentifierType signerAcctIdentifier = new AccountIdentifierType();
        signerAcctIdentifier.setType(acctTypeAttr);
        signerAcctIdentifier.setValue(getAppropriateSignerAccountId(acctTypeAttr));
        agreementType.setSignerAccountIdentifier(signerAcctIdentifier);

        agreementType.setAgreementCode(getAgreementCode());
        agreementType.setBeginDate(XmlDateTimeUtil.transformToXmlGregorianCalendar(getBeginDate()));
        agreementType.setEndDate(XmlDateTimeUtil.transformToXmlGregorianCalendar(getEndDate()));
        agreementType.setLastModifiedBy(getRowUserId());
        agreementType.setLastModifiedDate(XmlDateTimeUtil.transformToXmlGregorianCalendar(getRowModifyDate()));
        return agreementType;
    }
}
