
package com.monsanto.cidx.header.schema;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for RequestForQuoteBodyType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="RequestForQuoteBodyType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{urn:cidx:names:specification:ces:schema:all:5:0}RequestForQuoteProperties"/>
 *         &lt;element ref="{urn:cidx:names:specification:ces:schema:all:5:0}RequestForQuotePartners"/>
 *         &lt;element ref="{urn:cidx:names:specification:ces:schema:all:5:0}RequestForQuoteDetails"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RequestForQuoteBodyType", propOrder = {
    "requestForQuoteProperties",
    "requestForQuotePartners",
    "requestForQuoteDetails"
})
public class RequestForQuoteBodyType {

    @XmlElement(name = "RequestForQuoteProperties", required = true)
    protected RequestForQuotePropertiesType requestForQuoteProperties;
    @XmlElement(name = "RequestForQuotePartners", required = true)
    protected RequestForQuotePartnersType requestForQuotePartners;
    @XmlElement(name = "RequestForQuoteDetails", required = true)
    protected RequestForQuoteDetailsType requestForQuoteDetails;

    /**
     * Gets the value of the requestForQuoteProperties property.
     * 
     * @return
     *     possible object is
     *     {@link RequestForQuotePropertiesType }
     *     
     */
    public RequestForQuotePropertiesType getRequestForQuoteProperties() {
        return requestForQuoteProperties;
    }

    /**
     * Sets the value of the requestForQuoteProperties property.
     * 
     * @param value
     *     allowed object is
     *     {@link RequestForQuotePropertiesType }
     *     
     */
    public void setRequestForQuoteProperties(RequestForQuotePropertiesType value) {
        this.requestForQuoteProperties = value;
    }

    /**
     * Gets the value of the requestForQuotePartners property.
     * 
     * @return
     *     possible object is
     *     {@link RequestForQuotePartnersType }
     *     
     */
    public RequestForQuotePartnersType getRequestForQuotePartners() {
        return requestForQuotePartners;
    }

    /**
     * Sets the value of the requestForQuotePartners property.
     * 
     * @param value
     *     allowed object is
     *     {@link RequestForQuotePartnersType }
     *     
     */
    public void setRequestForQuotePartners(RequestForQuotePartnersType value) {
        this.requestForQuotePartners = value;
    }

    /**
     * Gets the value of the requestForQuoteDetails property.
     * 
     * @return
     *     possible object is
     *     {@link RequestForQuoteDetailsType }
     *     
     */
    public RequestForQuoteDetailsType getRequestForQuoteDetails() {
        return requestForQuoteDetails;
    }

    /**
     * Sets the value of the requestForQuoteDetails property.
     * 
     * @param value
     *     allowed object is
     *     {@link RequestForQuoteDetailsType }
     *     
     */
    public void setRequestForQuoteDetails(RequestForQuoteDetailsType value) {
        this.requestForQuoteDetails = value;
    }

}
