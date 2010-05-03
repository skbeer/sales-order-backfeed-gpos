
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
 * <p>Java class for PartnerInformationType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PartnerInformationType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{urn:cidx:names:specification:ces:schema:all:5:0}PartnerName" maxOccurs="unbounded"/>
 *         &lt;element ref="{urn:cidx:names:specification:ces:schema:all:5:0}PartnerIdentifier" maxOccurs="unbounded"/>
 *         &lt;element ref="{urn:cidx:names:specification:ces:schema:all:5:0}ContactInformation" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{urn:cidx:names:specification:ces:schema:all:5:0}AddressInformation" minOccurs="0"/>
 *         &lt;element ref="{urn:cidx:names:specification:ces:schema:all:5:0}TaxInformation" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{urn:cidx:names:specification:ces:schema:all:5:0}URL" minOccurs="0"/>
 *         &lt;element ref="{urn:cidx:names:specification:ces:schema:all:5:0}PartnerReference" minOccurs="0"/>
 *         &lt;element ref="{urn:cidx:names:specification:ces:schema:all:5:0}LoadingPoint" minOccurs="0"/>
 *         &lt;element ref="{urn:cidx:names:specification:ces:schema:all:5:0}UnloadingPoint" minOccurs="0"/>
 *         &lt;element ref="{urn:cidx:names:specification:ces:schema:all:5:0}AccountInformation" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PartnerInformationType", propOrder = {
    "partnerName",
    "partnerIdentifier",
    "contactInformation",
    "addressInformation",
    "taxInformation",
    "url",
    "partnerReference",
    "loadingPoint",
    "unloadingPoint",
    "accountInformation"
})
public class PartnerInformationType {

    @XmlElement(name = "PartnerName", required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected List<String> partnerName;
    @XmlElement(name = "PartnerIdentifier", required = true)
    protected List<PartnerIdentifierType> partnerIdentifier;
    @XmlElement(name = "ContactInformation")
    protected List<ContactInformationType> contactInformation;
    @XmlElement(name = "AddressInformation")
    protected AddressInformationType addressInformation;
    @XmlElement(name = "TaxInformation")
    protected List<TaxInformationType> taxInformation;
    @XmlElement(name = "URL")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String url;
    @XmlElement(name = "PartnerReference")
    protected PartnerReferenceType partnerReference;
    @XmlElement(name = "LoadingPoint")
    protected LoadingPointType loadingPoint;
    @XmlElement(name = "UnloadingPoint")
    protected UnloadingPointType unloadingPoint;
    @XmlElement(name = "AccountInformation")
    protected AccountInformationType accountInformation;

    /**
     * Gets the value of the partnerName property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the partnerName property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPartnerName().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getPartnerName() {
        if (partnerName == null) {
            partnerName = new ArrayList<String>();
        }
        return this.partnerName;
    }

    /**
     * Gets the value of the partnerIdentifier property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the partnerIdentifier property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPartnerIdentifier().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PartnerIdentifierType }
     * 
     * 
     */
    public List<PartnerIdentifierType> getPartnerIdentifier() {
        if (partnerIdentifier == null) {
            partnerIdentifier = new ArrayList<PartnerIdentifierType>();
        }
        return this.partnerIdentifier;
    }

    /**
     * Gets the value of the contactInformation property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the contactInformation property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getContactInformation().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ContactInformationType }
     * 
     * 
     */
    public List<ContactInformationType> getContactInformation() {
        if (contactInformation == null) {
            contactInformation = new ArrayList<ContactInformationType>();
        }
        return this.contactInformation;
    }

    /**
     * Gets the value of the addressInformation property.
     * 
     * @return
     *     possible object is
     *     {@link AddressInformationType }
     *     
     */
    public AddressInformationType getAddressInformation() {
        return addressInformation;
    }

    /**
     * Sets the value of the addressInformation property.
     * 
     * @param value
     *     allowed object is
     *     {@link AddressInformationType }
     *     
     */
    public void setAddressInformation(AddressInformationType value) {
        this.addressInformation = value;
    }

    /**
     * Gets the value of the taxInformation property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the taxInformation property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTaxInformation().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TaxInformationType }
     * 
     * 
     */
    public List<TaxInformationType> getTaxInformation() {
        if (taxInformation == null) {
            taxInformation = new ArrayList<TaxInformationType>();
        }
        return this.taxInformation;
    }

    /**
     * Gets the value of the url property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getURL() {
        return url;
    }

    /**
     * Sets the value of the url property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setURL(String value) {
        this.url = value;
    }

    /**
     * Gets the value of the partnerReference property.
     * 
     * @return
     *     possible object is
     *     {@link PartnerReferenceType }
     *     
     */
    public PartnerReferenceType getPartnerReference() {
        return partnerReference;
    }

    /**
     * Sets the value of the partnerReference property.
     * 
     * @param value
     *     allowed object is
     *     {@link PartnerReferenceType }
     *     
     */
    public void setPartnerReference(PartnerReferenceType value) {
        this.partnerReference = value;
    }

    /**
     * Gets the value of the loadingPoint property.
     * 
     * @return
     *     possible object is
     *     {@link LoadingPointType }
     *     
     */
    public LoadingPointType getLoadingPoint() {
        return loadingPoint;
    }

    /**
     * Sets the value of the loadingPoint property.
     * 
     * @param value
     *     allowed object is
     *     {@link LoadingPointType }
     *     
     */
    public void setLoadingPoint(LoadingPointType value) {
        this.loadingPoint = value;
    }

    /**
     * Gets the value of the unloadingPoint property.
     * 
     * @return
     *     possible object is
     *     {@link UnloadingPointType }
     *     
     */
    public UnloadingPointType getUnloadingPoint() {
        return unloadingPoint;
    }

    /**
     * Sets the value of the unloadingPoint property.
     * 
     * @param value
     *     allowed object is
     *     {@link UnloadingPointType }
     *     
     */
    public void setUnloadingPoint(UnloadingPointType value) {
        this.unloadingPoint = value;
    }

    /**
     * Gets the value of the accountInformation property.
     * 
     * @return
     *     possible object is
     *     {@link AccountInformationType }
     *     
     */
    public AccountInformationType getAccountInformation() {
        return accountInformation;
    }

    /**
     * Sets the value of the accountInformation property.
     * 
     * @param value
     *     allowed object is
     *     {@link AccountInformationType }
     *     
     */
    public void setAccountInformation(AccountInformationType value) {
        this.accountInformation = value;
    }

}
