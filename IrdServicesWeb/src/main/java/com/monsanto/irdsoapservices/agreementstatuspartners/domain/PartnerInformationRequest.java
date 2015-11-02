package com.monsanto.irdsoapservices.agreementstatuspartners.domain;



public class PartnerInformationRequest {

    private String name;
    private String element;
    private String agency;
    private String id;
    private String acctId;

    public PartnerInformationRequest(String element, String name, String agency, String id) {
        this.element = element;
        this.name = name;
        this.agency = agency;
        this.id = id;
    }

    public String getElement() {
        return element;
    }

    public void setElement(String element) {
        this.element = element;
    }

    public String getAgency() {
        return agency;
    }

    public void setAgency(String agency) {
        this.agency = agency;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

}
