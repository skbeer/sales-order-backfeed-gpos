
package com.monsanto.cidx.header.schema;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for QualificationResponseDetailsType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="QualificationResponseDetailsType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{urn:cidx:names:specification:ces:schema:all:5:0}CountryOfFinalDestinationCode" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{urn:cidx:names:specification:ces:schema:all:5:0}QualificationStatusInformation"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "QualificationResponseDetailsType", propOrder = {
    "countryOfFinalDestinationCode",
    "qualificationStatusInformation"
})
public class QualificationResponseDetailsType {

    @XmlElement(name = "CountryOfFinalDestinationCode")
    protected List<CountryOfFinalDestinationCodeType> countryOfFinalDestinationCode;
    @XmlElement(name = "QualificationStatusInformation", required = true)
    protected QualificationStatusInformationType qualificationStatusInformation;

    /**
     * Gets the value of the countryOfFinalDestinationCode property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the countryOfFinalDestinationCode property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCountryOfFinalDestinationCode().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CountryOfFinalDestinationCodeType }
     * 
     * 
     */
    public List<CountryOfFinalDestinationCodeType> getCountryOfFinalDestinationCode() {
        if (countryOfFinalDestinationCode == null) {
            countryOfFinalDestinationCode = new ArrayList<CountryOfFinalDestinationCodeType>();
        }
        return this.countryOfFinalDestinationCode;
    }

    /**
     * Gets the value of the qualificationStatusInformation property.
     * 
     * @return
     *     possible object is
     *     {@link QualificationStatusInformationType }
     *     
     */
    public QualificationStatusInformationType getQualificationStatusInformation() {
        return qualificationStatusInformation;
    }

    /**
     * Sets the value of the qualificationStatusInformation property.
     * 
     * @param value
     *     allowed object is
     *     {@link QualificationStatusInformationType }
     *     
     */
    public void setQualificationStatusInformation(QualificationStatusInformationType value) {
        this.qualificationStatusInformation = value;
    }

}
