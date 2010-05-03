
package com.monsanto.cidx.header.schema;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for OrderStatusRequestDetailsType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="OrderStatusRequestDetailsType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{urn:cidx:names:specification:ces:schema:all:5:0}OrderStatusRequestProductLineItem" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "OrderStatusRequestDetailsType", propOrder = {
    "orderStatusRequestProductLineItem"
})
public class OrderStatusRequestDetailsType {

    @XmlElement(name = "OrderStatusRequestProductLineItem")
    protected List<OrderStatusRequestProductLineItemType> orderStatusRequestProductLineItem;

    /**
     * Gets the value of the orderStatusRequestProductLineItem property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the orderStatusRequestProductLineItem property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getOrderStatusRequestProductLineItem().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link OrderStatusRequestProductLineItemType }
     * 
     * 
     */
    public List<OrderStatusRequestProductLineItemType> getOrderStatusRequestProductLineItem() {
        if (orderStatusRequestProductLineItem == null) {
            orderStatusRequestProductLineItem = new ArrayList<OrderStatusRequestProductLineItemType>();
        }
        return this.orderStatusRequestProductLineItem;
    }

}
