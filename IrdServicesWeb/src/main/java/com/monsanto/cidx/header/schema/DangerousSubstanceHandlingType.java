
package com.monsanto.cidx.header.schema;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for DangerousSubstanceHandlingType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="DangerousSubstanceHandlingType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{urn:cidx:names:specification:ces:schema:all:5:0}EULabelingRegulations" minOccurs="0"/>
 *         &lt;element ref="{urn:cidx:names:specification:ces:schema:all:5:0}RiskPhrase" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{urn:cidx:names:specification:ces:schema:all:5:0}SafetyPhrase" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DangerousSubstanceHandlingType", propOrder = {
    "euLabelingRegulations",
    "riskPhrase",
    "safetyPhrase"
})
public class DangerousSubstanceHandlingType {

    @XmlElement(name = "EULabelingRegulations")
    protected EULabelingRegulationsType euLabelingRegulations;
    @XmlElement(name = "RiskPhrase")
    protected List<RiskPhraseType> riskPhrase;
    @XmlElement(name = "SafetyPhrase")
    protected List<SafetyPhraseType> safetyPhrase;

    /**
     * Gets the value of the euLabelingRegulations property.
     * 
     * @return
     *     possible object is
     *     {@link EULabelingRegulationsType }
     *     
     */
    public EULabelingRegulationsType getEULabelingRegulations() {
        return euLabelingRegulations;
    }

    /**
     * Sets the value of the euLabelingRegulations property.
     * 
     * @param value
     *     allowed object is
     *     {@link EULabelingRegulationsType }
     *     
     */
    public void setEULabelingRegulations(EULabelingRegulationsType value) {
        this.euLabelingRegulations = value;
    }

    /**
     * Gets the value of the riskPhrase property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the riskPhrase property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRiskPhrase().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link RiskPhraseType }
     * 
     * 
     */
    public List<RiskPhraseType> getRiskPhrase() {
        if (riskPhrase == null) {
            riskPhrase = new ArrayList<RiskPhraseType>();
        }
        return this.riskPhrase;
    }

    /**
     * Gets the value of the safetyPhrase property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the safetyPhrase property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSafetyPhrase().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SafetyPhraseType }
     * 
     * 
     */
    public List<SafetyPhraseType> getSafetyPhrase() {
        if (safetyPhrase == null) {
            safetyPhrase = new ArrayList<SafetyPhraseType>();
        }
        return this.safetyPhrase;
    }

}
