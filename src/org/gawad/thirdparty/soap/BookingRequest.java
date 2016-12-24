
package org.gawad.thirdparty.soap;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for bookingRequest complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="bookingRequest">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;all>
 *         &lt;element name="ticketOption" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="genderCoupe" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="diapasonSeatMin" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="diapasonSeatMax" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="oneCoupe" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="oneSection" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="noSideSleeper" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="noLinen" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="lowerSleeper" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="upperSleeper" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="childMinTariff" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="specialRequests" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="possiblePositions" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="luggageOptions" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="remarks" type="{https://demo.contentrail.com/ws/SoapApi/0.1/}remarks"/>
 *         &lt;element name="paymentType" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="car" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="seats" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="meals" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/all>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "bookingRequest", propOrder = {

})
public class BookingRequest {

    @XmlElement(required = true)
    protected String ticketOption;
    @XmlElement(required = true, nillable = true)
    protected String genderCoupe;
    @XmlElement(required = true, type = Integer.class, nillable = true)
    protected Integer diapasonSeatMin;
    @XmlElement(required = true, type = Integer.class, nillable = true)
    protected Integer diapasonSeatMax;
    @XmlElement(required = true, type = Boolean.class, nillable = true)
    protected Boolean oneCoupe;
    @XmlElement(required = true, type = Boolean.class, nillable = true)
    protected Boolean oneSection;
    @XmlElement(required = true, type = Boolean.class, nillable = true)
    protected Boolean noSideSleeper;
    @XmlElement(required = true, type = Boolean.class, nillable = true)
    protected Boolean noLinen;
    @XmlElement(required = true, type = Integer.class, nillable = true)
    protected Integer lowerSleeper;
    @XmlElement(required = true, type = Integer.class, nillable = true)
    protected Integer upperSleeper;
    @XmlElement(required = true, type = Boolean.class, nillable = true)
    protected Boolean childMinTariff;
    @XmlElement(required = true, nillable = true)
    protected String specialRequests;
    @XmlElement(required = true, nillable = true)
    protected String possiblePositions;
    @XmlElement(required = true, nillable = true)
    protected String luggageOptions;
    @XmlElement(required = true, nillable = true)
    protected Remarks remarks;
    @XmlElement(required = true, nillable = true)
    protected String paymentType;
    @XmlElement(required = true, nillable = true)
    protected String car;
    @XmlElement(required = true, nillable = true)
    protected String seats;
    @XmlElement(required = true, nillable = true)
    protected String meals;

    /**
     * Gets the value of the ticketOption property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTicketOption() {
        return ticketOption;
    }

    /**
     * Sets the value of the ticketOption property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTicketOption(String value) {
        this.ticketOption = value;
    }

    /**
     * Gets the value of the genderCoupe property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGenderCoupe() {
        return genderCoupe;
    }

    /**
     * Sets the value of the genderCoupe property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGenderCoupe(String value) {
        this.genderCoupe = value;
    }

    /**
     * Gets the value of the diapasonSeatMin property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getDiapasonSeatMin() {
        return diapasonSeatMin;
    }

    /**
     * Sets the value of the diapasonSeatMin property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setDiapasonSeatMin(Integer value) {
        this.diapasonSeatMin = value;
    }

    /**
     * Gets the value of the diapasonSeatMax property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getDiapasonSeatMax() {
        return diapasonSeatMax;
    }

    /**
     * Sets the value of the diapasonSeatMax property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setDiapasonSeatMax(Integer value) {
        this.diapasonSeatMax = value;
    }

    /**
     * Gets the value of the oneCoupe property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isOneCoupe() {
        return oneCoupe;
    }

    /**
     * Sets the value of the oneCoupe property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setOneCoupe(Boolean value) {
        this.oneCoupe = value;
    }

    /**
     * Gets the value of the oneSection property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isOneSection() {
        return oneSection;
    }

    /**
     * Sets the value of the oneSection property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setOneSection(Boolean value) {
        this.oneSection = value;
    }

    /**
     * Gets the value of the noSideSleeper property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isNoSideSleeper() {
        return noSideSleeper;
    }

    /**
     * Sets the value of the noSideSleeper property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setNoSideSleeper(Boolean value) {
        this.noSideSleeper = value;
    }

    /**
     * Gets the value of the noLinen property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isNoLinen() {
        return noLinen;
    }

    /**
     * Sets the value of the noLinen property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setNoLinen(Boolean value) {
        this.noLinen = value;
    }

    /**
     * Gets the value of the lowerSleeper property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getLowerSleeper() {
        return lowerSleeper;
    }

    /**
     * Sets the value of the lowerSleeper property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setLowerSleeper(Integer value) {
        this.lowerSleeper = value;
    }

    /**
     * Gets the value of the upperSleeper property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getUpperSleeper() {
        return upperSleeper;
    }

    /**
     * Sets the value of the upperSleeper property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setUpperSleeper(Integer value) {
        this.upperSleeper = value;
    }

    /**
     * Gets the value of the childMinTariff property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isChildMinTariff() {
        return childMinTariff;
    }

    /**
     * Sets the value of the childMinTariff property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setChildMinTariff(Boolean value) {
        this.childMinTariff = value;
    }

    /**
     * Gets the value of the specialRequests property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSpecialRequests() {
        return specialRequests;
    }

    /**
     * Sets the value of the specialRequests property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSpecialRequests(String value) {
        this.specialRequests = value;
    }

    /**
     * Gets the value of the possiblePositions property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPossiblePositions() {
        return possiblePositions;
    }

    /**
     * Sets the value of the possiblePositions property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPossiblePositions(String value) {
        this.possiblePositions = value;
    }

    /**
     * Gets the value of the luggageOptions property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLuggageOptions() {
        return luggageOptions;
    }

    /**
     * Sets the value of the luggageOptions property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLuggageOptions(String value) {
        this.luggageOptions = value;
    }

    /**
     * Gets the value of the remarks property.
     * 
     * @return
     *     possible object is
     *     {@link Remarks }
     *     
     */
    public Remarks getRemarks() {
        return remarks;
    }

    /**
     * Sets the value of the remarks property.
     * 
     * @param value
     *     allowed object is
     *     {@link Remarks }
     *     
     */
    public void setRemarks(Remarks value) {
        this.remarks = value;
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
     * Gets the value of the car property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCar() {
        return car;
    }

    /**
     * Sets the value of the car property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCar(String value) {
        this.car = value;
    }

    /**
     * Gets the value of the seats property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSeats() {
        return seats;
    }

    /**
     * Sets the value of the seats property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSeats(String value) {
        this.seats = value;
    }

    /**
     * Gets the value of the meals property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMeals() {
        return meals;
    }

    /**
     * Sets the value of the meals property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMeals(String value) {
        this.meals = value;
    }

}
