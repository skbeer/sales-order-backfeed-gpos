
package com.monsanto.cidx.header.schema;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ShipNoticeListDetailsType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ShipNoticeListDetailsType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{urn:cidx:names:specification:ces:schema:all:5:0}ShipNoticeBody" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ShipNoticeListDetailsType", propOrder = {
    "shipNoticeBody"
})
public class ShipNoticeListDetailsType {

    @XmlElement(name = "ShipNoticeBody")
    protected List<ShipNoticeBodyType> shipNoticeBody;

    /**
     * Gets the value of the shipNoticeBody property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the shipNoticeBody property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getShipNoticeBody().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ShipNoticeBodyType }
     * 
     * 
     */
    public List<ShipNoticeBodyType> getShipNoticeBody() {
        if (shipNoticeBody == null) {
            shipNoticeBody = new ArrayList<ShipNoticeBodyType>();
        }
        return this.shipNoticeBody;
    }

}
