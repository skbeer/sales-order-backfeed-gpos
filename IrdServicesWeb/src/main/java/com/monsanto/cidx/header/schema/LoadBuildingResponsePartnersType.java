
package com.monsanto.cidx.header.schema;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for LoadBuildingResponsePartnersType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="LoadBuildingResponsePartnersType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{urn:cidx:names:specification:ces:schema:all:5:0}ShipFrom" maxOccurs="unbounded"/>
 *         &lt;element ref="{urn:cidx:names:specification:ces:schema:all:5:0}ShipTo" maxOccurs="unbounded"/>
 *         &lt;element ref="{urn:cidx:names:specification:ces:schema:all:5:0}OtherPartner" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "LoadBuildingResponsePartnersType", propOrder = {
    "shipFrom",
    "shipTo",
    "otherPartner"
})
public class LoadBuildingResponsePartnersType {

    @XmlElement(name = "ShipFrom", required = true)
    protected List<ShipFromType> shipFrom;
    @XmlElement(name = "ShipTo", required = true)
    protected List<ShipToType> shipTo;
    @XmlElement(name = "OtherPartner")
    protected List<OtherPartnerType> otherPartner;

    /**
     * Gets the value of the shipFrom property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the shipFrom property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getShipFrom().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ShipFromType }
     * 
     * 
     */
    public List<ShipFromType> getShipFrom() {
        if (shipFrom == null) {
            shipFrom = new ArrayList<ShipFromType>();
        }
        return this.shipFrom;
    }

    /**
     * Gets the value of the shipTo property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the shipTo property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getShipTo().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ShipToType }
     * 
     * 
     */
    public List<ShipToType> getShipTo() {
        if (shipTo == null) {
            shipTo = new ArrayList<ShipToType>();
        }
        return this.shipTo;
    }

    /**
     * Gets the value of the otherPartner property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the otherPartner property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getOtherPartner().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link OtherPartnerType }
     * 
     * 
     */
    public List<OtherPartnerType> getOtherPartner() {
        if (otherPartner == null) {
            otherPartner = new ArrayList<OtherPartnerType>();
        }
        return this.otherPartner;
    }

}
