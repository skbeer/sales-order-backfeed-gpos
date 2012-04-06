
package com.monsanto.irdsoapservices.datasummary.schema;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ReportDataVerificationType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ReportDataVerificationType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="DataVerificationCheckpoint" type="{urn:ecms:schema:datasummaryreport:response:1:0}DataVerificationCheckpointType" maxOccurs="unbounded"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ReportDataVerificationType", propOrder = {
    "dataVerificationCheckpoint"
})
public class ReportDataVerificationType {

    @XmlElement(name = "DataVerificationCheckpoint", required = true)
    protected List<DataVerificationCheckpointType> dataVerificationCheckpoint;

    /**
     * Gets the value of the dataVerificationCheckpoint property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the dataVerificationCheckpoint property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDataVerificationCheckpoint().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DataVerificationCheckpointType }
     * 
     * 
     */
    public List<DataVerificationCheckpointType> getDataVerificationCheckpoint() {
        if (dataVerificationCheckpoint == null) {
            dataVerificationCheckpoint = new ArrayList<DataVerificationCheckpointType>();
        }
        return this.dataVerificationCheckpoint;
    }

}
