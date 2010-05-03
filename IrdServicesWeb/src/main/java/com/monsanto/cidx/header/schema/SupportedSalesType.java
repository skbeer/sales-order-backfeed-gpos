
package com.monsanto.cidx.header.schema;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for SupportedSalesType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SupportedSalesType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{urn:cidx:names:specification:ces:schema:all:5:0}LineNumber" minOccurs="0"/>
 *         &lt;element ref="{urn:cidx:names:specification:ces:schema:all:5:0}InvoiceNumber"/>
 *         &lt;element ref="{urn:cidx:names:specification:ces:schema:all:5:0}ShipDate"/>
 *         &lt;element ref="{urn:cidx:names:specification:ces:schema:all:5:0}ProductQuantity"/>
 *         &lt;element ref="{urn:cidx:names:specification:ces:schema:all:5:0}SupportedSellingPrice"/>
 *         &lt;element ref="{urn:cidx:names:specification:ces:schema:all:5:0}NetDistributorCost" minOccurs="0"/>
 *         &lt;element ref="{urn:cidx:names:specification:ces:schema:all:5:0}CostSupportPerUnit"/>
 *         &lt;element ref="{urn:cidx:names:specification:ces:schema:all:5:0}LineItemTotal"/>
 *         &lt;element ref="{urn:cidx:names:specification:ces:schema:all:5:0}PurchaseOrderNumber" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SupportedSalesType", propOrder = {
    "lineNumber",
    "invoiceNumber",
    "shipDate",
    "productQuantity",
    "supportedSellingPrice",
    "netDistributorCost",
    "costSupportPerUnit",
    "lineItemTotal",
    "purchaseOrderNumber"
})
public class SupportedSalesType {

    @XmlElement(name = "LineNumber")
    protected Long lineNumber;
    @XmlElement(name = "InvoiceNumber", required = true)
    protected InvoiceNumberType invoiceNumber;
    @XmlElement(name = "ShipDate", required = true)
    protected ShipDateType shipDate;
    @XmlElement(name = "ProductQuantity", required = true)
    protected ProductQuantityType productQuantity;
    @XmlElement(name = "SupportedSellingPrice", required = true)
    protected SupportedSellingPriceType supportedSellingPrice;
    @XmlElement(name = "NetDistributorCost")
    protected NetDistributorCostType netDistributorCost;
    @XmlElement(name = "CostSupportPerUnit", required = true)
    protected CostSupportPerUnitType costSupportPerUnit;
    @XmlElement(name = "LineItemTotal", required = true)
    protected LineItemTotalType lineItemTotal;
    @XmlElement(name = "PurchaseOrderNumber")
    protected PurchaseOrderNumberType purchaseOrderNumber;

    /**
     * Gets the value of the lineNumber property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getLineNumber() {
        return lineNumber;
    }

    /**
     * Sets the value of the lineNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setLineNumber(Long value) {
        this.lineNumber = value;
    }

    /**
     * Gets the value of the invoiceNumber property.
     * 
     * @return
     *     possible object is
     *     {@link InvoiceNumberType }
     *     
     */
    public InvoiceNumberType getInvoiceNumber() {
        return invoiceNumber;
    }

    /**
     * Sets the value of the invoiceNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link InvoiceNumberType }
     *     
     */
    public void setInvoiceNumber(InvoiceNumberType value) {
        this.invoiceNumber = value;
    }

    /**
     * Gets the value of the shipDate property.
     * 
     * @return
     *     possible object is
     *     {@link ShipDateType }
     *     
     */
    public ShipDateType getShipDate() {
        return shipDate;
    }

    /**
     * Sets the value of the shipDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link ShipDateType }
     *     
     */
    public void setShipDate(ShipDateType value) {
        this.shipDate = value;
    }

    /**
     * Gets the value of the productQuantity property.
     * 
     * @return
     *     possible object is
     *     {@link ProductQuantityType }
     *     
     */
    public ProductQuantityType getProductQuantity() {
        return productQuantity;
    }

    /**
     * Sets the value of the productQuantity property.
     * 
     * @param value
     *     allowed object is
     *     {@link ProductQuantityType }
     *     
     */
    public void setProductQuantity(ProductQuantityType value) {
        this.productQuantity = value;
    }

    /**
     * Gets the value of the supportedSellingPrice property.
     * 
     * @return
     *     possible object is
     *     {@link SupportedSellingPriceType }
     *     
     */
    public SupportedSellingPriceType getSupportedSellingPrice() {
        return supportedSellingPrice;
    }

    /**
     * Sets the value of the supportedSellingPrice property.
     * 
     * @param value
     *     allowed object is
     *     {@link SupportedSellingPriceType }
     *     
     */
    public void setSupportedSellingPrice(SupportedSellingPriceType value) {
        this.supportedSellingPrice = value;
    }

    /**
     * Gets the value of the netDistributorCost property.
     * 
     * @return
     *     possible object is
     *     {@link NetDistributorCostType }
     *     
     */
    public NetDistributorCostType getNetDistributorCost() {
        return netDistributorCost;
    }

    /**
     * Sets the value of the netDistributorCost property.
     * 
     * @param value
     *     allowed object is
     *     {@link NetDistributorCostType }
     *     
     */
    public void setNetDistributorCost(NetDistributorCostType value) {
        this.netDistributorCost = value;
    }

    /**
     * Gets the value of the costSupportPerUnit property.
     * 
     * @return
     *     possible object is
     *     {@link CostSupportPerUnitType }
     *     
     */
    public CostSupportPerUnitType getCostSupportPerUnit() {
        return costSupportPerUnit;
    }

    /**
     * Sets the value of the costSupportPerUnit property.
     * 
     * @param value
     *     allowed object is
     *     {@link CostSupportPerUnitType }
     *     
     */
    public void setCostSupportPerUnit(CostSupportPerUnitType value) {
        this.costSupportPerUnit = value;
    }

    /**
     * Gets the value of the lineItemTotal property.
     * 
     * @return
     *     possible object is
     *     {@link LineItemTotalType }
     *     
     */
    public LineItemTotalType getLineItemTotal() {
        return lineItemTotal;
    }

    /**
     * Sets the value of the lineItemTotal property.
     * 
     * @param value
     *     allowed object is
     *     {@link LineItemTotalType }
     *     
     */
    public void setLineItemTotal(LineItemTotalType value) {
        this.lineItemTotal = value;
    }

    /**
     * Gets the value of the purchaseOrderNumber property.
     * 
     * @return
     *     possible object is
     *     {@link PurchaseOrderNumberType }
     *     
     */
    public PurchaseOrderNumberType getPurchaseOrderNumber() {
        return purchaseOrderNumber;
    }

    /**
     * Sets the value of the purchaseOrderNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link PurchaseOrderNumberType }
     *     
     */
    public void setPurchaseOrderNumber(PurchaseOrderNumberType value) {
        this.purchaseOrderNumber = value;
    }

}
