//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2015.11.06 at 11:34:29 AM CET 
//


package org.railml.schemas._2009;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAnyElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for eOcpTT complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="eOcpTT">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.railml.org/schemas/2009}tOcpTT">
 *       &lt;sequence>
 *         &lt;element name="times" type="{http://www.railml.org/schemas/2009}eArrivalDepartureTimes" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="connections" type="{http://www.railml.org/schemas/2009}eConnectionsTT" minOccurs="0"/>
 *         &lt;element name="statistics" type="{http://www.railml.org/schemas/2009}eStatistics" minOccurs="0"/>
 *         &lt;element name="sectionTT" type="{http://www.railml.org/schemas/2009}eSectionTT" minOccurs="0"/>
 *         &lt;element name="stopDescription" type="{http://www.railml.org/schemas/2009}eStopDescription" minOccurs="0"/>
 *         &lt;any namespace='##other' maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "eOcpTT", propOrder = {
    "times",
    "connections",
    "statistics",
    "sectionTT",
    "stopDescription",
    "any"
})
public class EOcpTT
    extends TOcpTT
{

    protected List<EArrivalDepartureTimes> times;
    protected EConnectionsTT connections;
    protected EStatistics statistics;
    protected ESectionTT sectionTT;
    protected EStopDescription stopDescription;
    @XmlAnyElement(lax = true)
    protected List<Object> any;

    /**
     * Gets the value of the times property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the times property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTimes().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link EArrivalDepartureTimes }
     * 
     * 
     */
    public List<EArrivalDepartureTimes> getTimes() {
        if (times == null) {
            times = new ArrayList<EArrivalDepartureTimes>();
        }
        return this.times;
    }

    /**
     * Gets the value of the connections property.
     * 
     * @return
     *     possible object is
     *     {@link EConnectionsTT }
     *     
     */
    public EConnectionsTT getConnections() {
        return connections;
    }

    /**
     * Sets the value of the connections property.
     * 
     * @param value
     *     allowed object is
     *     {@link EConnectionsTT }
     *     
     */
    public void setConnections(EConnectionsTT value) {
        this.connections = value;
    }

    /**
     * Gets the value of the statistics property.
     * 
     * @return
     *     possible object is
     *     {@link EStatistics }
     *     
     */
    public EStatistics getStatistics() {
        return statistics;
    }

    /**
     * Sets the value of the statistics property.
     * 
     * @param value
     *     allowed object is
     *     {@link EStatistics }
     *     
     */
    public void setStatistics(EStatistics value) {
        this.statistics = value;
    }

    /**
     * Gets the value of the sectionTT property.
     * 
     * @return
     *     possible object is
     *     {@link ESectionTT }
     *     
     */
    public ESectionTT getSectionTT() {
        return sectionTT;
    }

    /**
     * Sets the value of the sectionTT property.
     * 
     * @param value
     *     allowed object is
     *     {@link ESectionTT }
     *     
     */
    public void setSectionTT(ESectionTT value) {
        this.sectionTT = value;
    }

    /**
     * Gets the value of the stopDescription property.
     * 
     * @return
     *     possible object is
     *     {@link EStopDescription }
     *     
     */
    public EStopDescription getStopDescription() {
        return stopDescription;
    }

    /**
     * Sets the value of the stopDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link EStopDescription }
     *     
     */
    public void setStopDescription(EStopDescription value) {
        this.stopDescription = value;
    }

    /**
     * Gets the value of the any property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the any property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAny().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Object }
     * 
     * 
     */
    public List<Object> getAny() {
        if (any == null) {
            any = new ArrayList<Object>();
        }
        return this.any;
    }

}