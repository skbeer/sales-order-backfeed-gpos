
package com.monsanto.cidx.header.schema;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * <p>Java class for ReplenishmentProposalRequestProductType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ReplenishmentProposalRequestProductType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{urn:cidx:names:specification:ces:schema:all:5:0}ProductIdentification" maxOccurs="unbounded"/>
 *         &lt;element ref="{urn:cidx:names:specification:ces:schema:all:5:0}PackagingType" minOccurs="0"/>
 *         &lt;element ref="{urn:cidx:names:specification:ces:schema:all:5:0}PackagingContainerInformation" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ReplenishmentProposalRequestProductType", propOrder = {
    "productIdentification",
    "packagingType",
    "packagingContainerInformation"
})
public class ReplenishmentProposalRequestProductType {

    @XmlElement(name = "ProductIdentification", required = true)
    protected List<ProductIdentificationType> productIdentification;
    @XmlElement(name = "PackagingType")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String packagingType;
    @XmlElement(name = "PackagingContainerInformation")
    protected PackagingContainerInformationType packagingContainerInformation;

    /**
     * Gets the value of the productIdentification property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the productIdentification property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getProductIdentification().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ProductIdentificationType }
     * 
     * 
     */
    public List<ProductIdentificationType> getProductIdentification() {
        if (productIdentification == null) {
            productIdentification = new ArrayList<ProductIdentificationType>();
        }
        return this.productIdentification;
    }

    /**
     * Gets the value of the packagingType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPackagingType() {
        return packagingType;
    }

    /**
     * Sets the value of the packagingType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPackagingType(String value) {
        this.packagingType = value;
    }

    /**
     * Gets the value of the packagingContainerInformation property.
     * 
     * @return
     *     possible object is
     *     {@link PackagingContainerInformationType }
     *     
     */
    public PackagingContainerInformationType getPackagingContainerInformation() {
        return packagingContainerInformation;
    }

    /**
     * Sets the value of the packagingContainerInformation property.
     * 
     * @param value
     *     allowed object is
     *     {@link PackagingContainerInformationType }
     *     
     */
    public void setPackagingContainerInformation(PackagingContainerInformationType value) {
        this.packagingContainerInformation = value;
    }

}
