
package com.monsanto.cidx.header.schema;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * <p>Java class for TariffIdentificationType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TariffIdentificationType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{urn:cidx:names:specification:ces:schema:all:5:0}Bureau"/>
 *         &lt;element ref="{urn:cidx:names:specification:ces:schema:all:5:0}Tariff"/>
 *         &lt;element ref="{urn:cidx:names:specification:ces:schema:all:5:0}TariffSection"/>
 *         &lt;element ref="{urn:cidx:names:specification:ces:schema:all:5:0}TariffItem"/>
 *         &lt;element ref="{urn:cidx:names:specification:ces:schema:all:5:0}TariffSubItem" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TariffIdentificationType", propOrder = {
    "bureau",
    "tariff",
    "tariffSection",
    "tariffItem",
    "tariffSubItem"
})
public class TariffIdentificationType {

    @XmlElement(name = "Bureau", required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String bureau;
    @XmlElement(name = "Tariff", required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String tariff;
    @XmlElement(name = "TariffSection", required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String tariffSection;
    @XmlElement(name = "TariffItem", required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String tariffItem;
    @XmlElement(name = "TariffSubItem")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String tariffSubItem;

    /**
     * Gets the value of the bureau property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBureau() {
        return bureau;
    }

    /**
     * Sets the value of the bureau property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBureau(String value) {
        this.bureau = value;
    }

    /**
     * Gets the value of the tariff property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTariff() {
        return tariff;
    }

    /**
     * Sets the value of the tariff property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTariff(String value) {
        this.tariff = value;
    }

    /**
     * Gets the value of the tariffSection property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTariffSection() {
        return tariffSection;
    }

    /**
     * Sets the value of the tariffSection property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTariffSection(String value) {
        this.tariffSection = value;
    }

    /**
     * Gets the value of the tariffItem property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTariffItem() {
        return tariffItem;
    }

    /**
     * Sets the value of the tariffItem property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTariffItem(String value) {
        this.tariffItem = value;
    }

    /**
     * Gets the value of the tariffSubItem property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTariffSubItem() {
        return tariffSubItem;
    }

    /**
     * Sets the value of the tariffSubItem property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTariffSubItem(String value) {
        this.tariffSubItem = value;
    }

}
