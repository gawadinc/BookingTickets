
package org.gawad.thirdparty.soap;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ticket complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ticket">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;all>
 *         &lt;element name="ticketId" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="bookingId" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="ticketSupplierId" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="passengerId" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="fareId" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="ticketType" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="coupons" type="{https://demo.contentrail.com/ws/SoapApi/0.1/}coupons"/>
 *       &lt;/all>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ticket", propOrder = {

})
public class Ticket {

    protected int ticketId;
    protected int bookingId;
    @XmlElement(required = true, nillable = true)
    protected String ticketSupplierId;
    protected int passengerId;
    @XmlElement(required = true, type = Integer.class, nillable = true)
    protected Integer fareId;
    @XmlElement(required = true, nillable = true)
    protected String ticketType;
    @XmlElement(required = true, nillable = true)
    protected Coupons coupons;

    /**
     * Gets the value of the ticketId property.
     * 
     */
    public int getTicketId() {
        return ticketId;
    }

    /**
     * Sets the value of the ticketId property.
     * 
     */
    public void setTicketId(int value) {
        this.ticketId = value;
    }

    /**
     * Gets the value of the bookingId property.
     * 
     */
    public int getBookingId() {
        return bookingId;
    }

    /**
     * Sets the value of the bookingId property.
     * 
     */
    public void setBookingId(int value) {
        this.bookingId = value;
    }

    /**
     * Gets the value of the ticketSupplierId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTicketSupplierId() {
        return ticketSupplierId;
    }

    /**
     * Sets the value of the ticketSupplierId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTicketSupplierId(String value) {
        this.ticketSupplierId = value;
    }

    /**
     * Gets the value of the passengerId property.
     * 
     */
    public int getPassengerId() {
        return passengerId;
    }

    /**
     * Sets the value of the passengerId property.
     * 
     */
    public void setPassengerId(int value) {
        this.passengerId = value;
    }

    /**
     * Gets the value of the fareId property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getFareId() {
        return fareId;
    }

    /**
     * Sets the value of the fareId property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setFareId(Integer value) {
        this.fareId = value;
    }

    /**
     * Gets the value of the ticketType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTicketType() {
        return ticketType;
    }

    /**
     * Sets the value of the ticketType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTicketType(String value) {
        this.ticketType = value;
    }

    /**
     * Gets the value of the coupons property.
     * 
     * @return
     *     possible object is
     *     {@link Coupons }
     *     
     */
    public Coupons getCoupons() {
        return coupons;
    }

    /**
     * Sets the value of the coupons property.
     * 
     * @param value
     *     allowed object is
     *     {@link Coupons }
     *     
     */
    public void setCoupons(Coupons value) {
        this.coupons = value;
    }

}
