
package org.gawad.thirdparty.soap;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for additionalOptions complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="additionalOptions">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;all>
 *         &lt;element name="luggageOptions" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="seatNumbers" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/all>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "additionalOptions", propOrder = {

})
public class AdditionalOptions {

    @XmlElement(required = true, nillable = true)
    protected String luggageOptions;
    @XmlElement(required = true, nillable = true)
    protected String seatNumbers;

    /**
     * Gets the value of the luggageOptions property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLuggageOptions() {
        return luggageOptions;
    }

    /**
     * Sets the value of the luggageOptions property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLuggageOptions(String value) {
        this.luggageOptions = value;
    }

    /**
     * Gets the value of the seatNumbers property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSeatNumbers() {
        return seatNumbers;
    }

    /**
     * Sets the value of the seatNumbers property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSeatNumbers(String value) {
        this.seatNumbers = value;
    }

}
