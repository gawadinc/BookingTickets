
package org.gawad.thirdparty.soap;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for fareOffers complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="fareOffers">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="fareOffer" type="{https://demo.contentrail.com/ws/SoapApi/0.1/}fareOffer" maxOccurs="unbounded"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "fareOffers", propOrder = {
    "fareOffer"
})
public class FareOffers {

    @XmlElement(required = true)
    protected List<FareOffer> fareOffer;

    /**
     * Gets the value of the fareOffer property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the fareOffer property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getFareOffer().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link FareOffer }
     * 
     * 
     */
    public List<FareOffer> getFareOffer() {
        if (fareOffer == null) {
            fareOffer = new ArrayList<FareOffer>();
        }
        return this.fareOffer;
    }

}