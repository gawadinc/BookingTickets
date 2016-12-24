
package org.gawad.thirdparty.soap;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for intermediateStation complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="intermediateStation">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;all>
 *         &lt;element name="stationCode" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="stationName" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="stationCountry" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="stationArrivalTime" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="stationDepartureTime" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="stationStayTime" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *       &lt;/all>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "intermediateStation", propOrder = {

})
public class IntermediateStation {

    @XmlElement(required = true, nillable = true)
    protected String stationCode;
    @XmlElement(required = true)
    protected String stationName;
    @XmlElement(required = true, nillable = true)
    protected String stationCountry;
    @XmlElement(required = true, nillable = true)
    protected String stationArrivalTime;
    @XmlElement(required = true, nillable = true)
    protected String stationDepartureTime;
    @XmlElement(required = true, type = Integer.class, nillable = true)
    protected Integer stationStayTime;

    /**
     * Gets the value of the stationCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStationCode() {
        return stationCode;
    }

    /**
     * Sets the value of the stationCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStationCode(String value) {
        this.stationCode = value;
    }

    /**
     * Gets the value of the stationName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStationName() {
        return stationName;
    }

    /**
     * Sets the value of the stationName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStationName(String value) {
        this.stationName = value;
    }

    /**
     * Gets the value of the stationCountry property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStationCountry() {
        return stationCountry;
    }

    /**
     * Sets the value of the stationCountry property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStationCountry(String value) {
        this.stationCountry = value;
    }

    /**
     * Gets the value of the stationArrivalTime property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStationArrivalTime() {
        return stationArrivalTime;
    }

    /**
     * Sets the value of the stationArrivalTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStationArrivalTime(String value) {
        this.stationArrivalTime = value;
    }

    /**
     * Gets the value of the stationDepartureTime property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStationDepartureTime() {
        return stationDepartureTime;
    }

    /**
     * Sets the value of the stationDepartureTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStationDepartureTime(String value) {
        this.stationDepartureTime = value;
    }

    /**
     * Gets the value of the stationStayTime property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getStationStayTime() {
        return stationStayTime;
    }

    /**
     * Sets the value of the stationStayTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setStationStayTime(Integer value) {
        this.stationStayTime = value;
    }

}
