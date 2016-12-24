
package org.gawad.thirdparty.soap;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for journeySearchResponse complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="journeySearchResponse">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;all>
 *         &lt;element name="originDestination" type="{https://demo.contentrail.com/ws/SoapApi/0.1/}originDestination"/>
 *         &lt;element name="roundtripOriginDestination" type="{https://demo.contentrail.com/ws/SoapApi/0.1/}originDestination"/>
 *         &lt;element name="journeys" type="{https://demo.contentrail.com/ws/SoapApi/0.1/}journeys"/>
 *         &lt;element name="roundtripJourneys" type="{https://demo.contentrail.com/ws/SoapApi/0.1/}roundtripJourneys"/>
 *       &lt;/all>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "journeySearchResponse", propOrder = {

})
public class JourneySearchResponse {

    @XmlElement(required = true)
    protected OriginDestination originDestination;
    @XmlElement(required = true, nillable = true)
    protected OriginDestination roundtripOriginDestination;
    @XmlElement(required = true)
    protected Journeys journeys;
    @XmlElement(required = true, nillable = true)
    protected RoundtripJourneys roundtripJourneys;

    /**
     * Gets the value of the originDestination property.
     * 
     * @return
     *     possible object is
     *     {@link OriginDestination }
     *     
     */
    public OriginDestination getOriginDestination() {
        return originDestination;
    }

    /**
     * Sets the value of the originDestination property.
     * 
     * @param value
     *     allowed object is
     *     {@link OriginDestination }
     *     
     */
    public void setOriginDestination(OriginDestination value) {
        this.originDestination = value;
    }

    /**
     * Gets the value of the roundtripOriginDestination property.
     * 
     * @return
     *     possible object is
     *     {@link OriginDestination }
     *     
     */
    public OriginDestination getRoundtripOriginDestination() {
        return roundtripOriginDestination;
    }

    /**
     * Sets the value of the roundtripOriginDestination property.
     * 
     * @param value
     *     allowed object is
     *     {@link OriginDestination }
     *     
     */
    public void setRoundtripOriginDestination(OriginDestination value) {
        this.roundtripOriginDestination = value;
    }

    /**
     * Gets the value of the journeys property.
     * 
     * @return
     *     possible object is
     *     {@link Journeys }
     *     
     */
    public Journeys getJourneys() {
        return journeys;
    }

    /**
     * Sets the value of the journeys property.
     * 
     * @param value
     *     allowed object is
     *     {@link Journeys }
     *     
     */
    public void setJourneys(Journeys value) {
        this.journeys = value;
    }

    /**
     * Gets the value of the roundtripJourneys property.
     * 
     * @return
     *     possible object is
     *     {@link RoundtripJourneys }
     *     
     */
    public RoundtripJourneys getRoundtripJourneys() {
        return roundtripJourneys;
    }

    /**
     * Sets the value of the roundtripJourneys property.
     * 
     * @param value
     *     allowed object is
     *     {@link RoundtripJourneys }
     *     
     */
    public void setRoundtripJourneys(RoundtripJourneys value) {
        this.roundtripJourneys = value;
    }

}
