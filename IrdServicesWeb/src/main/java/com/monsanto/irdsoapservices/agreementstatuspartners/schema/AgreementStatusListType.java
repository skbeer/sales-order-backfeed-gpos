
package com.monsanto.irdsoapservices.agreementstatuspartners.schema;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * <p>Java class for AgreementStatusListType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AgreementStatusListType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="LicenseNumber" type="{http://www.w3.org/2001/XMLSchema}token"/>
 *         &lt;element ref="{urn:cidx:names:specification:ces:schema:all:5:3}AgreementName"/>
 *         &lt;element ref="{urn:cidx:names:specification:ces:schema:all:5:3}AgreementStatus"/>
 *         &lt;element ref="{urn:cidx:names:specification:ces:schema:all:5:3}Zone" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AgreementStatusListType", propOrder = {
    "licenseNumber",
    "agreementName",
    "agreementStatus",
    "zone"
})
public class AgreementStatusListType {

    @XmlElement(name = "LicenseNumber", required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String licenseNumber;
    @XmlElement(name = "AgreementName", required = true)
    protected String agreementName;
    @XmlElement(name = "AgreementStatus", required = true)
    protected String agreementStatus;
    @XmlElement(name = "Zone")
    protected List<ZoneType> zone;

    /**
     * Gets the value of the licenseNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLicenseNumber() {
        return licenseNumber;
    }

    /**
     * Sets the value of the licenseNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLicenseNumber(String value) {
        this.licenseNumber = value;
    }

    /**
     * Gets the value of the agreementName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAgreementName() {
        return agreementName;
    }

    /**
     * Sets the value of the agreementName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAgreementName(String value) {
        this.agreementName = value;
    }

    /**
     * Gets the value of the agreementStatus property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAgreementStatus() {
        return agreementStatus;
    }

    /**
     * Sets the value of the agreementStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAgreementStatus(String value) {
        this.agreementStatus = value;
    }

    /**
     * Gets the value of the zone property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the zone property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getZone().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ZoneType }
     * 
     * 
     */
    public List<ZoneType> getZone() {
        if (zone == null) {
            zone = new ArrayList<ZoneType>();
        }
        return this.zone;
    }

}
