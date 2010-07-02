
package com.monsanto.irdsoapservices.retailseller.schema;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for AddressInformationTypeII complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AddressInformationTypeII">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="AddressLine" type="{http://www.w3.org/2001/XMLSchema}anyType" maxOccurs="unbounded"/>
 *         &lt;element name="PostBoxNumber" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/>
 *         &lt;element name="CityName" type="{http://www.w3.org/2001/XMLSchema}anyType"/>
 *         &lt;element name="StateOrProvince" type="{http://www.w3.org/2001/XMLSchema}anyType"/>
 *         &lt;element name="PostalCode" type="{http://www.w3.org/2001/XMLSchema}anyType"/>
 *         &lt;element name="PostalCountry" type="{http://www.w3.org/2001/XMLSchema}anyType"/>
 *         &lt;element name="County" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AddressInformationTypeII", propOrder = {
    "addressLine",
    "postBoxNumber",
    "cityName",
    "stateOrProvince",
    "postalCode",
    "postalCountry",
    "county"
})
public class AddressInformationTypeII {

    @XmlElement(name = "AddressLine", required = true)
    protected List<Object> addressLine;
    @XmlElement(name = "PostBoxNumber")
    protected Object postBoxNumber;
    @XmlElement(name = "CityName", required = true)
    protected Object cityName;
    @XmlElement(name = "StateOrProvince", required = true)
    protected Object stateOrProvince;
    @XmlElement(name = "PostalCode", required = true)
    protected Object postalCode;
    @XmlElement(name = "PostalCountry", required = true)
    protected Object postalCountry;
    @XmlElement(name = "County")
    protected Object county;

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
     * {@link Object }
     * 
     * 
     */
    public List<Object> getAddressLine() {
        if (addressLine == null) {
            addressLine = new ArrayList<Object>();
        }
        return this.addressLine;
    }

    /**
     * Gets the value of the postBoxNumber property.
     * 
     * @return
     *     possible object is
     *     {@link Object }
     *     
     */
    public Object getPostBoxNumber() {
        return postBoxNumber;
    }

    /**
     * Sets the value of the postBoxNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     
     */
    public void setPostBoxNumber(Object value) {
        this.postBoxNumber = value;
    }

    /**
     * Gets the value of the cityName property.
     * 
     * @return
     *     possible object is
     *     {@link Object }
     *     
     */
    public Object getCityName() {
        return cityName;
    }

    /**
     * Sets the value of the cityName property.
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     
     */
    public void setCityName(Object value) {
        this.cityName = value;
    }

    /**
     * Gets the value of the stateOrProvince property.
     * 
     * @return
     *     possible object is
     *     {@link Object }
     *     
     */
    public Object getStateOrProvince() {
        return stateOrProvince;
    }

    /**
     * Sets the value of the stateOrProvince property.
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     
     */
    public void setStateOrProvince(Object value) {
        this.stateOrProvince = value;
    }

    /**
     * Gets the value of the postalCode property.
     * 
     * @return
     *     possible object is
     *     {@link Object }
     *     
     */
    public Object getPostalCode() {
        return postalCode;
    }

    /**
     * Sets the value of the postalCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     
     */
    public void setPostalCode(Object value) {
        this.postalCode = value;
    }

    /**
     * Gets the value of the postalCountry property.
     * 
     * @return
     *     possible object is
     *     {@link Object }
     *     
     */
    public Object getPostalCountry() {
        return postalCountry;
    }

    /**
     * Sets the value of the postalCountry property.
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     
     */
    public void setPostalCountry(Object value) {
        this.postalCountry = value;
    }

    /**
     * Gets the value of the county property.
     * 
     * @return
     *     possible object is
     *     {@link Object }
     *     
     */
    public Object getCounty() {
        return county;
    }

    /**
     * Sets the value of the county property.
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     
     */
    public void setCounty(Object value) {
        this.county = value;
    }

}
