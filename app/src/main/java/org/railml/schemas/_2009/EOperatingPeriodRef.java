//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2015.11.06 at 11:34:29 AM CET 
//


package org.railml.schemas._2009;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;
import java.util.ArrayList;
import java.util.List;


/**
 * <p>Java class for eOperatingPeriodRef complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="eOperatingPeriodRef">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.railml.org/schemas/2009}tOperatingPeriodRef">
 *       &lt;sequence>
 *         &lt;element name="specialService" type="{http://www.railml.org/schemas/2009}tSpecialService" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;anyAttribute namespace='##other'/>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "eOperatingPeriodRef", propOrder = {
    "specialService"
})
public class EOperatingPeriodRef
    extends TOperatingPeriodRef
{

    protected List<TSpecialService> specialService;

    /**
     * Gets the value of the specialService property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the specialService property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSpecialService().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TSpecialService }
     * 
     * 
     */
    public List<TSpecialService> getSpecialService() {
        if (specialService == null) {
            specialService = new ArrayList<TSpecialService>();
        }
        return this.specialService;
    }

}
