
package com.monsanto.cidx.header.schema;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * <p>Java class for DeliveryTermsType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="DeliveryTermsType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{urn:cidx:names:specification:ces:schema:all:5:0}DeliveryTermsCode"/>
 *         &lt;element ref="{urn:cidx:names:specification:ces:schema:all:5:0}DeliveryTermsLocation"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DeliveryTermsType", propOrder = {
    "deliveryTermsCode",
    "deliveryTermsLocation"
})
public class DeliveryTermsType {

    @XmlElement(name = "DeliveryTermsCode", required = true)
    protected DeliveryTermsCodeType deliveryTermsCode;
    @XmlElement(name = "DeliveryTermsLocation", required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String deliveryTermsLocation;

    /**
     * Gets the value of the deliveryTermsCode property.
     * 
     * @return
     *     possible object is
     *     {@link DeliveryTermsCodeType }
     *     
     */
    public DeliveryTermsCodeType getDeliveryTermsCode() {
        return deliveryTermsCode;
    }

    /**
     * Sets the value of the deliveryTermsCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link DeliveryTermsCodeType }
     *     
     */
    public void setDeliveryTermsCode(DeliveryTermsCodeType value) {
        this.deliveryTermsCode = value;
    }

    /**
     * Gets the value of the deliveryTermsLocation property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDeliveryTermsLocation() {
        return deliveryTermsLocation;
    }

    /**
     * Sets the value of the deliveryTermsLocation property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDeliveryTermsLocation(String value) {
        this.deliveryTermsLocation = value;
    }

}
