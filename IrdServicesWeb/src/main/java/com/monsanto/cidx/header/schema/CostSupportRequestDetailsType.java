
package com.monsanto.cidx.header.schema;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CostSupportRequestDetailsType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CostSupportRequestDetailsType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{urn:cidx:names:specification:ces:schema:all:5:0}SupportedProduct"/>
 *         &lt;element ref="{urn:cidx:names:specification:ces:schema:all:5:0}PackagingInformation"/>
 *         &lt;element ref="{urn:cidx:names:specification:ces:schema:all:5:0}RequestedCostSupport"/>
 *         &lt;element ref="{urn:cidx:names:specification:ces:schema:all:5:0}CostSupportDuration"/>
 *         &lt;element ref="{urn:cidx:names:specification:ces:schema:all:5:0}ReviewDate" minOccurs="0"/>
 *         &lt;element ref="{urn:cidx:names:specification:ces:schema:all:5:0}UnitConversions" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;choice>
 *           &lt;element ref="{urn:cidx:names:specification:ces:schema:all:5:0}BidInformation"/>
 *           &lt;element ref="{urn:cidx:names:specification:ces:schema:all:5:0}CompetitiveInformation"/>
 *         &lt;/choice>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CostSupportRequestDetailsType", propOrder = {
    "supportedProduct",
    "packagingInformation",
    "requestedCostSupport",
    "costSupportDuration",
    "reviewDate",
    "unitConversions",
    "bidInformation",
    "competitiveInformation"
})
public class CostSupportRequestDetailsType {

    @XmlElement(name = "SupportedProduct", required = true)
    protected SupportedProductType supportedProduct;
    @XmlElement(name = "PackagingInformation", required = true)
    protected PackagingInformationType packagingInformation;
    @XmlElement(name = "RequestedCostSupport", required = true)
    protected RequestedCostSupportType requestedCostSupport;
    @XmlElement(name = "CostSupportDuration", required = true)
    protected CostSupportDurationType costSupportDuration;
    @XmlElement(name = "ReviewDate")
    protected ReviewDateType reviewDate;
    @XmlElement(name = "UnitConversions")
    protected List<UnitConversionsType> unitConversions;
    @XmlElement(name = "BidInformation")
    protected BidInformationType bidInformation;
    @XmlElement(name = "CompetitiveInformation")
    protected CompetitiveInformationType competitiveInformation;

    /**
     * Gets the value of the supportedProduct property.
     * 
     * @return
     *     possible object is
     *     {@link SupportedProductType }
     *     
     */
    public SupportedProductType getSupportedProduct() {
        return supportedProduct;
    }

    /**
     * Sets the value of the supportedProduct property.
     * 
     * @param value
     *     allowed object is
     *     {@link SupportedProductType }
     *     
     */
    public void setSupportedProduct(SupportedProductType value) {
        this.supportedProduct = value;
    }

    /**
     * Gets the value of the packagingInformation property.
     * 
     * @return
     *     possible object is
     *     {@link PackagingInformationType }
     *     
     */
    public PackagingInformationType getPackagingInformation() {
        return packagingInformation;
    }

    /**
     * Sets the value of the packagingInformation property.
     * 
     * @param value
     *     allowed object is
     *     {@link PackagingInformationType }
     *     
     */
    public void setPackagingInformation(PackagingInformationType value) {
        this.packagingInformation = value;
    }

    /**
     * Gets the value of the requestedCostSupport property.
     * 
     * @return
     *     possible object is
     *     {@link RequestedCostSupportType }
     *     
     */
    public RequestedCostSupportType getRequestedCostSupport() {
        return requestedCostSupport;
    }

    /**
     * Sets the value of the requestedCostSupport property.
     * 
     * @param value
     *     allowed object is
     *     {@link RequestedCostSupportType }
     *     
     */
    public void setRequestedCostSupport(RequestedCostSupportType value) {
        this.requestedCostSupport = value;
    }

    /**
     * Gets the value of the costSupportDuration property.
     * 
     * @return
     *     possible object is
     *     {@link CostSupportDurationType }
     *     
     */
    public CostSupportDurationType getCostSupportDuration() {
        return costSupportDuration;
    }

    /**
     * Sets the value of the costSupportDuration property.
     * 
     * @param value
     *     allowed object is
     *     {@link CostSupportDurationType }
     *     
     */
    public void setCostSupportDuration(CostSupportDurationType value) {
        this.costSupportDuration = value;
    }

    /**
     * Gets the value of the reviewDate property.
     * 
     * @return
     *     possible object is
     *     {@link ReviewDateType }
     *     
     */
    public ReviewDateType getReviewDate() {
        return reviewDate;
    }

    /**
     * Sets the value of the reviewDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link ReviewDateType }
     *     
     */
    public void setReviewDate(ReviewDateType value) {
        this.reviewDate = value;
    }

    /**
     * Gets the value of the unitConversions property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the unitConversions property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getUnitConversions().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link UnitConversionsType }
     * 
     * 
     */
    public List<UnitConversionsType> getUnitConversions() {
        if (unitConversions == null) {
            unitConversions = new ArrayList<UnitConversionsType>();
        }
        return this.unitConversions;
    }

    /**
     * Gets the value of the bidInformation property.
     * 
     * @return
     *     possible object is
     *     {@link BidInformationType }
     *     
     */
    public BidInformationType getBidInformation() {
        return bidInformation;
    }

    /**
     * Sets the value of the bidInformation property.
     * 
     * @param value
     *     allowed object is
     *     {@link BidInformationType }
     *     
     */
    public void setBidInformation(BidInformationType value) {
        this.bidInformation = value;
    }

    /**
     * Gets the value of the competitiveInformation property.
     * 
     * @return
     *     possible object is
     *     {@link CompetitiveInformationType }
     *     
     */
    public CompetitiveInformationType getCompetitiveInformation() {
        return competitiveInformation;
    }

    /**
     * Sets the value of the competitiveInformation property.
     * 
     * @param value
     *     allowed object is
     *     {@link CompetitiveInformationType }
     *     
     */
    public void setCompetitiveInformation(CompetitiveInformationType value) {
        this.competitiveInformation = value;
    }

}
