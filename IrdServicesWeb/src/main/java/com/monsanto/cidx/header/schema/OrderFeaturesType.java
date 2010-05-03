
package com.monsanto.cidx.header.schema;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for OrderFeaturesType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="OrderFeaturesType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{urn:cidx:names:specification:ces:schema:all:5:0}PriceSheetEffectiveDate" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{urn:cidx:names:specification:ces:schema:all:5:0}SalesVolume" minOccurs="0"/>
 *         &lt;element ref="{urn:cidx:names:specification:ces:schema:all:5:0}UnitVolume" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="OrderScope" type="{urn:cidx:names:specification:ces:schema:all:5:0}cidxListOrderScope" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "OrderFeaturesType", propOrder = {
    "priceSheetEffectiveDate",
    "salesVolume",
    "unitVolume"
})
public class OrderFeaturesType {

    @XmlElement(name = "PriceSheetEffectiveDate")
    protected List<PriceSheetEffectiveDateType> priceSheetEffectiveDate;
    @XmlElement(name = "SalesVolume")
    protected SalesVolumeType salesVolume;
    @XmlElement(name = "UnitVolume")
    protected UnitVolumeType unitVolume;
    @XmlAttribute(name = "OrderScope")
    protected CidxListOrderScope orderScope;

    /**
     * Gets the value of the priceSheetEffectiveDate property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the priceSheetEffectiveDate property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPriceSheetEffectiveDate().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PriceSheetEffectiveDateType }
     * 
     * 
     */
    public List<PriceSheetEffectiveDateType> getPriceSheetEffectiveDate() {
        if (priceSheetEffectiveDate == null) {
            priceSheetEffectiveDate = new ArrayList<PriceSheetEffectiveDateType>();
        }
        return this.priceSheetEffectiveDate;
    }

    /**
     * Gets the value of the salesVolume property.
     * 
     * @return
     *     possible object is
     *     {@link SalesVolumeType }
     *     
     */
    public SalesVolumeType getSalesVolume() {
        return salesVolume;
    }

    /**
     * Sets the value of the salesVolume property.
     * 
     * @param value
     *     allowed object is
     *     {@link SalesVolumeType }
     *     
     */
    public void setSalesVolume(SalesVolumeType value) {
        this.salesVolume = value;
    }

    /**
     * Gets the value of the unitVolume property.
     * 
     * @return
     *     possible object is
     *     {@link UnitVolumeType }
     *     
     */
    public UnitVolumeType getUnitVolume() {
        return unitVolume;
    }

    /**
     * Sets the value of the unitVolume property.
     * 
     * @param value
     *     allowed object is
     *     {@link UnitVolumeType }
     *     
     */
    public void setUnitVolume(UnitVolumeType value) {
        this.unitVolume = value;
    }

    /**
     * Gets the value of the orderScope property.
     * 
     * @return
     *     possible object is
     *     {@link CidxListOrderScope }
     *     
     */
    public CidxListOrderScope getOrderScope() {
        return orderScope;
    }

    /**
     * Sets the value of the orderScope property.
     * 
     * @param value
     *     allowed object is
     *     {@link CidxListOrderScope }
     *     
     */
    public void setOrderScope(CidxListOrderScope value) {
        this.orderScope = value;
    }

}
