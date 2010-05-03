
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
 * <p>Java class for QualityTestingReportBatchDetailType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="QualityTestingReportBatchDetailType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{urn:cidx:names:specification:ces:schema:all:5:0}ManufactureDate" minOccurs="0"/>
 *         &lt;element ref="{urn:cidx:names:specification:ces:schema:all:5:0}BatchNumber" minOccurs="0"/>
 *         &lt;element ref="{urn:cidx:names:specification:ces:schema:all:5:0}EquipmentIdentifier" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{urn:cidx:names:specification:ces:schema:all:5:0}SourceContainer" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{urn:cidx:names:specification:ces:schema:all:5:0}SampleNumber" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{urn:cidx:names:specification:ces:schema:all:5:0}ShelfLifeDate" minOccurs="0"/>
 *         &lt;element ref="{urn:cidx:names:specification:ces:schema:all:5:0}TestSpecification" maxOccurs="unbounded"/>
 *         &lt;element ref="{urn:cidx:names:specification:ces:schema:all:5:0}Comment" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{urn:cidx:names:specification:ces:schema:all:5:0}SpecialInstructions" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{urn:cidx:names:specification:ces:schema:all:5:0}ThirdPartyLaboratoryDetail" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "QualityTestingReportBatchDetailType", propOrder = {
    "manufactureDate",
    "batchNumber",
    "equipmentIdentifier",
    "sourceContainer",
    "sampleNumber",
    "shelfLifeDate",
    "testSpecification",
    "comment",
    "specialInstructions",
    "thirdPartyLaboratoryDetail"
})
public class QualityTestingReportBatchDetailType {

    @XmlElement(name = "ManufactureDate")
    protected ManufactureDateType manufactureDate;
    @XmlElement(name = "BatchNumber")
    protected BatchNumberType batchNumber;
    @XmlElement(name = "EquipmentIdentifier")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected List<String> equipmentIdentifier;
    @XmlElement(name = "SourceContainer")
    protected List<SourceContainerType> sourceContainer;
    @XmlElement(name = "SampleNumber")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected List<String> sampleNumber;
    @XmlElement(name = "ShelfLifeDate")
    protected ShelfLifeDateType shelfLifeDate;
    @XmlElement(name = "TestSpecification", required = true)
    protected List<TestSpecificationType> testSpecification;
    @XmlElement(name = "Comment")
    protected List<CommentType> comment;
    @XmlElement(name = "SpecialInstructions")
    protected List<SpecialInstructionsType> specialInstructions;
    @XmlElement(name = "ThirdPartyLaboratoryDetail")
    protected List<ThirdPartyLaboratoryDetailType> thirdPartyLaboratoryDetail;

    /**
     * Gets the value of the manufactureDate property.
     * 
     * @return
     *     possible object is
     *     {@link ManufactureDateType }
     *     
     */
    public ManufactureDateType getManufactureDate() {
        return manufactureDate;
    }

    /**
     * Sets the value of the manufactureDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link ManufactureDateType }
     *     
     */
    public void setManufactureDate(ManufactureDateType value) {
        this.manufactureDate = value;
    }

    /**
     * Gets the value of the batchNumber property.
     * 
     * @return
     *     possible object is
     *     {@link BatchNumberType }
     *     
     */
    public BatchNumberType getBatchNumber() {
        return batchNumber;
    }

    /**
     * Sets the value of the batchNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link BatchNumberType }
     *     
     */
    public void setBatchNumber(BatchNumberType value) {
        this.batchNumber = value;
    }

    /**
     * Gets the value of the equipmentIdentifier property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the equipmentIdentifier property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getEquipmentIdentifier().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getEquipmentIdentifier() {
        if (equipmentIdentifier == null) {
            equipmentIdentifier = new ArrayList<String>();
        }
        return this.equipmentIdentifier;
    }

    /**
     * Gets the value of the sourceContainer property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the sourceContainer property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSourceContainer().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SourceContainerType }
     * 
     * 
     */
    public List<SourceContainerType> getSourceContainer() {
        if (sourceContainer == null) {
            sourceContainer = new ArrayList<SourceContainerType>();
        }
        return this.sourceContainer;
    }

    /**
     * Gets the value of the sampleNumber property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the sampleNumber property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSampleNumber().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getSampleNumber() {
        if (sampleNumber == null) {
            sampleNumber = new ArrayList<String>();
        }
        return this.sampleNumber;
    }

    /**
     * Gets the value of the shelfLifeDate property.
     * 
     * @return
     *     possible object is
     *     {@link ShelfLifeDateType }
     *     
     */
    public ShelfLifeDateType getShelfLifeDate() {
        return shelfLifeDate;
    }

    /**
     * Sets the value of the shelfLifeDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link ShelfLifeDateType }
     *     
     */
    public void setShelfLifeDate(ShelfLifeDateType value) {
        this.shelfLifeDate = value;
    }

    /**
     * Gets the value of the testSpecification property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the testSpecification property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTestSpecification().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TestSpecificationType }
     * 
     * 
     */
    public List<TestSpecificationType> getTestSpecification() {
        if (testSpecification == null) {
            testSpecification = new ArrayList<TestSpecificationType>();
        }
        return this.testSpecification;
    }

    /**
     * Gets the value of the comment property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the comment property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getComment().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CommentType }
     * 
     * 
     */
    public List<CommentType> getComment() {
        if (comment == null) {
            comment = new ArrayList<CommentType>();
        }
        return this.comment;
    }

    /**
     * Gets the value of the specialInstructions property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the specialInstructions property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSpecialInstructions().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SpecialInstructionsType }
     * 
     * 
     */
    public List<SpecialInstructionsType> getSpecialInstructions() {
        if (specialInstructions == null) {
            specialInstructions = new ArrayList<SpecialInstructionsType>();
        }
        return this.specialInstructions;
    }

    /**
     * Gets the value of the thirdPartyLaboratoryDetail property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the thirdPartyLaboratoryDetail property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getThirdPartyLaboratoryDetail().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ThirdPartyLaboratoryDetailType }
     * 
     * 
     */
    public List<ThirdPartyLaboratoryDetailType> getThirdPartyLaboratoryDetail() {
        if (thirdPartyLaboratoryDetail == null) {
            thirdPartyLaboratoryDetail = new ArrayList<ThirdPartyLaboratoryDetailType>();
        }
        return this.thirdPartyLaboratoryDetail;
    }

}
