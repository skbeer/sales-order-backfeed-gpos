
package com.monsanto.cidx.header.schema;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for PartnerReferenceType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PartnerReferenceType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{urn:cidx:names:specification:ces:schema:all:5:0}PartnerIdentifier"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PartnerReferenceType", propOrder = {
    "partnerIdentifier"
})
public class PartnerReferenceType {

    @XmlElement(name = "PartnerIdentifier", required = true)
    protected PartnerIdentifierType partnerIdentifier;

    /**
     * Gets the value of the partnerIdentifier property.
     * 
     * @return
     *     possible object is
     *     {@link PartnerIdentifierType }
     *     
     */
    public PartnerIdentifierType getPartnerIdentifier() {
        return partnerIdentifier;
    }

    /**
     * Sets the value of the partnerIdentifier property.
     * 
     * @param value
     *     allowed object is
     *     {@link PartnerIdentifierType }
     *     
     */
    public void setPartnerIdentifier(PartnerIdentifierType value) {
        this.partnerIdentifier = value;
    }

}
