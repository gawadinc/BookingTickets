
package org.gawad.thirdparty.soap;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for getBookingsListResponse complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="getBookingsListResponse">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;all>
 *         &lt;element name="bookings" type="{https://demo.contentrail.com/ws/SoapApi/0.1/}bookings"/>
 *         &lt;element name="refunds" type="{https://demo.contentrail.com/ws/SoapApi/0.1/}refunds"/>
 *         &lt;element name="fares" type="{https://demo.contentrail.com/ws/SoapApi/0.1/}fares"/>
 *         &lt;element name="tickets" type="{https://demo.contentrail.com/ws/SoapApi/0.1/}tickets"/>
 *         &lt;element name="refundTickets" type="{https://demo.contentrail.com/ws/SoapApi/0.1/}refundTickets"/>
 *         &lt;element name="passengers" type="{https://demo.contentrail.com/ws/SoapApi/0.1/}passengers"/>
 *       &lt;/all>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "getBookingsListResponse", propOrder = {

})
public class GetBookingsListResponse {

    @XmlElement(required = true)
    protected Bookings bookings;
    @XmlElement(required = true)
    protected Refunds refunds;
    @XmlElement(required = true)
    protected Fares fares;
    @XmlElement(required = true)
    protected Tickets tickets;
    @XmlElement(required = true)
    protected RefundTickets refundTickets;
    @XmlElement(required = true)
    protected Passengers passengers;

    /**
     * Gets the value of the bookings property.
     * 
     * @return
     *     possible object is
     *     {@link Bookings }
     *     
     */
    public Bookings getBookings() {
        return bookings;
    }

    /**
     * Sets the value of the bookings property.
     * 
     * @param value
     *     allowed object is
     *     {@link Bookings }
     *     
     */
    public void setBookings(Bookings value) {
        this.bookings = value;
    }

    /**
     * Gets the value of the refunds property.
     * 
     * @return
     *     possible object is
     *     {@link Refunds }
     *     
     */
    public Refunds getRefunds() {
        return refunds;
    }

    /**
     * Sets the value of the refunds property.
     * 
     * @param value
     *     allowed object is
     *     {@link Refunds }
     *     
     */
    public void setRefunds(Refunds value) {
        this.refunds = value;
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
     * Gets the value of the refundTickets property.
     * 
     * @return
     *     possible object is
     *     {@link RefundTickets }
     *     
     */
    public RefundTickets getRefundTickets() {
        return refundTickets;
    }

    /**
     * Sets the value of the refundTickets property.
     * 
     * @param value
     *     allowed object is
     *     {@link RefundTickets }
     *     
     */
    public void setRefundTickets(RefundTickets value) {
        this.refundTickets = value;
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

}
