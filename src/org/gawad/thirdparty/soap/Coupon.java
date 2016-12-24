
package org.gawad.thirdparty.soap;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for coupon complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="coupon">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;all>
 *         &lt;element name="couponId" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="couponPdf" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/all>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "coupon", propOrder = {

})
public class Coupon {

    protected int couponId;
    @XmlElement(required = true, nillable = true)
    protected String couponPdf;

    /**
     * Gets the value of the couponId property.
     * 
     */
    public int getCouponId() {
        return couponId;
    }

    /**
     * Sets the value of the couponId property.
     * 
     */
    public void setCouponId(int value) {
        this.couponId = value;
    }

    /**
     * Gets the value of the couponPdf property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCouponPdf() {
        return couponPdf;
    }

    /**
     * Sets the value of the couponPdf property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCouponPdf(String value) {
        this.couponPdf = value;
    }

}
