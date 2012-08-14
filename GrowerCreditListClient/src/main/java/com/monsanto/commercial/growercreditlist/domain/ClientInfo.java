package com.monsanto.commercial.growercreditlist.domain;

import com.monsanto.commercial.growercreditlist.util.EnvironmentEnum;

/**
 * Created by IntelliJ IDEA.
 * User: MKUCHIP
 * Date: Jun 27, 2012
 * Time: 1:35:03 PM
 * To change this template use File | Settings | File Templates.
 */
public class ClientInfo {
    private String partnerId;
    private String partnerName;
    private String partnerIdType;
    private String docIdentifier;
    private EnvironmentEnum environment;

    public String getPartnerIdType() {
        return partnerIdType;
    }

    public void setPartnerIdType(String partnerIdType) {
        this.partnerIdType = partnerIdType;
    }

    public String getPartnerId() {
        return partnerId;
    }

    public void setPartnerId(String partnerId) {
        this.partnerId = partnerId;
    }

    public String getPartnerName() {
        return partnerName;
    }

    public void setPartnerName(String partnerName) {
        this.partnerName = partnerName;
    }

    public String getDocIdentifier() {
        return docIdentifier;
    }

    public void setDocIdentifier(String docIdentifier) {
        this.docIdentifier = docIdentifier;
    }

    public EnvironmentEnum getEnvironment() {
        return environment;
    }

    public void setEnvironment(EnvironmentEnum environment) {
        this.environment = environment;
    }
}
