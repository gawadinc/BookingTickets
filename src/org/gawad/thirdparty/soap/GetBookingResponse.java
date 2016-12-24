
package org.gawad.thirdparty.soap;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for getBookingResponse complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="getBookingResponse">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;all>
 *         &lt;element name="booking" type="{https://demo.contentrail.com/ws/SoapApi/0.1/}booking"/>
 *         &lt;element name="bookingJourney" type="{https://demo.contentrail.com/ws/SoapApi/0.1/}bookingJourney"/>
 *         &lt;element name="roundtripBooking" type="{https://demo.contentrail.com/ws/SoapApi/0.1/}booking"/>
 *         &lt;element name="roundtripBookingJourney" type="{https://demo.contentrail.com/ws/SoapApi/0.1/}bookingJourney"/>
 *         &lt;element name="seats" type="{https://demo.contentrail.com/ws/SoapApi/0.1/}seats"/>
 *         &lt;element name="tickets" type="{https://demo.contentrail.com/ws/SoapApi/0.1/}tickets"/>
 *         &lt;element name="passengers" type="{https://demo.contentrail.com/ws/SoapApi/0.1/}passengers"/>
 *         &lt;element name="fares" type="{https://demo.contentrail.com/ws/SoapApi/0.1/}fares"/>
 *         &lt;element name="ancillaryServices" type="{https://demo.contentrail.com/ws/SoapApi/0.1/}ancillaryServices"/>
 *       &lt;/all>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "getBookingResponse", propOrder = {

})
public class GetBookingResponse {

    @XmlElement(required = true)
    protected Booking booking;
    @XmlElement(required = true)
    protected BookingJourney bookingJourney;
    @XmlElement(required = true, nillable = true)
    protected Booking roundtripBooking;
    @XmlElement(required = true, nillable = true)
    protected BookingJourney roundtripBookingJourney;
    @XmlElement(required = true)
    protected Seats seats;
    @XmlElement(required = true)
    protected Tickets tickets;
    @XmlElement(required = true)
    protected Passengers passengers;
    @XmlElement(required = true)
    protected Fares fares;
    @XmlElement(required = true, nillable = true)
    protected AncillaryServices ancillaryServices;

    /**
     * Gets the value of the booking property.
     * 
     * @return
     *     possible object is
     *     {@link Booking }
     *     
     */
    public Booking getBooking() {
        return booking;
    }

    /**
     * Sets the value of the booking property.
     * 
     * @param value
     *     allowed object is
     *     {@link Booking }
     *     
     */
    public void setBooking(Booking value) {
        this.booking = value;
    }

    /**
     * Gets the value of the bookingJourney property.
     * 
     * @return
     *     possible object is
     *     {@link BookingJourney }
     *     
     */
    public BookingJourney getBookingJourney() {
        return bookingJourney;
    }

    /**
     * Sets the value of the bookingJourney property.
     * 
     * @param value
     *     allowed object is
     *     {@link BookingJourney }
     *     
     */
    public void setBookingJourney(BookingJourney value) {
        this.bookingJourney = value;
    }

    /**
     * Gets the value of the roundtripBooking property.
     * 
     * @return
     *     possible object is
     *     {@link Booking }
     *     
     */
    public Booking getRoundtripBooking() {
        return roundtripBooking;
    }

    /**
     * Sets the value of the roundtripBooking property.
     * 
     * @param value
     *     allowed object is
     *     {@link Booking }
     *     
     */
    public void setRoundtripBooking(Booking value) {
        this.roundtripBooking = value;
    }

    /**
     * Gets the value of the roundtripBookingJourney property.
     * 
     * @return
     *     possible object is
     *     {@link BookingJourney }
     *     
     */
    public BookingJourney getRoundtripBookingJourney() {
        return roundtripBookingJourney;
    }

    /**
     * Sets the value of the roundtripBookingJourney property.
     * 
     * @param value
     *     allowed object is
     *     {@link BookingJourney }
     *     
     */
    public void setRoundtripBookingJourney(BookingJourney value) {
        this.roundtripBookingJourney = value;
    }

    /**
     * Gets the value of the seats property.
     * 
     * @return
     *     possible object is
     *     {@link Seats }
     *     
     */
    public Seats getSeats() {
        return seats;
    }

    /**
     * Sets the value of the seats property.
     * 
     * @param value
     *     allowed object is
     *     {@link Seats }
     *     
     */
    public void setSeats(Seats value) {
        this.seats = value;
    }

    /**
     * Gets the value of the tickets property.
     * 
     * @return
     *     possible object is
     *     {@link Tickets }
     *     
     */
    public Tickets getTickets() {
        return tickets;
    }

    /**
     * Sets the value of the tickets property.
     * 
     * @param value
     *     allowed object is
     *     {@link Tickets }
     *     
     */
    public void setTickets(Tickets value) {
        this.tickets = value;
    }

    /**
     * Gets the value of the passengers property.
     * 
     * @return
     *     possible object is
     *     {@link Passengers }
     *     
     */
    public Passengers getPassengers() {
        return passengers;
    }

    /**
     * Sets the value of the passengers property.
     * 
     * @param value
     *     allowed object is
     *     {@link Passengers }
     *     
     */
    public void setPassengers(Passengers value) {
        this.passengers = value;
    }

    /**
     * Gets the value of the fares property.
     * 
     * @return
     *     possible object is
     *     {@link Fares }
     *     
     */
    public Fares getFares() {
        return fares;
    }

    /**
     * Sets the value of the fares property.
     * 
     * @param value
     *     allowed object is
     *     {@link Fares }
     *     
     */
    public void setFares(Fares value) {
        this.fares = value;
    }

    /**
     * Gets the value of the ancillaryServices property.
     * 
     * @return
     *     possible object is
     *     {@link AncillaryServices }
     *     
     */
    public AncillaryServices getAncillaryServices() {
        return ancillaryServices;
    }

    /**
     * Sets the value of the ancillaryServices property.
     * 
     * @param value
     *     allowed object is
     *     {@link AncillaryServices }
     *     
     */
    public void setAncillaryServices(AncillaryServices value) {
        this.ancillaryServices = value;
    }

}
