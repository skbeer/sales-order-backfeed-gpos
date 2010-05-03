
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
 * <p>Java class for DeliveryPointType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="DeliveryPointType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{urn:cidx:names:specification:ces:schema:all:5:0}TerminalName" minOccurs="0"/>
 *         &lt;element ref="{urn:cidx:names:specification:ces:schema:all:5:0}PierName" minOccurs="0"/>
 *         &lt;element ref="{urn:cidx:names:specification:ces:schema:all:5:0}Berth" minOccurs="0"/>
 *         &lt;element ref="{urn:cidx:names:specification:ces:schema:all:5:0}AddressLine" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DeliveryPointType", propOrder = {
    "terminalName",
    "pierName",
    "berth",
    "addressLine"
})
public class DeliveryPointType {

    @XmlElement(name = "TerminalName")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String terminalName;
    @XmlElement(name = "PierName")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String pierName;
    @XmlElement(name = "Berth")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String berth;
    @XmlElement(name = "AddressLine")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected List<String> addressLine;

    /**
     * Gets the value of the terminalName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTerminalName() {
        return terminalName;
    }

    /**
     * Sets the value of the terminalName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTerminalName(String value) {
        this.terminalName = value;
    }

    /**
     * Gets the value of the pierName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPierName() {
        return pierName;
    }

    /**
     * Sets the value of the pierName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPierName(String value) {
        this.pierName = value;
    }

    /**
     * Gets the value of the berth property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBerth() {
        return berth;
    }

    /**
     * Sets the value of the berth property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBerth(String value) {
        this.berth = value;
    }

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

}
