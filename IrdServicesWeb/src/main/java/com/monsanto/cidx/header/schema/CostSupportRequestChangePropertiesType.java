
package com.monsanto.cidx.header.schema;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * <p>Java class for CostSupportRequestChangePropertiesType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CostSupportRequestChangePropertiesType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{urn:cidx:names:specification:ces:schema:all:5:0}CostSupportRequestNumber"/>
 *         &lt;element ref="{urn:cidx:names:specification:ces:schema:all:5:0}CostSupportAgreementNumber"/>
 *         &lt;element ref="{urn:cidx:names:specification:ces:schema:all:5:0}RebateType"/>
 *         &lt;element ref="{urn:cidx:names:specification:ces:schema:all:5:0}RequestIssuedDate"/>
 *         &lt;element ref="{urn:cidx:names:specification:ces:schema:all:5:0}LanguageCode"/>
 *         &lt;element ref="{urn:cidx:names:specification:ces:schema:all:5:0}CurrencyCode"/>
 *         &lt;element ref="{urn:cidx:names:specification:ces:schema:all:5:0}TransportMethodCode" minOccurs="0"/>
 *         &lt;element ref="{urn:cidx:names:specification:ces:schema:all:5:0}CostSupportOrderType" minOccurs="0"/>
 *         &lt;element ref="{urn:cidx:names:specification:ces:schema:all:5:0}SupplierMarketSegment" minOccurs="0"/>
 *         &lt;element ref="{urn:cidx:names:specification:ces:schema:all:5:0}Comment" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{urn:cidx:names:specification:ces:schema:all:5:0}DeletionStatus" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CostSupportRequestChangePropertiesType", propOrder = {
    "costSupportRequestNumber",
    "costSupportAgreementNumber",
    "rebateType",
    "requestIssuedDate",
    "languageCode",
    "currencyCode",
    "transportMethodCode",
    "costSupportOrderType",
    "supplierMarketSegment",
    "comment",
    "deletionStatus"
})
public class CostSupportRequestChangePropertiesType {

    @XmlElement(name = "CostSupportRequestNumber", required = true)
    protected CostSupportRequestNumberType costSupportRequestNumber;
    @XmlElement(name = "CostSupportAgreementNumber", required = true)
    protected CostSupportAgreementNumberType costSupportAgreementNumber;
    @XmlElement(name = "RebateType", required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String rebateType;
    @XmlElement(name = "RequestIssuedDate", required = true)
    protected RequestIssuedDateType requestIssuedDate;
    @XmlElement(name = "LanguageCode", required = true)
    protected LanguageCodeType languageCode;
    @XmlElement(name = "CurrencyCode", required = true)
    protected CurrencyCodeType currencyCode;
    @XmlElement(name = "TransportMethodCode")
    protected TransportMethodCodeType transportMethodCode;
    @XmlElement(name = "CostSupportOrderType")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String costSupportOrderType;
    @XmlElement(name = "SupplierMarketSegment")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String supplierMarketSegment;
    @XmlElement(name = "Comment")
    protected List<CommentType> comment;
    @XmlElement(name = "DeletionStatus")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String deletionStatus;

    /**
     * Gets the value of the costSupportRequestNumber property.
     * 
     * @return
     *     possible object is
     *     {@link CostSupportRequestNumberType }
     *     
     */
    public CostSupportRequestNumberType getCostSupportRequestNumber() {
        return costSupportRequestNumber;
    }

    /**
     * Sets the value of the costSupportRequestNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link CostSupportRequestNumberType }
     *     
     */
    public void setCostSupportRequestNumber(CostSupportRequestNumberType value) {
        this.costSupportRequestNumber = value;
    }

    /**
     * Gets the value of the costSupportAgreementNumber property.
     * 
     * @return
     *     possible object is
     *     {@link CostSupportAgreementNumberType }
     *     
     */
    public CostSupportAgreementNumberType getCostSupportAgreementNumber() {
        return costSupportAgreementNumber;
    }

    /**
     * Sets the value of the costSupportAgreementNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link CostSupportAgreementNumberType }
     *     
     */
    public void setCostSupportAgreementNumber(CostSupportAgreementNumberType value) {
        this.costSupportAgreementNumber = value;
    }

    /**
     * Gets the value of the rebateType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRebateType() {
        return rebateType;
    }

    /**
     * Sets the value of the rebateType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRebateType(String value) {
        this.rebateType = value;
    }

    /**
     * Gets the value of the requestIssuedDate property.
     * 
     * @return
     *     possible object is
     *     {@link RequestIssuedDateType }
     *     
     */
    public RequestIssuedDateType getRequestIssuedDate() {
        return requestIssuedDate;
    }

    /**
     * Sets the value of the requestIssuedDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link RequestIssuedDateType }
     *     
     */
    public void setRequestIssuedDate(RequestIssuedDateType value) {
        this.requestIssuedDate = value;
    }

    /**
     * Gets the value of the languageCode property.
     * 
     * @return
     *     possible object is
     *     {@link LanguageCodeType }
     *     
     */
    public LanguageCodeType getLanguageCode() {
        return languageCode;
    }

    /**
     * Sets the value of the languageCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link LanguageCodeType }
     *     
     */
    public void setLanguageCode(LanguageCodeType value) {
        this.languageCode = value;
    }

    /**
     * Gets the value of the currencyCode property.
     * 
     * @return
     *     possible object is
     *     {@link CurrencyCodeType }
     *     
     */
    public CurrencyCodeType getCurrencyCode() {
        return currencyCode;
    }

    /**
     * Sets the value of the currencyCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link CurrencyCodeType }
     *     
     */
    public void setCurrencyCode(CurrencyCodeType value) {
        this.currencyCode = value;
    }

    /**
     * Gets the value of the transportMethodCode property.
     * 
     * @return
     *     possible object is
     *     {@link TransportMethodCodeType }
     *     
     */
    public TransportMethodCodeType getTransportMethodCode() {
        return transportMethodCode;
    }

    /**
     * Sets the value of the transportMethodCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link TransportMethodCodeType }
     *     
     */
    public void setTransportMethodCode(TransportMethodCodeType value) {
        this.transportMethodCode = value;
    }

    /**
     * Gets the value of the costSupportOrderType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCostSupportOrderType() {
        return costSupportOrderType;
    }

    /**
     * Sets the value of the costSupportOrderType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCostSupportOrderType(String value) {
        this.costSupportOrderType = value;
    }

    /**
     * Gets the value of the supplierMarketSegment property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSupplierMarketSegment() {
        return supplierMarketSegment;
    }

    /**
     * Sets the value of the supplierMarketSegment property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSupplierMarketSegment(String value) {
        this.supplierMarketSegment = value;
    }

    /**
     * Gets the value of the comment property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the comment property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getComment().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CommentType }
     * 
     * 
     */
    public List<CommentType> getComment() {
        if (comment == null) {
            comment = new ArrayList<CommentType>();
        }
        return this.comment;
    }

    /**
     * Gets the value of the deletionStatus property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDeletionStatus() {
        return deletionStatus;
    }

    /**
     * Sets the value of the deletionStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDeletionStatus(String value) {
        this.deletionStatus = value;
    }

}
