
package com.monsanto.cidx.header.schema;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for EULabelingRegulationsType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="EULabelingRegulationsType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{urn:cidx:names:specification:ces:schema:all:5:0}HazardousGoodsDangerIndication" maxOccurs="unbounded"/>
 *         &lt;element ref="{urn:cidx:names:specification:ces:schema:all:5:0}HazardousSubstanceName" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "EULabelingRegulationsType", propOrder = {
    "hazardousGoodsDangerIndication",
    "hazardousSubstanceName"
})
public class EULabelingRegulationsType {

    @XmlElement(name = "HazardousGoodsDangerIndication", required = true)
    protected List<HazardousGoodsDangerIndicationType> hazardousGoodsDangerIndication;
    @XmlElement(name = "HazardousSubstanceName")
    protected List<HazardousSubstanceNameType> hazardousSubstanceName;

    /**
     * Gets the value of the hazardousGoodsDangerIndication property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the hazardousGoodsDangerIndication property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getHazardousGoodsDangerIndication().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link HazardousGoodsDangerIndicationType }
     * 
     * 
     */
    public List<HazardousGoodsDangerIndicationType> getHazardousGoodsDangerIndication() {
        if (hazardousGoodsDangerIndication == null) {
            hazardousGoodsDangerIndication = new ArrayList<HazardousGoodsDangerIndicationType>();
        }
        return this.hazardousGoodsDangerIndication;
    }

    /**
     * Gets the value of the hazardousSubstanceName property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the hazardousSubstanceName property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getHazardousSubstanceName().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link HazardousSubstanceNameType }
     * 
     * 
     */
    public List<HazardousSubstanceNameType> getHazardousSubstanceName() {
        if (hazardousSubstanceName == null) {
            hazardousSubstanceName = new ArrayList<HazardousSubstanceNameType>();
        }
        return this.hazardousSubstanceName;
    }

}
