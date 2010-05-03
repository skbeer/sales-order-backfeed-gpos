
package com.monsanto.cidx.header.schema;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for EmergencyResponseContactType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="EmergencyResponseContactType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{urn:cidx:names:specification:ces:schema:all:5:0}ContactInformation"/>
 *       &lt;/sequence>
 *       &lt;attribute name="ContactType" use="required" type="{urn:cidx:names:specification:ces:schema:all:5:0}cidxListEmergencyResponseContactType" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "EmergencyResponseContactType", propOrder = {
    "contactInformation"
})
public class EmergencyResponseContactType {

    @XmlElement(name = "ContactInformation", required = true)
    protected ContactInformationType contactInformation;
    @XmlAttribute(name = "ContactType", required = true)
    protected CidxListEmergencyResponseContactType contactType;

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

    /**
     * Gets the value of the contactType property.
     * 
     * @return
     *     possible object is
     *     {@link CidxListEmergencyResponseContactType }
     *     
     */
    public CidxListEmergencyResponseContactType getContactType() {
        return contactType;
    }

    /**
     * Sets the value of the contactType property.
     * 
     * @param value
     *     allowed object is
     *     {@link CidxListEmergencyResponseContactType }
     *     
     */
    public void setContactType(CidxListEmergencyResponseContactType value) {
        this.contactType = value;
    }

}
