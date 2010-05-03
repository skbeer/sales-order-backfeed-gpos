
package com.monsanto.cidx.header.schema;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for PostingStatusRequestBodyType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PostingStatusRequestBodyType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{urn:cidx:names:specification:ces:schema:all:5:0}PostingStatusRequestProperties"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PostingStatusRequestBodyType", propOrder = {
    "postingStatusRequestProperties"
})
public class PostingStatusRequestBodyType {

    @XmlElement(name = "PostingStatusRequestProperties", required = true)
    protected PostingStatusRequestPropertiesType postingStatusRequestProperties;

    /**
     * Gets the value of the postingStatusRequestProperties property.
     * 
     * @return
     *     possible object is
     *     {@link PostingStatusRequestPropertiesType }
     *     
     */
    public PostingStatusRequestPropertiesType getPostingStatusRequestProperties() {
        return postingStatusRequestProperties;
    }

    /**
     * Sets the value of the postingStatusRequestProperties property.
     * 
     * @param value
     *     allowed object is
     *     {@link PostingStatusRequestPropertiesType }
     *     
     */
    public void setPostingStatusRequestProperties(PostingStatusRequestPropertiesType value) {
        this.postingStatusRequestProperties = value;
    }

}
