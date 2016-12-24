
package org.gawad.thirdparty.soap;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for journeySegment complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="journeySegment">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;all>
 *         &lt;element name="journeySegmentId" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="departureCode" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="departureName" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="departureCountry" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="departureDate" type="{http://www.w3.org/2001/XMLSchema}date"/>
 *         &lt;element name="departureTime" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="arrivalCode" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="arrivalName" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="arrivalCountry" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="arrivalDate" type="{http://www.w3.org/2001/XMLSchema}date"/>
 *         &lt;element name="arrivalTime" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="trainNumber" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="duration" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="transportType" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="operatorName" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="vendorName" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="trainName" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="trainCategories" type="{https://demo.contentrail.com/ws/SoapApi/0.1/}trainCategories"/>
 *         &lt;element name="amenities" type="{https://demo.contentrail.com/ws/SoapApi/0.1/}amenities"/>
 *         &lt;element name="route" type="{https://demo.contentrail.com/ws/SoapApi/0.1/}route"/>
 *       &lt;/all>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "journeySegment", propOrder = {

})
public class JourneySegment {

    protected int journeySegmentId;
    @XmlElement(required = true)
    protected String departureCode;
    @XmlElement(required = true)
    protected String departureName;
    @XmlElement(required = true)
    protected String departureCountry;
    @XmlElement(required = true)
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar departureDate;
    @XmlElement(required = true)
    protected String departureTime;
    @XmlElement(required = true)
    protected String arrivalCode;
    @XmlElement(required = true)
    protected String arrivalName;
    @XmlElement(required = true)
    protected String arrivalCountry;
    @XmlElement(required = true)
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar arrivalDate;
    @XmlElement(required = true)
    protected String arrivalTime;
    @XmlElement(required = true)
    protected String trainNumber;
    @XmlElement(required = true, nillable = true)
    protected String duration;
    @XmlElement(required = true)
    protected String transportType;
    @XmlElement(required = true)
    protected String operatorName;
    @XmlElement(required = true, nillable = true)
    protected String vendorName;
    @XmlElement(required = true, nillable = true)
    protected String trainName;
    @XmlElement(required = true, nillable = true)
    protected TrainCategories trainCategories;
    @XmlElement(required = true, nillable = true)
    protected Amenities amenities;
    @XmlElement(required = true, nillable = true)
    protected Route route;

    /**
     * Gets the value of the journeySegmentId property.
     * 
     */
    public int getJourneySegmentId() {
        return journeySegmentId;
    }

    /**
     * Sets the value of the journeySegmentId property.
     * 
     */
    public void setJourneySegmentId(int value) {
        this.journeySegmentId = value;
    }

    /**
     * Gets the value of the departureCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDepartureCode() {
        return departureCode;
    }

    /**
     * Sets the value of the departureCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDepartureCode(String value) {
        this.departureCode = value;
    }

    /**
     * Gets the value of the departureName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDepartureName() {
        return departureName;
    }

    /**
     * Sets the value of the departureName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDepartureName(String value) {
        this.departureName = value;
    }

    /**
     * Gets the value of the departureCountry property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDepartureCountry() {
        return departureCountry;
    }

    /**
     * Sets the value of the departureCountry property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDepartureCountry(String value) {
        this.departureCountry = value;
    }

    /**
     * Gets the value of the departureDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDepartureDate() {
        return departureDate;
    }

    /**
     * Sets the value of the departureDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDepartureDate(XMLGregorianCalendar value) {
        this.departureDate = value;
    }

    /**
     * Gets the value of the departureTime property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDepartureTime() {
        return departureTime;
    }

    /**
     * Sets the value of the departureTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDepartureTime(String value) {
        this.departureTime = value;
    }

    /**
     * Gets the value of the arrivalCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getArrivalCode() {
        return arrivalCode;
    }

    /**
     * Sets the value of the arrivalCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setArrivalCode(String value) {
        this.arrivalCode = value;
    }

    /**
     * Gets the value of the arrivalName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getArrivalName() {
        return arrivalName;
    }

    /**
     * Sets the value of the arrivalName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setArrivalName(String value) {
        this.arrivalName = value;
    }

    /**
     * Gets the value of the arrivalCountry property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getArrivalCountry() {
        return arrivalCountry;
    }

    /**
     * Sets the value of the arrivalCountry property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setArrivalCountry(String value) {
        this.arrivalCountry = value;
    }

    /**
     * Gets the value of the arrivalDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getArrivalDate() {
        return arrivalDate;
    }

    /**
     * Sets the value of the arrivalDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setArrivalDate(XMLGregorianCalendar value) {
        this.arrivalDate = value;
    }

    /**
     * Gets the value of the arrivalTime property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getArrivalTime() {
        return arrivalTime;
    }

    /**
     * Sets the value of the arrivalTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setArrivalTime(String value) {
        this.arrivalTime = value;
    }

    /**
     * Gets the value of the trainNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTrainNumber() {
        return trainNumber;
    }

    /**
     * Sets the value of the trainNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTrainNumber(String value) {
        this.trainNumber = value;
    }

    /**
     * Gets the value of the duration property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDuration() {
        return duration;
    }

    /**
     * Sets the value of the duration property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDuration(String value) {
        this.duration = value;
    }

    /**
     * Gets the value of the transportType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTransportType() {
        return transportType;
    }

    /**
     * Sets the value of the transportType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTransportType(String value) {
        this.transportType = value;
    }

    /**
     * Gets the value of the operatorName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOperatorName() {
        return operatorName;
    }

    /**
     * Sets the value of the operatorName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOperatorName(String value) {
        this.operatorName = value;
    }

    /**
     * Gets the value of the vendorName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVendorName() {
        return vendorName;
    }

    /**
     * Sets the value of the vendorName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVendorName(String value) {
        this.vendorName = value;
    }

    /**
     * Gets the value of the trainName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTrainName() {
        return trainName;
    }

    /**
     * Sets the value of the trainName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTrainName(String value) {
        this.trainName = value;
    }

    /**
     * Gets the value of the trainCategories property.
     * 
     * @return
     *     possible object is
     *     {@link TrainCategories }
     *     
     */
    public TrainCategories getTrainCategories() {
        return trainCategories;
    }

    /**
     * Sets the value of the trainCategories property.
     * 
     * @param value
     *     allowed object is
     *     {@link TrainCategories }
     *     
     */
    public void setTrainCategories(TrainCategories value) {
        this.trainCategories = value;
    }

    /**
     * Gets the value of the amenities property.
     * 
     * @return
     *     possible object is
     *     {@link Amenities }
     *     
     */
    public Amenities getAmenities() {
        return amenities;
    }

    /**
     * Sets the value of the amenities property.
     * 
     * @param value
     *     allowed object is
     *     {@link Amenities }
     *     
     */
    public void setAmenities(Amenities value) {
        this.amenities = value;
    }

    /**
     * Gets the value of the route property.
     * 
     * @return
     *     possible object is
     *     {@link Route }
     *     
     */
    public Route getRoute() {
        return route;
    }

    /**
     * Sets the value of the route property.
     * 
     * @param value
     *     allowed object is
     *     {@link Route }
     *     
     */
    public void setRoute(Route value) {
        this.route = value;
    }

}
