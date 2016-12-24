
package org.gawad.thirdparty.soap;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for bookingResponse complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="bookingResponse">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;all>
 *         &lt;element name="booking" type="{https://demo.contentrail.com/ws/SoapApi/0.1/}booking"/>
 *         &lt;element name="roundtripBooking" type="{https://demo.contentrail.com/ws/SoapApi/0.1/}booking"/>
 *         &lt;element name="fares" type="{https://demo.contentrail.com/ws/SoapApi/0.1/}fares"/>
 *       &lt;/all>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "bookingResponse", propOrder = {

})
public class BookingResponse {

    @XmlElement(required = true)
    protected Booking booking;
    @XmlElement(required = true, nillable = true)
    protected Booking roundtripBooking;
    @XmlElement(required = true)
    protected Fares fares;

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

}
