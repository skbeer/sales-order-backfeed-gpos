
package com.monsanto.cidx.header.schema;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for RequestedPackagingType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="RequestedPackagingType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{urn:cidx:names:specification:ces:schema:all:5:0}PackagingInformation" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RequestedPackagingType", propOrder = {
    "packagingInformation"
})
public class RequestedPackagingType {

    @XmlElement(name = "PackagingInformation")
    protected PackagingInformationType packagingInformation;

    /**
     * Gets the value of the packagingInformation property.
     * 
     * @return
     *     possible object is
     *     {@link PackagingInformationType }
     *     
     */
    public PackagingInformationType getPackagingInformation() {
        return packagingInformation;
    }

    /**
     * Sets the value of the packagingInformation property.
     * 
     * @param value
     *     allowed object is
     *     {@link PackagingInformationType }
     *     
     */
    public void setPackagingInformation(PackagingInformationType value) {
        this.packagingInformation = value;
    }

}
