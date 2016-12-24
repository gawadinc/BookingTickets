
package org.gawad.thirdparty.soap;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for refundTicket complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="refundTicket">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;all>
 *         &lt;element name="refundId" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="refundTicketId" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="ticketId" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="passengerId" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="fareId" type="{http://www.w3.org/2001/XMLSchema}int"/>
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
@XmlType(name = "refundTicket", propOrder = {

})
public class RefundTicket {

    protected int refundId;
    protected int refundTicketId;
    protected int ticketId;
    protected int passengerId;
    protected int fareId;
    @XmlElement(required = true, nillable = true)
    protected Coupons coupons;

    /**
     * Gets the value of the refundId property.
     * 
     */
    public int getRefundId() {
        return refundId;
    }

    /**
     * Sets the value of the refundId property.
     * 
     */
    public void setRefundId(int value) {
        this.refundId = value;
    }

    /**
     * Gets the value of the refundTicketId property.
     * 
     */
    public int getRefundTicketId() {
        return refundTicketId;
    }

    /**
     * Sets the value of the refundTicketId property.
     * 
     */
    public void setRefundTicketId(int value) {
        this.refundTicketId = value;
    }

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
     */
    public int getFareId() {
        return fareId;
    }

    /**
     * Sets the value of the fareId property.
     * 
     */
    public void setFareId(int value) {
        this.fareId = value;
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
