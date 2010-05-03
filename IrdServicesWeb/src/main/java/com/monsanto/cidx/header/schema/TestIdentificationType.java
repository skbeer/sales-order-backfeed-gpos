
package com.monsanto.cidx.header.schema;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlElementRefs;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for TestIdentificationType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TestIdentificationType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;choice maxOccurs="unbounded">
 *         &lt;element ref="{urn:cidx:names:specification:ces:schema:all:5:0}PropertyIdentifier"/>
 *         &lt;element ref="{urn:cidx:names:specification:ces:schema:all:5:0}PropertyDescription"/>
 *         &lt;element ref="{urn:cidx:names:specification:ces:schema:all:5:0}TestMethod"/>
 *       &lt;/choice>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TestIdentificationType", propOrder = {
    "propertyIdentifierOrPropertyDescriptionOrTestMethod"
})
public class TestIdentificationType {

    @XmlElementRefs({
        @XmlElementRef(name = "PropertyDescription", namespace = "urn:cidx:names:specification:ces:schema:all:5:0", type = JAXBElement.class),
        @XmlElementRef(name = "TestMethod", namespace = "urn:cidx:names:specification:ces:schema:all:5:0", type = JAXBElement.class),
        @XmlElementRef(name = "PropertyIdentifier", namespace = "urn:cidx:names:specification:ces:schema:all:5:0", type = JAXBElement.class)
    })
    protected List<JAXBElement<?>> propertyIdentifierOrPropertyDescriptionOrTestMethod;

    /**
     * Gets the value of the propertyIdentifierOrPropertyDescriptionOrTestMethod property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the propertyIdentifierOrPropertyDescriptionOrTestMethod property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPropertyIdentifierOrPropertyDescriptionOrTestMethod().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link JAXBElement }{@code <}{@link String }{@code >}
     * {@link JAXBElement }{@code <}{@link String }{@code >}
     * {@link JAXBElement }{@code <}{@link TestMethodType }{@code >}
     * 
     * 
     */
    public List<JAXBElement<?>> getPropertyIdentifierOrPropertyDescriptionOrTestMethod() {
        if (propertyIdentifierOrPropertyDescriptionOrTestMethod == null) {
            propertyIdentifierOrPropertyDescriptionOrTestMethod = new ArrayList<JAXBElement<?>>();
        }
        return this.propertyIdentifierOrPropertyDescriptionOrTestMethod;
    }

}
