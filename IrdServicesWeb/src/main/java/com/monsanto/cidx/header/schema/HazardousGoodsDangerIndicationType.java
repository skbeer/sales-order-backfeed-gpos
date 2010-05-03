
package com.monsanto.cidx.header.schema;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * <p>Java class for HazardousGoodsDangerIndicationType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="HazardousGoodsDangerIndicationType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{urn:cidx:names:specification:ces:schema:all:5:0}HazardousGoodsSymbol"/>
 *         &lt;element ref="{urn:cidx:names:specification:ces:schema:all:5:0}DangerIndicationText" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "HazardousGoodsDangerIndicationType", propOrder = {
    "hazardousGoodsSymbol",
    "dangerIndicationText"
})
public class HazardousGoodsDangerIndicationType {

    @XmlElement(name = "HazardousGoodsSymbol", required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String hazardousGoodsSymbol;
    @XmlElement(name = "DangerIndicationText")
    protected List<DangerIndicationTextType> dangerIndicationText;

    /**
     * Gets the value of the hazardousGoodsSymbol property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHazardousGoodsSymbol() {
        return hazardousGoodsSymbol;
    }

    /**
     * Sets the value of the hazardousGoodsSymbol property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHazardousGoodsSymbol(String value) {
        this.hazardousGoodsSymbol = value;
    }

    /**
     * Gets the value of the dangerIndicationText property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the dangerIndicationText property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDangerIndicationText().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DangerIndicationTextType }
     * 
     * 
     */
    public List<DangerIndicationTextType> getDangerIndicationText() {
        if (dangerIndicationText == null) {
            dangerIndicationText = new ArrayList<DangerIndicationTextType>();
        }
        return this.dangerIndicationText;
    }

}
