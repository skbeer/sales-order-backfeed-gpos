
package com.monsanto.cidx.header.schema;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * <p>Java class for TaxOrDutyType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TaxOrDutyType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{urn:cidx:names:specification:ces:schema:all:5:0}TaxTypeCode"/>
 *         &lt;element ref="{urn:cidx:names:specification:ces:schema:all:5:0}TaxLocation"/>
 *         &lt;choice>
 *           &lt;element ref="{urn:cidx:names:specification:ces:schema:all:5:0}Exempt"/>
 *           &lt;element ref="{urn:cidx:names:specification:ces:schema:all:5:0}NonExempt" maxOccurs="unbounded"/>
 *         &lt;/choice>
 *       &lt;/sequence>
 *       &lt;attribute name="TaxOrDutyQualifier" use="required" type="{urn:cidx:names:specification:ces:schema:all:5:0}cidxListTaxOrDutyQualifier" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TaxOrDutyType", propOrder = {
    "taxTypeCode",
    "taxLocation",
    "exempt",
    "nonExempt"
})
public class TaxOrDutyType {

    @XmlElement(name = "TaxTypeCode", required = true)
    protected TaxTypeCodeType taxTypeCode;
    @XmlElement(name = "TaxLocation", required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String taxLocation;
    @XmlElement(name = "Exempt")
    protected ExemptType exempt;
    @XmlElement(name = "NonExempt")
    protected List<NonExemptType> nonExempt;
    @XmlAttribute(name = "TaxOrDutyQualifier", required = true)
    protected CidxListTaxOrDutyQualifier taxOrDutyQualifier;

    /**
     * Gets the value of the taxTypeCode property.
     * 
     * @return
     *     possible object is
     *     {@link TaxTypeCodeType }
     *     
     */
    public TaxTypeCodeType getTaxTypeCode() {
        return taxTypeCode;
    }

    /**
     * Sets the value of the taxTypeCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link TaxTypeCodeType }
     *     
     */
    public void setTaxTypeCode(TaxTypeCodeType value) {
        this.taxTypeCode = value;
    }

    /**
     * Gets the value of the taxLocation property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTaxLocation() {
        return taxLocation;
    }

    /**
     * Sets the value of the taxLocation property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTaxLocation(String value) {
        this.taxLocation = value;
    }

    /**
     * Gets the value of the exempt property.
     * 
     * @return
     *     possible object is
     *     {@link ExemptType }
     *     
     */
    public ExemptType getExempt() {
        return exempt;
    }

    /**
     * Sets the value of the exempt property.
     * 
     * @param value
     *     allowed object is
     *     {@link ExemptType }
     *     
     */
    public void setExempt(ExemptType value) {
        this.exempt = value;
    }

    /**
     * Gets the value of the nonExempt property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the nonExempt property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getNonExempt().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link NonExemptType }
     * 
     * 
     */
    public List<NonExemptType> getNonExempt() {
        if (nonExempt == null) {
            nonExempt = new ArrayList<NonExemptType>();
        }
        return this.nonExempt;
    }

    /**
     * Gets the value of the taxOrDutyQualifier property.
     * 
     * @return
     *     possible object is
     *     {@link CidxListTaxOrDutyQualifier }
     *     
     */
    public CidxListTaxOrDutyQualifier getTaxOrDutyQualifier() {
        return taxOrDutyQualifier;
    }

    /**
     * Sets the value of the taxOrDutyQualifier property.
     * 
     * @param value
     *     allowed object is
     *     {@link CidxListTaxOrDutyQualifier }
     *     
     */
    public void setTaxOrDutyQualifier(CidxListTaxOrDutyQualifier value) {
        this.taxOrDutyQualifier = value;
    }

}
