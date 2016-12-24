
package org.gawad.thirdparty.soap;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for seat complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="seat">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;all>
 *         &lt;element name="ticketId" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="journeySegmentId" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="placeNumber" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="carNumber" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="deck" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="serviceClass" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="serviceType" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="placeType" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="orientation" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="genderCoupe" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/all>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "seat", propOrder = {

})
public class Seat {

    protected int ticketId;
    protected int journeySegmentId;
    @XmlElement(required = true)
    protected String placeNumber;
    @XmlElement(required = true)
    protected String carNumber;
    @XmlElement(required = true, type = Integer.class, nillable = true)
    protected Integer deck;
    @XmlElement(required = true, nillable = true)
    protected String serviceClass;
    @XmlElement(required = true, nillable = true)
    protected String serviceType;
    @XmlElement(required = true, nillable = true)
    protected String placeType;
    @XmlElement(required = true, nillable = true)
    protected String orientation;
    @XmlElement(required = true, nillable = true)
    protected String genderCoupe;

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
     * Gets the value of the journeySegmentId property.
     * 
     */
    public int getJourneySegmentId() {
        return journeySegmentId;
    }

    /**
     * Sets the value of the journeySegmentId property.
     * 
     */
    public void setJourneySegmentId(int value) {
        this.journeySegmentId = value;
    }

    /**
     * Gets the value of the placeNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPlaceNumber() {
        return placeNumber;
    }

    /**
     * Sets the value of the placeNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPlaceNumber(String value) {
        this.placeNumber = value;
    }

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
     * Gets the value of the deck property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getDeck() {
        return deck;
    }

    /**
     * Sets the value of the deck property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setDeck(Integer value) {
        this.deck = value;
    }

    /**
     * Gets the value of the serviceClass property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getServiceClass() {
        return serviceClass;
    }

    /**
     * Sets the value of the serviceClass property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setServiceClass(String value) {
        this.serviceClass = value;
    }

    /**
     * Gets the value of the serviceType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getServiceType() {
        return serviceType;
    }

    /**
     * Sets the value of the serviceType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setServiceType(String value) {
        this.serviceType = value;
    }

    /**
     * Gets the value of the placeType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPlaceType() {
        return placeType;
    }

    /**
     * Sets the value of the placeType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPlaceType(String value) {
        this.placeType = value;
    }

    /**
     * Gets the value of the orientation property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOrientation() {
        return orientation;
    }

    /**
     * Sets the value of the orientation property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOrientation(String value) {
        this.orientation = value;
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

}
