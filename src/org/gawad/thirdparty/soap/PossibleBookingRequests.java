
package org.gawad.thirdparty.soap;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for possibleBookingRequests complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="possibleBookingRequests">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;all>
 *         &lt;element name="wholeCoupe" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="diapasonSeat" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="oneCoupe" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="oneSection" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="noSideSleeper" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="lowerSleeper" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="upperSleeper" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="childMinTariff" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="noLinen" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="car" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="seats" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="genderCoupe" type="{https://demo.contentrail.com/ws/SoapApi/0.1/}GenderCoupe"/>
 *         &lt;element name="specialRequests" type="{https://demo.contentrail.com/ws/SoapApi/0.1/}SpecialRequests"/>
 *         &lt;element name="possiblePositions" type="{https://demo.contentrail.com/ws/SoapApi/0.1/}PossiblePositions"/>
 *         &lt;element name="luggageOptions" type="{https://demo.contentrail.com/ws/SoapApi/0.1/}LuggageOptions"/>
 *         &lt;element name="seatNumbers" type="{https://demo.contentrail.com/ws/SoapApi/0.1/}SeatNumbers"/>
 *         &lt;element name="meals" type="{https://demo.contentrail.com/ws/SoapApi/0.1/}Meals"/>
 *       &lt;/all>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "possibleBookingRequests", propOrder = {

})
public class PossibleBookingRequests {

    @XmlElement(required = true, type = Boolean.class, nillable = true)
    protected Boolean wholeCoupe;
    @XmlElement(required = true, type = Boolean.class, nillable = true)
    protected Boolean diapasonSeat;
    @XmlElement(required = true, type = Boolean.class, nillable = true)
    protected Boolean oneCoupe;
    @XmlElement(required = true, type = Boolean.class, nillable = true)
    protected Boolean oneSection;
    @XmlElement(required = true, type = Boolean.class, nillable = true)
    protected Boolean noSideSleeper;
    @XmlElement(required = true, type = Boolean.class, nillable = true)
    protected Boolean lowerSleeper;
    @XmlElement(required = true, type = Boolean.class, nillable = true)
    protected Boolean upperSleeper;
    @XmlElement(required = true, type = Boolean.class, nillable = true)
    protected Boolean childMinTariff;
    @XmlElement(required = true, type = Boolean.class, nillable = true)
    protected Boolean noLinen;
    @XmlElement(required = true, type = Boolean.class, nillable = true)
    protected Boolean car;
    @XmlElement(required = true, type = Boolean.class, nillable = true)
    protected Boolean seats;
    @XmlElement(required = true, nillable = true)
    protected GenderCoupe genderCoupe;
    @XmlElement(required = true, nillable = true)
    protected SpecialRequests specialRequests;
    @XmlElement(required = true, nillable = true)
    protected PossiblePositions possiblePositions;
    @XmlElement(required = true, nillable = true)
    protected LuggageOptions luggageOptions;
    @XmlElement(required = true, nillable = true)
    protected SeatNumbers seatNumbers;
    @XmlElement(required = true, nillable = true)
    protected Meals meals;

    /**
     * Gets the value of the wholeCoupe property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isWholeCoupe() {
        return wholeCoupe;
    }

    /**
     * Sets the value of the wholeCoupe property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setWholeCoupe(Boolean value) {
        this.wholeCoupe = value;
    }

    /**
     * Gets the value of the diapasonSeat property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isDiapasonSeat() {
        return diapasonSeat;
    }

    /**
     * Sets the value of the diapasonSeat property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setDiapasonSeat(Boolean value) {
        this.diapasonSeat = value;
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
     * Gets the value of the lowerSleeper property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isLowerSleeper() {
        return lowerSleeper;
    }

    /**
     * Sets the value of the lowerSleeper property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setLowerSleeper(Boolean value) {
        this.lowerSleeper = value;
    }

    /**
     * Gets the value of the upperSleeper property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isUpperSleeper() {
        return upperSleeper;
    }

    /**
     * Sets the value of the upperSleeper property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setUpperSleeper(Boolean value) {
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
     * Gets the value of the car property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isCar() {
        return car;
    }

    /**
     * Sets the value of the car property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setCar(Boolean value) {
        this.car = value;
    }

    /**
     * Gets the value of the seats property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isSeats() {
        return seats;
    }

    /**
     * Sets the value of the seats property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setSeats(Boolean value) {
        this.seats = value;
    }

    /**
     * Gets the value of the genderCoupe property.
     * 
     * @return
     *     possible object is
     *     {@link GenderCoupe }
     *     
     */
    public GenderCoupe getGenderCoupe() {
        return genderCoupe;
    }

    /**
     * Sets the value of the genderCoupe property.
     * 
     * @param value
     *     allowed object is
     *     {@link GenderCoupe }
     *     
     */
    public void setGenderCoupe(GenderCoupe value) {
        this.genderCoupe = value;
    }

    /**
     * Gets the value of the specialRequests property.
     * 
     * @return
     *     possible object is
     *     {@link SpecialRequests }
     *     
     */
    public SpecialRequests getSpecialRequests() {
        return specialRequests;
    }

    /**
     * Sets the value of the specialRequests property.
     * 
     * @param value
     *     allowed object is
     *     {@link SpecialRequests }
     *     
     */
    public void setSpecialRequests(SpecialRequests value) {
        this.specialRequests = value;
    }

    /**
     * Gets the value of the possiblePositions property.
     * 
     * @return
     *     possible object is
     *     {@link PossiblePositions }
     *     
     */
    public PossiblePositions getPossiblePositions() {
        return possiblePositions;
    }

    /**
     * Sets the value of the possiblePositions property.
     * 
     * @param value
     *     allowed object is
     *     {@link PossiblePositions }
     *     
     */
    public void setPossiblePositions(PossiblePositions value) {
        this.possiblePositions = value;
    }

    /**
     * Gets the value of the luggageOptions property.
     * 
     * @return
     *     possible object is
     *     {@link LuggageOptions }
     *     
     */
    public LuggageOptions getLuggageOptions() {
        return luggageOptions;
    }

    /**
     * Sets the value of the luggageOptions property.
     * 
     * @param value
     *     allowed object is
     *     {@link LuggageOptions }
     *     
     */
    public void setLuggageOptions(LuggageOptions value) {
        this.luggageOptions = value;
    }

    /**
     * Gets the value of the seatNumbers property.
     * 
     * @return
     *     possible object is
     *     {@link SeatNumbers }
     *     
     */
    public SeatNumbers getSeatNumbers() {
        return seatNumbers;
    }

    /**
     * Sets the value of the seatNumbers property.
     * 
     * @param value
     *     allowed object is
     *     {@link SeatNumbers }
     *     
     */
    public void setSeatNumbers(SeatNumbers value) {
        this.seatNumbers = value;
    }

    /**
     * Gets the value of the meals property.
     * 
     * @return
     *     possible object is
     *     {@link Meals }
     *     
     */
    public Meals getMeals() {
        return meals;
    }

    /**
     * Sets the value of the meals property.
     * 
     * @param value
     *     allowed object is
     *     {@link Meals }
     *     
     */
    public void setMeals(Meals value) {
        this.meals = value;
    }

}
