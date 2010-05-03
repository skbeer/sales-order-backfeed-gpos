
package com.monsanto.cidx.header.schema;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for RelativeDueDateType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="RelativeDueDateType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{urn:cidx:names:specification:ces:schema:all:5:0}DateOfMonth"/>
 *         &lt;element ref="{urn:cidx:names:specification:ces:schema:all:5:0}NumberOfMonths"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RelativeDueDateType", propOrder = {
    "dateOfMonth",
    "numberOfMonths"
})
public class RelativeDueDateType {

    @XmlElement(name = "DateOfMonth")
    protected int dateOfMonth;
    @XmlElement(name = "NumberOfMonths")
    protected int numberOfMonths;

    /**
     * Gets the value of the dateOfMonth property.
     * 
     */
    public int getDateOfMonth() {
        return dateOfMonth;
    }

    /**
     * Sets the value of the dateOfMonth property.
     * 
     */
    public void setDateOfMonth(int value) {
        this.dateOfMonth = value;
    }

    /**
     * Gets the value of the numberOfMonths property.
     * 
     */
    public int getNumberOfMonths() {
        return numberOfMonths;
    }

    /**
     * Sets the value of the numberOfMonths property.
     * 
     */
    public void setNumberOfMonths(int value) {
        this.numberOfMonths = value;
    }

}
