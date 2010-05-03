
package com.monsanto.cidx.header.schema;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for RiskPhraseType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="RiskPhraseType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{urn:cidx:names:specification:ces:schema:all:5:0}RiskCode"/>
 *         &lt;element ref="{urn:cidx:names:specification:ces:schema:all:5:0}RiskDescription" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RiskPhraseType", propOrder = {
    "riskCode",
    "riskDescription"
})
public class RiskPhraseType {

    @XmlElement(name = "RiskCode", required = true)
    protected RiskCodeType riskCode;
    @XmlElement(name = "RiskDescription")
    protected List<RiskDescriptionType> riskDescription;

    /**
     * Gets the value of the riskCode property.
     * 
     * @return
     *     possible object is
     *     {@link RiskCodeType }
     *     
     */
    public RiskCodeType getRiskCode() {
        return riskCode;
    }

    /**
     * Sets the value of the riskCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link RiskCodeType }
     *     
     */
    public void setRiskCode(RiskCodeType value) {
        this.riskCode = value;
    }

    /**
     * Gets the value of the riskDescription property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the riskDescription property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRiskDescription().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link RiskDescriptionType }
     * 
     * 
     */
    public List<RiskDescriptionType> getRiskDescription() {
        if (riskDescription == null) {
            riskDescription = new ArrayList<RiskDescriptionType>();
        }
        return this.riskDescription;
    }

}
