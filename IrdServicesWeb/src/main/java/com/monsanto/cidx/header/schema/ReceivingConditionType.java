
package com.monsanto.cidx.header.schema;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * <p>Java class for ReceivingConditionType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ReceivingConditionType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{urn:cidx:names:specification:ces:schema:all:5:0}ReceivingConditionCode"/>
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
@XmlType(name = "ReceivingConditionType", propOrder = {
    "receivingConditionCode",
    "comment"
})
public class ReceivingConditionType {

    @XmlElement(name = "ReceivingConditionCode", required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String receivingConditionCode;
    @XmlElement(name = "Comment")
    protected CommentType comment;

    /**
     * Gets the value of the receivingConditionCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReceivingConditionCode() {
        return receivingConditionCode;
    }

    /**
     * Sets the value of the receivingConditionCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReceivingConditionCode(String value) {
        this.receivingConditionCode = value;
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
