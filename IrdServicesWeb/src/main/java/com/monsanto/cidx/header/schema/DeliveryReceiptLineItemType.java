
package com.monsanto.cidx.header.schema;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for DeliveryReceiptLineItemType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="DeliveryReceiptLineItemType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{urn:cidx:names:specification:ces:schema:all:5:0}LineNumber"/>
 *         &lt;element ref="{urn:cidx:names:specification:ces:schema:all:5:0}DeliveryReceiptLocation"/>
 *         &lt;element ref="{urn:cidx:names:specification:ces:schema:all:5:0}DeliveryContent" maxOccurs="unbounded"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DeliveryReceiptLineItemType", propOrder = {
    "lineNumber",
    "deliveryReceiptLocation",
    "deliveryContent"
})
public class DeliveryReceiptLineItemType {

    @XmlElement(name = "LineNumber")
    protected long lineNumber;
    @XmlElement(name = "DeliveryReceiptLocation", required = true)
    protected DeliveryReceiptLocationType deliveryReceiptLocation;
    @XmlElement(name = "DeliveryContent", required = true)
    protected List<DeliveryContentType> deliveryContent;

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
     * Gets the value of the deliveryReceiptLocation property.
     * 
     * @return
     *     possible object is
     *     {@link DeliveryReceiptLocationType }
     *     
     */
    public DeliveryReceiptLocationType getDeliveryReceiptLocation() {
        return deliveryReceiptLocation;
    }

    /**
     * Sets the value of the deliveryReceiptLocation property.
     * 
     * @param value
     *     allowed object is
     *     {@link DeliveryReceiptLocationType }
     *     
     */
    public void setDeliveryReceiptLocation(DeliveryReceiptLocationType value) {
        this.deliveryReceiptLocation = value;
    }

    /**
     * Gets the value of the deliveryContent property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the deliveryContent property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDeliveryContent().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DeliveryContentType }
     * 
     * 
     */
    public List<DeliveryContentType> getDeliveryContent() {
        if (deliveryContent == null) {
            deliveryContent = new ArrayList<DeliveryContentType>();
        }
        return this.deliveryContent;
    }

}
