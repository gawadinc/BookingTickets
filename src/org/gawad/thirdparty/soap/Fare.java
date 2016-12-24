
package org.gawad.thirdparty.soap;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for fare complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="fare">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;all>
 *         &lt;element name="fareId" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="netFare" type="{http://www.w3.org/2001/XMLSchema}float"/>
 *         &lt;element name="markup" type="{http://www.w3.org/2001/XMLSchema}float"/>
 *         &lt;element name="resellerMarkup" type="{http://www.w3.org/2001/XMLSchema}float"/>
 *         &lt;element name="currency" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="prodMarketingName" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="tariffCode" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/all>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "fare", propOrder = {

})
public class Fare {

    protected int fareId;
    protected float netFare;
    protected float markup;
    @XmlElement(required = true, type = Float.class, nillable = true)
    protected Float resellerMarkup;
    @XmlElement(required = true)
    protected String currency;
    @XmlElement(required = true, nillable = true)
    protected String prodMarketingName;
    @XmlElement(required = true, nillable = true)
    protected String tariffCode;

    /**
     * Gets the value of the fareId property.
     * 
     */
    public int getFareId() {
        return fareId;
    }

    /**
     * Sets the value of the fareId property.
     * 
     */
    public void setFareId(int value) {
        this.fareId = value;
    }

    /**
     * Gets the value of the netFare property.
     * 
     */
    public float getNetFare() {
        return netFare;
    }

    /**
     * Sets the value of the netFare property.
     * 
     */
    public void setNetFare(float value) {
        this.netFare = value;
    }

    /**
     * Gets the value of the markup property.
     * 
     */
    public float getMarkup() {
        return markup;
    }

    /**
     * Sets the value of the markup property.
     * 
     */
    public void setMarkup(float value) {
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
     * Gets the value of the prodMarketingName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProdMarketingName() {
        return prodMarketingName;
    }

    /**
     * Sets the value of the prodMarketingName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProdMarketingName(String value) {
        this.prodMarketingName = value;
    }

    /**
     * Gets the value of the tariffCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTariffCode() {
        return tariffCode;
    }

    /**
     * Sets the value of the tariffCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTariffCode(String value) {
        this.tariffCode = value;
    }

}
