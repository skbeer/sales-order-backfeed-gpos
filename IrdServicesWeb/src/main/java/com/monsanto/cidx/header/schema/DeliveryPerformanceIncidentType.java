
package com.monsanto.cidx.header.schema;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * <p>Java class for DeliveryPerformanceIncidentType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="DeliveryPerformanceIncidentType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{urn:cidx:names:specification:ces:schema:all:5:0}PartOfSupplyChainCode"/>
 *         &lt;element ref="{urn:cidx:names:specification:ces:schema:all:5:0}IncidentCategoryCode"/>
 *         &lt;element ref="{urn:cidx:names:specification:ces:schema:all:5:0}IncidentAccountabilityCode"/>
 *         &lt;element ref="{urn:cidx:names:specification:ces:schema:all:5:0}IncidentCauseCode"/>
 *         &lt;element ref="{urn:cidx:names:specification:ces:schema:all:5:0}DateTime"/>
 *         &lt;element ref="{urn:cidx:names:specification:ces:schema:all:5:0}Comment" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DeliveryPerformanceIncidentType", propOrder = {
    "partOfSupplyChainCode",
    "incidentCategoryCode",
    "incidentAccountabilityCode",
    "incidentCauseCode",
    "dateTime",
    "comment"
})
public class DeliveryPerformanceIncidentType {

    @XmlElement(name = "PartOfSupplyChainCode", required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String partOfSupplyChainCode;
    @XmlElement(name = "IncidentCategoryCode", required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String incidentCategoryCode;
    @XmlElement(name = "IncidentAccountabilityCode", required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String incidentAccountabilityCode;
    @XmlElement(name = "IncidentCauseCode", required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String incidentCauseCode;
    @XmlElement(name = "DateTime", required = true)
    protected DateTimeType dateTime;
    @XmlElement(name = "Comment")
    protected CommentType comment;

    /**
     * Gets the value of the partOfSupplyChainCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPartOfSupplyChainCode() {
        return partOfSupplyChainCode;
    }

    /**
     * Sets the value of the partOfSupplyChainCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPartOfSupplyChainCode(String value) {
        this.partOfSupplyChainCode = value;
    }

    /**
     * Gets the value of the incidentCategoryCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIncidentCategoryCode() {
        return incidentCategoryCode;
    }

    /**
     * Sets the value of the incidentCategoryCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIncidentCategoryCode(String value) {
        this.incidentCategoryCode = value;
    }

    /**
     * Gets the value of the incidentAccountabilityCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIncidentAccountabilityCode() {
        return incidentAccountabilityCode;
    }

    /**
     * Sets the value of the incidentAccountabilityCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIncidentAccountabilityCode(String value) {
        this.incidentAccountabilityCode = value;
    }

    /**
     * Gets the value of the incidentCauseCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIncidentCauseCode() {
        return incidentCauseCode;
    }

    /**
     * Sets the value of the incidentCauseCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIncidentCauseCode(String value) {
        this.incidentCauseCode = value;
    }

    /**
     * Gets the value of the dateTime property.
     * 
     * @return
     *     possible object is
     *     {@link DateTimeType }
     *     
     */
    public DateTimeType getDateTime() {
        return dateTime;
    }

    /**
     * Sets the value of the dateTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link DateTimeType }
     *     
     */
    public void setDateTime(DateTimeType value) {
        this.dateTime = value;
    }

    /**
     * Gets the value of the comment property.
     * 
     * @return
     *     possible object is
     *     {@link CommentType }
     *     
     */
    public CommentType getComment() {
        return comment;
    }

    /**
     * Sets the value of the comment property.
     * 
     * @param value
     *     allowed object is
     *     {@link CommentType }
     *     
     */
    public void setComment(CommentType value) {
        this.comment = value;
    }

}
