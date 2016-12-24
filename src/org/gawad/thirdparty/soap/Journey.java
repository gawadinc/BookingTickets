
package org.gawad.thirdparty.soap;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for journey complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="journey">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;all>
 *         &lt;element name="journeyId" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="journeyInfo" type="{https://demo.contentrail.com/ws/SoapApi/0.1/}journeyInfo"/>
 *         &lt;element name="journeySegments" type="{https://demo.contentrail.com/ws/SoapApi/0.1/}journeySegments"/>
 *       &lt;/all>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "journey", propOrder = {

})
public class Journey {

    protected int journeyId;
    @XmlElement(required = true)
    protected JourneyInfo journeyInfo;
    @XmlElement(required = true)
    protected JourneySegments journeySegments;

    /**
     * Gets the value of the journeyId property.
     * 
     */
    public int getJourneyId() {
        return journeyId;
    }

    /**
     * Sets the value of the journeyId property.
     * 
     */
    public void setJourneyId(int value) {
        this.journeyId = value;
    }

    /**
     * Gets the value of the journeyInfo property.
     * 
     * @return
     *     possible object is
     *     {@link JourneyInfo }
     *     
     */
    public JourneyInfo getJourneyInfo() {
        return journeyInfo;
    }

    /**
     * Sets the value of the journeyInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link JourneyInfo }
     *     
     */
    public void setJourneyInfo(JourneyInfo value) {
        this.journeyInfo = value;
    }

    /**
     * Gets the value of the journeySegments property.
     * 
     * @return
     *     possible object is
     *     {@link JourneySegments }
     *     
     */
    public JourneySegments getJourneySegments() {
        return journeySegments;
    }

    /**
     * Sets the value of the journeySegments property.
     * 
     * @param value
     *     allowed object is
     *     {@link JourneySegments }
     *     
     */
    public void setJourneySegments(JourneySegments value) {
        this.journeySegments = value;
    }

}
