
package com.monsanto.commercial.growercreditlist.gen.creditlist.schema;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for GrowerCreditListListBodyType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="GrowerCreditListListBodyType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="GrowerCreditListDetails" maxOccurs="unbounded">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element ref="{Monsanto:Service:GrowerCreditList}PartnerInformation"/>
 *                   &lt;element ref="{Monsanto:Service:GrowerCreditList}GrowerCreditListProperties"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
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
@XmlType(name = "GrowerCreditListListBodyType", propOrder = {
    "growerCreditListDetails"
})
public class GrowerCreditListListBodyType {

    @XmlElement(name = "GrowerCreditListDetails", required = true)
    protected List<GrowerCreditListListBodyType.GrowerCreditListDetails> growerCreditListDetails;

    /**
     * Gets the value of the growerCreditListDetails property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the growerCreditListDetails property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getGrowerCreditListDetails().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link GrowerCreditListListBodyType.GrowerCreditListDetails }
     * 
     * 
     */
    public List<GrowerCreditListListBodyType.GrowerCreditListDetails> getGrowerCreditListDetails() {
        if (growerCreditListDetails == null) {
            growerCreditListDetails = new ArrayList<GrowerCreditListListBodyType.GrowerCreditListDetails>();
        }
        return this.growerCreditListDetails;
    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;sequence>
     *         &lt;element ref="{Monsanto:Service:GrowerCreditList}PartnerInformation"/>
     *         &lt;element ref="{Monsanto:Service:GrowerCreditList}GrowerCreditListProperties"/>
     *       &lt;/sequence>
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "partnerInformation",
        "growerCreditListProperties"
    })
    public static class GrowerCreditListDetails {

        @XmlElement(name = "PartnerInformation", required = true)
        protected PartnerInformationType partnerInformation;
        @XmlElement(name = "GrowerCreditListProperties", required = true)
        protected GrowerCreditListPropertiesType growerCreditListProperties;

        /**
         * 
         * 											Contains all relevant
         * 											partner/grower information.
         * 										
         * 
         * @return
         *     possible object is
         *     {@link PartnerInformationType }
         *     
         */
        public PartnerInformationType getPartnerInformation() {
            return partnerInformation;
        }

        /**
         * Sets the value of the partnerInformation property.
         * 
         * @param value
         *     allowed object is
         *     {@link PartnerInformationType }
         *     
         */
        public void setPartnerInformation(PartnerInformationType value) {
            this.partnerInformation = value;
        }

        /**
         * 
         * 											Contains credit and
         * 											additional grower
         * 											properties.
         * 										
         * 
         * @return
         *     possible object is
         *     {@link GrowerCreditListPropertiesType }
         *     
         */
        public GrowerCreditListPropertiesType getGrowerCreditListProperties() {
            return growerCreditListProperties;
        }

        /**
         * Sets the value of the growerCreditListProperties property.
         * 
         * @param value
         *     allowed object is
         *     {@link GrowerCreditListPropertiesType }
         *     
         */
        public void setGrowerCreditListProperties(GrowerCreditListPropertiesType value) {
            this.growerCreditListProperties = value;
        }

    }

}
