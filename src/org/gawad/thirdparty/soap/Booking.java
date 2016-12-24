
package org.gawad.thirdparty.soap;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for booking complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="booking">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;all>
 *         &lt;element name="bookingId" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="operatorBookingId" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="status" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="createDate" type="{http://www.w3.org/2001/XMLSchema}date"/>
 *         &lt;element name="createTime" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="confirmLimit" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="fareId" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="ticketType" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="paymentType" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="coupons" type="{https://demo.contentrail.com/ws/SoapApi/0.1/}coupons"/>
 *         &lt;element name="couponsMessage" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/all>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "booking", propOrder = {

})
public class Booking {

    protected int bookingId;
    @XmlElement(required = true, nillable = true)
    protected String operatorBookingId;
    @XmlElement(required = true)
    protected String status;
    @XmlElement(required = true)
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar createDate;
    @XmlElement(required = true)
    protected String createTime;
    @XmlElement(required = true, type = Integer.class, nillable = true)
    protected Integer confirmLimit;
    @XmlElement(required = true, type = Integer.class, nillable = true)
    protected Integer fareId;
    @XmlElement(required = true, nillable = true)
    protected String ticketType;
    @XmlElement(required = true, nillable = true)
    protected String paymentType;
    @XmlElement(required = true, nillable = true)
    protected Coupons coupons;
    @XmlElement(required = true, nillable = true)
    protected String couponsMessage;

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
     * Gets the value of the operatorBookingId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOperatorBookingId() {
        return operatorBookingId;
    }

    /**
     * Sets the value of the operatorBookingId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOperatorBookingId(String value) {
        this.operatorBookingId = value;
    }

    /**
     * Gets the value of the status property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStatus() {
        return status;
    }

    /**
     * Sets the value of the status property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStatus(String value) {
        this.status = value;
    }

    /**
     * Gets the value of the createDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getCreateDate() {
        return createDate;
    }

    /**
     * Sets the value of the createDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setCreateDate(XMLGregorianCalendar value) {
        this.createDate = value;
    }

    /**
     * Gets the value of the createTime property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCreateTime() {
        return createTime;
    }

    /**
     * Sets the value of the createTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCreateTime(String value) {
        this.createTime = value;
    }

    /**
     * Gets the value of the confirmLimit property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getConfirmLimit() {
        return confirmLimit;
    }

    /**
     * Sets the value of the confirmLimit property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setConfirmLimit(Integer value) {
        this.confirmLimit = value;
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
     * Gets the value of the paymentType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPaymentType() {
        return paymentType;
    }

    /**
     * Sets the value of the paymentType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPaymentType(String value) {
        this.paymentType = value;
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

    /**
     * Gets the value of the couponsMessage property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCouponsMessage() {
        return couponsMessage;
    }

    /**
     * Sets the value of the couponsMessage property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCouponsMessage(String value) {
        this.couponsMessage = value;
    }

}
