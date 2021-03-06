//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2019.03.13 at 09:20:21 AM CST 
//


package com.newegg.marketplace.sdk.datafeed.model.sub.properties;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for GuitarsAccessoryTypeValueList.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;simpleType name="GuitarsAccessoryTypeValueList"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="Effects Pedals - Multi-Effects"/&gt;
 *     &lt;enumeration value="Effects Pedals - Wah &amp; Volume"/&gt;
 *     &lt;enumeration value="Tuners"/&gt;
 *     &lt;enumeration value="Pickups"/&gt;
 *     &lt;enumeration value="Effects Pedals - Distortion &amp; Overdrive"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "GuitarsAccessoryTypeValueList")
@XmlEnum
public enum GuitarsAccessoryTypeValueList {

    @XmlEnumValue("Effects Pedals - Multi-Effects")
    EFFECTS_PEDALS_MULTI_EFFECTS("Effects Pedals - Multi-Effects"),
    @XmlEnumValue("Effects Pedals - Wah & Volume")
    EFFECTS_PEDALS_WAH_VOLUME("Effects Pedals - Wah & Volume"),
    @XmlEnumValue("Tuners")
    TUNERS("Tuners"),
    @XmlEnumValue("Pickups")
    PICKUPS("Pickups"),
    @XmlEnumValue("Effects Pedals - Distortion & Overdrive")
    EFFECTS_PEDALS_DISTORTION_OVERDRIVE("Effects Pedals - Distortion & Overdrive");
    private final String value;

    GuitarsAccessoryTypeValueList(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static GuitarsAccessoryTypeValueList fromValue(String v) {
        for (GuitarsAccessoryTypeValueList c: GuitarsAccessoryTypeValueList.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
