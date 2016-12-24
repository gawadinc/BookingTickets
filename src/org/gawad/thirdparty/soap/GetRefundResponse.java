
package org.gawad.thirdparty.soap;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for getRefundResponse complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="getRefundResponse">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;all>
 *         &lt;element name="refund" type="{https://demo.contentrail.com/ws/SoapApi/0.1/}refund"/>
 *         &lt;element name="refundTickets" type="{https://demo.contentrail.com/ws/SoapApi/0.1/}refundTickets"/>
 *         &lt;element name="passengers" type="{https://demo.contentrail.com/ws/SoapApi/0.1/}passengers"/>
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
@XmlType(name = "getRefundResponse", propOrder = {

})
public class GetRefundResponse {

    @XmlElement(required = true)
    protected Refund refund;
    @XmlElement(required = true)
    protected RefundTickets refundTickets;
    @XmlElement(required = true)
    protected Passengers passengers;
    @XmlElement(required = true)
    protected Fares fares;

    /**
     * Gets the value of the refund property.
     * 
     * @return
     *     possible object is
     *     {@link Refund }
     *     
     */
    public Refund getRefund() {
        return refund;
    }

    /**
     * Sets the value of the refund property.
     * 
     * @param value
     *     allowed object is
     *     {@link Refund }
     *     
     */
    public void setRefund(Refund value) {
        this.refund = value;
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
