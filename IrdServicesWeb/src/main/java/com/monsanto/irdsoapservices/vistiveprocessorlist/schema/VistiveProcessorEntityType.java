
package com.monsanto.irdsoapservices.vistiveprocessorlist.schema;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;
import com.monsanto.cidx.header.schema.PartnerInformationType;


/**
 * <p>Java class for VistiveProcessorEntityType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="VistiveProcessorEntityType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{urn:cidx:names:specification:ces:schema:all:5:0}PartnerInformation"/>
 *         &lt;element ref="{urn:ecms:schema:vistiveprocessorlist:1:0}LastModifiedDateTime" minOccurs="0"/>
 *         &lt;element name="VistiveProcessorCode" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/sequence>
 *       &lt;attribute name="ActiveFlag" use="required" type="{urn:ecms:schema:vistiveprocessorlist:1:0}ActiveFlagType" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "VistiveProcessorEntityType", propOrder = {
    "partnerInformation",
    "lastModifiedDateTime",
    "vistiveProcessorCode"
})
public class VistiveProcessorEntityType {

    @XmlElement(name = "PartnerInformation", namespace = "urn:cidx:names:specification:ces:schema:all:5:0", required = true)
    protected PartnerInformationType partnerInformation;
    @XmlElement(name = "LastModifiedDateTime")
    protected XMLGregorianCalendar lastModifiedDateTime;
    @XmlElement(name = "VistiveProcessorCode", required = true)
    protected String vistiveProcessorCode;
    @XmlAttribute(name = "ActiveFlag", required = true)
    protected ActiveFlagType activeFlag;

    /**
     * Gets the value of the partnerInformation property.
     * 
     * @return
     *     possible object is
     *     {@link PartnerInformationType }
     *     
     */
    public PartnerInformationType getPartnerInformation() {
        return partnerInformation;
    }

    /**
     * Sets the value of the partnerInformation property.
     * 
     * @param value
     *     allowed object is
     *     {@link PartnerInformationType }
     *     
     */
    public void setPartnerInformation(PartnerInformationType value) {
        this.partnerInformation = value;
    }

    /**
     * Gets the value of the lastModifiedDateTime property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getLastModifiedDateTime() {
        return lastModifiedDateTime;
    }

    /**
     * Sets the value of the lastModifiedDateTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setLastModifiedDateTime(XMLGregorianCalendar value) {
        this.lastModifiedDateTime = value;
    }

    /**
     * Gets the value of the vistiveProcessorCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVistiveProcessorCode() {
        return vistiveProcessorCode;
    }

    /**
     * Sets the value of the vistiveProcessorCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVistiveProcessorCode(String value) {
        this.vistiveProcessorCode = value;
    }

    /**
     * Gets the value of the activeFlag property.
     * 
     * @return
     *     possible object is
     *     {@link ActiveFlagType }
     *     
     */
    public ActiveFlagType getActiveFlag() {
        return activeFlag;
    }

    /**
     * Sets the value of the activeFlag property.
     * 
     * @param value
     *     allowed object is
     *     {@link ActiveFlagType }
     *     
     */
    public void setActiveFlag(ActiveFlagType value) {
        this.activeFlag = value;
    }

}
