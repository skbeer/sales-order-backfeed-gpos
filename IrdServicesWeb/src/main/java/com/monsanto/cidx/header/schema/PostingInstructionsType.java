
package com.monsanto.cidx.header.schema;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * <p>Java class for PostingInstructionsType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PostingInstructionsType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{urn:cidx:names:specification:ces:schema:all:5:0}PostingType" minOccurs="0"/>
 *         &lt;element ref="{urn:cidx:names:specification:ces:schema:all:5:0}AllowExportFlag" minOccurs="0"/>
 *         &lt;element ref="{urn:cidx:names:specification:ces:schema:all:5:0}AnonymityFlag" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PostingInstructionsType", propOrder = {
    "postingType",
    "allowExportFlag",
    "anonymityFlag"
})
public class PostingInstructionsType {

    @XmlElement(name = "PostingType")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String postingType;
    @XmlElement(name = "AllowExportFlag")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String allowExportFlag;
    @XmlElement(name = "AnonymityFlag")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String anonymityFlag;

    /**
     * Gets the value of the postingType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPostingType() {
        return postingType;
    }

    /**
     * Sets the value of the postingType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPostingType(String value) {
        this.postingType = value;
    }

    /**
     * Gets the value of the allowExportFlag property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAllowExportFlag() {
        return allowExportFlag;
    }

    /**
     * Sets the value of the allowExportFlag property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAllowExportFlag(String value) {
        this.allowExportFlag = value;
    }

    /**
     * Gets the value of the anonymityFlag property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAnonymityFlag() {
        return anonymityFlag;
    }

    /**
     * Sets the value of the anonymityFlag property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAnonymityFlag(String value) {
        this.anonymityFlag = value;
    }

}
