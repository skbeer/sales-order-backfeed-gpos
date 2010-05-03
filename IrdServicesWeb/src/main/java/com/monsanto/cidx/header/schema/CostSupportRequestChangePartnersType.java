
package com.monsanto.cidx.header.schema;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CostSupportRequestChangePartnersType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CostSupportRequestChangePartnersType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{urn:cidx:names:specification:ces:schema:all:5:0}Distributor"/>
 *         &lt;element ref="{urn:cidx:names:specification:ces:schema:all:5:0}SoldBy"/>
 *         &lt;element ref="{urn:cidx:names:specification:ces:schema:all:5:0}Supplier"/>
 *         &lt;element ref="{urn:cidx:names:specification:ces:schema:all:5:0}ShipTo" maxOccurs="unbounded"/>
 *         &lt;element ref="{urn:cidx:names:specification:ces:schema:all:5:0}SoldTo"/>
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
@XmlType(name = "CostSupportRequestChangePartnersType", propOrder = {
    "distributor",
    "soldBy",
    "supplier",
    "shipTo",
    "soldTo",
    "otherPartner"
})
public class CostSupportRequestChangePartnersType {

    @XmlElement(name = "Distributor", required = true)
    protected DistributorType distributor;
    @XmlElement(name = "SoldBy", required = true)
    protected SoldByType soldBy;
    @XmlElement(name = "Supplier", required = true)
    protected SupplierType supplier;
    @XmlElement(name = "ShipTo", required = true)
    protected List<ShipToType> shipTo;
    @XmlElement(name = "SoldTo", required = true)
    protected SoldToType soldTo;
    @XmlElement(name = "OtherPartner")
    protected List<OtherPartnerType> otherPartner;

    /**
     * Gets the value of the distributor property.
     * 
     * @return
     *     possible object is
     *     {@link DistributorType }
     *     
     */
    public DistributorType getDistributor() {
        return distributor;
    }

    /**
     * Sets the value of the distributor property.
     * 
     * @param value
     *     allowed object is
     *     {@link DistributorType }
     *     
     */
    public void setDistributor(DistributorType value) {
        this.distributor = value;
    }

    /**
     * Gets the value of the soldBy property.
     * 
     * @return
     *     possible object is
     *     {@link SoldByType }
     *     
     */
    public SoldByType getSoldBy() {
        return soldBy;
    }

    /**
     * Sets the value of the soldBy property.
     * 
     * @param value
     *     allowed object is
     *     {@link SoldByType }
     *     
     */
    public void setSoldBy(SoldByType value) {
        this.soldBy = value;
    }

    /**
     * Gets the value of the supplier property.
     * 
     * @return
     *     possible object is
     *     {@link SupplierType }
     *     
     */
    public SupplierType getSupplier() {
        return supplier;
    }

    /**
     * Sets the value of the supplier property.
     * 
     * @param value
     *     allowed object is
     *     {@link SupplierType }
     *     
     */
    public void setSupplier(SupplierType value) {
        this.supplier = value;
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
     * Gets the value of the soldTo property.
     * 
     * @return
     *     possible object is
     *     {@link SoldToType }
     *     
     */
    public SoldToType getSoldTo() {
        return soldTo;
    }

    /**
     * Sets the value of the soldTo property.
     * 
     * @param value
     *     allowed object is
     *     {@link SoldToType }
     *     
     */
    public void setSoldTo(SoldToType value) {
        this.soldTo = value;
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
