
package org.gawad.thirdparty.soap;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for journeySegments complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="journeySegments">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="journeySegment" type="{https://demo.contentrail.com/ws/SoapApi/0.1/}journeySegment" maxOccurs="unbounded"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "journeySegments", propOrder = {
    "journeySegment"
})
public class JourneySegments {

    @XmlElement(required = true)
    protected List<JourneySegment> journeySegment;

    /**
     * Gets the value of the journeySegment property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the journeySegment property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getJourneySegment().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link JourneySegment }
     * 
     * 
     */
    public List<JourneySegment> getJourneySegment() {
        if (journeySegment == null) {
            journeySegment = new ArrayList<JourneySegment>();
        }
        return this.journeySegment;
    }

}
