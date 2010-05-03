
package com.monsanto.cidx.header.schema;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for QualityTestingReportDetailsType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="QualityTestingReportDetailsType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{urn:cidx:names:specification:ces:schema:all:5:0}QualityTestingReportBatchDetail" maxOccurs="unbounded"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "QualityTestingReportDetailsType", propOrder = {
    "qualityTestingReportBatchDetail"
})
public class QualityTestingReportDetailsType {

    @XmlElement(name = "QualityTestingReportBatchDetail", required = true)
    protected List<QualityTestingReportBatchDetailType> qualityTestingReportBatchDetail;

    /**
     * Gets the value of the qualityTestingReportBatchDetail property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the qualityTestingReportBatchDetail property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getQualityTestingReportBatchDetail().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link QualityTestingReportBatchDetailType }
     * 
     * 
     */
    public List<QualityTestingReportBatchDetailType> getQualityTestingReportBatchDetail() {
        if (qualityTestingReportBatchDetail == null) {
            qualityTestingReportBatchDetail = new ArrayList<QualityTestingReportBatchDetailType>();
        }
        return this.qualityTestingReportBatchDetail;
    }

}
