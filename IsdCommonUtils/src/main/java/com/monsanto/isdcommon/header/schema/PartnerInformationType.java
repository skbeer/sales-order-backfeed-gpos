
package com.monsanto.isdcommon.header.schema;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for PartnerInformationType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PartnerInformationType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="PartnerName" type="{http://www.w3.org/2001/XMLSchema}anyType"/>
 *         &lt;element name="PartnerIdentifier" type="{urn:monsanto:uscomm:service:header}PartnerIdentifierType" minOccurs="0"/>
 *         &lt;element name="ContactInformation" type="{urn:monsanto:uscomm:service:header}ContactInformationType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PartnerInformationType", propOrder = {
    "partnerName",
    "partnerIdentifier",
    "contactInformation"
})
public class PartnerInformationType {

    @XmlElement(name = "PartnerName", required = true)
    protected Object partnerName;
    @XmlElement(name = "PartnerIdentifier")
    protected PartnerIdentifierType partnerIdentifier;
    @XmlElement(name = "ContactInformation")
    protected ContactInformationType contactInformation;

    /**
     * Gets the value of the partnerName property.
     * 
     * @return
     *     possible object is
     *     {@link Object }
     *     
     */
    public Object getPartnerName() {
        return partnerName;
    }

    /**
     * Sets the value of the partnerName property.
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     
     */
    public void setPartnerName(Object value) {
        this.partnerName = value;
    }

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

    /**
     * Gets the value of the contactInformation property.
     * 
     * @return
     *     possible object is
     *     {@link ContactInformationType }
     *     
     */
    public ContactInformationType getContactInformation() {
        return contactInformation;
    }

    /**
     * Sets the value of the contactInformation property.
     * 
     * @param value
     *     allowed object is
     *     {@link ContactInformationType }
     *     
     */
    public void setContactInformation(ContactInformationType value) {
        this.contactInformation = value;
    }

}
