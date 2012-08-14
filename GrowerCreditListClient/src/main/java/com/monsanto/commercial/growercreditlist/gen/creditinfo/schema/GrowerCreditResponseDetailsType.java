
package com.monsanto.commercial.growercreditlist.gen.creditinfo.schema;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * <p>Java class for GrowerCreditResponseDetailsType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="GrowerCreditResponseDetailsType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{Monsanto:Service:GrowerCredit}GrowerIdentification"/>
 *         &lt;element name="CreditLimit">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}decimal">
 *               &lt;fractionDigits value="2"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="AmountOfCreditUsed">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}decimal">
 *               &lt;fractionDigits value="2"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GrowerCreditResponseDetailsType", propOrder = {
    "growerIdentification",
    "creditLimit",
    "amountOfCreditUsed"
})
public class GrowerCreditResponseDetailsType {

    @XmlElement(name = "GrowerIdentification", required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String growerIdentification;
    @XmlElement(name = "CreditLimit", required = true)
    protected BigDecimal creditLimit;
    @XmlElement(name = "AmountOfCreditUsed", required = true)
    protected BigDecimal amountOfCreditUsed;

    /**
     * Gets the value of the growerIdentification property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGrowerIdentification() {
        return growerIdentification;
    }

    /**
     * Sets the value of the growerIdentification property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGrowerIdentification(String value) {
        this.growerIdentification = value;
    }

    /**
     * Gets the value of the creditLimit property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getCreditLimit() {
        return creditLimit;
    }

    /**
     * Sets the value of the creditLimit property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setCreditLimit(BigDecimal value) {
        this.creditLimit = value;
    }

    /**
     * Gets the value of the amountOfCreditUsed property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getAmountOfCreditUsed() {
        return amountOfCreditUsed;
    }

    /**
     * Sets the value of the amountOfCreditUsed property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setAmountOfCreditUsed(BigDecimal value) {
        this.amountOfCreditUsed = value;
    }

}
