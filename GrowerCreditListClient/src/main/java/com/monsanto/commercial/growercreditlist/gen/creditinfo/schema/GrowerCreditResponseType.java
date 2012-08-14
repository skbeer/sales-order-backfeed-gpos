
package com.monsanto.commercial.growercreditlist.gen.creditinfo.schema;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import com.monsanto.commercial.growercreditlist.gen.creditinfo.header.HeaderType;


/**
 * <p>Java class for GrowerCreditResponseType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="GrowerCreditResponseType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{urn:monsanto:uscomm:service:header}Header"/>
 *         &lt;element name="GrowerCreditResponseBody" type="{Monsanto:Service:GrowerCredit}GrowerCreditResponseBodyType"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GrowerCreditResponseType", propOrder = {
    "header",
    "growerCreditResponseBody"
})
public class GrowerCreditResponseType {

    @XmlElement(name = "Header", namespace = "urn:monsanto:uscomm:service:header", required = true)
    protected HeaderType header;
    @XmlElement(name = "GrowerCreditResponseBody", required = true)
    protected GrowerCreditResponseBodyType growerCreditResponseBody;

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
     * Gets the value of the growerCreditResponseBody property.
     * 
     * @return
     *     possible object is
     *     {@link GrowerCreditResponseBodyType }
     *     
     */
    public GrowerCreditResponseBodyType getGrowerCreditResponseBody() {
        return growerCreditResponseBody;
    }

    /**
     * Sets the value of the growerCreditResponseBody property.
     * 
     * @param value
     *     allowed object is
     *     {@link GrowerCreditResponseBodyType }
     *     
     */
    public void setGrowerCreditResponseBody(GrowerCreditResponseBodyType value) {
        this.growerCreditResponseBody = value;
    }

}
