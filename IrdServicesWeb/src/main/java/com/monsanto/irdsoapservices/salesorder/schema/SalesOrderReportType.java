
package com.monsanto.irdsoapservices.salesorder.schema;

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
 * <p>Java class for SalesOrderReportType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SalesOrderReportType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Header" type="{urn:ecms:schema:salesorderreport:response:1:0}HeaderType"/>
 *         &lt;element name="SalesOrderReportBody" type="{urn:ecms:schema:salesorderreport:response:1:0}SalesOrderReportBodyType"/>
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
@XmlType(name = "SalesOrderReportType", propOrder = {
    "header",
    "salesOrderReportBody"
})
@XmlSeeAlso({
    SalesOrderReport.class
})
public class SalesOrderReportType {

    @XmlElement(name = "Header", required = true)
    protected HeaderType header;
    @XmlElement(name = "SalesOrderReportBody", required = true)
    protected SalesOrderReportBodyType salesOrderReportBody;
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
     * Gets the value of the salesOrderReportBody property.
     * 
     * @return
     *     possible object is
     *     {@link SalesOrderReportBodyType }
     *     
     */
    public SalesOrderReportBodyType getSalesOrderReportBody() {
        return salesOrderReportBody;
    }

    /**
     * Sets the value of the salesOrderReportBody property.
     * 
     * @param value
     *     allowed object is
     *     {@link SalesOrderReportBodyType }
     *     
     */
    public void setSalesOrderReportBody(SalesOrderReportBodyType value) {
        this.salesOrderReportBody = value;
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
