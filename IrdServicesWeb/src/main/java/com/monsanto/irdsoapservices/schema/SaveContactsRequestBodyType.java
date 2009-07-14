
package com.monsanto.irdsoapservices.schema;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for SaveContactsRequestBodyType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SaveContactsRequestBodyType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="GrowerAccountId" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="PersistableContact" type="{urn:monsanto:ird:services:account:information}PersistableContactInfoType" maxOccurs="unbounded"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SaveContactsRequestBodyType", propOrder = {
    "growerAccountId",
    "persistableContact"
})
public class SaveContactsRequestBodyType {

    @XmlElement(name = "GrowerAccountId")
    protected long growerAccountId;
    @XmlElement(name = "PersistableContact", required = true)
    protected List<PersistableContactInfoType> persistableContact;

    /**
     * Gets the value of the growerAccountId property.
     * 
     */
    public long getGrowerAccountId() {
        return growerAccountId;
    }

    /**
     * Sets the value of the growerAccountId property.
     * 
     */
    public void setGrowerAccountId(long value) {
        this.growerAccountId = value;
    }

    /**
     * Gets the value of the persistableContact property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the persistableContact property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPersistableContact().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PersistableContactInfoType }
     * 
     * 
     */
    public List<PersistableContactInfoType> getPersistableContact() {
        if (persistableContact == null) {
            persistableContact = new ArrayList<PersistableContactInfoType>();
        }
        return this.persistableContact;
    }

}
