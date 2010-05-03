
package com.monsanto.cidx.header.schema;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * <p>Java class for PostingResponseLineItemType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PostingResponseLineItemType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{urn:cidx:names:specification:ces:schema:all:5:0}LineNumber"/>
 *         &lt;element ref="{urn:cidx:names:specification:ces:schema:all:5:0}LineItemRequestedAction"/>
 *         &lt;element ref="{urn:cidx:names:specification:ces:schema:all:5:0}LineItemStatusInformation"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PostingResponseLineItemType", propOrder = {
    "lineNumber",
    "lineItemRequestedAction",
    "lineItemStatusInformation"
})
public class PostingResponseLineItemType {

    @XmlElement(name = "LineNumber")
    protected long lineNumber;
    @XmlElement(name = "LineItemRequestedAction", required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String lineItemRequestedAction;
    @XmlElement(name = "LineItemStatusInformation", required = true)
    protected LineItemStatusInformationType lineItemStatusInformation;

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
     * Gets the value of the lineItemRequestedAction property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLineItemRequestedAction() {
        return lineItemRequestedAction;
    }

    /**
     * Sets the value of the lineItemRequestedAction property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLineItemRequestedAction(String value) {
        this.lineItemRequestedAction = value;
    }

    /**
     * Gets the value of the lineItemStatusInformation property.
     * 
     * @return
     *     possible object is
     *     {@link LineItemStatusInformationType }
     *     
     */
    public LineItemStatusInformationType getLineItemStatusInformation() {
        return lineItemStatusInformation;
    }

    /**
     * Sets the value of the lineItemStatusInformation property.
     * 
     * @param value
     *     allowed object is
     *     {@link LineItemStatusInformationType }
     *     
     */
    public void setLineItemStatusInformation(LineItemStatusInformationType value) {
        this.lineItemStatusInformation = value;
    }

}
