
package com.monsanto.irdsoapservices.salesorder.schema;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for SalesOrderReportBodyType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SalesOrderReportBodyType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="SalesOrderReportDetails" type="{urn:ecms:schema:salesorderreport:response:1:0}SalesOrderReportDetailsType" maxOccurs="unbounded"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SalesOrderReportBodyType", propOrder = {
    "salesOrderReportDetails"
})
public class SalesOrderReportBodyType {

    @XmlElement(name = "SalesOrderReportDetails", required = true)
    protected List<SalesOrderReportDetailsType> salesOrderReportDetails;

    /**
     * Gets the value of the salesOrderReportDetails property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the salesOrderReportDetails property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSalesOrderReportDetails().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SalesOrderReportDetailsType }
     * 
     * 
     */
    public List<SalesOrderReportDetailsType> getSalesOrderReportDetails() {
        if (salesOrderReportDetails == null) {
            salesOrderReportDetails = new ArrayList<SalesOrderReportDetailsType>();
        }
        return this.salesOrderReportDetails;
    }

}
