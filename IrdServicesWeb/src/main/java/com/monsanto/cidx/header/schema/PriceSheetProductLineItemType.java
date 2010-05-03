
package com.monsanto.cidx.header.schema;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for PriceSheetProductLineItemType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PriceSheetProductLineItemType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{urn:cidx:names:specification:ces:schema:all:5:0}LineNumber"/>
 *         &lt;element ref="{urn:cidx:names:specification:ces:schema:all:5:0}ProductInformation"/>
 *         &lt;element ref="{urn:cidx:names:specification:ces:schema:all:5:0}PriceSheetPriceData" maxOccurs="unbounded"/>
 *         &lt;element ref="{urn:cidx:names:specification:ces:schema:all:5:0}AllowanceChargeList" minOccurs="0"/>
 *         &lt;element ref="{urn:cidx:names:specification:ces:schema:all:5:0}SpecialInstructions" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{urn:cidx:names:specification:ces:schema:all:5:0}OrderingInformation" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="Action" use="required" type="{urn:cidx:names:specification:ces:schema:all:5:0}cidxListActionType" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PriceSheetProductLineItemType", propOrder = {
    "lineNumber",
    "productInformation",
    "priceSheetPriceData",
    "allowanceChargeList",
    "specialInstructions",
    "orderingInformation"
})
public class PriceSheetProductLineItemType {

    @XmlElement(name = "LineNumber")
    protected long lineNumber;
    @XmlElement(name = "ProductInformation", required = true)
    protected ProductInformationType productInformation;
    @XmlElement(name = "PriceSheetPriceData", required = true)
    protected List<PriceSheetPriceDataType> priceSheetPriceData;
    @XmlElement(name = "AllowanceChargeList")
    protected AllowanceChargeListType allowanceChargeList;
    @XmlElement(name = "SpecialInstructions")
    protected List<SpecialInstructionsType> specialInstructions;
    @XmlElement(name = "OrderingInformation")
    protected OrderingInformationType orderingInformation;
    @XmlAttribute(name = "Action", required = true)
    protected CidxListActionType action;

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
     * Gets the value of the productInformation property.
     * 
     * @return
     *     possible object is
     *     {@link ProductInformationType }
     *     
     */
    public ProductInformationType getProductInformation() {
        return productInformation;
    }

    /**
     * Sets the value of the productInformation property.
     * 
     * @param value
     *     allowed object is
     *     {@link ProductInformationType }
     *     
     */
    public void setProductInformation(ProductInformationType value) {
        this.productInformation = value;
    }

    /**
     * Gets the value of the priceSheetPriceData property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the priceSheetPriceData property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPriceSheetPriceData().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PriceSheetPriceDataType }
     * 
     * 
     */
    public List<PriceSheetPriceDataType> getPriceSheetPriceData() {
        if (priceSheetPriceData == null) {
            priceSheetPriceData = new ArrayList<PriceSheetPriceDataType>();
        }
        return this.priceSheetPriceData;
    }

    /**
     * Gets the value of the allowanceChargeList property.
     * 
     * @return
     *     possible object is
     *     {@link AllowanceChargeListType }
     *     
     */
    public AllowanceChargeListType getAllowanceChargeList() {
        return allowanceChargeList;
    }

    /**
     * Sets the value of the allowanceChargeList property.
     * 
     * @param value
     *     allowed object is
     *     {@link AllowanceChargeListType }
     *     
     */
    public void setAllowanceChargeList(AllowanceChargeListType value) {
        this.allowanceChargeList = value;
    }

    /**
     * Gets the value of the specialInstructions property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the specialInstructions property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSpecialInstructions().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SpecialInstructionsType }
     * 
     * 
     */
    public List<SpecialInstructionsType> getSpecialInstructions() {
        if (specialInstructions == null) {
            specialInstructions = new ArrayList<SpecialInstructionsType>();
        }
        return this.specialInstructions;
    }

    /**
     * Gets the value of the orderingInformation property.
     * 
     * @return
     *     possible object is
     *     {@link OrderingInformationType }
     *     
     */
    public OrderingInformationType getOrderingInformation() {
        return orderingInformation;
    }

    /**
     * Sets the value of the orderingInformation property.
     * 
     * @param value
     *     allowed object is
     *     {@link OrderingInformationType }
     *     
     */
    public void setOrderingInformation(OrderingInformationType value) {
        this.orderingInformation = value;
    }

    /**
     * Gets the value of the action property.
     * 
     * @return
     *     possible object is
     *     {@link CidxListActionType }
     *     
     */
    public CidxListActionType getAction() {
        return action;
    }

    /**
     * Sets the value of the action property.
     * 
     * @param value
     *     allowed object is
     *     {@link CidxListActionType }
     *     
     */
    public void setAction(CidxListActionType value) {
        this.action = value;
    }

}
