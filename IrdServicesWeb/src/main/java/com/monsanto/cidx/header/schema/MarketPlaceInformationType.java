
package com.monsanto.cidx.header.schema;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * <p>Java class for MarketPlaceInformationType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="MarketPlaceInformationType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{urn:cidx:names:specification:ces:schema:all:5:0}MarketPlaceIdentifier"/>
 *         &lt;element ref="{urn:cidx:names:specification:ces:schema:all:5:0}MarketPlaceDocumentReference"/>
 *         &lt;element ref="{urn:cidx:names:specification:ces:schema:all:5:0}MarketPlaceSellerIdentifier"/>
 *         &lt;element ref="{urn:cidx:names:specification:ces:schema:all:5:0}MarketPlaceBuyerIdentifier"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MarketPlaceInformationType", propOrder = {
    "marketPlaceIdentifier",
    "marketPlaceDocumentReference",
    "marketPlaceSellerIdentifier",
    "marketPlaceBuyerIdentifier"
})
public class MarketPlaceInformationType {

    @XmlElement(name = "MarketPlaceIdentifier", required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String marketPlaceIdentifier;
    @XmlElement(name = "MarketPlaceDocumentReference", required = true)
    protected MarketPlaceDocumentReferenceType marketPlaceDocumentReference;
    @XmlElement(name = "MarketPlaceSellerIdentifier", required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String marketPlaceSellerIdentifier;
    @XmlElement(name = "MarketPlaceBuyerIdentifier", required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String marketPlaceBuyerIdentifier;

    /**
     * Gets the value of the marketPlaceIdentifier property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMarketPlaceIdentifier() {
        return marketPlaceIdentifier;
    }

    /**
     * Sets the value of the marketPlaceIdentifier property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMarketPlaceIdentifier(String value) {
        this.marketPlaceIdentifier = value;
    }

    /**
     * Gets the value of the marketPlaceDocumentReference property.
     * 
     * @return
     *     possible object is
     *     {@link MarketPlaceDocumentReferenceType }
     *     
     */
    public MarketPlaceDocumentReferenceType getMarketPlaceDocumentReference() {
        return marketPlaceDocumentReference;
    }

    /**
     * Sets the value of the marketPlaceDocumentReference property.
     * 
     * @param value
     *     allowed object is
     *     {@link MarketPlaceDocumentReferenceType }
     *     
     */
    public void setMarketPlaceDocumentReference(MarketPlaceDocumentReferenceType value) {
        this.marketPlaceDocumentReference = value;
    }

    /**
     * Gets the value of the marketPlaceSellerIdentifier property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMarketPlaceSellerIdentifier() {
        return marketPlaceSellerIdentifier;
    }

    /**
     * Sets the value of the marketPlaceSellerIdentifier property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMarketPlaceSellerIdentifier(String value) {
        this.marketPlaceSellerIdentifier = value;
    }

    /**
     * Gets the value of the marketPlaceBuyerIdentifier property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMarketPlaceBuyerIdentifier() {
        return marketPlaceBuyerIdentifier;
    }

    /**
     * Sets the value of the marketPlaceBuyerIdentifier property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMarketPlaceBuyerIdentifier(String value) {
        this.marketPlaceBuyerIdentifier = value;
    }

}
