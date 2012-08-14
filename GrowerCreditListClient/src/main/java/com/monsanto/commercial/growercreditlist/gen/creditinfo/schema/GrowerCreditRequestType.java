
package com.monsanto.commercial.growercreditlist.gen.creditinfo.schema;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import com.monsanto.commercial.growercreditlist.gen.creditinfo.header.HeaderType;


/**
 * <p>Java class for GrowerCreditRequestType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="GrowerCreditRequestType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{urn:monsanto:uscomm:service:header}Header"/>
 *         &lt;element name="GrowerCreditRequestBody" type="{Monsanto:Service:GrowerCredit}GrowerCreditRequestBodyType"/>
 *       &lt;/sequence>
 *       &lt;attribute name="Version" type="{http://www.w3.org/2001/XMLSchema}token" default="1.0" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GrowerCreditRequestType", propOrder = {
    "header",
    "growerCreditRequestBody"
})
public class GrowerCreditRequestType {

    @XmlElement(name = "Header", namespace = "urn:monsanto:uscomm:service:header", required = true)
    protected HeaderType header;
    @XmlElement(name = "GrowerCreditRequestBody", required = true)
    protected GrowerCreditRequestBodyType growerCreditRequestBody;
    @XmlAttribute(name = "Version")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String version;

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
     * Gets the value of the growerCreditRequestBody property.
     * 
     * @return
     *     possible object is
     *     {@link GrowerCreditRequestBodyType }
     *     
     */
    public GrowerCreditRequestBodyType getGrowerCreditRequestBody() {
        return growerCreditRequestBody;
    }

    /**
     * Sets the value of the growerCreditRequestBody property.
     * 
     * @param value
     *     allowed object is
     *     {@link GrowerCreditRequestBodyType }
     *     
     */
    public void setGrowerCreditRequestBody(GrowerCreditRequestBodyType value) {
        this.growerCreditRequestBody = value;
    }

    /**
     * Gets the value of the version property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVersion() {
        if (version == null) {
            return "1.0";
        } else {
            return version;
        }
    }

    /**
     * Sets the value of the version property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVersion(String value) {
        this.version = value;
    }

}
