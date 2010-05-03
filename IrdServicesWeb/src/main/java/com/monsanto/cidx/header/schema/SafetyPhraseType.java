
package com.monsanto.cidx.header.schema;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for SafetyPhraseType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SafetyPhraseType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{urn:cidx:names:specification:ces:schema:all:5:0}SafetyCode"/>
 *         &lt;element ref="{urn:cidx:names:specification:ces:schema:all:5:0}SafetyDescription" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SafetyPhraseType", propOrder = {
    "safetyCode",
    "safetyDescription"
})
public class SafetyPhraseType {

    @XmlElement(name = "SafetyCode", required = true)
    protected SafetyCodeType safetyCode;
    @XmlElement(name = "SafetyDescription")
    protected List<SafetyDescriptionType> safetyDescription;

    /**
     * Gets the value of the safetyCode property.
     * 
     * @return
     *     possible object is
     *     {@link SafetyCodeType }
     *     
     */
    public SafetyCodeType getSafetyCode() {
        return safetyCode;
    }

    /**
     * Sets the value of the safetyCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link SafetyCodeType }
     *     
     */
    public void setSafetyCode(SafetyCodeType value) {
        this.safetyCode = value;
    }

    /**
     * Gets the value of the safetyDescription property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the safetyDescription property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSafetyDescription().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SafetyDescriptionType }
     * 
     * 
     */
    public List<SafetyDescriptionType> getSafetyDescription() {
        if (safetyDescription == null) {
            safetyDescription = new ArrayList<SafetyDescriptionType>();
        }
        return this.safetyDescription;
    }

}
