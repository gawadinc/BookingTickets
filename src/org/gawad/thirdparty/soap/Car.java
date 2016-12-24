
package org.gawad.thirdparty.soap;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for car complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="car">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;all>
 *         &lt;element name="carNumber" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="carOwner" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="seaters" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="lowerSleeper" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="upperSleeper" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="lowerSideSleeper" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="upperSideSleeper" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="allAvailableSeats" type="{https://demo.contentrail.com/ws/SoapApi/0.1/}availableSeats"/>
 *         &lt;element name="availableMaleCoupes" type="{https://demo.contentrail.com/ws/SoapApi/0.1/}availableSeats"/>
 *         &lt;element name="availableFemaleCoupes" type="{https://demo.contentrail.com/ws/SoapApi/0.1/}availableSeats"/>
 *         &lt;element name="availableMixedCoupes" type="{https://demo.contentrail.com/ws/SoapApi/0.1/}availableSeats"/>
 *         &lt;element name="availableWholeCoupes" type="{https://demo.contentrail.com/ws/SoapApi/0.1/}availableSeats"/>
 *         &lt;element name="seatMap" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/all>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "car", propOrder = {

})
public class Car {

    @XmlElement(required = true)
    protected String carNumber;
    @XmlElement(required = true, nillable = true)
    protected String carOwner;
    @XmlElement(required = true, type = Integer.class, nillable = true)
    protected Integer seaters;
    @XmlElement(required = true, type = Integer.class, nillable = true)
    protected Integer lowerSleeper;
    @XmlElement(required = true, type = Integer.class, nillable = true)
    protected Integer upperSleeper;
    @XmlElement(required = true, type = Integer.class, nillable = true)
    protected Integer lowerSideSleeper;
    @XmlElement(required = true, type = Integer.class, nillable = true)
    protected Integer upperSideSleeper;
    @XmlElement(required = true, nillable = true)
    protected AvailableSeats allAvailableSeats;
    @XmlElement(required = true, nillable = true)
    protected AvailableSeats availableMaleCoupes;
    @XmlElement(required = true, nillable = true)
    protected AvailableSeats availableFemaleCoupes;
    @XmlElement(required = true, nillable = true)
    protected AvailableSeats availableMixedCoupes;
    @XmlElement(required = true, nillable = true)
    protected AvailableSeats availableWholeCoupes;
    @XmlElement(required = true, nillable = true)
    protected String seatMap;

    /**
     * Gets the value of the carNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCarNumber() {
        return carNumber;
    }

    /**
     * Sets the value of the carNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCarNumber(String value) {
        this.carNumber = value;
    }

    /**
     * Gets the value of the carOwner property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCarOwner() {
        return carOwner;
    }

    /**
     * Sets the value of the carOwner property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCarOwner(String value) {
        this.carOwner = value;
    }

    /**
     * Gets the value of the seaters property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getSeaters() {
        return seaters;
    }

    /**
     * Sets the value of the seaters property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setSeaters(Integer value) {
        this.seaters = value;
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
     * Gets the value of the lowerSideSleeper property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getLowerSideSleeper() {
        return lowerSideSleeper;
    }

    /**
     * Sets the value of the lowerSideSleeper property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setLowerSideSleeper(Integer value) {
        this.lowerSideSleeper = value;
    }

    /**
     * Gets the value of the upperSideSleeper property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getUpperSideSleeper() {
        return upperSideSleeper;
    }

    /**
     * Sets the value of the upperSideSleeper property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setUpperSideSleeper(Integer value) {
        this.upperSideSleeper = value;
    }

    /**
     * Gets the value of the allAvailableSeats property.
     * 
     * @return
     *     possible object is
     *     {@link AvailableSeats }
     *     
     */
    public AvailableSeats getAllAvailableSeats() {
        return allAvailableSeats;
    }

    /**
     * Sets the value of the allAvailableSeats property.
     * 
     * @param value
     *     allowed object is
     *     {@link AvailableSeats }
     *     
     */
    public void setAllAvailableSeats(AvailableSeats value) {
        this.allAvailableSeats = value;
    }

    /**
     * Gets the value of the availableMaleCoupes property.
     * 
     * @return
     *     possible object is
     *     {@link AvailableSeats }
     *     
     */
    public AvailableSeats getAvailableMaleCoupes() {
        return availableMaleCoupes;
    }

    /**
     * Sets the value of the availableMaleCoupes property.
     * 
     * @param value
     *     allowed object is
     *     {@link AvailableSeats }
     *     
     */
    public void setAvailableMaleCoupes(AvailableSeats value) {
        this.availableMaleCoupes = value;
    }

    /**
     * Gets the value of the availableFemaleCoupes property.
     * 
     * @return
     *     possible object is
     *     {@link AvailableSeats }
     *     
     */
    public AvailableSeats getAvailableFemaleCoupes() {
        return availableFemaleCoupes;
    }

    /**
     * Sets the value of the availableFemaleCoupes property.
     * 
     * @param value
     *     allowed object is
     *     {@link AvailableSeats }
     *     
     */
    public void setAvailableFemaleCoupes(AvailableSeats value) {
        this.availableFemaleCoupes = value;
    }

    /**
     * Gets the value of the availableMixedCoupes property.
     * 
     * @return
     *     possible object is
     *     {@link AvailableSeats }
     *     
     */
    public AvailableSeats getAvailableMixedCoupes() {
        return availableMixedCoupes;
    }

    /**
     * Sets the value of the availableMixedCoupes property.
     * 
     * @param value
     *     allowed object is
     *     {@link AvailableSeats }
     *     
     */
    public void setAvailableMixedCoupes(AvailableSeats value) {
        this.availableMixedCoupes = value;
    }

    /**
     * Gets the value of the availableWholeCoupes property.
     * 
     * @return
     *     possible object is
     *     {@link AvailableSeats }
     *     
     */
    public AvailableSeats getAvailableWholeCoupes() {
        return availableWholeCoupes;
    }

    /**
     * Sets the value of the availableWholeCoupes property.
     * 
     * @param value
     *     allowed object is
     *     {@link AvailableSeats }
     *     
     */
    public void setAvailableWholeCoupes(AvailableSeats value) {
        this.availableWholeCoupes = value;
    }

    /**
     * Gets the value of the seatMap property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSeatMap() {
        return seatMap;
    }

    /**
     * Sets the value of the seatMap property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSeatMap(String value) {
        this.seatMap = value;
    }

}
