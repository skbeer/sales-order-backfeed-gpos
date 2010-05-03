
package com.monsanto.cidx.header.schema;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for OrderStatusResponseDetailsType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="OrderStatusResponseDetailsType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{urn:cidx:names:specification:ces:schema:all:5:0}OrderStatusResponseProductLineItem" maxOccurs="unbounded"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "OrderStatusResponseDetailsType", propOrder = {
    "orderStatusResponseProductLineItem"
})
public class OrderStatusResponseDetailsType {

    @XmlElement(name = "OrderStatusResponseProductLineItem", required = true)
    protected List<OrderStatusResponseProductLineItemType> orderStatusResponseProductLineItem;

    /**
     * Gets the value of the orderStatusResponseProductLineItem property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the orderStatusResponseProductLineItem property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getOrderStatusResponseProductLineItem().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link OrderStatusResponseProductLineItemType }
     * 
     * 
     */
    public List<OrderStatusResponseProductLineItemType> getOrderStatusResponseProductLineItem() {
        if (orderStatusResponseProductLineItem == null) {
            orderStatusResponseProductLineItem = new ArrayList<OrderStatusResponseProductLineItemType>();
        }
        return this.orderStatusResponseProductLineItem;
    }

}
