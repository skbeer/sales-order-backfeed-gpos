
package com.monsanto.irdsoapservices.schema;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import com.monsanto.isdcommon.header.schema.HeaderType;


/**
 * <p>Java class for SaveAccountDetailsRequestType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SaveAccountDetailsRequestType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{urn:monsanto:uscomm:service:header}Header"/>
 *         &lt;element name="SaveAccountDetailsRequestBody" type="{urn:monsanto:ird:services:account:information}SaveAccountDetailsRequestBodyType"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SaveAccountDetailsRequestType", propOrder = {
    "header",
    "saveAccountDetailsRequestBody"
})
public class SaveAccountDetailsRequestType {

    @XmlElement(name = "Header", namespace = "urn:monsanto:uscomm:service:header", required = true)
    protected HeaderType header;
    @XmlElement(name = "SaveAccountDetailsRequestBody", required = true)
    protected SaveAccountDetailsRequestBodyType saveAccountDetailsRequestBody;

    /**
     * Gets the value of the header property.
     * 
     * @return
     *     possible object is
     *     {@link HeaderType }
     *     
     */
    public HeaderType getHeader() {
        return header;
    }

    /**
     * Sets the value of the header property.
     * 
     * @param value
     *     allowed object is
     *     {@link HeaderType }
     *     
     */
    public void setHeader(HeaderType value) {
        this.header = value;
    }

    /**
     * Gets the value of the saveAccountDetailsRequestBody property.
     * 
     * @return
     *     possible object is
     *     {@link SaveAccountDetailsRequestBodyType }
     *     
     */
    public SaveAccountDetailsRequestBodyType getSaveAccountDetailsRequestBody() {
        return saveAccountDetailsRequestBody;
    }

    /**
     * Sets the value of the saveAccountDetailsRequestBody property.
     * 
     * @param value
     *     allowed object is
     *     {@link SaveAccountDetailsRequestBodyType }
     *     
     */
    public void setSaveAccountDetailsRequestBody(SaveAccountDetailsRequestBodyType value) {
        this.saveAccountDetailsRequestBody = value;
    }

}
