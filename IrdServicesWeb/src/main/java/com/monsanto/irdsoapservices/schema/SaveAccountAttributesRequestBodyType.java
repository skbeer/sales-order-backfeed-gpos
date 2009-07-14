
package com.monsanto.irdsoapservices.schema;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for SaveAccountAttributesRequestBodyType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SaveAccountAttributesRequestBodyType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="GrowerAccountId" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="PersistableAttributeInfo" type="{urn:monsanto:ird:services:account:information}PersistableAttributeInfoType" maxOccurs="unbounded"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SaveAccountAttributesRequestBodyType", propOrder = {
    "growerAccountId",
    "persistableAttributeInfo"
})
public class SaveAccountAttributesRequestBodyType {

    @XmlElement(name = "GrowerAccountId")
    protected long growerAccountId;
    @XmlElement(name = "PersistableAttributeInfo", required = true)
    protected List<PersistableAttributeInfoType> persistableAttributeInfo;

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
     * Gets the value of the persistableAttributeInfo property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the persistableAttributeInfo property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPersistableAttributeInfo().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PersistableAttributeInfoType }
     * 
     * 
     */
    public List<PersistableAttributeInfoType> getPersistableAttributeInfo() {
        if (persistableAttributeInfo == null) {
            persistableAttributeInfo = new ArrayList<PersistableAttributeInfoType>();
        }
        return this.persistableAttributeInfo;
    }

}
