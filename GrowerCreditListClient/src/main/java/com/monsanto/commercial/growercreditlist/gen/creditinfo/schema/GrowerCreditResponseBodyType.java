
package com.monsanto.commercial.growercreditlist.gen.creditinfo.schema;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for GrowerCreditResponseBodyType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="GrowerCreditResponseBodyType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="GrowerCreditResponseDetails" type="{Monsanto:Service:GrowerCredit}GrowerCreditResponseDetailsType" maxOccurs="unbounded"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GrowerCreditResponseBodyType", propOrder = {
    "growerCreditResponseDetails"
})
public class GrowerCreditResponseBodyType {

    @XmlElement(name = "GrowerCreditResponseDetails", required = true)
    protected List<GrowerCreditResponseDetailsType> growerCreditResponseDetails;

    /**
     * Gets the value of the growerCreditResponseDetails property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the growerCreditResponseDetails property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getGrowerCreditResponseDetails().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link GrowerCreditResponseDetailsType }
     * 
     * 
     */
    public List<GrowerCreditResponseDetailsType> getGrowerCreditResponseDetails() {
        if (growerCreditResponseDetails == null) {
            growerCreditResponseDetails = new ArrayList<GrowerCreditResponseDetailsType>();
        }
        return this.growerCreditResponseDetails;
    }

}
