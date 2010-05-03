
package com.monsanto.cidx.header.schema;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ReferencedPriceSheetType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ReferencedPriceSheetType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{urn:cidx:names:specification:ces:schema:all:5:0}PriceSheetInformation"/>
 *       &lt;/sequence>
 *       &lt;attribute name="PriceSheetReferenceType" use="required" type="{urn:cidx:names:specification:ces:schema:all:5:0}cidxListPriceSheetReferenceType" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ReferencedPriceSheetType", propOrder = {
    "priceSheetInformation"
})
public class ReferencedPriceSheetType {

    @XmlElement(name = "PriceSheetInformation", required = true)
    protected PriceSheetInformationType priceSheetInformation;
    @XmlAttribute(name = "PriceSheetReferenceType", required = true)
    protected CidxListPriceSheetReferenceType priceSheetReferenceType;

    /**
     * Gets the value of the priceSheetInformation property.
     * 
     * @return
     *     possible object is
     *     {@link PriceSheetInformationType }
     *     
     */
    public PriceSheetInformationType getPriceSheetInformation() {
        return priceSheetInformation;
    }

    /**
     * Sets the value of the priceSheetInformation property.
     * 
     * @param value
     *     allowed object is
     *     {@link PriceSheetInformationType }
     *     
     */
    public void setPriceSheetInformation(PriceSheetInformationType value) {
        this.priceSheetInformation = value;
    }

    /**
     * Gets the value of the priceSheetReferenceType property.
     * 
     * @return
     *     possible object is
     *     {@link CidxListPriceSheetReferenceType }
     *     
     */
    public CidxListPriceSheetReferenceType getPriceSheetReferenceType() {
        return priceSheetReferenceType;
    }

    /**
     * Sets the value of the priceSheetReferenceType property.
     * 
     * @param value
     *     allowed object is
     *     {@link CidxListPriceSheetReferenceType }
     *     
     */
    public void setPriceSheetReferenceType(CidxListPriceSheetReferenceType value) {
        this.priceSheetReferenceType = value;
    }

}
