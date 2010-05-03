
package com.monsanto.cidx.header.schema;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for DeliveryReceiptDetailsType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="DeliveryReceiptDetailsType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{urn:cidx:names:specification:ces:schema:all:5:0}DeliveryReceiptLineItem" maxOccurs="unbounded"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DeliveryReceiptDetailsType", propOrder = {
    "deliveryReceiptLineItem"
})
public class DeliveryReceiptDetailsType {

    @XmlElement(name = "DeliveryReceiptLineItem", required = true)
    protected List<DeliveryReceiptLineItemType> deliveryReceiptLineItem;

    /**
     * Gets the value of the deliveryReceiptLineItem property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the deliveryReceiptLineItem property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDeliveryReceiptLineItem().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DeliveryReceiptLineItemType }
     * 
     * 
     */
    public List<DeliveryReceiptLineItemType> getDeliveryReceiptLineItem() {
        if (deliveryReceiptLineItem == null) {
            deliveryReceiptLineItem = new ArrayList<DeliveryReceiptLineItemType>();
        }
        return this.deliveryReceiptLineItem;
    }

}
