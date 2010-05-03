
package com.monsanto.cidx.header.schema;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for QualityTestingReportPartnersType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="QualityTestingReportPartnersType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{urn:cidx:names:specification:ces:schema:all:5:0}Seller"/>
 *         &lt;element ref="{urn:cidx:names:specification:ces:schema:all:5:0}ThirdPartyLaboratory"/>
 *         &lt;element ref="{urn:cidx:names:specification:ces:schema:all:5:0}OtherPartner" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "QualityTestingReportPartnersType", propOrder = {
    "seller",
    "thirdPartyLaboratory",
    "otherPartner"
})
public class QualityTestingReportPartnersType {

    @XmlElement(name = "Seller", required = true)
    protected SellerType seller;
    @XmlElement(name = "ThirdPartyLaboratory", required = true)
    protected ThirdPartyLaboratoryType thirdPartyLaboratory;
    @XmlElement(name = "OtherPartner")
    protected List<OtherPartnerType> otherPartner;

    /**
     * Gets the value of the seller property.
     * 
     * @return
     *     possible object is
     *     {@link SellerType }
     *     
     */
    public SellerType getSeller() {
        return seller;
    }

    /**
     * Sets the value of the seller property.
     * 
     * @param value
     *     allowed object is
     *     {@link SellerType }
     *     
     */
    public void setSeller(SellerType value) {
        this.seller = value;
    }

    /**
     * Gets the value of the thirdPartyLaboratory property.
     * 
     * @return
     *     possible object is
     *     {@link ThirdPartyLaboratoryType }
     *     
     */
    public ThirdPartyLaboratoryType getThirdPartyLaboratory() {
        return thirdPartyLaboratory;
    }

    /**
     * Sets the value of the thirdPartyLaboratory property.
     * 
     * @param value
     *     allowed object is
     *     {@link ThirdPartyLaboratoryType }
     *     
     */
    public void setThirdPartyLaboratory(ThirdPartyLaboratoryType value) {
        this.thirdPartyLaboratory = value;
    }

    /**
     * Gets the value of the otherPartner property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the otherPartner property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getOtherPartner().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link OtherPartnerType }
     * 
     * 
     */
    public List<OtherPartnerType> getOtherPartner() {
        if (otherPartner == null) {
            otherPartner = new ArrayList<OtherPartnerType>();
        }
        return this.otherPartner;
    }

}
