
package com.monsanto.irdsoapservices.contacts.schema;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import com.monsanto.isdcommon.header.schema.HeaderType;


/**
 * <p>Java class for InsertContactResponseType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="InsertContactResponseType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{urn:monsanto:uscomm:service:header}Header"/>
 *         &lt;element name="InsertContactResponseBody" type="{urn:monsanto:ird:services:contacts}InsertContactResponseBodyType"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "InsertContactResponseType", propOrder = {
    "header",
    "insertContactResponseBody"
})
public class InsertContactResponseType {

    @XmlElement(name = "Header", namespace = "urn:monsanto:uscomm:service:header", required = true)
    protected HeaderType header;
    @XmlElement(name = "InsertContactResponseBody", required = true)
    protected InsertContactResponseBodyType insertContactResponseBody;

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
     * Gets the value of the insertContactResponseBody property.
     * 
     * @return
     *     possible object is
     *     {@link InsertContactResponseBodyType }
     *     
     */
    public InsertContactResponseBodyType getInsertContactResponseBody() {
        return insertContactResponseBody;
    }

    /**
     * Sets the value of the insertContactResponseBody property.
     * 
     * @param value
     *     allowed object is
     *     {@link InsertContactResponseBodyType }
     *     
     */
    public void setInsertContactResponseBody(InsertContactResponseBodyType value) {
        this.insertContactResponseBody = value;
    }

}
