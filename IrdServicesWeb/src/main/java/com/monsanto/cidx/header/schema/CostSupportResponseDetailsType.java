
package com.monsanto.cidx.header.schema;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CostSupportResponseDetailsType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CostSupportResponseDetailsType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{urn:cidx:names:specification:ces:schema:all:5:0}CostSupportResponseStatusInformation"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CostSupportResponseDetailsType", propOrder = {
    "costSupportResponseStatusInformation"
})
public class CostSupportResponseDetailsType {

    @XmlElement(name = "CostSupportResponseStatusInformation", required = true)
    protected CostSupportResponseStatusInformationType costSupportResponseStatusInformation;

    /**
     * Gets the value of the costSupportResponseStatusInformation property.
     * 
     * @return
     *     possible object is
     *     {@link CostSupportResponseStatusInformationType }
     *     
     */
    public CostSupportResponseStatusInformationType getCostSupportResponseStatusInformation() {
        return costSupportResponseStatusInformation;
    }

    /**
     * Sets the value of the costSupportResponseStatusInformation property.
     * 
     * @param value
     *     allowed object is
     *     {@link CostSupportResponseStatusInformationType }
     *     
     */
    public void setCostSupportResponseStatusInformation(CostSupportResponseStatusInformationType value) {
        this.costSupportResponseStatusInformation = value;
    }

}
