
package com.monsanto.irdsoapservices.vistiveprocessorlist.schema;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for VistiveProcessorListBodyType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="VistiveProcessorListBodyType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{urn:ecms:schema:vistiveprocessorlist:1:0}VistiveProcessorEntity" maxOccurs="unbounded"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "VistiveProcessorListBodyType", propOrder = {
    "vistiveProcessorEntity"
})
public class VistiveProcessorListBodyType {

    @XmlElement(name = "VistiveProcessorEntity", required = true)
    protected List<VistiveProcessorEntityType> vistiveProcessorEntity;

    /**
     * Gets the value of the vistiveProcessorEntity property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the vistiveProcessorEntity property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getVistiveProcessorEntity().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link VistiveProcessorEntityType }
     * 
     * 
     */
    public List<VistiveProcessorEntityType> getVistiveProcessorEntity() {
        if (vistiveProcessorEntity == null) {
            vistiveProcessorEntity = new ArrayList<VistiveProcessorEntityType>();
        }
        return this.vistiveProcessorEntity;
    }

}
