
package com.monsanto.commercial.growercreditlist.gen.creditinfo.schema;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for GrowerCreditRequestBodyType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="GrowerCreditRequestBodyType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="GrowerList" type="{Monsanto:Service:GrowerCredit}GrowerListType"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GrowerCreditRequestBodyType", propOrder = {
    "growerList"
})
public class GrowerCreditRequestBodyType {

    @XmlElement(name = "GrowerList", required = true)
    protected GrowerListType growerList;

    /**
     * Gets the value of the growerList property.
     * 
     * @return
     *     possible object is
     *     {@link GrowerListType }
     *     
     */
    public GrowerListType getGrowerList() {
        return growerList;
    }

    /**
     * Sets the value of the growerList property.
     * 
     * @param value
     *     allowed object is
     *     {@link GrowerListType }
     *     
     */
    public void setGrowerList(GrowerListType value) {
        this.growerList = value;
    }

}
