
package com.monsanto.cidx.header.schema;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for PriceAndAvailabilityRequestDetailsType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PriceAndAvailabilityRequestDetailsType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{urn:cidx:names:specification:ces:schema:all:5:0}PriceAndAvailabilityRequestProductLineItem" maxOccurs="unbounded"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PriceAndAvailabilityRequestDetailsType", propOrder = {
    "priceAndAvailabilityRequestProductLineItem"
})
public class PriceAndAvailabilityRequestDetailsType {

    @XmlElement(name = "PriceAndAvailabilityRequestProductLineItem", required = true)
    protected List<PriceAndAvailabilityRequestProductLineItemType> priceAndAvailabilityRequestProductLineItem;

    /**
     * Gets the value of the priceAndAvailabilityRequestProductLineItem property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the priceAndAvailabilityRequestProductLineItem property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPriceAndAvailabilityRequestProductLineItem().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PriceAndAvailabilityRequestProductLineItemType }
     * 
     * 
     */
    public List<PriceAndAvailabilityRequestProductLineItemType> getPriceAndAvailabilityRequestProductLineItem() {
        if (priceAndAvailabilityRequestProductLineItem == null) {
            priceAndAvailabilityRequestProductLineItem = new ArrayList<PriceAndAvailabilityRequestProductLineItemType>();
        }
        return this.priceAndAvailabilityRequestProductLineItem;
    }

}
