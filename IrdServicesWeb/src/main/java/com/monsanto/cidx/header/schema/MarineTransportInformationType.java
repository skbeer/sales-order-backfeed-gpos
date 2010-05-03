
package com.monsanto.cidx.header.schema;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * <p>Java class for MarineTransportInformationType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="MarineTransportInformationType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{urn:cidx:names:specification:ces:schema:all:5:0}ShipType" minOccurs="0"/>
 *         &lt;element ref="{urn:cidx:names:specification:ces:schema:all:5:0}EmergencyScheduleCode" maxOccurs="unbounded"/>
 *         &lt;element ref="{urn:cidx:names:specification:ces:schema:all:5:0}MarpolCategory" minOccurs="0"/>
 *         &lt;element ref="{urn:cidx:names:specification:ces:schema:all:5:0}MarinePollutantCode" minOccurs="0"/>
 *         &lt;element ref="{urn:cidx:names:specification:ces:schema:all:5:0}MarpolShipType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MarineTransportInformationType", propOrder = {
    "shipType",
    "emergencyScheduleCode",
    "marpolCategory",
    "marinePollutantCode",
    "marpolShipType"
})
public class MarineTransportInformationType {

    @XmlElement(name = "ShipType")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String shipType;
    @XmlElement(name = "EmergencyScheduleCode", required = true)
    protected List<EmergencyScheduleCodeType> emergencyScheduleCode;
    @XmlElement(name = "MarpolCategory")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String marpolCategory;
    @XmlElement(name = "MarinePollutantCode")
    protected MarinePollutantCodeType marinePollutantCode;
    @XmlElement(name = "MarpolShipType")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String marpolShipType;

    /**
     * Gets the value of the shipType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getShipType() {
        return shipType;
    }

    /**
     * Sets the value of the shipType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setShipType(String value) {
        this.shipType = value;
    }

    /**
     * Gets the value of the emergencyScheduleCode property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the emergencyScheduleCode property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getEmergencyScheduleCode().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link EmergencyScheduleCodeType }
     * 
     * 
     */
    public List<EmergencyScheduleCodeType> getEmergencyScheduleCode() {
        if (emergencyScheduleCode == null) {
            emergencyScheduleCode = new ArrayList<EmergencyScheduleCodeType>();
        }
        return this.emergencyScheduleCode;
    }

    /**
     * Gets the value of the marpolCategory property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMarpolCategory() {
        return marpolCategory;
    }

    /**
     * Sets the value of the marpolCategory property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMarpolCategory(String value) {
        this.marpolCategory = value;
    }

    /**
     * Gets the value of the marinePollutantCode property.
     * 
     * @return
     *     possible object is
     *     {@link MarinePollutantCodeType }
     *     
     */
    public MarinePollutantCodeType getMarinePollutantCode() {
        return marinePollutantCode;
    }

    /**
     * Sets the value of the marinePollutantCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link MarinePollutantCodeType }
     *     
     */
    public void setMarinePollutantCode(MarinePollutantCodeType value) {
        this.marinePollutantCode = value;
    }

    /**
     * Gets the value of the marpolShipType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMarpolShipType() {
        return marpolShipType;
    }

    /**
     * Sets the value of the marpolShipType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMarpolShipType(String value) {
        this.marpolShipType = value;
    }

}
