
package org.gawad.thirdparty.soap;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for originDestinationSearch complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="originDestinationSearch">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;all>
 *         &lt;element name="originCode" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="originDate" type="{http://www.w3.org/2001/XMLSchema}date"/>
 *         &lt;element name="originTimeFrom" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="originTimeTo" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="destinationCode" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/all>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "originDestinationSearch", propOrder = {

})
public class OriginDestinationSearch {

    @XmlElement(required = true)
    protected String originCode;
    @XmlElement(required = true)
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar originDate;
    @XmlElement(required = true, nillable = true)
    protected String originTimeFrom;
    @XmlElement(required = true, nillable = true)
    protected String originTimeTo;
    @XmlElement(required = true)
    protected String destinationCode;

    /**
     * Gets the value of the originCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOriginCode() {
        return originCode;
    }

    /**
     * Sets the value of the originCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOriginCode(String value) {
        this.originCode = value;
    }

    /**
     * Gets the value of the originDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getOriginDate() {
        return originDate;
    }

    /**
     * Sets the value of the originDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setOriginDate(XMLGregorianCalendar value) {
        this.originDate = value;
    }

    /**
     * Gets the value of the originTimeFrom property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOriginTimeFrom() {
        return originTimeFrom;
    }

    /**
     * Sets the value of the originTimeFrom property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOriginTimeFrom(String value) {
        this.originTimeFrom = value;
    }

    /**
     * Gets the value of the originTimeTo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOriginTimeTo() {
        return originTimeTo;
    }

    /**
     * Sets the value of the originTimeTo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOriginTimeTo(String value) {
        this.originTimeTo = value;
    }

    /**
     * Gets the value of the destinationCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDestinationCode() {
        return destinationCode;
    }

    /**
     * Sets the value of the destinationCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDestinationCode(String value) {
        this.destinationCode = value;
    }

}
