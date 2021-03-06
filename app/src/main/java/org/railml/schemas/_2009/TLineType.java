//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2015.11.06 at 11:34:29 AM CET 
//


package org.railml.schemas._2009;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for tLineType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="tLineType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="mainLine"/>
 *     &lt;enumeration value="secondaryLine"/>
 *     &lt;enumeration value="branchLine"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "tLineType")
@XmlEnum
public enum TLineType {

    @XmlEnumValue("mainLine")
    MAIN_LINE("mainLine"),
    @XmlEnumValue("secondaryLine")
    SECONDARY_LINE("secondaryLine"),
    @XmlEnumValue("branchLine")
    BRANCH_LINE("branchLine");
    private final String value;

    TLineType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static TLineType fromValue(String v) {
        for (TLineType c: TLineType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
