
package com.monsanto.irdsoapservices.datasummary.schema;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * <p>Java class for DataSummaryReportType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="DataSummaryReportType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Header" type="{urn:ecms:schema:datasummaryreport:response:1:0}HeaderType"/>
 *         &lt;element name="DataSummaryReportBody" type="{urn:ecms:schema:datasummaryreport:response:1:0}DataSummaryReportBodyType"/>
 *       &lt;/sequence>
 *       &lt;attribute name="Version" type="{http://www.w3.org/2001/XMLSchema}token" fixed="1.0" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DataSummaryReportType", propOrder = {
    "header",
    "dataSummaryReportBody"
})
@XmlSeeAlso({
    DataSummaryReport.class
})
public class DataSummaryReportType {

    @XmlElement(name = "Header", required = true)
    protected HeaderType header;
    @XmlElement(name = "DataSummaryReportBody", required = true)
    protected DataSummaryReportBodyType dataSummaryReportBody;
    @XmlAttribute(name = "Version")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String version;

    /**
     * Gets the value of the header property.
     * 
     * @return
     *     possible object is
     *     {@link HeaderType }
     *     
     */
    public HeaderType getHeader() {
        return header;
    }

    /**
     * Sets the value of the header property.
     * 
     * @param value
     *     allowed object is
     *     {@link HeaderType }
     *     
     */
    public void setHeader(HeaderType value) {
        this.header = value;
    }

    /**
     * Gets the value of the dataSummaryReportBody property.
     * 
     * @return
     *     possible object is
     *     {@link DataSummaryReportBodyType }
     *     
     */
    public DataSummaryReportBodyType getDataSummaryReportBody() {
        return dataSummaryReportBody;
    }

    /**
     * Sets the value of the dataSummaryReportBody property.
     * 
     * @param value
     *     allowed object is
     *     {@link DataSummaryReportBodyType }
     *     
     */
    public void setDataSummaryReportBody(DataSummaryReportBodyType value) {
        this.dataSummaryReportBody = value;
    }

    /**
     * Gets the value of the version property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVersion() {
        if (version == null) {
            return "1.0";
        } else {
            return version;
        }
    }

    /**
     * Sets the value of the version property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVersion(String value) {
        this.version = value;
    }

}
