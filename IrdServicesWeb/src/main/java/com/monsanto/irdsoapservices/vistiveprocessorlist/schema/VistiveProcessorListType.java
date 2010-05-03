
package com.monsanto.irdsoapservices.vistiveprocessorlist.schema;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import com.monsanto.cidx.header.schema.HeaderType;


/**
 * <p>Java class for VistiveProcessorListType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="VistiveProcessorListType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{urn:cidx:names:specification:ces:schema:all:5:0}Header"/>
 *         &lt;element ref="{urn:ecms:schema:vistiveprocessorlist:1:0}VistiveProcessorListBody"/>
 *       &lt;/sequence>
 *       &lt;attribute name="Version" use="required" fixed="1.0">
 *         &lt;simpleType>
 *           &lt;restriction base="{urn:cidx:names:specification:ces:schema:all:5:0}cidxToken">
 *           &lt;/restriction>
 *         &lt;/simpleType>
 *       &lt;/attribute>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "VistiveProcessorListType", propOrder = {
    "header",
    "vistiveProcessorListBody"
})
public class VistiveProcessorListType {

    @XmlElement(name = "Header", namespace = "urn:cidx:names:specification:ces:schema:all:5:0", required = true)
    protected HeaderType header;
    @XmlElement(name = "VistiveProcessorListBody", required = true)
    protected VistiveProcessorListBodyType vistiveProcessorListBody;
    @XmlAttribute(name = "Version", required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
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
     * Gets the value of the vistiveProcessorListBody property.
     * 
     * @return
     *     possible object is
     *     {@link VistiveProcessorListBodyType }
     *     
     */
    public VistiveProcessorListBodyType getVistiveProcessorListBody() {
        return vistiveProcessorListBody;
    }

    /**
     * Sets the value of the vistiveProcessorListBody property.
     * 
     * @param value
     *     allowed object is
     *     {@link VistiveProcessorListBodyType }
     *     
     */
    public void setVistiveProcessorListBody(VistiveProcessorListBodyType value) {
        this.vistiveProcessorListBody = value;
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
