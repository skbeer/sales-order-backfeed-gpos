
package com.monsanto.cidx.header.schema;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CarrierWeightsBodyType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CarrierWeightsBodyType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{urn:cidx:names:specification:ces:schema:all:5:0}CarrierWeightsProperties"/>
 *         &lt;element ref="{urn:cidx:names:specification:ces:schema:all:5:0}CarrierWeightsPartners"/>
 *         &lt;element ref="{urn:cidx:names:specification:ces:schema:all:5:0}CarrierWeightsDetails" maxOccurs="unbounded"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CarrierWeightsBodyType", propOrder = {
    "carrierWeightsProperties",
    "carrierWeightsPartners",
    "carrierWeightsDetails"
})
public class CarrierWeightsBodyType {

    @XmlElement(name = "CarrierWeightsProperties", required = true)
    protected CarrierWeightsPropertiesType carrierWeightsProperties;
    @XmlElement(name = "CarrierWeightsPartners", required = true)
    protected CarrierWeightsPartnersType carrierWeightsPartners;
    @XmlElement(name = "CarrierWeightsDetails", required = true)
    protected List<CarrierWeightsDetailsType> carrierWeightsDetails;

    /**
     * Gets the value of the carrierWeightsProperties property.
     * 
     * @return
     *     possible object is
     *     {@link CarrierWeightsPropertiesType }
     *     
     */
    public CarrierWeightsPropertiesType getCarrierWeightsProperties() {
        return carrierWeightsProperties;
    }

    /**
     * Sets the value of the carrierWeightsProperties property.
     * 
     * @param value
     *     allowed object is
     *     {@link CarrierWeightsPropertiesType }
     *     
     */
    public void setCarrierWeightsProperties(CarrierWeightsPropertiesType value) {
        this.carrierWeightsProperties = value;
    }

    /**
     * Gets the value of the carrierWeightsPartners property.
     * 
     * @return
     *     possible object is
     *     {@link CarrierWeightsPartnersType }
     *     
     */
    public CarrierWeightsPartnersType getCarrierWeightsPartners() {
        return carrierWeightsPartners;
    }

    /**
     * Sets the value of the carrierWeightsPartners property.
     * 
     * @param value
     *     allowed object is
     *     {@link CarrierWeightsPartnersType }
     *     
     */
    public void setCarrierWeightsPartners(CarrierWeightsPartnersType value) {
        this.carrierWeightsPartners = value;
    }

    /**
     * Gets the value of the carrierWeightsDetails property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the carrierWeightsDetails property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCarrierWeightsDetails().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CarrierWeightsDetailsType }
     * 
     * 
     */
    public List<CarrierWeightsDetailsType> getCarrierWeightsDetails() {
        if (carrierWeightsDetails == null) {
            carrierWeightsDetails = new ArrayList<CarrierWeightsDetailsType>();
        }
        return this.carrierWeightsDetails;
    }

}
