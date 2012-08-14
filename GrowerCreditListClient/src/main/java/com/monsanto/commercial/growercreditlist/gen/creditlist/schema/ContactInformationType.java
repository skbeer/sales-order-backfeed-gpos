
package com.monsanto.commercial.growercreditlist.gen.creditlist.schema;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * <p>Java class for ContactInformationType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ContactInformationType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ContactName" maxOccurs="unbounded" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}token">
 *               &lt;minLength value="1"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="ContactDescription" maxOccurs="unbounded" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}token">
 *               &lt;minLength value="1"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="ContactNumber" maxOccurs="unbounded" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}token">
 *               &lt;minLength value="1"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="EmailAddress" maxOccurs="unbounded" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}token">
 *               &lt;minLength value="1"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="AlternateCommunicationMethod" type="{Monsanto:Service:GrowerCreditList}AlternateCommunicationMethodType" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ContactInformationType", propOrder = {
    "contactName",
    "contactDescription",
    "contactNumber",
    "emailAddress",
    "alternateCommunicationMethod"
})
public class ContactInformationType {

    @XmlElement(name = "ContactName")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected List<String> contactName;
    @XmlElement(name = "ContactDescription")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected List<String> contactDescription;
    @XmlElement(name = "ContactNumber")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected List<String> contactNumber;
    @XmlElement(name = "EmailAddress")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected List<String> emailAddress;
    @XmlElement(name = "AlternateCommunicationMethod")
    protected List<AlternateCommunicationMethodType> alternateCommunicationMethod;

    /**
     * Gets the value of the contactName property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the contactName property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getContactName().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getContactName() {
        if (contactName == null) {
            contactName = new ArrayList<String>();
        }
        return this.contactName;
    }

    /**
     * Gets the value of the contactDescription property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the contactDescription property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getContactDescription().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getContactDescription() {
        if (contactDescription == null) {
            contactDescription = new ArrayList<String>();
        }
        return this.contactDescription;
    }

    /**
     * Gets the value of the contactNumber property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the contactNumber property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getContactNumber().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getContactNumber() {
        if (contactNumber == null) {
            contactNumber = new ArrayList<String>();
        }
        return this.contactNumber;
    }

    /**
     * Gets the value of the emailAddress property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the emailAddress property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getEmailAddress().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getEmailAddress() {
        if (emailAddress == null) {
            emailAddress = new ArrayList<String>();
        }
        return this.emailAddress;
    }

    /**
     * Gets the value of the alternateCommunicationMethod property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the alternateCommunicationMethod property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAlternateCommunicationMethod().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AlternateCommunicationMethodType }
     * 
     * 
     */
    public List<AlternateCommunicationMethodType> getAlternateCommunicationMethod() {
        if (alternateCommunicationMethod == null) {
            alternateCommunicationMethod = new ArrayList<AlternateCommunicationMethodType>();
        }
        return this.alternateCommunicationMethod;
    }

}
