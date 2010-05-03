
package com.monsanto.cidx.header.schema;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for OpenHoursType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="OpenHoursType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{urn:cidx:names:specification:ces:schema:all:5:0}TimeOfDayRange" maxOccurs="unbounded"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "OpenHoursType", propOrder = {
    "timeOfDayRange"
})
public class OpenHoursType {

    @XmlElement(name = "TimeOfDayRange", required = true)
    protected List<TimeOfDayRangeType> timeOfDayRange;

    /**
     * Gets the value of the timeOfDayRange property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the timeOfDayRange property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTimeOfDayRange().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TimeOfDayRangeType }
     * 
     * 
     */
    public List<TimeOfDayRangeType> getTimeOfDayRange() {
        if (timeOfDayRange == null) {
            timeOfDayRange = new ArrayList<TimeOfDayRangeType>();
        }
        return this.timeOfDayRange;
    }

}
