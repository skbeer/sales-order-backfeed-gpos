
package com.monsanto.irdsoapservices.schema;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import com.monsanto.isdcommon.header.schema.HeaderType;


/**
 * <p>Java class for GetAssociatedEmployeesResponseType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="GetAssociatedEmployeesResponseType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{urn:monsanto:uscomm:service:header}Header"/>
 *         &lt;element name="GetAssociatedEmployeesResponseBody" type="{urn:monsanto:ird:services:account:information}GetAssociatedEmployeesResponseBodyType"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GetAssociatedEmployeesResponseType", propOrder = {
    "header",
    "getAssociatedEmployeesResponseBody"
})
public class GetAssociatedEmployeesResponseType {

    @XmlElement(name = "Header", namespace = "urn:monsanto:uscomm:service:header", required = true)
    protected HeaderType header;
    @XmlElement(name = "GetAssociatedEmployeesResponseBody", required = true)
    protected GetAssociatedEmployeesResponseBodyType getAssociatedEmployeesResponseBody;

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
     * Gets the value of the getAssociatedEmployeesResponseBody property.
     * 
     * @return
     *     possible object is
     *     {@link GetAssociatedEmployeesResponseBodyType }
     *     
     */
    public GetAssociatedEmployeesResponseBodyType getGetAssociatedEmployeesResponseBody() {
        return getAssociatedEmployeesResponseBody;
    }

    /**
     * Sets the value of the getAssociatedEmployeesResponseBody property.
     * 
     * @param value
     *     allowed object is
     *     {@link GetAssociatedEmployeesResponseBodyType }
     *     
     */
    public void setGetAssociatedEmployeesResponseBody(GetAssociatedEmployeesResponseBodyType value) {
        this.getAssociatedEmployeesResponseBody = value;
    }

}
