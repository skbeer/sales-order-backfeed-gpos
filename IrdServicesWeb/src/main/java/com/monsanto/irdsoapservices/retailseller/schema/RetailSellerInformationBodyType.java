
package com.monsanto.irdsoapservices.retailseller.schema;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for RetailSellerInformationBodyType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="RetailSellerInformationBodyType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="RetailSellerInformationPartners" type="{urn:ecms:schema:retailsellerinformation:request:1:0}RetailSellerInformationPartnersType"/>
 *         &lt;element name="RetailSellerInformationDetails" type="{urn:ecms:schema:retailsellerinformation:request:1:0}RetailSellerInformationDetailsType" maxOccurs="unbounded"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RetailSellerInformationBodyType", propOrder = {
    "retailSellerInformationPartners",
    "retailSellerInformationDetails"
})
public class RetailSellerInformationBodyType {

    @XmlElement(name = "RetailSellerInformationPartners", required = true)
    protected RetailSellerInformationPartnersType retailSellerInformationPartners;
    @XmlElement(name = "RetailSellerInformationDetails", required = true)
    protected List<RetailSellerInformationDetailsType> retailSellerInformationDetails;

    /**
     * Gets the value of the retailSellerInformationPartners property.
     * 
     * @return
     *     possible object is
     *     {@link RetailSellerInformationPartnersType }
     *     
     */
    public RetailSellerInformationPartnersType getRetailSellerInformationPartners() {
        return retailSellerInformationPartners;
    }

    /**
     * Sets the value of the retailSellerInformationPartners property.
     * 
     * @param value
     *     allowed object is
     *     {@link RetailSellerInformationPartnersType }
     *     
     */
    public void setRetailSellerInformationPartners(RetailSellerInformationPartnersType value) {
        this.retailSellerInformationPartners = value;
    }

    /**
     * Gets the value of the retailSellerInformationDetails property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the retailSellerInformationDetails property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRetailSellerInformationDetails().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link RetailSellerInformationDetailsType }
     * 
     * 
     */
    public List<RetailSellerInformationDetailsType> getRetailSellerInformationDetails() {
        if (retailSellerInformationDetails == null) {
            retailSellerInformationDetails = new ArrayList<RetailSellerInformationDetailsType>();
        }
        return this.retailSellerInformationDetails;
    }

}
