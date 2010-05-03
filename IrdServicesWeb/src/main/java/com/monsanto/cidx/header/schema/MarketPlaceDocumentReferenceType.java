
package com.monsanto.cidx.header.schema;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for MarketPlaceDocumentReferenceType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="MarketPlaceDocumentReferenceType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{urn:cidx:names:specification:ces:schema:all:5:0}DocumentReference"/>
 *       &lt;/sequence>
 *       &lt;attribute name="ReferenceType" use="required" type="{urn:cidx:names:specification:ces:schema:all:5:0}cidxListReferenceType" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MarketPlaceDocumentReferenceType", propOrder = {
    "documentReference"
})
public class MarketPlaceDocumentReferenceType {

    @XmlElement(name = "DocumentReference", required = true)
    protected DocumentReferenceType documentReference;
    @XmlAttribute(name = "ReferenceType", required = true)
    protected CidxListReferenceType referenceType;

    /**
     * Gets the value of the documentReference property.
     * 
     * @return
     *     possible object is
     *     {@link DocumentReferenceType }
     *     
     */
    public DocumentReferenceType getDocumentReference() {
        return documentReference;
    }

    /**
     * Sets the value of the documentReference property.
     * 
     * @param value
     *     allowed object is
     *     {@link DocumentReferenceType }
     *     
     */
    public void setDocumentReference(DocumentReferenceType value) {
        this.documentReference = value;
    }

    /**
     * Gets the value of the referenceType property.
     * 
     * @return
     *     possible object is
     *     {@link CidxListReferenceType }
     *     
     */
    public CidxListReferenceType getReferenceType() {
        return referenceType;
    }

    /**
     * Sets the value of the referenceType property.
     * 
     * @param value
     *     allowed object is
     *     {@link CidxListReferenceType }
     *     
     */
    public void setReferenceType(CidxListReferenceType value) {
        this.referenceType = value;
    }

}
