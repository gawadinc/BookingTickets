
package org.gawad.thirdparty.soap;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for getCouponsResponse complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="getCouponsResponse">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;all>
 *         &lt;element name="coupons" type="{https://demo.contentrail.com/ws/SoapApi/0.1/}coupons"/>
 *       &lt;/all>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "getCouponsResponse", propOrder = {

})
public class GetCouponsResponse {

    @XmlElement(required = true)
    protected Coupons coupons;

    /**
     * Gets the value of the coupons property.
     * 
     * @return
     *     possible object is
     *     {@link Coupons }
     *     
     */
    public Coupons getCoupons() {
        return coupons;
    }

    /**
     * Sets the value of the coupons property.
     * 
     * @param value
     *     allowed object is
     *     {@link Coupons }
     *     
     */
    public void setCoupons(Coupons value) {
        this.coupons = value;
    }

}
