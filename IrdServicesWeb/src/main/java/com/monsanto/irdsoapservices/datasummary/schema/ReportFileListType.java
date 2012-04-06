
package com.monsanto.irdsoapservices.datasummary.schema;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * <p>Java class for ReportFileListType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ReportFileListType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="FileCount" type="{http://www.w3.org/2001/XMLSchema}integer"/>
 *         &lt;element name="ReportFile" type="{urn:ecms:schema:datasummaryreport:response:1:0}ReportFileType" maxOccurs="unbounded"/>
 *       &lt;/sequence>
 *       &lt;attribute name="Type">
 *         &lt;simpleType>
 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}token">
 *             &lt;enumeration value="External"/>
 *             &lt;enumeration value="Agrimine"/>
 *             &lt;enumeration value="Manual"/>
 *           &lt;/restriction>
 *         &lt;/simpleType>
 *       &lt;/attribute>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ReportFileListType", propOrder = {
    "fileCount",
    "reportFile"
})
public class ReportFileListType {

    @XmlElement(name = "FileCount", required = true)
    protected BigInteger fileCount;
    @XmlElement(name = "ReportFile", required = true)
    protected List<ReportFileType> reportFile;
    @XmlAttribute(name = "Type")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String type;

    /**
     * Gets the value of the fileCount property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getFileCount() {
        return fileCount;
    }

    /**
     * Sets the value of the fileCount property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setFileCount(BigInteger value) {
        this.fileCount = value;
    }

    /**
     * Gets the value of the reportFile property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the reportFile property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getReportFile().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ReportFileType }
     * 
     * 
     */
    public List<ReportFileType> getReportFile() {
        if (reportFile == null) {
            reportFile = new ArrayList<ReportFileType>();
        }
        return this.reportFile;
    }

    /**
     * Gets the value of the type property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getType() {
        return type;
    }

    /**
     * Sets the value of the type property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setType(String value) {
        this.type = value;
    }

}
