
package com.monsanto.commercial.growercreditlist.gen.creditlist.schema;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * <p>Java class for GrowerCreditListListType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="GrowerCreditListListType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{Monsanto:Service:GrowerCreditList}Header"/>
 *         &lt;element name="GrowerCreditListBody" type="{Monsanto:Service:GrowerCreditList}GrowerCreditListListBodyType"/>
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
@XmlType(name = "GrowerCreditListListType", propOrder = {
    "header",
    "growerCreditListBody"
})
public class GrowerCreditListListType {

    @XmlElement(name = "Header", required = true)
    protected HeaderType header;
    @XmlElement(name = "GrowerCreditListBody", required = true)
    protected GrowerCreditListListBodyType growerCreditListBody;
    @XmlAttribute(name = "Version")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String version;

    /**
     * 
     * 								Generic Message header to identify this
     * 								unique message and other message
     * 								attributes.
     * 							
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
     * Gets the value of the growerCreditListBody property.
     * 
     * @return
     *     possible object is
     *     {@link GrowerCreditListListBodyType }
     *     
     */
    public GrowerCreditListListBodyType getGrowerCreditListBody() {
        return growerCreditListBody;
    }

    /**
     * Sets the value of the growerCreditListBody property.
     * 
     * @param value
     *     allowed object is
     *     {@link GrowerCreditListListBodyType }
     *     
     */
    public void setGrowerCreditListBody(GrowerCreditListListBodyType value) {
        this.growerCreditListBody = value;
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
