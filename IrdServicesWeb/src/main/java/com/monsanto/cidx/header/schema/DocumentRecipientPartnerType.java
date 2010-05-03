
package com.monsanto.cidx.header.schema;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for DocumentRecipientPartnerType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="DocumentRecipientPartnerType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{urn:cidx:names:specification:ces:schema:all:5:0}PartnerInformation"/>
 *       &lt;/sequence>
 *       &lt;attribute name="PartnerRole" use="required" type="{urn:cidx:names:specification:ces:schema:all:5:0}cidxListPartnerRoles" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DocumentRecipientPartnerType", propOrder = {
    "partnerInformation"
})
public class DocumentRecipientPartnerType {

    @XmlElement(name = "PartnerInformation", required = true)
    protected PartnerInformationType partnerInformation;
    @XmlAttribute(name = "PartnerRole", required = true)
    protected CidxListPartnerRoles partnerRole;

    /**
     * Gets the value of the partnerInformation property.
     * 
     * @return
     *     possible object is
     *     {@link PartnerInformationType }
     *     
     */
    public PartnerInformationType getPartnerInformation() {
        return partnerInformation;
    }

    /**
     * Sets the value of the partnerInformation property.
     * 
     * @param value
     *     allowed object is
     *     {@link PartnerInformationType }
     *     
     */
    public void setPartnerInformation(PartnerInformationType value) {
        this.partnerInformation = value;
    }

    /**
     * Gets the value of the partnerRole property.
     * 
     * @return
     *     possible object is
     *     {@link CidxListPartnerRoles }
     *     
     */
    public CidxListPartnerRoles getPartnerRole() {
        return partnerRole;
    }

    /**
     * Sets the value of the partnerRole property.
     * 
     * @param value
     *     allowed object is
     *     {@link CidxListPartnerRoles }
     *     
     */
    public void setPartnerRole(CidxListPartnerRoles value) {
        this.partnerRole = value;
    }

}
