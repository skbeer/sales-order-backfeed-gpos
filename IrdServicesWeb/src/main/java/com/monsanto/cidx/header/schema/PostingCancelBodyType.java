
package com.monsanto.cidx.header.schema;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for PostingCancelBodyType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PostingCancelBodyType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{urn:cidx:names:specification:ces:schema:all:5:0}PostingCancelProperties"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PostingCancelBodyType", propOrder = {
    "postingCancelProperties"
})
public class PostingCancelBodyType {

    @XmlElement(name = "PostingCancelProperties", required = true)
    protected PostingCancelPropertiesType postingCancelProperties;

    /**
     * Gets the value of the postingCancelProperties property.
     * 
     * @return
     *     possible object is
     *     {@link PostingCancelPropertiesType }
     *     
     */
    public PostingCancelPropertiesType getPostingCancelProperties() {
        return postingCancelProperties;
    }

    /**
     * Sets the value of the postingCancelProperties property.
     * 
     * @param value
     *     allowed object is
     *     {@link PostingCancelPropertiesType }
     *     
     */
    public void setPostingCancelProperties(PostingCancelPropertiesType value) {
        this.postingCancelProperties = value;
    }

}
