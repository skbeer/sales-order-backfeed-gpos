
package com.monsanto.irdsoapservices.schema;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * <p>Java class for PersistableAttributeInfoType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PersistableAttributeInfoType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="DatabaseAction" type="{urn:monsanto:ird:services:account:information}DatabaseActionType"/>
 *         &lt;element name="AttributeCode" type="{http://www.w3.org/2001/XMLSchema}token"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PersistableAttributeInfoType", propOrder = {
    "databaseAction",
    "attributeCode"
})
public class PersistableAttributeInfoType {

    @XmlElement(name = "DatabaseAction", required = true)
    protected DatabaseActionType databaseAction;
    @XmlElement(name = "AttributeCode", required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String attributeCode;

    /**
     * Gets the value of the databaseAction property.
     * 
     * @return
     *     possible object is
     *     {@link DatabaseActionType }
     *     
     */
    public DatabaseActionType getDatabaseAction() {
        return databaseAction;
    }

    /**
     * Sets the value of the databaseAction property.
     * 
     * @param value
     *     allowed object is
     *     {@link DatabaseActionType }
     *     
     */
    public void setDatabaseAction(DatabaseActionType value) {
        this.databaseAction = value;
    }

    /**
     * Gets the value of the attributeCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAttributeCode() {
        return attributeCode;
    }

    /**
     * Sets the value of the attributeCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAttributeCode(String value) {
        this.attributeCode = value;
    }

}
