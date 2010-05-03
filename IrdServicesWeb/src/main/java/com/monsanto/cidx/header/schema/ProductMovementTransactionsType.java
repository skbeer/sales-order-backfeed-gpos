
package com.monsanto.cidx.header.schema;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ProductMovementTransactionsType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ProductMovementTransactionsType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{urn:cidx:names:specification:ces:schema:all:5:0}ProductMovementTransaction" maxOccurs="unbounded"/>
 *       &lt;/sequence>
 *       &lt;attribute name="ProductMovementReportType" use="required" type="{urn:cidx:names:specification:ces:schema:all:5:0}cidxListReportType" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ProductMovementTransactionsType", propOrder = {
    "productMovementTransaction"
})
public class ProductMovementTransactionsType {

    @XmlElement(name = "ProductMovementTransaction", required = true)
    protected List<ProductMovementTransactionType> productMovementTransaction;
    @XmlAttribute(name = "ProductMovementReportType", required = true)
    protected CidxListReportType productMovementReportType;

    /**
     * Gets the value of the productMovementTransaction property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the productMovementTransaction property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getProductMovementTransaction().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ProductMovementTransactionType }
     * 
     * 
     */
    public List<ProductMovementTransactionType> getProductMovementTransaction() {
        if (productMovementTransaction == null) {
            productMovementTransaction = new ArrayList<ProductMovementTransactionType>();
        }
        return this.productMovementTransaction;
    }

    /**
     * Gets the value of the productMovementReportType property.
     * 
     * @return
     *     possible object is
     *     {@link CidxListReportType }
     *     
     */
    public CidxListReportType getProductMovementReportType() {
        return productMovementReportType;
    }

    /**
     * Sets the value of the productMovementReportType property.
     * 
     * @param value
     *     allowed object is
     *     {@link CidxListReportType }
     *     
     */
    public void setProductMovementReportType(CidxListReportType value) {
        this.productMovementReportType = value;
    }

}
