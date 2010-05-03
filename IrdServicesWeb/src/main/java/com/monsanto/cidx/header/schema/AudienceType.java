
package com.monsanto.cidx.header.schema;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for AudienceType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AudienceType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;choice>
 *         &lt;element ref="{urn:cidx:names:specification:ces:schema:all:5:0}Include"/>
 *         &lt;element ref="{urn:cidx:names:specification:ces:schema:all:5:0}Exclude"/>
 *       &lt;/choice>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AudienceType", propOrder = {
    "include",
    "exclude"
})
public class AudienceType {

    @XmlElement(name = "Include")
    protected IncludeType include;
    @XmlElement(name = "Exclude")
    protected ExcludeType exclude;

    /**
     * Gets the value of the include property.
     * 
     * @return
     *     possible object is
     *     {@link IncludeType }
     *     
     */
    public IncludeType getInclude() {
        return include;
    }

    /**
     * Sets the value of the include property.
     * 
     * @param value
     *     allowed object is
     *     {@link IncludeType }
     *     
     */
    public void setInclude(IncludeType value) {
        this.include = value;
    }

    /**
     * Gets the value of the exclude property.
     * 
     * @return
     *     possible object is
     *     {@link ExcludeType }
     *     
     */
    public ExcludeType getExclude() {
        return exclude;
    }

    /**
     * Sets the value of the exclude property.
     * 
     * @param value
     *     allowed object is
     *     {@link ExcludeType }
     *     
     */
    public void setExclude(ExcludeType value) {
        this.exclude = value;
    }

}
