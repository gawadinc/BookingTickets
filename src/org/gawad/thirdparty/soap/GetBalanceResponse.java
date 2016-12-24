
package org.gawad.thirdparty.soap;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for getBalanceResponse complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="getBalanceResponse">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;all>
 *         &lt;element name="bookingAllowed" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="creditLimit" type="{http://www.w3.org/2001/XMLSchema}float"/>
 *         &lt;element name="availableCredit" type="{http://www.w3.org/2001/XMLSchema}float"/>
 *         &lt;element name="paymentBalance" type="{http://www.w3.org/2001/XMLSchema}float"/>
 *         &lt;element name="debts" type="{http://www.w3.org/2001/XMLSchema}float"/>
 *         &lt;element name="currencyCode" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/all>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "getBalanceResponse", propOrder = {

})
public class GetBalanceResponse {

    protected boolean bookingAllowed;
    protected float creditLimit;
    protected float availableCredit;
    protected float paymentBalance;
    protected float debts;
    @XmlElement(required = true)
    protected String currencyCode;

    /**
     * Gets the value of the bookingAllowed property.
     * 
     */
    public boolean isBookingAllowed() {
        return bookingAllowed;
    }

    /**
     * Sets the value of the bookingAllowed property.
     * 
     */
    public void setBookingAllowed(boolean value) {
        this.bookingAllowed = value;
    }

    /**
     * Gets the value of the creditLimit property.
     * 
     */
    public float getCreditLimit() {
        return creditLimit;
    }

    /**
     * Sets the value of the creditLimit property.
     * 
     */
    public void setCreditLimit(float value) {
        this.creditLimit = value;
    }

    /**
     * Gets the value of the availableCredit property.
     * 
     */
    public float getAvailableCredit() {
        return availableCredit;
    }

    /**
     * Sets the value of the availableCredit property.
     * 
     */
    public void setAvailableCredit(float value) {
        this.availableCredit = value;
    }

    /**
     * Gets the value of the paymentBalance property.
     * 
     */
    public float getPaymentBalance() {
        return paymentBalance;
    }

    /**
     * Sets the value of the paymentBalance property.
     * 
     */
    public void setPaymentBalance(float value) {
        this.paymentBalance = value;
    }

    /**
     * Gets the value of the debts property.
     * 
     */
    public float getDebts() {
        return debts;
    }

    /**
     * Sets the value of the debts property.
     * 
     */
    public void setDebts(float value) {
        this.debts = value;
    }

    /**
     * Gets the value of the currencyCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCurrencyCode() {
        return currencyCode;
    }

    /**
     * Sets the value of the currencyCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCurrencyCode(String value) {
        this.currencyCode = value;
    }

}
