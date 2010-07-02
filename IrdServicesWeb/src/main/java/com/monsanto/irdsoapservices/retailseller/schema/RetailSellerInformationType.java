
package com.monsanto.irdsoapservices.retailseller.schema;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * <p>Java class for RetailSellerInformationType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="RetailSellerInformationType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Header" type="{urn:ecms:schema:retailsellerinformation:request:1:0}HeaderType"/>
 *         &lt;element name="RetailSellerInformationBody" type="{urn:ecms:schema:retailsellerinformation:request:1:0}RetailSellerInformationBodyType"/>
 *       &lt;/sequence>
 *       &lt;attribute name="Version" type="{http://www.w3.org/2001/XMLSchema}token" fixed="1.0" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RetailSellerInformationType", propOrder = {
    "header",
    "retailSellerInformationBody"
})
public class RetailSellerInformationType {

    @XmlElement(name = "Header", required = true)
    protected HeaderType header;
    @XmlElement(name = "RetailSellerInformationBody", required = true)
    protected RetailSellerInformationBodyType retailSellerInformationBody;
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
     * Gets the value of the retailSellerInformationBody property.
     * 
     * @return
     *     possible object is
     *     {@link RetailSellerInformationBodyType }
     *     
     */
    public RetailSellerInformationBodyType getRetailSellerInformationBody() {
        return retailSellerInformationBody;
    }

    /**
     * Sets the value of the retailSellerInformationBody property.
     * 
     * @param value
     *     allowed object is
     *     {@link RetailSellerInformationBodyType }
     *     
     */
    public void setRetailSellerInformationBody(RetailSellerInformationBodyType value) {
        this.retailSellerInformationBody = value;
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
