
package com.monsanto.cidx.header.schema;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for PostingStatusResponsePartnersType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PostingStatusResponsePartnersType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{urn:cidx:names:specification:ces:schema:all:5:0}Originator"/>
 *         &lt;element ref="{urn:cidx:names:specification:ces:schema:all:5:0}Audience" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PostingStatusResponsePartnersType", propOrder = {
    "originator",
    "audience"
})
public class PostingStatusResponsePartnersType {

    @XmlElement(name = "Originator", required = true)
    protected OriginatorType originator;
    @XmlElement(name = "Audience")
    protected List<AudienceType> audience;

    /**
     * Gets the value of the originator property.
     * 
     * @return
     *     possible object is
     *     {@link OriginatorType }
     *     
     */
    public OriginatorType getOriginator() {
        return originator;
    }

    /**
     * Sets the value of the originator property.
     * 
     * @param value
     *     allowed object is
     *     {@link OriginatorType }
     *     
     */
    public void setOriginator(OriginatorType value) {
        this.originator = value;
    }

    /**
     * Gets the value of the audience property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the audience property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAudience().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AudienceType }
     * 
     * 
     */
    public List<AudienceType> getAudience() {
        if (audience == null) {
            audience = new ArrayList<AudienceType>();
        }
        return this.audience;
    }

}
