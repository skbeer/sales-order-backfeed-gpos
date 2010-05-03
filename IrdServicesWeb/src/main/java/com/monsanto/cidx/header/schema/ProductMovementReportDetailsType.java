
package com.monsanto.cidx.header.schema;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ProductMovementReportDetailsType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ProductMovementReportDetailsType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{urn:cidx:names:specification:ces:schema:all:5:0}ReportingEntity"/>
 *         &lt;element ref="{urn:cidx:names:specification:ces:schema:all:5:0}ProductMovementTransactions"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ProductMovementReportDetailsType", propOrder = {
    "reportingEntity",
    "productMovementTransactions"
})
public class ProductMovementReportDetailsType {

    @XmlElement(name = "ReportingEntity", required = true)
    protected ReportingEntityType reportingEntity;
    @XmlElement(name = "ProductMovementTransactions", required = true)
    protected ProductMovementTransactionsType productMovementTransactions;

    /**
     * Gets the value of the reportingEntity property.
     * 
     * @return
     *     possible object is
     *     {@link ReportingEntityType }
     *     
     */
    public ReportingEntityType getReportingEntity() {
        return reportingEntity;
    }

    /**
     * Sets the value of the reportingEntity property.
     * 
     * @param value
     *     allowed object is
     *     {@link ReportingEntityType }
     *     
     */
    public void setReportingEntity(ReportingEntityType value) {
        this.reportingEntity = value;
    }

    /**
     * Gets the value of the productMovementTransactions property.
     * 
     * @return
     *     possible object is
     *     {@link ProductMovementTransactionsType }
     *     
     */
    public ProductMovementTransactionsType getProductMovementTransactions() {
        return productMovementTransactions;
    }

    /**
     * Sets the value of the productMovementTransactions property.
     * 
     * @param value
     *     allowed object is
     *     {@link ProductMovementTransactionsType }
     *     
     */
    public void setProductMovementTransactions(ProductMovementTransactionsType value) {
        this.productMovementTransactions = value;
    }

}
