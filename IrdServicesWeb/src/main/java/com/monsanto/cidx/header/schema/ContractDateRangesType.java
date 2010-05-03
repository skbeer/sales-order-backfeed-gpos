
package com.monsanto.cidx.header.schema;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ContractDateRangesType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ContractDateRangesType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{urn:cidx:names:specification:ces:schema:all:5:0}DateTimeRange"/>
 *       &lt;/sequence>
 *       &lt;attribute name="ContractDateRangesType" use="required" type="{urn:cidx:names:specification:ces:schema:all:5:0}cidxListContractDateRangesType" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ContractDateRangesType", propOrder = {
    "dateTimeRange"
})
public class ContractDateRangesType {

    @XmlElement(name = "DateTimeRange", required = true)
    protected DateTimeRangeType dateTimeRange;
    @XmlAttribute(name = "ContractDateRangesType", required = true)
    protected CidxListContractDateRangesType contractDateRangesType;

    /**
     * Gets the value of the dateTimeRange property.
     * 
     * @return
     *     possible object is
     *     {@link DateTimeRangeType }
     *     
     */
    public DateTimeRangeType getDateTimeRange() {
        return dateTimeRange;
    }

    /**
     * Sets the value of the dateTimeRange property.
     * 
     * @param value
     *     allowed object is
     *     {@link DateTimeRangeType }
     *     
     */
    public void setDateTimeRange(DateTimeRangeType value) {
        this.dateTimeRange = value;
    }

    /**
     * Gets the value of the contractDateRangesType property.
     * 
     * @return
     *     possible object is
     *     {@link CidxListContractDateRangesType }
     *     
     */
    public CidxListContractDateRangesType getContractDateRangesType() {
        return contractDateRangesType;
    }

    /**
     * Sets the value of the contractDateRangesType property.
     * 
     * @param value
     *     allowed object is
     *     {@link CidxListContractDateRangesType }
     *     
     */
    public void setContractDateRangesType(CidxListContractDateRangesType value) {
        this.contractDateRangesType = value;
    }

}
