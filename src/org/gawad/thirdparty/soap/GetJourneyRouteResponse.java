
package org.gawad.thirdparty.soap;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for getJourneyRouteResponse complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="getJourneyRouteResponse">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;all>
 *         &lt;element name="journey" type="{https://demo.contentrail.com/ws/SoapApi/0.1/}journey"/>
 *       &lt;/all>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "getJourneyRouteResponse", propOrder = {

})
public class GetJourneyRouteResponse {

    @XmlElement(required = true)
    protected Journey journey;

    /**
     * Gets the value of the journey property.
     * 
     * @return
     *     possible object is
     *     {@link Journey }
     *     
     */
    public Journey getJourney() {
        return journey;
    }

    /**
     * Sets the value of the journey property.
     * 
     * @param value
     *     allowed object is
     *     {@link Journey }
     *     
     */
    public void setJourney(Journey value) {
        this.journey = value;
    }

}
