
package com.monsanto.cidx.header.schema;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ReplenishmentProposalRequestLineItemType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ReplenishmentProposalRequestLineItemType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{urn:cidx:names:specification:ces:schema:all:5:0}LineNumber"/>
 *         &lt;element ref="{urn:cidx:names:specification:ces:schema:all:5:0}ReplenishmentProposalRequestLocation"/>
 *         &lt;element ref="{urn:cidx:names:specification:ces:schema:all:5:0}ReplenishmentProposalRequestContent" maxOccurs="unbounded"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ReplenishmentProposalRequestLineItemType", propOrder = {
    "lineNumber",
    "replenishmentProposalRequestLocation",
    "replenishmentProposalRequestContent"
})
public class ReplenishmentProposalRequestLineItemType {

    @XmlElement(name = "LineNumber")
    protected long lineNumber;
    @XmlElement(name = "ReplenishmentProposalRequestLocation", required = true)
    protected ReplenishmentProposalRequestLocationType replenishmentProposalRequestLocation;
    @XmlElement(name = "ReplenishmentProposalRequestContent", required = true)
    protected List<ReplenishmentProposalRequestContentType> replenishmentProposalRequestContent;

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
     * Gets the value of the replenishmentProposalRequestLocation property.
     * 
     * @return
     *     possible object is
     *     {@link ReplenishmentProposalRequestLocationType }
     *     
     */
    public ReplenishmentProposalRequestLocationType getReplenishmentProposalRequestLocation() {
        return replenishmentProposalRequestLocation;
    }

    /**
     * Sets the value of the replenishmentProposalRequestLocation property.
     * 
     * @param value
     *     allowed object is
     *     {@link ReplenishmentProposalRequestLocationType }
     *     
     */
    public void setReplenishmentProposalRequestLocation(ReplenishmentProposalRequestLocationType value) {
        this.replenishmentProposalRequestLocation = value;
    }

    /**
     * Gets the value of the replenishmentProposalRequestContent property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the replenishmentProposalRequestContent property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getReplenishmentProposalRequestContent().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ReplenishmentProposalRequestContentType }
     * 
     * 
     */
    public List<ReplenishmentProposalRequestContentType> getReplenishmentProposalRequestContent() {
        if (replenishmentProposalRequestContent == null) {
            replenishmentProposalRequestContent = new ArrayList<ReplenishmentProposalRequestContentType>();
        }
        return this.replenishmentProposalRequestContent;
    }

}
