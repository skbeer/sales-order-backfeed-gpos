
package com.monsanto.cidx.header.schema;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ProductMovementReportBodyType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ProductMovementReportBodyType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{urn:cidx:names:specification:ces:schema:all:5:0}ProductMovementReportProperties" minOccurs="0"/>
 *         &lt;element ref="{urn:cidx:names:specification:ces:schema:all:5:0}ProductMovementReportDetails" maxOccurs="unbounded"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ProductMovementReportBodyType", propOrder = {
    "productMovementReportProperties",
    "productMovementReportDetails"
})
public class ProductMovementReportBodyType {

    @XmlElement(name = "ProductMovementReportProperties")
    protected ProductMovementReportPropertiesType productMovementReportProperties;
    @XmlElement(name = "ProductMovementReportDetails", required = true)
    protected List<ProductMovementReportDetailsType> productMovementReportDetails;

    /**
     * Gets the value of the productMovementReportProperties property.
     * 
     * @return
     *     possible object is
     *     {@link ProductMovementReportPropertiesType }
     *     
     */
    public ProductMovementReportPropertiesType getProductMovementReportProperties() {
        return productMovementReportProperties;
    }

    /**
     * Sets the value of the productMovementReportProperties property.
     * 
     * @param value
     *     allowed object is
     *     {@link ProductMovementReportPropertiesType }
     *     
     */
    public void setProductMovementReportProperties(ProductMovementReportPropertiesType value) {
        this.productMovementReportProperties = value;
    }

    /**
     * Gets the value of the productMovementReportDetails property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the productMovementReportDetails property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getProductMovementReportDetails().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ProductMovementReportDetailsType }
     * 
     * 
     */
    public List<ProductMovementReportDetailsType> getProductMovementReportDetails() {
        if (productMovementReportDetails == null) {
            productMovementReportDetails = new ArrayList<ProductMovementReportDetailsType>();
        }
        return this.productMovementReportDetails;
    }

}
