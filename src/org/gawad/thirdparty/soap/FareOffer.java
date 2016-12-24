
package org.gawad.thirdparty.soap;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for fareOffer complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="fareOffer">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;all>
 *         &lt;element name="fareOfferId" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="fareName" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="fareOfferType" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="serviceClass" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="serviceType" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="placeType" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="isEstimated" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="fareRules" type="{https://demo.contentrail.com/ws/SoapApi/0.1/}fareRules"/>
 *         &lt;element name="netFare" type="{http://www.w3.org/2001/XMLSchema}float"/>
 *         &lt;element name="markup" type="{http://www.w3.org/2001/XMLSchema}float"/>
 *         &lt;element name="resellerMarkup" type="{http://www.w3.org/2001/XMLSchema}float"/>
 *         &lt;element name="currency" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="ticketOptions" type="{https://demo.contentrail.com/ws/SoapApi/0.1/}ticketOptions"/>
 *         &lt;element name="possibleBookingRequests" type="{https://demo.contentrail.com/ws/SoapApi/0.1/}possibleBookingRequests"/>
 *         &lt;element name="amenities" type="{https://demo.contentrail.com/ws/SoapApi/0.1/}amenities"/>
 *         &lt;element name="paxDataRequired" type="{https://demo.contentrail.com/ws/SoapApi/0.1/}paxDataRequired"/>
 *       &lt;/all>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "fareOffer", propOrder = {

})
public class FareOffer {

    protected int fareOfferId;
    @XmlElement(required = true, nillable = true)
    protected String fareName;
    protected int fareOfferType;
    @XmlElement(required = true, nillable = true)
    protected String serviceClass;
    @XmlElement(required = true, nillable = true)
    protected String serviceType;
    @XmlElement(required = true, nillable = true)
    protected String placeType;
    @XmlElement(required = true, type = Boolean.class, nillable = true)
    protected Boolean isEstimated;
    @XmlElement(required = true, nillable = true)
    protected FareRules fareRules;
    @XmlElement(required = true, type = Float.class, nillable = true)
    protected Float netFare;
    @XmlElement(required = true, type = Float.class, nillable = true)
    protected Float markup;
    @XmlElement(required = true, type = Float.class, nillable = true)
    protected Float resellerMarkup;
    @XmlElement(required = true, nillable = true)
    protected String currency;
    @XmlElement(required = true)
    protected TicketOptions ticketOptions;
    @XmlElement(required = true, nillable = true)
    protected PossibleBookingRequests possibleBookingRequests;
    @XmlElement(required = true, nillable = true)
    protected Amenities amenities;
    @XmlElement(required = true)
    protected PaxDataRequired paxDataRequired;

    /**
     * Gets the value of the fareOfferId property.
     * 
     */
    public int getFareOfferId() {
        return fareOfferId;
    }

    /**
     * Sets the value of the fareOfferId property.
     * 
     */
    public void setFareOfferId(int value) {
        this.fareOfferId = value;
    }

    /**
     * Gets the value of the fareName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFareName() {
        return fareName;
    }

    /**
     * Sets the value of the fareName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFareName(String value) {
        this.fareName = value;
    }

    /**
     * Gets the value of the fareOfferType property.
     * 
     */
    public int getFareOfferType() {
        return fareOfferType;
    }

    /**
     * Sets the value of the fareOfferType property.
     * 
     */
    public void setFareOfferType(int value) {
        this.fareOfferType = value;
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
     * Gets the value of the isEstimated property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIsEstimated() {
        return isEstimated;
    }

    /**
     * Sets the value of the isEstimated property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIsEstimated(Boolean value) {
        this.isEstimated = value;
    }

    /**
     * Gets the value of the fareRules property.
     * 
     * @return
     *     possible object is
     *     {@link FareRules }
     *     
     */
    public FareRules getFareRules() {
        return fareRules;
    }

    /**
     * Sets the value of the fareRules property.
     * 
     * @param value
     *     allowed object is
     *     {@link FareRules }
     *     
     */
    public void setFareRules(FareRules value) {
        this.fareRules = value;
    }

    /**
     * Gets the value of the netFare property.
     * 
     * @return
     *     possible object is
     *     {@link Float }
     *     
     */
    public Float getNetFare() {
        return netFare;
    }

    /**
     * Sets the value of the netFare property.
     * 
     * @param value
     *     allowed object is
     *     {@link Float }
     *     
     */
    public void setNetFare(Float value) {
        this.netFare = value;
    }

    /**
     * Gets the value of the markup property.
     * 
     * @return
     *     possible object is
     *     {@link Float }
     *     
     */
    public Float getMarkup() {
        return markup;
    }

    /**
     * Sets the value of the markup property.
     * 
     * @param value
     *     allowed object is
     *     {@link Float }
     *     
     */
    public void setMarkup(Float value) {
        this.markup = value;
    }

    /**
     * Gets the value of the resellerMarkup property.
     * 
     * @return
     *     possible object is
     *     {@link Float }
     *     
     */
    public Float getResellerMarkup() {
        return resellerMarkup;
    }

    /**
     * Sets the value of the resellerMarkup property.
     * 
     * @param value
     *     allowed object is
     *     {@link Float }
     *     
     */
    public void setResellerMarkup(Float value) {
        this.resellerMarkup = value;
    }

    /**
     * Gets the value of the currency property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCurrency() {
        return currency;
    }

    /**
     * Sets the value of the currency property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCurrency(String value) {
        this.currency = value;
    }

    /**
     * Gets the value of the ticketOptions property.
     * 
     * @return
     *     possible object is
     *     {@link TicketOptions }
     *     
     */
    public TicketOptions getTicketOptions() {
        return ticketOptions;
    }

    /**
     * Sets the value of the ticketOptions property.
     * 
     * @param value
     *     allowed object is
     *     {@link TicketOptions }
     *     
     */
    public void setTicketOptions(TicketOptions value) {
        this.ticketOptions = value;
    }

    /**
     * Gets the value of the possibleBookingRequests property.
     * 
     * @return
     *     possible object is
     *     {@link PossibleBookingRequests }
     *     
     */
    public PossibleBookingRequests getPossibleBookingRequests() {
        return possibleBookingRequests;
    }

    /**
     * Sets the value of the possibleBookingRequests property.
     * 
     * @param value
     *     allowed object is
     *     {@link PossibleBookingRequests }
     *     
     */
    public void setPossibleBookingRequests(PossibleBookingRequests value) {
        this.possibleBookingRequests = value;
    }

    /**
     * Gets the value of the amenities property.
     * 
     * @return
     *     possible object is
     *     {@link Amenities }
     *     
     */
    public Amenities getAmenities() {
        return amenities;
    }

    /**
     * Sets the value of the amenities property.
     * 
     * @param value
     *     allowed object is
     *     {@link Amenities }
     *     
     */
    public void setAmenities(Amenities value) {
        this.amenities = value;
    }

    /**
     * Gets the value of the paxDataRequired property.
     * 
     * @return
     *     possible object is
     *     {@link PaxDataRequired }
     *     
     */
    public PaxDataRequired getPaxDataRequired() {
        return paxDataRequired;
    }

    /**
     * Sets the value of the paxDataRequired property.
     * 
     * @param value
     *     allowed object is
     *     {@link PaxDataRequired }
     *     
     */
    public void setPaxDataRequired(PaxDataRequired value) {
        this.paxDataRequired = value;
    }

}
