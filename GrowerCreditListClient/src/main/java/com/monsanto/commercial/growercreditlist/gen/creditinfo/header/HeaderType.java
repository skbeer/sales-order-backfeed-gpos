
package com.monsanto.commercial.growercreditlist.gen.creditinfo.header;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for HeaderType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="HeaderType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{urn:monsanto:uscomm:service:header}DocumentIdentifier"/>
 *         &lt;element ref="{urn:monsanto:uscomm:service:header}DocumentDateTime"/>
 *         &lt;element ref="{urn:monsanto:uscomm:service:header}From"/>
 *         &lt;element ref="{urn:monsanto:uscomm:service:header}To" minOccurs="0"/>
 *         &lt;element ref="{urn:monsanto:uscomm:service:header}DataSource"/>
 *         &lt;element ref="{urn:monsanto:uscomm:service:header}SoftwareVersion" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "HeaderType", propOrder = {
    "documentIdentifier",
    "documentDateTime",
    "from",
    "to",
    "dataSource",
    "softwareVersion"
})
public class HeaderType {

    @XmlElement(name = "DocumentIdentifier", required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String documentIdentifier;
    @XmlElement(name = "DocumentDateTime", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar documentDateTime;
    @XmlElement(name = "From", required = true)
    protected PartnerInformationType from;
    @XmlElement(name = "To")
    protected PartnerInformationType to;
    @XmlElement(name = "DataSource", required = true)
    protected String dataSource;
    @XmlElement(name = "SoftwareVersion")
    protected String softwareVersion;

    /**
     * Gets the value of the documentIdentifier property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDocumentIdentifier() {
        return documentIdentifier;
    }

    /**
     * Sets the value of the documentIdentifier property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDocumentIdentifier(String value) {
        this.documentIdentifier = value;
    }

    /**
     * Gets the value of the documentDateTime property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDocumentDateTime() {
        return documentDateTime;
    }

    /**
     * Sets the value of the documentDateTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDocumentDateTime(XMLGregorianCalendar value) {
        this.documentDateTime = value;
    }

    /**
     * Gets the value of the from property.
     * 
     * @return
     *     possible object is
     *     {@link PartnerInformationType }
     *     
     */
    public PartnerInformationType getFrom() {
        return from;
    }

    /**
     * Sets the value of the from property.
     * 
     * @param value
     *     allowed object is
     *     {@link PartnerInformationType }
     *     
     */
    public void setFrom(PartnerInformationType value) {
        this.from = value;
    }

    /**
     * Gets the value of the to property.
     * 
     * @return
     *     possible object is
     *     {@link PartnerInformationType }
     *     
     */
    public PartnerInformationType getTo() {
        return to;
    }

    /**
     * Sets the value of the to property.
     * 
     * @param value
     *     allowed object is
     *     {@link PartnerInformationType }
     *     
     */
    public void setTo(PartnerInformationType value) {
        this.to = value;
    }

    /**
     * Gets the value of the dataSource property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDataSource() {
        return dataSource;
    }

    /**
     * Sets the value of the dataSource property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDataSource(String value) {
        this.dataSource = value;
    }

    /**
     * Gets the value of the softwareVersion property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSoftwareVersion() {
        return softwareVersion;
    }

    /**
     * Sets the value of the softwareVersion property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSoftwareVersion(String value) {
        this.softwareVersion = value;
    }

}
