
package com.monsanto.cidx.header.schema;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * <p>Java class for ConveyanceInformationType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ConveyanceInformationType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{urn:cidx:names:specification:ces:schema:all:5:0}ConveyanceNameOrIdentifier"/>
 *         &lt;element ref="{urn:cidx:names:specification:ces:schema:all:5:0}VoyageTripNumber" minOccurs="0"/>
 *         &lt;element ref="{urn:cidx:names:specification:ces:schema:all:5:0}EstimatedTimeOfDepartureDate" minOccurs="0"/>
 *         &lt;element ref="{urn:cidx:names:specification:ces:schema:all:5:0}EstimatedTimeOfArrivalDate" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ConveyanceInformationType", propOrder = {
    "conveyanceNameOrIdentifier",
    "voyageTripNumber",
    "estimatedTimeOfDepartureDate",
    "estimatedTimeOfArrivalDate"
})
public class ConveyanceInformationType {

    @XmlElement(name = "ConveyanceNameOrIdentifier", required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String conveyanceNameOrIdentifier;
    @XmlElement(name = "VoyageTripNumber")
    protected VoyageTripNumberType voyageTripNumber;
    @XmlElement(name = "EstimatedTimeOfDepartureDate")
    protected EstimatedTimeOfDepartureDateType estimatedTimeOfDepartureDate;
    @XmlElement(name = "EstimatedTimeOfArrivalDate")
    protected EstimatedTimeOfArrivalDateType estimatedTimeOfArrivalDate;

    /**
     * Gets the value of the conveyanceNameOrIdentifier property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getConveyanceNameOrIdentifier() {
        return conveyanceNameOrIdentifier;
    }

    /**
     * Sets the value of the conveyanceNameOrIdentifier property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setConveyanceNameOrIdentifier(String value) {
        this.conveyanceNameOrIdentifier = value;
    }

    /**
     * Gets the value of the voyageTripNumber property.
     * 
     * @return
     *     possible object is
     *     {@link VoyageTripNumberType }
     *     
     */
    public VoyageTripNumberType getVoyageTripNumber() {
        return voyageTripNumber;
    }

    /**
     * Sets the value of the voyageTripNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link VoyageTripNumberType }
     *     
     */
    public void setVoyageTripNumber(VoyageTripNumberType value) {
        this.voyageTripNumber = value;
    }

    /**
     * Gets the value of the estimatedTimeOfDepartureDate property.
     * 
     * @return
     *     possible object is
     *     {@link EstimatedTimeOfDepartureDateType }
     *     
     */
    public EstimatedTimeOfDepartureDateType getEstimatedTimeOfDepartureDate() {
        return estimatedTimeOfDepartureDate;
    }

    /**
     * Sets the value of the estimatedTimeOfDepartureDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link EstimatedTimeOfDepartureDateType }
     *     
     */
    public void setEstimatedTimeOfDepartureDate(EstimatedTimeOfDepartureDateType value) {
        this.estimatedTimeOfDepartureDate = value;
    }

    /**
     * Gets the value of the estimatedTimeOfArrivalDate property.
     * 
     * @return
     *     possible object is
     *     {@link EstimatedTimeOfArrivalDateType }
     *     
     */
    public EstimatedTimeOfArrivalDateType getEstimatedTimeOfArrivalDate() {
        return estimatedTimeOfArrivalDate;
    }

    /**
     * Sets the value of the estimatedTimeOfArrivalDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link EstimatedTimeOfArrivalDateType }
     *     
     */
    public void setEstimatedTimeOfArrivalDate(EstimatedTimeOfArrivalDateType value) {
        this.estimatedTimeOfArrivalDate = value;
    }

}
