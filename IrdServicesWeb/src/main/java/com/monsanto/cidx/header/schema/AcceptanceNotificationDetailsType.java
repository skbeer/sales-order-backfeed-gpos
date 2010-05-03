
package com.monsanto.cidx.header.schema;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for AcceptanceNotificationDetailsType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AcceptanceNotificationDetailsType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{urn:cidx:names:specification:ces:schema:all:5:0}AcceptanceNotificationLineItem" maxOccurs="unbounded"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AcceptanceNotificationDetailsType", propOrder = {
    "acceptanceNotificationLineItem"
})
public class AcceptanceNotificationDetailsType {

    @XmlElement(name = "AcceptanceNotificationLineItem", required = true)
    protected List<AcceptanceNotificationLineItemType> acceptanceNotificationLineItem;

    /**
     * Gets the value of the acceptanceNotificationLineItem property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the acceptanceNotificationLineItem property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAcceptanceNotificationLineItem().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AcceptanceNotificationLineItemType }
     * 
     * 
     */
    public List<AcceptanceNotificationLineItemType> getAcceptanceNotificationLineItem() {
        if (acceptanceNotificationLineItem == null) {
            acceptanceNotificationLineItem = new ArrayList<AcceptanceNotificationLineItemType>();
        }
        return this.acceptanceNotificationLineItem;
    }

}
