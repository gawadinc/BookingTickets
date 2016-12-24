
package org.gawad.thirdparty.soap;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for journeyInfo complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="journeyInfo">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;all>
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
 *         &lt;element name="duration" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="faresAvailable" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="fareOfferType" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="netFare" type="{http://www.w3.org/2001/XMLSchema}float"/>
 *         &lt;element name="markup" type="{http://www.w3.org/2001/XMLSchema}float"/>
 *         &lt;element name="resellerMarkup" type="{http://www.w3.org/2001/XMLSchema}float"/>
 *         &lt;element name="currency" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="ticketOptions" type="{https://demo.contentrail.com/ws/SoapApi/0.1/}ticketOptions"/>
 *       &lt;/all>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "journeyInfo", propOrder = {

})
public class JourneyInfo {

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
    protected String duration;
    protected boolean faresAvailable;
    protected int fareOfferType;
    @XmlElement(required = true, type = Float.class, nillable = true)
    protected Float netFare;
    @XmlElement(required = true, type = Float.class, nillable = true)
    protected Float markup;
    @XmlElement(required = true, type = Float.class, nillable = true)
    protected Float resellerMarkup;
    @XmlElement(required = true, nillable = true)
    protected String currency;
    @XmlElement(required = true, nillable = true)
    protected TicketOptions ticketOptions;

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
     * Gets the value of the faresAvailable property.
     * 
     */
    public boolean isFaresAvailable() {
        return faresAvailable;
    }

    /**
     * Sets the value of the faresAvailable property.
     * 
     */
    public void setFaresAvailable(boolean value) {
        this.faresAvailable = value;
    }

    /**
     * Gets the value of the fareOfferType property.
     * 
     */
    public int getFareOfferType() {
        return fareOfferType;
    }

    /**
     * Sets the value of the fareOfferType property.
     * 
     */
    public void setFareOfferType(int value) {
        this.fareOfferType = value;
    }

    /**
     * Gets the value of the netFare property.
     * 
     * @return
     *     possible object is
     *     {@link Float }
     *     
     */
    public Float getNetFare() {
        return netFare;
    }

    /**
     * Sets the value of the netFare property.
     * 
     * @param value
     *     allowed object is
     *     {@link Float }
     *     
     */
    public void setNetFare(Float value) {
        this.netFare = value;
    }

    /**
     * Gets the value of the markup property.
     * 
     * @return
     *     possible object is
     *     {@link Float }
     *     
     */
    public Float getMarkup() {
        return markup;
    }

    /**
     * Sets the value of the markup property.
     * 
     * @param value
     *     allowed object is
     *     {@link Float }
     *     
     */
    public void setMarkup(Float value) {
        this.markup = value;
    }

    /**
     * Gets the value of the resellerMarkup property.
     * 
     * @return
     *     possible object is
     *     {@link Float }
     *     
     */
    public Float getResellerMarkup() {
        return resellerMarkup;
    }

    /**
     * Sets the value of the resellerMarkup property.
     * 
     * @param value
     *     allowed object is
     *     {@link Float }
     *     
     */
    public void setResellerMarkup(Float value) {
        this.resellerMarkup = value;
    }

    /**
     * Gets the value of the currency property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCurrency() {
        return currency;
    }

    /**
     * Sets the value of the currency property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCurrency(String value) {
        this.currency = value;
    }

    /**
     * Gets the value of the ticketOptions property.
     * 
     * @return
     *     possible object is
     *     {@link TicketOptions }
     *     
     */
    public TicketOptions getTicketOptions() {
        return ticketOptions;
    }

    /**
     * Sets the value of the ticketOptions property.
     * 
     * @param value
     *     allowed object is
     *     {@link TicketOptions }
     *     
     */
    public void setTicketOptions(TicketOptions value) {
        this.ticketOptions = value;
    }

}
