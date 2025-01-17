
package com.monsanto.commercial.growercreditlist.gen.creditinfo.schema;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * <p>Java class for GrowerListType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="GrowerListType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{Monsanto:Service:GrowerCredit}GrowerIdentification" maxOccurs="unbounded"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GrowerListType", propOrder = {
    "growerIdentification"
})
public class GrowerListType {

    @XmlElement(name = "GrowerIdentification", required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected List<String> growerIdentification;

    /**
     * Gets the value of the growerIdentification property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the growerIdentification property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getGrowerIdentification().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getGrowerIdentification() {
        if (growerIdentification == null) {
            growerIdentification = new ArrayList<String>();
        }
        return this.growerIdentification;
    }

}
