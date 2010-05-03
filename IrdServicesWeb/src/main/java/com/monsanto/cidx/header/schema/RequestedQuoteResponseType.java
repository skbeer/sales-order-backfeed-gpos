
package com.monsanto.cidx.header.schema;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for RequestedQuoteResponseType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="RequestedQuoteResponseType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{urn:cidx:names:specification:ces:schema:all:5:0}ContactInformation" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{urn:cidx:names:specification:ces:schema:all:5:0}ClosingDate"/>
 *       &lt;/sequence>
 *       &lt;attribute name="PreferredMethod" use="required" type="{urn:cidx:names:specification:ces:schema:all:5:0}cidxListRFQDeliveryMethod" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RequestedQuoteResponseType", propOrder = {
    "contactInformation",
    "closingDate"
})
public class RequestedQuoteResponseType {

    @XmlElement(name = "ContactInformation")
    protected List<ContactInformationType> contactInformation;
    @XmlElement(name = "ClosingDate", required = true)
    protected ClosingDateType closingDate;
    @XmlAttribute(name = "PreferredMethod", required = true)
    protected CidxListRFQDeliveryMethod preferredMethod;

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

    /**
     * Gets the value of the closingDate property.
     * 
     * @return
     *     possible object is
     *     {@link ClosingDateType }
     *     
     */
    public ClosingDateType getClosingDate() {
        return closingDate;
    }

    /**
     * Sets the value of the closingDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link ClosingDateType }
     *     
     */
    public void setClosingDate(ClosingDateType value) {
        this.closingDate = value;
    }

    /**
     * Gets the value of the preferredMethod property.
     * 
     * @return
     *     possible object is
     *     {@link CidxListRFQDeliveryMethod }
     *     
     */
    public CidxListRFQDeliveryMethod getPreferredMethod() {
        return preferredMethod;
    }

    /**
     * Sets the value of the preferredMethod property.
     * 
     * @param value
     *     allowed object is
     *     {@link CidxListRFQDeliveryMethod }
     *     
     */
    public void setPreferredMethod(CidxListRFQDeliveryMethod value) {
        this.preferredMethod = value;
    }

}
