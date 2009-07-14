
package com.monsanto.irdsoapservices.schema;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for GetAccountAttributesRequestBodyType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="GetAccountAttributesRequestBodyType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="GrowerAccountId" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GetAccountAttributesRequestBodyType", propOrder = {
    "growerAccountId"
})
public class GetAccountAttributesRequestBodyType {

    @XmlElement(name = "GrowerAccountId")
    protected long growerAccountId;

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

}
