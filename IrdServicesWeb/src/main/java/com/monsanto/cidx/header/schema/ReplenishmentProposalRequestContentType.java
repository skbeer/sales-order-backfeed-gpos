
package com.monsanto.cidx.header.schema;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * <p>Java class for ReplenishmentProposalRequestContentType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ReplenishmentProposalRequestContentType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{urn:cidx:names:specification:ces:schema:all:5:0}LineNumber"/>
 *         &lt;element ref="{urn:cidx:names:specification:ces:schema:all:5:0}ReplenishmentProposalRequestProduct"/>
 *         &lt;element ref="{urn:cidx:names:specification:ces:schema:all:5:0}StorageTankIdentifier" minOccurs="0"/>
 *         &lt;element ref="{urn:cidx:names:specification:ces:schema:all:5:0}ReplenishmentSummary"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ReplenishmentProposalRequestContentType", propOrder = {
    "lineNumber",
    "replenishmentProposalRequestProduct",
    "storageTankIdentifier",
    "replenishmentSummary"
})
public class ReplenishmentProposalRequestContentType {

    @XmlElement(name = "LineNumber")
    protected long lineNumber;
    @XmlElement(name = "ReplenishmentProposalRequestProduct", required = true)
    protected ReplenishmentProposalRequestProductType replenishmentProposalRequestProduct;
    @XmlElement(name = "StorageTankIdentifier")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String storageTankIdentifier;
    @XmlElement(name = "ReplenishmentSummary", required = true)
    protected ReplenishmentSummaryType replenishmentSummary;

    /**
     * Gets the value of the lineNumber property.
     * 
     */
    public long getLineNumber() {
        return lineNumber;
    }

    /**
     * Sets the value of the lineNumber property.
     * 
     */
    public void setLineNumber(long value) {
        this.lineNumber = value;
    }

    /**
     * Gets the value of the replenishmentProposalRequestProduct property.
     * 
     * @return
     *     possible object is
     *     {@link ReplenishmentProposalRequestProductType }
     *     
     */
    public ReplenishmentProposalRequestProductType getReplenishmentProposalRequestProduct() {
        return replenishmentProposalRequestProduct;
    }

    /**
     * Sets the value of the replenishmentProposalRequestProduct property.
     * 
     * @param value
     *     allowed object is
     *     {@link ReplenishmentProposalRequestProductType }
     *     
     */
    public void setReplenishmentProposalRequestProduct(ReplenishmentProposalRequestProductType value) {
        this.replenishmentProposalRequestProduct = value;
    }

    /**
     * Gets the value of the storageTankIdentifier property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStorageTankIdentifier() {
        return storageTankIdentifier;
    }

    /**
     * Sets the value of the storageTankIdentifier property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStorageTankIdentifier(String value) {
        this.storageTankIdentifier = value;
    }

    /**
     * Gets the value of the replenishmentSummary property.
     * 
     * @return
     *     possible object is
     *     {@link ReplenishmentSummaryType }
     *     
     */
    public ReplenishmentSummaryType getReplenishmentSummary() {
        return replenishmentSummary;
    }

    /**
     * Sets the value of the replenishmentSummary property.
     * 
     * @param value
     *     allowed object is
     *     {@link ReplenishmentSummaryType }
     *     
     */
    public void setReplenishmentSummary(ReplenishmentSummaryType value) {
        this.replenishmentSummary = value;
    }

}
