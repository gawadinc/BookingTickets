
package org.gawad.thirdparty.soap;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for fareOfferSearchResponse complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="fareOfferSearchResponse">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;all>
 *         &lt;element name="fareOffers" type="{https://demo.contentrail.com/ws/SoapApi/0.1/}fareOffers"/>
 *         &lt;element name="roundtripFareOffers" type="{https://demo.contentrail.com/ws/SoapApi/0.1/}roundtripFareOffers"/>
 *       &lt;/all>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "fareOfferSearchResponse", propOrder = {

})
public class FareOfferSearchResponse {

    @XmlElement(required = true)
    protected FareOffers fareOffers;
    @XmlElement(required = true, nillable = true)
    protected RoundtripFareOffers roundtripFareOffers;

    /**
     * Gets the value of the fareOffers property.
     * 
     * @return
     *     possible object is
     *     {@link FareOffers }
     *     
     */
    public FareOffers getFareOffers() {
        return fareOffers;
    }

    /**
     * Sets the value of the fareOffers property.
     * 
     * @param value
     *     allowed object is
     *     {@link FareOffers }
     *     
     */
    public void setFareOffers(FareOffers value) {
        this.fareOffers = value;
    }

    /**
     * Gets the value of the roundtripFareOffers property.
     * 
     * @return
     *     possible object is
     *     {@link RoundtripFareOffers }
     *     
     */
    public RoundtripFareOffers getRoundtripFareOffers() {
        return roundtripFareOffers;
    }

    /**
     * Sets the value of the roundtripFareOffers property.
     * 
     * @param value
     *     allowed object is
     *     {@link RoundtripFareOffers }
     *     
     */
    public void setRoundtripFareOffers(RoundtripFareOffers value) {
        this.roundtripFareOffers = value;
    }

}
