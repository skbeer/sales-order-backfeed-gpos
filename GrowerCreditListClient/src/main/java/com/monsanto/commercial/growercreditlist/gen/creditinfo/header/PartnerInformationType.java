
package com.monsanto.commercial.growercreditlist.gen.creditinfo.header;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


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
 *         &lt;element ref="{urn:monsanto:uscomm:service:header}PartnerName"/>
 *         &lt;element ref="{urn:monsanto:uscomm:service:header}PartnerIdentifier"/>
 *         &lt;element ref="{urn:monsanto:uscomm:service:header}ContactInformation" maxOccurs="unbounded" minOccurs="0"/>
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
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String partnerName;
    @XmlElement(name = "PartnerIdentifier", required = true)
    protected PartnerIdentifierType partnerIdentifier;
    @XmlElement(name = "ContactInformation")
    protected List<ContactInformationType> contactInformation;

    /**
     * Gets the value of the partnerName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPartnerName() {
        return partnerName;
    }

    /**
     * Sets the value of the partnerName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPartnerName(String value) {
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
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the contactInformation property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getContactInformation().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ContactInformationType }
     * 
     * 
     */
    public List<ContactInformationType> getContactInformation() {
        if (contactInformation == null) {
            contactInformation = new ArrayList<ContactInformationType>();
        }
        return this.contactInformation;
    }

}
