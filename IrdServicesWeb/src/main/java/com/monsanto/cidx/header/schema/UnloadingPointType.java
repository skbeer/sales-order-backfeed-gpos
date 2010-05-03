
package com.monsanto.cidx.header.schema;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for UnloadingPointType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="UnloadingPointType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{urn:cidx:names:specification:ces:schema:all:5:0}OpenHours" minOccurs="0"/>
 *         &lt;element ref="{urn:cidx:names:specification:ces:schema:all:5:0}LoadDockHours" minOccurs="0"/>
 *         &lt;element ref="{urn:cidx:names:specification:ces:schema:all:5:0}Comment" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "UnloadingPointType", propOrder = {
    "openHours",
    "loadDockHours",
    "comment"
})
public class UnloadingPointType {

    @XmlElement(name = "OpenHours")
    protected OpenHoursType openHours;
    @XmlElement(name = "LoadDockHours")
    protected LoadDockHoursType loadDockHours;
    @XmlElement(name = "Comment")
    protected CommentType comment;

    /**
     * Gets the value of the openHours property.
     * 
     * @return
     *     possible object is
     *     {@link OpenHoursType }
     *     
     */
    public OpenHoursType getOpenHours() {
        return openHours;
    }

    /**
     * Sets the value of the openHours property.
     * 
     * @param value
     *     allowed object is
     *     {@link OpenHoursType }
     *     
     */
    public void setOpenHours(OpenHoursType value) {
        this.openHours = value;
    }

    /**
     * Gets the value of the loadDockHours property.
     * 
     * @return
     *     possible object is
     *     {@link LoadDockHoursType }
     *     
     */
    public LoadDockHoursType getLoadDockHours() {
        return loadDockHours;
    }

    /**
     * Sets the value of the loadDockHours property.
     * 
     * @param value
     *     allowed object is
     *     {@link LoadDockHoursType }
     *     
     */
    public void setLoadDockHours(LoadDockHoursType value) {
        this.loadDockHours = value;
    }

    /**
     * Gets the value of the comment property.
     * 
     * @return
     *     possible object is
     *     {@link CommentType }
     *     
     */
    public CommentType getComment() {
        return comment;
    }

    /**
     * Sets the value of the comment property.
     * 
     * @param value
     *     allowed object is
     *     {@link CommentType }
     *     
     */
    public void setComment(CommentType value) {
        this.comment = value;
    }

}
