
package com.monsanto.cidx.header.schema;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * <p>Java class for DeliveryConfirmationResponseProductLineItemType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="DeliveryConfirmationResponseProductLineItemType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{urn:cidx:names:specification:ces:schema:all:5:0}LineNumber"/>
 *         &lt;element ref="{urn:cidx:names:specification:ces:schema:all:5:0}PurchaseOrderLineItemNumber"/>
 *         &lt;element ref="{urn:cidx:names:specification:ces:schema:all:5:0}PurchaseOrderNumber"/>
 *         &lt;element ref="{urn:cidx:names:specification:ces:schema:all:5:0}DeliveryConfirmationAcceptance"/>
 *         &lt;element ref="{urn:cidx:names:specification:ces:schema:all:5:0}DeliveryConfirmationRejectionDescription" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{urn:cidx:names:specification:ces:schema:all:5:0}ProductIdentification" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{urn:cidx:names:specification:ces:schema:all:5:0}ReferenceInformation" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{urn:cidx:names:specification:ces:schema:all:5:0}SalesOrderIdentifier" minOccurs="0"/>
 *         &lt;element ref="{urn:cidx:names:specification:ces:schema:all:5:0}ProductQuantity" minOccurs="0"/>
 *         &lt;element ref="{urn:cidx:names:specification:ces:schema:all:5:0}PackagingQuantity" minOccurs="0"/>
 *         &lt;element ref="{urn:cidx:names:specification:ces:schema:all:5:0}BatchNumber" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{urn:cidx:names:specification:ces:schema:all:5:0}CountryOfOriginCode" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DeliveryConfirmationResponseProductLineItemType", propOrder = {
    "lineNumber",
    "purchaseOrderLineItemNumber",
    "purchaseOrderNumber",
    "deliveryConfirmationAcceptance",
    "deliveryConfirmationRejectionDescription",
    "productIdentification",
    "referenceInformation",
    "salesOrderIdentifier",
    "productQuantity",
    "packagingQuantity",
    "batchNumber",
    "countryOfOriginCode"
})
public class DeliveryConfirmationResponseProductLineItemType {

    @XmlElement(name = "LineNumber")
    protected long lineNumber;
    @XmlElement(name = "PurchaseOrderLineItemNumber", required = true)
    protected BigInteger purchaseOrderLineItemNumber;
    @XmlElement(name = "PurchaseOrderNumber", required = true)
    protected PurchaseOrderNumberType purchaseOrderNumber;
    @XmlElement(name = "DeliveryConfirmationAcceptance", required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String deliveryConfirmationAcceptance;
    @XmlElement(name = "DeliveryConfirmationRejectionDescription")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected List<String> deliveryConfirmationRejectionDescription;
    @XmlElement(name = "ProductIdentification")
    protected List<ProductIdentificationType> productIdentification;
    @XmlElement(name = "ReferenceInformation")
    protected List<ReferenceInformationType> referenceInformation;
    @XmlElement(name = "SalesOrderIdentifier")
    protected SalesOrderIdentifierType salesOrderIdentifier;
    @XmlElement(name = "ProductQuantity")
    protected ProductQuantityType productQuantity;
    @XmlElement(name = "PackagingQuantity")
    protected PackagingQuantityType packagingQuantity;
    @XmlElement(name = "BatchNumber")
    protected List<BatchNumberType> batchNumber;
    @XmlElement(name = "CountryOfOriginCode")
    protected CountryOfOriginCodeType countryOfOriginCode;

    /**
     * Gets the value of the lineNumber property.
     * 
     */
    public long getLineNumber() {
        return lineNumber;
    }

    /**
     * Sets the value of the lineNumber property.
     * 
     */
    public void setLineNumber(long value) {
        this.lineNumber = value;
    }

    /**
     * Gets the value of the purchaseOrderLineItemNumber property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getPurchaseOrderLineItemNumber() {
        return purchaseOrderLineItemNumber;
    }

    /**
     * Sets the value of the purchaseOrderLineItemNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setPurchaseOrderLineItemNumber(BigInteger value) {
        this.purchaseOrderLineItemNumber = value;
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

    /**
     * Gets the value of the deliveryConfirmationAcceptance property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDeliveryConfirmationAcceptance() {
        return deliveryConfirmationAcceptance;
    }

    /**
     * Sets the value of the deliveryConfirmationAcceptance property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDeliveryConfirmationAcceptance(String value) {
        this.deliveryConfirmationAcceptance = value;
    }

    /**
     * Gets the value of the deliveryConfirmationRejectionDescription property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the deliveryConfirmationRejectionDescription property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDeliveryConfirmationRejectionDescription().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getDeliveryConfirmationRejectionDescription() {
        if (deliveryConfirmationRejectionDescription == null) {
            deliveryConfirmationRejectionDescription = new ArrayList<String>();
        }
        return this.deliveryConfirmationRejectionDescription;
    }

    /**
     * Gets the value of the productIdentification property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the productIdentification property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getProductIdentification().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ProductIdentificationType }
     * 
     * 
     */
    public List<ProductIdentificationType> getProductIdentification() {
        if (productIdentification == null) {
            productIdentification = new ArrayList<ProductIdentificationType>();
        }
        return this.productIdentification;
    }

    /**
     * Gets the value of the referenceInformation property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the referenceInformation property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getReferenceInformation().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ReferenceInformationType }
     * 
     * 
     */
    public List<ReferenceInformationType> getReferenceInformation() {
        if (referenceInformation == null) {
            referenceInformation = new ArrayList<ReferenceInformationType>();
        }
        return this.referenceInformation;
    }

    /**
     * Gets the value of the salesOrderIdentifier property.
     * 
     * @return
     *     possible object is
     *     {@link SalesOrderIdentifierType }
     *     
     */
    public SalesOrderIdentifierType getSalesOrderIdentifier() {
        return salesOrderIdentifier;
    }

    /**
     * Sets the value of the salesOrderIdentifier property.
     * 
     * @param value
     *     allowed object is
     *     {@link SalesOrderIdentifierType }
     *     
     */
    public void setSalesOrderIdentifier(SalesOrderIdentifierType value) {
        this.salesOrderIdentifier = value;
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
     * Gets the value of the packagingQuantity property.
     * 
     * @return
     *     possible object is
     *     {@link PackagingQuantityType }
     *     
     */
    public PackagingQuantityType getPackagingQuantity() {
        return packagingQuantity;
    }

    /**
     * Sets the value of the packagingQuantity property.
     * 
     * @param value
     *     allowed object is
     *     {@link PackagingQuantityType }
     *     
     */
    public void setPackagingQuantity(PackagingQuantityType value) {
        this.packagingQuantity = value;
    }

    /**
     * Gets the value of the batchNumber property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the batchNumber property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getBatchNumber().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link BatchNumberType }
     * 
     * 
     */
    public List<BatchNumberType> getBatchNumber() {
        if (batchNumber == null) {
            batchNumber = new ArrayList<BatchNumberType>();
        }
        return this.batchNumber;
    }

    /**
     * Gets the value of the countryOfOriginCode property.
     * 
     * @return
     *     possible object is
     *     {@link CountryOfOriginCodeType }
     *     
     */
    public CountryOfOriginCodeType getCountryOfOriginCode() {
        return countryOfOriginCode;
    }

    /**
     * Sets the value of the countryOfOriginCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link CountryOfOriginCodeType }
     *     
     */
    public void setCountryOfOriginCode(CountryOfOriginCodeType value) {
        this.countryOfOriginCode = value;
    }

}
