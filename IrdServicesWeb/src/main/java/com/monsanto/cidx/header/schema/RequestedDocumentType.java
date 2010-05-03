
package com.monsanto.cidx.header.schema;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for RequestedDocumentType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="RequestedDocumentType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{urn:cidx:names:specification:ces:schema:all:5:0}RequestedDocumentTypeCode"/>
 *         &lt;element ref="{urn:cidx:names:specification:ces:schema:all:5:0}DocumentRecipientInformation" maxOccurs="unbounded"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RequestedDocumentType", propOrder = {
    "requestedDocumentTypeCode",
    "documentRecipientInformation"
})
public class RequestedDocumentType {

    @XmlElement(name = "RequestedDocumentTypeCode", required = true)
    protected RequestedDocumentTypeCodeType requestedDocumentTypeCode;
    @XmlElement(name = "DocumentRecipientInformation", required = true)
    protected List<DocumentRecipientInformationType> documentRecipientInformation;

    /**
     * Gets the value of the requestedDocumentTypeCode property.
     * 
     * @return
     *     possible object is
     *     {@link RequestedDocumentTypeCodeType }
     *     
     */
    public RequestedDocumentTypeCodeType getRequestedDocumentTypeCode() {
        return requestedDocumentTypeCode;
    }

    /**
     * Sets the value of the requestedDocumentTypeCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link RequestedDocumentTypeCodeType }
     *     
     */
    public void setRequestedDocumentTypeCode(RequestedDocumentTypeCodeType value) {
        this.requestedDocumentTypeCode = value;
    }

    /**
     * Gets the value of the documentRecipientInformation property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the documentRecipientInformation property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDocumentRecipientInformation().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DocumentRecipientInformationType }
     * 
     * 
     */
    public List<DocumentRecipientInformationType> getDocumentRecipientInformation() {
        if (documentRecipientInformation == null) {
            documentRecipientInformation = new ArrayList<DocumentRecipientInformationType>();
        }
        return this.documentRecipientInformation;
    }

}
