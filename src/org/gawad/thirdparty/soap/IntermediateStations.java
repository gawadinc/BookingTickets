
package org.gawad.thirdparty.soap;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for intermediateStations complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="intermediateStations">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="intermediateStation" type="{https://demo.contentrail.com/ws/SoapApi/0.1/}intermediateStation" maxOccurs="unbounded"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "intermediateStations", propOrder = {
    "intermediateStation"
})
public class IntermediateStations {

    @XmlElement(required = true)
    protected List<IntermediateStation> intermediateStation;

    /**
     * Gets the value of the intermediateStation property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the intermediateStation property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getIntermediateStation().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link IntermediateStation }
     * 
     * 
     */
    public List<IntermediateStation> getIntermediateStation() {
        if (intermediateStation == null) {
            intermediateStation = new ArrayList<IntermediateStation>();
        }
        return this.intermediateStation;
    }

}
