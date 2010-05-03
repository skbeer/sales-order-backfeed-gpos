
package com.monsanto.cidx.header.schema;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for HazardousGoodsType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="HazardousGoodsType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{urn:cidx:names:specification:ces:schema:all:5:0}HazardousIdentification" minOccurs="0"/>
 *         &lt;element ref="{urn:cidx:names:specification:ces:schema:all:5:0}HazardousShipment"/>
 *         &lt;element ref="{urn:cidx:names:specification:ces:schema:all:5:0}HazardousFormattedText" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "HazardousGoodsType", propOrder = {
    "hazardousIdentification",
    "hazardousShipment",
    "hazardousFormattedText"
})
public class HazardousGoodsType {

    @XmlElement(name = "HazardousIdentification")
    protected HazardousIdentificationType hazardousIdentification;
    @XmlElement(name = "HazardousShipment", required = true)
    protected HazardousShipmentType hazardousShipment;
    @XmlElement(name = "HazardousFormattedText")
    protected List<HazardousFormattedTextType> hazardousFormattedText;

    /**
     * Gets the value of the hazardousIdentification property.
     * 
     * @return
     *     possible object is
     *     {@link HazardousIdentificationType }
     *     
     */
    public HazardousIdentificationType getHazardousIdentification() {
        return hazardousIdentification;
    }

    /**
     * Sets the value of the hazardousIdentification property.
     * 
     * @param value
     *     allowed object is
     *     {@link HazardousIdentificationType }
     *     
     */
    public void setHazardousIdentification(HazardousIdentificationType value) {
        this.hazardousIdentification = value;
    }

    /**
     * Gets the value of the hazardousShipment property.
     * 
     * @return
     *     possible object is
     *     {@link HazardousShipmentType }
     *     
     */
    public HazardousShipmentType getHazardousShipment() {
        return hazardousShipment;
    }

    /**
     * Sets the value of the hazardousShipment property.
     * 
     * @param value
     *     allowed object is
     *     {@link HazardousShipmentType }
     *     
     */
    public void setHazardousShipment(HazardousShipmentType value) {
        this.hazardousShipment = value;
    }

    /**
     * Gets the value of the hazardousFormattedText property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the hazardousFormattedText property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getHazardousFormattedText().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link HazardousFormattedTextType }
     * 
     * 
     */
    public List<HazardousFormattedTextType> getHazardousFormattedText() {
        if (hazardousFormattedText == null) {
            hazardousFormattedText = new ArrayList<HazardousFormattedTextType>();
        }
        return this.hazardousFormattedText;
    }

}
