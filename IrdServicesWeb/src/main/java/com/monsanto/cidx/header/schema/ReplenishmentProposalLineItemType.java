
package com.monsanto.cidx.header.schema;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ReplenishmentProposalLineItemType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ReplenishmentProposalLineItemType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{urn:cidx:names:specification:ces:schema:all:5:0}LineNumber"/>
 *         &lt;element ref="{urn:cidx:names:specification:ces:schema:all:5:0}ReplenishmentProposalLocation"/>
 *         &lt;element ref="{urn:cidx:names:specification:ces:schema:all:5:0}ReplenishmentProposalContent" maxOccurs="unbounded"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ReplenishmentProposalLineItemType", propOrder = {
    "lineNumber",
    "replenishmentProposalLocation",
    "replenishmentProposalContent"
})
public class ReplenishmentProposalLineItemType {

    @XmlElement(name = "LineNumber")
    protected long lineNumber;
    @XmlElement(name = "ReplenishmentProposalLocation", required = true)
    protected ReplenishmentProposalLocationType replenishmentProposalLocation;
    @XmlElement(name = "ReplenishmentProposalContent", required = true)
    protected List<ReplenishmentProposalContentType> replenishmentProposalContent;

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
     * Gets the value of the replenishmentProposalLocation property.
     * 
     * @return
     *     possible object is
     *     {@link ReplenishmentProposalLocationType }
     *     
     */
    public ReplenishmentProposalLocationType getReplenishmentProposalLocation() {
        return replenishmentProposalLocation;
    }

    /**
     * Sets the value of the replenishmentProposalLocation property.
     * 
     * @param value
     *     allowed object is
     *     {@link ReplenishmentProposalLocationType }
     *     
     */
    public void setReplenishmentProposalLocation(ReplenishmentProposalLocationType value) {
        this.replenishmentProposalLocation = value;
    }

    /**
     * Gets the value of the replenishmentProposalContent property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the replenishmentProposalContent property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getReplenishmentProposalContent().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ReplenishmentProposalContentType }
     * 
     * 
     */
    public List<ReplenishmentProposalContentType> getReplenishmentProposalContent() {
        if (replenishmentProposalContent == null) {
            replenishmentProposalContent = new ArrayList<ReplenishmentProposalContentType>();
        }
        return this.replenishmentProposalContent;
    }

}
