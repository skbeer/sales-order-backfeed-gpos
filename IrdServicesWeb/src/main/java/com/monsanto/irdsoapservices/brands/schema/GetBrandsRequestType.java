
package com.monsanto.irdsoapservices.brands.schema;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import com.monsanto.isdcommon.header.schema.HeaderType;


/**
 * <p>Java class for GetBrandsRequestType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="GetBrandsRequestType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{urn:monsanto:uscomm:service:header}Header"/>
 *         &lt;element name="GetBrandsRequestBody" type="{urn:monsanto:ird:services:brands}GetBrandsRequestBodyType"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GetBrandsRequestType", propOrder = {
    "header",
    "getBrandsRequestBody"
})
public class GetBrandsRequestType {

    @XmlElement(name = "Header", namespace = "urn:monsanto:uscomm:service:header", required = true)
    protected HeaderType header;
    @XmlElement(name = "GetBrandsRequestBody", required = true)
    protected GetBrandsRequestBodyType getBrandsRequestBody;

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
     * Gets the value of the getBrandsRequestBody property.
     * 
     * @return
     *     possible object is
     *     {@link GetBrandsRequestBodyType }
     *     
     */
    public GetBrandsRequestBodyType getGetBrandsRequestBody() {
        return getBrandsRequestBody;
    }

    /**
     * Sets the value of the getBrandsRequestBody property.
     * 
     * @param value
     *     allowed object is
     *     {@link GetBrandsRequestBodyType }
     *     
     */
    public void setGetBrandsRequestBody(GetBrandsRequestBodyType value) {
        this.getBrandsRequestBody = value;
    }

}
