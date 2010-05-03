
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
 * <p>Java class for PackagingContainerInformationType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PackagingContainerInformationType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{urn:cidx:names:specification:ces:schema:all:5:0}ContainerType"/>
 *         &lt;element ref="{urn:cidx:names:specification:ces:schema:all:5:0}ContainerDescription" minOccurs="0"/>
 *         &lt;element ref="{urn:cidx:names:specification:ces:schema:all:5:0}ContainerIdentifier" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PackagingContainerInformationType", propOrder = {
    "containerType",
    "containerDescription",
    "containerIdentifier"
})
public class PackagingContainerInformationType {

    @XmlElement(name = "ContainerType", required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String containerType;
    @XmlElement(name = "ContainerDescription")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String containerDescription;
    @XmlElement(name = "ContainerIdentifier")
    protected List<ContainerIdentifierType> containerIdentifier;

    /**
     * Gets the value of the containerType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getContainerType() {
        return containerType;
    }

    /**
     * Sets the value of the containerType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setContainerType(String value) {
        this.containerType = value;
    }

    /**
     * Gets the value of the containerDescription property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getContainerDescription() {
        return containerDescription;
    }

    /**
     * Sets the value of the containerDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setContainerDescription(String value) {
        this.containerDescription = value;
    }

    /**
     * Gets the value of the containerIdentifier property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the containerIdentifier property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getContainerIdentifier().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ContainerIdentifierType }
     * 
     * 
     */
    public List<ContainerIdentifierType> getContainerIdentifier() {
        if (containerIdentifier == null) {
            containerIdentifier = new ArrayList<ContainerIdentifierType>();
        }
        return this.containerIdentifier;
    }

}
