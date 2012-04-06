
package com.monsanto.irdsoapservices.datasummary.schema;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for DataSummaryReportBodyType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="DataSummaryReportBodyType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ReportFileList" type="{urn:ecms:schema:datasummaryreport:response:1:0}ReportFileListType"/>
 *         &lt;element name="ReportDataVerification" type="{urn:ecms:schema:datasummaryreport:response:1:0}ReportDataVerificationType"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DataSummaryReportBodyType", propOrder = {
    "reportFileList",
    "reportDataVerification"
})
public class DataSummaryReportBodyType {

    @XmlElement(name = "ReportFileList", required = true)
    protected ReportFileListType reportFileList;
    @XmlElement(name = "ReportDataVerification", required = true)
    protected ReportDataVerificationType reportDataVerification;

    /**
     * Gets the value of the reportFileList property.
     * 
     * @return
     *     possible object is
     *     {@link ReportFileListType }
     *     
     */
    public ReportFileListType getReportFileList() {
        return reportFileList;
    }

    /**
     * Sets the value of the reportFileList property.
     * 
     * @param value
     *     allowed object is
     *     {@link ReportFileListType }
     *     
     */
    public void setReportFileList(ReportFileListType value) {
        this.reportFileList = value;
    }

    /**
     * Gets the value of the reportDataVerification property.
     * 
     * @return
     *     possible object is
     *     {@link ReportDataVerificationType }
     *     
     */
    public ReportDataVerificationType getReportDataVerification() {
        return reportDataVerification;
    }

    /**
     * Sets the value of the reportDataVerification property.
     * 
     * @param value
     *     allowed object is
     *     {@link ReportDataVerificationType }
     *     
     */
    public void setReportDataVerification(ReportDataVerificationType value) {
        this.reportDataVerification = value;
    }

}
