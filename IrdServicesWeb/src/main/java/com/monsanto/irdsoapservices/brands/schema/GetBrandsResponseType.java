
package com.monsanto.irdsoapservices.brands.schema;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import com.monsanto.isdcommon.header.schema.HeaderType;


/**
 * <p>Java class for GetBrandsResponseType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="GetBrandsResponseType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{urn:monsanto:uscomm:service:header}Header"/>
 *         &lt;element name="GetBrandsResponseBody" type="{urn:monsanto:ird:services:brands}GetBrandsResponseBodyType"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GetBrandsResponseType", propOrder = {
    "header",
    "getBrandsResponseBody"
})
public class GetBrandsResponseType {

    @XmlElement(name = "Header", namespace = "urn:monsanto:uscomm:service:header", required = true)
    protected HeaderType header;
    @XmlElement(name = "GetBrandsResponseBody", required = true)
    protected GetBrandsResponseBodyType getBrandsResponseBody;

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
     * Gets the value of the getBrandsResponseBody property.
     * 
     * @return
     *     possible object is
     *     {@link GetBrandsResponseBodyType }
     *     
     */
    public GetBrandsResponseBodyType getGetBrandsResponseBody() {
        return getBrandsResponseBody;
    }

    /**
     * Sets the value of the getBrandsResponseBody property.
     * 
     * @param value
     *     allowed object is
     *     {@link GetBrandsResponseBodyType }
     *     
     */
    public void setGetBrandsResponseBody(GetBrandsResponseBodyType value) {
        this.getBrandsResponseBody = value;
    }

}
