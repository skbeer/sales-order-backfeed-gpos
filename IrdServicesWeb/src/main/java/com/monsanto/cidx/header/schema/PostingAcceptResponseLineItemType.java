
package com.monsanto.cidx.header.schema;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for PostingAcceptResponseLineItemType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PostingAcceptResponseLineItemType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{urn:cidx:names:specification:ces:schema:all:5:0}LineNumber"/>
 *         &lt;element ref="{urn:cidx:names:specification:ces:schema:all:5:0}LineItemAcceptanceStatus"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PostingAcceptResponseLineItemType", propOrder = {
    "lineNumber",
    "lineItemAcceptanceStatus"
})
public class PostingAcceptResponseLineItemType {

    @XmlElement(name = "LineNumber")
    protected long lineNumber;
    @XmlElement(name = "LineItemAcceptanceStatus", required = true)
    protected LineItemAcceptanceStatusType lineItemAcceptanceStatus;

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
     * Gets the value of the lineItemAcceptanceStatus property.
     * 
     * @return
     *     possible object is
     *     {@link LineItemAcceptanceStatusType }
     *     
     */
    public LineItemAcceptanceStatusType getLineItemAcceptanceStatus() {
        return lineItemAcceptanceStatus;
    }

    /**
     * Sets the value of the lineItemAcceptanceStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link LineItemAcceptanceStatusType }
     *     
     */
    public void setLineItemAcceptanceStatus(LineItemAcceptanceStatusType value) {
        this.lineItemAcceptanceStatus = value;
    }

}
