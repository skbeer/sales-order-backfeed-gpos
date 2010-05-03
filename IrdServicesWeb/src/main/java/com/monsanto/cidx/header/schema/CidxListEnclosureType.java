
package com.monsanto.cidx.header.schema;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for cidxListEnclosureType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="cidxListEnclosureType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}token">
 *     &lt;enumeration value="Carbon steel (iron)"/>
 *     &lt;enumeration value="Lead coated"/>
 *     &lt;enumeration value="enamelled"/>
 *     &lt;enumeration value="gummed"/>
 *     &lt;enumeration value="Coating"/>
 *     &lt;enumeration value="Stainless steel 1.4541"/>
 *     &lt;enumeration value="Stainless steel 1.4571"/>
 *     &lt;enumeration value="Carbozinc 11"/>
 *     &lt;enumeration value="zinc coated"/>
 *     &lt;enumeration value="epoxy coated"/>
 *     &lt;enumeration value="Stainless steel 1.4439"/>
 *     &lt;enumeration value="Stainless steel 1.4301 (V2)"/>
 *     &lt;enumeration value="Stainless steel 1.4401"/>
 *     &lt;enumeration value="HDPE: High density polyethylene (HDPE)"/>
 *     &lt;enumeration value="LDPE: Low density polyenthylene (LDPE)"/>
 *     &lt;enumeration value="GRP: Glas reinforced platic (GRP)"/>
 *     &lt;enumeration value="Steel with polyethylene liner"/>
 *     &lt;enumeration value="Stove-lacquer RDL 16"/>
 *     &lt;enumeration value="Stove-lacquer RDL 44"/>
 *     &lt;enumeration value="Stove-lacquer RDL 50"/>
 *     &lt;enumeration value="Stove-lacquer O 360"/>
 *     &lt;enumeration value="Stove-lacquer R 78433"/>
 *     &lt;enumeration value="Stove-lacquer O 267"/>
 *     &lt;enumeration value="Stove-lacquer O 758"/>
 *     &lt;enumeration value="Stove-lacquer Z 4"/>
 *     &lt;enumeration value="Stove-lacquer 'Protefan'"/>
 *     &lt;enumeration value="fluorinated"/>
 *     &lt;enumeration value="Stainless steel 1.4539"/>
 *     &lt;enumeration value="Stainless steel 1.4361"/>
 *     &lt;enumeration value="light-impervious"/>
 *     &lt;enumeration value="aluminium"/>
 *     &lt;enumeration value="steel"/>
 *     &lt;enumeration value="glass"/>
 *     &lt;enumeration value="paper"/>
 *     &lt;enumeration value="board"/>
 *     &lt;enumeration value="tin (tinplate)"/>
 *     &lt;enumeration value="Stainless steel 1.4306 (V2A)"/>
 *     &lt;enumeration value="PET: Polyethylenetherephtalate (PET)"/>
 *     &lt;enumeration value="Stainless steel 1.4401"/>
 *     &lt;enumeration value="High - Purity Polymer"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "cidxListEnclosureType")
@XmlEnum
public enum CidxListEnclosureType {

    @XmlEnumValue("Carbon steel (iron)")
    CARBON_STEEL_IRON("Carbon steel (iron)"),
    @XmlEnumValue("Lead coated")
    LEAD_COATED("Lead coated"),
    @XmlEnumValue("enamelled")
    ENAMELLED("enamelled"),
    @XmlEnumValue("gummed")
    GUMMED("gummed"),
    @XmlEnumValue("Coating")
    COATING("Coating"),
    @XmlEnumValue("Stainless steel 1.4541")
    STAINLESS_STEEL_1_4541("Stainless steel 1.4541"),
    @XmlEnumValue("Stainless steel 1.4571")
    STAINLESS_STEEL_1_4571("Stainless steel 1.4571"),
    @XmlEnumValue("Carbozinc 11")
    CARBOZINC_11("Carbozinc 11"),
    @XmlEnumValue("zinc coated")
    ZINC_COATED("zinc coated"),
    @XmlEnumValue("epoxy coated")
    EPOXY_COATED("epoxy coated"),
    @XmlEnumValue("Stainless steel 1.4439")
    STAINLESS_STEEL_1_4439("Stainless steel 1.4439"),
    @XmlEnumValue("Stainless steel 1.4301 (V2)")
    STAINLESS_STEEL_1_4301_V_2("Stainless steel 1.4301 (V2)"),
    @XmlEnumValue("Stainless steel 1.4401")
    STAINLESS_STEEL_1_4401("Stainless steel 1.4401"),
    @XmlEnumValue("HDPE: High density polyethylene (HDPE)")
    HDPE_HIGH_DENSITY_POLYETHYLENE_HDPE("HDPE: High density polyethylene (HDPE)"),
    @XmlEnumValue("LDPE: Low density polyenthylene (LDPE)")
    LDPE_LOW_DENSITY_POLYENTHYLENE_LDPE("LDPE: Low density polyenthylene (LDPE)"),
    @XmlEnumValue("GRP: Glas reinforced platic (GRP)")
    GRP_GLAS_REINFORCED_PLATIC_GRP("GRP: Glas reinforced platic (GRP)"),
    @XmlEnumValue("Steel with polyethylene liner")
    STEEL_WITH_POLYETHYLENE_LINER("Steel with polyethylene liner"),
    @XmlEnumValue("Stove-lacquer RDL 16")
    STOVE_LACQUER_RDL_16("Stove-lacquer RDL 16"),
    @XmlEnumValue("Stove-lacquer RDL 44")
    STOVE_LACQUER_RDL_44("Stove-lacquer RDL 44"),
    @XmlEnumValue("Stove-lacquer RDL 50")
    STOVE_LACQUER_RDL_50("Stove-lacquer RDL 50"),
    @XmlEnumValue("Stove-lacquer O 360")
    STOVE_LACQUER_O_360("Stove-lacquer O 360"),
    @XmlEnumValue("Stove-lacquer R 78433")
    STOVE_LACQUER_R_78433("Stove-lacquer R 78433"),
    @XmlEnumValue("Stove-lacquer O 267")
    STOVE_LACQUER_O_267("Stove-lacquer O 267"),
    @XmlEnumValue("Stove-lacquer O 758")
    STOVE_LACQUER_O_758("Stove-lacquer O 758"),
    @XmlEnumValue("Stove-lacquer Z 4")
    STOVE_LACQUER_Z_4("Stove-lacquer Z 4"),
    @XmlEnumValue("Stove-lacquer \'Protefan\'")
    STOVE_LACQUER_PROTEFAN("Stove-lacquer \'Protefan\'"),
    @XmlEnumValue("fluorinated")
    FLUORINATED("fluorinated"),
    @XmlEnumValue("Stainless steel 1.4539")
    STAINLESS_STEEL_1_4539("Stainless steel 1.4539"),
    @XmlEnumValue("Stainless steel 1.4361")
    STAINLESS_STEEL_1_4361("Stainless steel 1.4361"),
    @XmlEnumValue("light-impervious")
    LIGHT_IMPERVIOUS("light-impervious"),
    @XmlEnumValue("aluminium")
    ALUMINIUM("aluminium"),
    @XmlEnumValue("steel")
    STEEL("steel"),
    @XmlEnumValue("glass")
    GLASS("glass"),
    @XmlEnumValue("paper")
    PAPER("paper"),
    @XmlEnumValue("board")
    BOARD("board"),
    @XmlEnumValue("tin (tinplate)")
    TIN_TINPLATE("tin (tinplate)"),
    @XmlEnumValue("Stainless steel 1.4306 (V2A)")
    STAINLESS_STEEL_1_4306_V_2_A("Stainless steel 1.4306 (V2A)"),
    @XmlEnumValue("PET: Polyethylenetherephtalate (PET)")
    PET_POLYETHYLENETHEREPHTALATE_PET("PET: Polyethylenetherephtalate (PET)"),
    @XmlEnumValue("High - Purity Polymer")
    HIGH_PURITY_POLYMER("High - Purity Polymer");
    private final String value;

    CidxListEnclosureType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static CidxListEnclosureType fromValue(String v) {
        for (CidxListEnclosureType c: CidxListEnclosureType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
