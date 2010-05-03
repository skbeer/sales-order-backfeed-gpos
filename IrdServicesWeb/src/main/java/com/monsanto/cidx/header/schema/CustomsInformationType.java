
package com.monsanto.cidx.header.schema;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * <p>Java class for CustomsInformationType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CustomsInformationType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{urn:cidx:names:specification:ces:schema:all:5:0}CountryOfOriginCode"/>
 *         &lt;element ref="{urn:cidx:names:specification:ces:schema:all:5:0}CountryOfFinalDestinationCode" minOccurs="0"/>
 *         &lt;element ref="{urn:cidx:names:specification:ces:schema:all:5:0}BondedWarehouseStatus" minOccurs="0"/>
 *         &lt;element ref="{urn:cidx:names:specification:ces:schema:all:5:0}BondedWarehouseRelease" minOccurs="0"/>
 *         &lt;element ref="{urn:cidx:names:specification:ces:schema:all:5:0}DutyDrawback" minOccurs="0"/>
 *         &lt;element ref="{urn:cidx:names:specification:ces:schema:all:5:0}USGoodsReturned" minOccurs="0"/>
 *         &lt;element ref="{urn:cidx:names:specification:ces:schema:all:5:0}TransportInBond" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CustomsInformationType", propOrder = {
    "countryOfOriginCode",
    "countryOfFinalDestinationCode",
    "bondedWarehouseStatus",
    "bondedWarehouseRelease",
    "dutyDrawback",
    "usGoodsReturned",
    "transportInBond"
})
public class CustomsInformationType {

    @XmlElement(name = "CountryOfOriginCode", required = true)
    protected CountryOfOriginCodeType countryOfOriginCode;
    @XmlElement(name = "CountryOfFinalDestinationCode")
    protected CountryOfFinalDestinationCodeType countryOfFinalDestinationCode;
    @XmlElement(name = "BondedWarehouseStatus")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String bondedWarehouseStatus;
    @XmlElement(name = "BondedWarehouseRelease")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String bondedWarehouseRelease;
    @XmlElement(name = "DutyDrawback")
    protected CidxListDutyDrawBack dutyDrawback;
    @XmlElement(name = "USGoodsReturned")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String usGoodsReturned;
    @XmlElement(name = "TransportInBond")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String transportInBond;

    /**
     * Gets the value of the countryOfOriginCode property.
     * 
     * @return
     *     possible object is
     *     {@link CountryOfOriginCodeType }
     *     
     */
    public CountryOfOriginCodeType getCountryOfOriginCode() {
        return countryOfOriginCode;
    }

    /**
     * Sets the value of the countryOfOriginCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link CountryOfOriginCodeType }
     *     
     */
    public void setCountryOfOriginCode(CountryOfOriginCodeType value) {
        this.countryOfOriginCode = value;
    }

    /**
     * Gets the value of the countryOfFinalDestinationCode property.
     * 
     * @return
     *     possible object is
     *     {@link CountryOfFinalDestinationCodeType }
     *     
     */
    public CountryOfFinalDestinationCodeType getCountryOfFinalDestinationCode() {
        return countryOfFinalDestinationCode;
    }

    /**
     * Sets the value of the countryOfFinalDestinationCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link CountryOfFinalDestinationCodeType }
     *     
     */
    public void setCountryOfFinalDestinationCode(CountryOfFinalDestinationCodeType value) {
        this.countryOfFinalDestinationCode = value;
    }

    /**
     * Gets the value of the bondedWarehouseStatus property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBondedWarehouseStatus() {
        return bondedWarehouseStatus;
    }

    /**
     * Sets the value of the bondedWarehouseStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBondedWarehouseStatus(String value) {
        this.bondedWarehouseStatus = value;
    }

    /**
     * Gets the value of the bondedWarehouseRelease property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBondedWarehouseRelease() {
        return bondedWarehouseRelease;
    }

    /**
     * Sets the value of the bondedWarehouseRelease property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBondedWarehouseRelease(String value) {
        this.bondedWarehouseRelease = value;
    }

    /**
     * Gets the value of the dutyDrawback property.
     * 
     * @return
     *     possible object is
     *     {@link CidxListDutyDrawBack }
     *     
     */
    public CidxListDutyDrawBack getDutyDrawback() {
        return dutyDrawback;
    }

    /**
     * Sets the value of the dutyDrawback property.
     * 
     * @param value
     *     allowed object is
     *     {@link CidxListDutyDrawBack }
     *     
     */
    public void setDutyDrawback(CidxListDutyDrawBack value) {
        this.dutyDrawback = value;
    }

    /**
     * Gets the value of the usGoodsReturned property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUSGoodsReturned() {
        return usGoodsReturned;
    }

    /**
     * Sets the value of the usGoodsReturned property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUSGoodsReturned(String value) {
        this.usGoodsReturned = value;
    }

    /**
     * Gets the value of the transportInBond property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTransportInBond() {
        return transportInBond;
    }

    /**
     * Sets the value of the transportInBond property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTransportInBond(String value) {
        this.transportInBond = value;
    }

}
