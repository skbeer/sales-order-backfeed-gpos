
package com.monsanto.irdsoapservices.brands.schema;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for GetBrandsResponseBodyType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="GetBrandsResponseBodyType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="BrandsForSpecie" type="{urn:monsanto:ird:services:brands}BrandsForSpecieType" maxOccurs="unbounded"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GetBrandsResponseBodyType", propOrder = {
    "brandsForSpecie"
})
public class GetBrandsResponseBodyType {

    @XmlElement(name = "BrandsForSpecie", required = true)
    protected List<BrandsForSpecieType> brandsForSpecie;

    /**
     * Gets the value of the brandsForSpecie property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the brandsForSpecie property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getBrandsForSpecie().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link BrandsForSpecieType }
     * 
     * 
     */
    public List<BrandsForSpecieType> getBrandsForSpecie() {
        if (brandsForSpecie == null) {
            brandsForSpecie = new ArrayList<BrandsForSpecieType>();
        }
        return this.brandsForSpecie;
    }

}
