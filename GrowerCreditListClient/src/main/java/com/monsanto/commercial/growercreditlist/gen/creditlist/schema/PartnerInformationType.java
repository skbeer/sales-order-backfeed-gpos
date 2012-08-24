
package com.monsanto.commercial.growercreditlist.gen.creditlist.schema;

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
 *         &lt;element name="PartnerName" maxOccurs="unbounded">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}token">
 *               &lt;minLength value="1"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element ref="{Monsanto:Service:GrowerCreditList}PartnerIdentifier" maxOccurs="unbounded"/>
 *         &lt;element ref="{Monsanto:Service:GrowerCreditList}ContactInformation" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{Monsanto:Service:GrowerCreditList}AddressInformation" minOccurs="0"/>
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
    "contactInformation",
    "addressInformation"
})
public class PartnerInformationType {

    @XmlElement(name = "PartnerName", required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected List<String> partnerName;
    @XmlElement(name = "PartnerIdentifier", required = true)
    protected List<PartnerIdentifierType> partnerIdentifier;
    @XmlElement(name = "ContactInformation")
    protected List<ContactInformationType> contactInformation;
    @XmlElement(name = "AddressInformation")
    protected AddressInformationType addressInformation;

    /**
     * Gets the value of the partnerName property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the partnerName property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPartnerName().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getPartnerName() {
        if (partnerName == null) {
            partnerName = new ArrayList<String>();
        }
        return this.partnerName;
    }

    /**
     * 
     * 								Provide Licence Number and GLN as needed
     * 							Gets the value of the partnerIdentifier property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the partnerIdentifier property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPartnerIdentifier().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PartnerIdentifierType }
     * 
     * 
     */
    public List<PartnerIdentifierType> getPartnerIdentifier() {
        if (partnerIdentifier == null) {
            partnerIdentifier = new ArrayList<PartnerIdentifierType>();
        }
        return this.partnerIdentifier;
    }

    /**
     * 
     * 								Contact information for the grower
     * 							Gets the value of the contactInformation property.
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

    /**
     * Gets the value of the addressInformation property.
     * 
     * @return
     *     possible object is
     *     {@link AddressInformationType }
     *     
     */
    public AddressInformationType getAddressInformation() {
        return addressInformation;
    }

    /**
     * Sets the value of the addressInformation property.
     * 
     * @param value
     *     allowed object is
     *     {@link AddressInformationType }
     *     
     */
    public void setAddressInformation(AddressInformationType value) {
        this.addressInformation = value;
    }

}