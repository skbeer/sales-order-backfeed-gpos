
package com.monsanto.cidx.header.schema;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * <p>Java class for AddressInformationType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AddressInformationType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;choice minOccurs="0">
 *           &lt;element ref="{urn:cidx:names:specification:ces:schema:all:5:0}AddressLine" maxOccurs="unbounded"/>
 *           &lt;element ref="{urn:cidx:names:specification:ces:schema:all:5:0}PostBoxNumber"/>
 *         &lt;/choice>
 *         &lt;element ref="{urn:cidx:names:specification:ces:schema:all:5:0}CityName"/>
 *         &lt;element ref="{urn:cidx:names:specification:ces:schema:all:5:0}StateOrProvince" minOccurs="0"/>
 *         &lt;element ref="{urn:cidx:names:specification:ces:schema:all:5:0}PostalCode" minOccurs="0"/>
 *         &lt;element ref="{urn:cidx:names:specification:ces:schema:all:5:0}PostalCountry"/>
 *         &lt;element ref="{urn:cidx:names:specification:ces:schema:all:5:0}LocationCode" minOccurs="0"/>
 *         &lt;element ref="{urn:cidx:names:specification:ces:schema:all:5:0}Comment" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AddressInformationType", propOrder = {
    "addressLine",
    "postBoxNumber",
    "cityName",
    "stateOrProvince",
    "postalCode",
    "postalCountry",
    "locationCode",
    "comment"
})
public class AddressInformationType {

    @XmlElement(name = "AddressLine")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected List<String> addressLine;
    @XmlElement(name = "PostBoxNumber")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String postBoxNumber;
    @XmlElement(name = "CityName", required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String cityName;
    @XmlElement(name = "StateOrProvince")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String stateOrProvince;
    @XmlElement(name = "PostalCode")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String postalCode;
    @XmlElement(name = "PostalCountry", required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String postalCountry;
    @XmlElement(name = "LocationCode")
    protected LocationCodeType locationCode;
    @XmlElement(name = "Comment")
    protected CommentType comment;

    /**
     * Gets the value of the addressLine property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the addressLine property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAddressLine().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getAddressLine() {
        if (addressLine == null) {
            addressLine = new ArrayList<String>();
        }
        return this.addressLine;
    }

    /**
     * Gets the value of the postBoxNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPostBoxNumber() {
        return postBoxNumber;
    }

    /**
     * Sets the value of the postBoxNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPostBoxNumber(String value) {
        this.postBoxNumber = value;
    }

    /**
     * Gets the value of the cityName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCityName() {
        return cityName;
    }

    /**
     * Sets the value of the cityName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCityName(String value) {
        this.cityName = value;
    }

    /**
     * Gets the value of the stateOrProvince property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStateOrProvince() {
        return stateOrProvince;
    }

    /**
     * Sets the value of the stateOrProvince property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStateOrProvince(String value) {
        this.stateOrProvince = value;
    }

    /**
     * Gets the value of the postalCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPostalCode() {
        return postalCode;
    }

    /**
     * Sets the value of the postalCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPostalCode(String value) {
        this.postalCode = value;
    }

    /**
     * Gets the value of the postalCountry property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPostalCountry() {
        return postalCountry;
    }

    /**
     * Sets the value of the postalCountry property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPostalCountry(String value) {
        this.postalCountry = value;
    }

    /**
     * Gets the value of the locationCode property.
     * 
     * @return
     *     possible object is
     *     {@link LocationCodeType }
     *     
     */
    public LocationCodeType getLocationCode() {
        return locationCode;
    }

    /**
     * Sets the value of the locationCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link LocationCodeType }
     *     
     */
    public void setLocationCode(LocationCodeType value) {
        this.locationCode = value;
    }

    /**
     * Gets the value of the comment property.
     * 
     * @return
     *     possible object is
     *     {@link CommentType }
     *     
     */
    public CommentType getComment() {
        return comment;
    }

    /**
     * Sets the value of the comment property.
     * 
     * @param value
     *     allowed object is
     *     {@link CommentType }
     *     
     */
    public void setComment(CommentType value) {
        this.comment = value;
    }

}
