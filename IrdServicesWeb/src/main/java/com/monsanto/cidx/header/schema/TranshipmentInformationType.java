
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
 * <p>Java class for TranshipmentInformationType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TranshipmentInformationType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{urn:cidx:names:specification:ces:schema:all:5:0}PortOfTranshipmentAllowed"/>
 *         &lt;element ref="{urn:cidx:names:specification:ces:schema:all:5:0}PortOfTranshipmentCode" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TranshipmentInformationType", propOrder = {
    "portOfTranshipmentAllowed",
    "portOfTranshipmentCode"
})
public class TranshipmentInformationType {

    @XmlElement(name = "PortOfTranshipmentAllowed", required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String portOfTranshipmentAllowed;
    @XmlElement(name = "PortOfTranshipmentCode")
    protected List<PortOfTranshipmentCodeType> portOfTranshipmentCode;

    /**
     * Gets the value of the portOfTranshipmentAllowed property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPortOfTranshipmentAllowed() {
        return portOfTranshipmentAllowed;
    }

    /**
     * Sets the value of the portOfTranshipmentAllowed property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPortOfTranshipmentAllowed(String value) {
        this.portOfTranshipmentAllowed = value;
    }

    /**
     * Gets the value of the portOfTranshipmentCode property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the portOfTranshipmentCode property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPortOfTranshipmentCode().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PortOfTranshipmentCodeType }
     * 
     * 
     */
    public List<PortOfTranshipmentCodeType> getPortOfTranshipmentCode() {
        if (portOfTranshipmentCode == null) {
            portOfTranshipmentCode = new ArrayList<PortOfTranshipmentCodeType>();
        }
        return this.portOfTranshipmentCode;
    }

}
