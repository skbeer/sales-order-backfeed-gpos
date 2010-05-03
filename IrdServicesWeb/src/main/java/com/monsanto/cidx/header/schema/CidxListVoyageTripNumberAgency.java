
package com.monsanto.cidx.header.schema;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for cidxListVoyageTripNumberAgency.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="cidxListVoyageTripNumberAgency">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}NMTOKEN">
 *     &lt;enumeration value="AssignedByCarrier"/>
 *     &lt;enumeration value="AssignedByShipper"/>
 *     &lt;enumeration value="BillOfLadingNumber"/>
 *     &lt;enumeration value="CallOffNumber"/>
 *     &lt;enumeration value="CIM"/>
 *     &lt;enumeration value="CRM"/>
 *     &lt;enumeration value="IMONumber"/>
 *     &lt;enumeration value="VehicleID"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "cidxListVoyageTripNumberAgency")
@XmlEnum
public enum CidxListVoyageTripNumberAgency {

    @XmlEnumValue("AssignedByCarrier")
    ASSIGNED_BY_CARRIER("AssignedByCarrier"),
    @XmlEnumValue("AssignedByShipper")
    ASSIGNED_BY_SHIPPER("AssignedByShipper"),
    @XmlEnumValue("BillOfLadingNumber")
    BILL_OF_LADING_NUMBER("BillOfLadingNumber"),
    @XmlEnumValue("CallOffNumber")
    CALL_OFF_NUMBER("CallOffNumber"),
    CIM("CIM"),
    CRM("CRM"),
    @XmlEnumValue("IMONumber")
    IMO_NUMBER("IMONumber"),
    @XmlEnumValue("VehicleID")
    VEHICLE_ID("VehicleID");
    private final String value;

    CidxListVoyageTripNumberAgency(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static CidxListVoyageTripNumberAgency fromValue(String v) {
        for (CidxListVoyageTripNumberAgency c: CidxListVoyageTripNumberAgency.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
