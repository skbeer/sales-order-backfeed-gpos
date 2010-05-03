
package com.monsanto.cidx.header.schema;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * <p>Java class for PalletQuantityInformationType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PalletQuantityInformationType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{urn:cidx:names:specification:ces:schema:all:5:0}NumberFullPallets" minOccurs="0"/>
 *         &lt;element ref="{urn:cidx:names:specification:ces:schema:all:5:0}PalletPackageCountQuantity" minOccurs="0"/>
 *         &lt;element ref="{urn:cidx:names:specification:ces:schema:all:5:0}LoosePackageCountQuantity" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PalletQuantityInformationType", propOrder = {
    "numberFullPallets",
    "palletPackageCountQuantity",
    "loosePackageCountQuantity"
})
public class PalletQuantityInformationType {

    @XmlElement(name = "NumberFullPallets")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String numberFullPallets;
    @XmlElement(name = "PalletPackageCountQuantity")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String palletPackageCountQuantity;
    @XmlElement(name = "LoosePackageCountQuantity")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String loosePackageCountQuantity;

    /**
     * Gets the value of the numberFullPallets property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNumberFullPallets() {
        return numberFullPallets;
    }

    /**
     * Sets the value of the numberFullPallets property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNumberFullPallets(String value) {
        this.numberFullPallets = value;
    }

    /**
     * Gets the value of the palletPackageCountQuantity property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPalletPackageCountQuantity() {
        return palletPackageCountQuantity;
    }

    /**
     * Sets the value of the palletPackageCountQuantity property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPalletPackageCountQuantity(String value) {
        this.palletPackageCountQuantity = value;
    }

    /**
     * Gets the value of the loosePackageCountQuantity property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLoosePackageCountQuantity() {
        return loosePackageCountQuantity;
    }

    /**
     * Sets the value of the loosePackageCountQuantity property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLoosePackageCountQuantity(String value) {
        this.loosePackageCountQuantity = value;
    }

}
