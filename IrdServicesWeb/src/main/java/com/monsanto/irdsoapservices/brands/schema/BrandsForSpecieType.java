
package com.monsanto.irdsoapservices.brands.schema;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for BrandsForSpecieType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="BrandsForSpecieType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="SeedSpecieName" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="Brand" type="{urn:monsanto:ird:services:brands}BrandType" maxOccurs="unbounded"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "BrandsForSpecieType", propOrder = {
    "seedSpecieName",
    "brand"
})
public class BrandsForSpecieType {

    @XmlElement(name = "SeedSpecieName", required = true)
    protected String seedSpecieName;
    @XmlElement(name = "Brand", required = true)
    protected List<BrandType> brand;

    /**
     * Gets the value of the seedSpecieName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSeedSpecieName() {
        return seedSpecieName;
    }

    /**
     * Sets the value of the seedSpecieName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSeedSpecieName(String value) {
        this.seedSpecieName = value;
    }

    /**
     * Gets the value of the brand property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the brand property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getBrand().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link BrandType }
     * 
     * 
     */
    public List<BrandType> getBrand() {
        if (brand == null) {
            brand = new ArrayList<BrandType>();
        }
        return this.brand;
    }

}
