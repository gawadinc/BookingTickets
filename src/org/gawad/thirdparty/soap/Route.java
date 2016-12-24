
package org.gawad.thirdparty.soap;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for route complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="route">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;all>
 *         &lt;element name="trainDepartureCode" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="trainDepartureName" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="trainDepartureCountry" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="trainArrivalCode" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="trainArrivalName" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="trainArrivalCountry" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="intermediateStations" type="{https://demo.contentrail.com/ws/SoapApi/0.1/}intermediateStations"/>
 *       &lt;/all>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "route", propOrder = {

})
public class Route {

    @XmlElement(required = true, nillable = true)
    protected String trainDepartureCode;
    @XmlElement(required = true, nillable = true)
    protected String trainDepartureName;
    @XmlElement(required = true, nillable = true)
    protected String trainDepartureCountry;
    @XmlElement(required = true, nillable = true)
    protected String trainArrivalCode;
    @XmlElement(required = true, nillable = true)
    protected String trainArrivalName;
    @XmlElement(required = true, nillable = true)
    protected String trainArrivalCountry;
    @XmlElement(required = true)
    protected IntermediateStations intermediateStations;

    /**
     * Gets the value of the trainDepartureCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTrainDepartureCode() {
        return trainDepartureCode;
    }

    /**
     * Sets the value of the trainDepartureCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTrainDepartureCode(String value) {
        this.trainDepartureCode = value;
    }

    /**
     * Gets the value of the trainDepartureName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTrainDepartureName() {
        return trainDepartureName;
    }

    /**
     * Sets the value of the trainDepartureName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTrainDepartureName(String value) {
        this.trainDepartureName = value;
    }

    /**
     * Gets the value of the trainDepartureCountry property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTrainDepartureCountry() {
        return trainDepartureCountry;
    }

    /**
     * Sets the value of the trainDepartureCountry property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTrainDepartureCountry(String value) {
        this.trainDepartureCountry = value;
    }

    /**
     * Gets the value of the trainArrivalCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTrainArrivalCode() {
        return trainArrivalCode;
    }

    /**
     * Sets the value of the trainArrivalCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTrainArrivalCode(String value) {
        this.trainArrivalCode = value;
    }

    /**
     * Gets the value of the trainArrivalName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTrainArrivalName() {
        return trainArrivalName;
    }

    /**
     * Sets the value of the trainArrivalName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTrainArrivalName(String value) {
        this.trainArrivalName = value;
    }

    /**
     * Gets the value of the trainArrivalCountry property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTrainArrivalCountry() {
        return trainArrivalCountry;
    }

    /**
     * Sets the value of the trainArrivalCountry property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTrainArrivalCountry(String value) {
        this.trainArrivalCountry = value;
    }

    /**
     * Gets the value of the intermediateStations property.
     * 
     * @return
     *     possible object is
     *     {@link IntermediateStations }
     *     
     */
    public IntermediateStations getIntermediateStations() {
        return intermediateStations;
    }

    /**
     * Sets the value of the intermediateStations property.
     * 
     * @param value
     *     allowed object is
     *     {@link IntermediateStations }
     *     
     */
    public void setIntermediateStations(IntermediateStations value) {
        this.intermediateStations = value;
    }

}
