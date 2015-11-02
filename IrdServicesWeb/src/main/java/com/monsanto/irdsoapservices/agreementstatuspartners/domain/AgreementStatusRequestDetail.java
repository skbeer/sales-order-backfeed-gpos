package com.monsanto.irdsoapservices.agreementstatuspartners.domain;


import java.util.List;

public class AgreementStatusRequestDetail {

    PartnerInformationRequest buyer;
    PartnerInformationRequest seller;
    PartnerInformationRequest shipTo;

    public AgreementStatusRequestDetail(PartnerInformationRequest buyer, PartnerInformationRequest seller, PartnerInformationRequest shipTo) {
        this.buyer = buyer;
        this.seller = seller;
        this.shipTo = shipTo;
    }

    public PartnerInformationRequest getBuyer() {
        return buyer;
    }

    public void setBuyer(PartnerInformationRequest buyer) {
        this.buyer = buyer;
    }

    public PartnerInformationRequest getSeller() {
        return seller;
    }

    public void setSeller(PartnerInformationRequest seller) {
        this.seller = seller;
    }

    public PartnerInformationRequest getShipTo() {
        return shipTo;
    }

    public void setShipTo(PartnerInformationRequest shipTo) {
        this.shipTo = shipTo;
    }
}
