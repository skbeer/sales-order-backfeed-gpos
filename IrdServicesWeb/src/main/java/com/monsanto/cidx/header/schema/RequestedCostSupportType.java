
package com.monsanto.cidx.header.schema;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for RequestedCostSupportType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="RequestedCostSupportType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{urn:cidx:names:specification:ces:schema:all:5:0}Pricing" maxOccurs="unbounded"/>
 *         &lt;element ref="{urn:cidx:names:specification:ces:schema:all:5:0}Comment" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{urn:cidx:names:specification:ces:schema:all:5:0}ExpectedReleaseQuantity" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RequestedCostSupportType", propOrder = {
    "pricing",
    "comment",
    "expectedReleaseQuantity"
})
public class RequestedCostSupportType {

    @XmlElement(name = "Pricing", required = true)
    protected List<PricingType> pricing;
    @XmlElement(name = "Comment")
    protected List<CommentType> comment;
    @XmlElement(name = "ExpectedReleaseQuantity")
    protected ExpectedReleaseQuantityType expectedReleaseQuantity;

    /**
     * Gets the value of the pricing property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the pricing property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPricing().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PricingType }
     * 
     * 
     */
    public List<PricingType> getPricing() {
        if (pricing == null) {
            pricing = new ArrayList<PricingType>();
        }
        return this.pricing;
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
     * Gets the value of the expectedReleaseQuantity property.
     * 
     * @return
     *     possible object is
     *     {@link ExpectedReleaseQuantityType }
     *     
     */
    public ExpectedReleaseQuantityType getExpectedReleaseQuantity() {
        return expectedReleaseQuantity;
    }

    /**
     * Sets the value of the expectedReleaseQuantity property.
     * 
     * @param value
     *     allowed object is
     *     {@link ExpectedReleaseQuantityType }
     *     
     */
    public void setExpectedReleaseQuantity(ExpectedReleaseQuantityType value) {
        this.expectedReleaseQuantity = value;
    }

}
