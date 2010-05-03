
package com.monsanto.cidx.header.schema;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * <p>Java class for LoadBuildingMotorType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="LoadBuildingMotorType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{urn:cidx:names:specification:ces:schema:all:5:0}Header"/>
 *         &lt;element ref="{urn:cidx:names:specification:ces:schema:all:5:0}LoadBuildingMotorBody"/>
 *       &lt;/sequence>
 *       &lt;attribute name="Version" type="{urn:cidx:names:specification:ces:schema:all:5:0}cidxToken" fixed="5.0" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "LoadBuildingMotorType", propOrder = {
    "header",
    "loadBuildingMotorBody"
})
public class LoadBuildingMotorType {

    @XmlElement(name = "Header", required = true)
    protected HeaderType header;
    @XmlElement(name = "LoadBuildingMotorBody", required = true)
    protected LoadBuildingMotorBodyType loadBuildingMotorBody;
    @XmlAttribute(name = "Version")
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
     * Gets the value of the loadBuildingMotorBody property.
     * 
     * @return
     *     possible object is
     *     {@link LoadBuildingMotorBodyType }
     *     
     */
    public LoadBuildingMotorBodyType getLoadBuildingMotorBody() {
        return loadBuildingMotorBody;
    }

    /**
     * Sets the value of the loadBuildingMotorBody property.
     * 
     * @param value
     *     allowed object is
     *     {@link LoadBuildingMotorBodyType }
     *     
     */
    public void setLoadBuildingMotorBody(LoadBuildingMotorBodyType value) {
        this.loadBuildingMotorBody = value;
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
            return "5.0";
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
