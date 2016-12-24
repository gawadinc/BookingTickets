
package org.gawad.thirdparty.soap;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for paxDataRequired complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="paxDataRequired">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;all>
 *         &lt;element name="salutation" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="name" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="documentType" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="documentNumber" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="documentExpireDate" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="birthDate" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="nationality" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="residence" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="email" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="birthDateForChildren" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *       &lt;/all>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "paxDataRequired", propOrder = {

})
public class PaxDataRequired {

    @XmlElement(required = true, type = Boolean.class, nillable = true)
    protected Boolean salutation;
    @XmlElement(required = true, type = Boolean.class, nillable = true)
    protected Boolean name;
    @XmlElement(required = true, type = Boolean.class, nillable = true)
    protected Boolean documentType;
    @XmlElement(required = true, type = Boolean.class, nillable = true)
    protected Boolean documentNumber;
    @XmlElement(required = true, type = Boolean.class, nillable = true)
    protected Boolean documentExpireDate;
    protected boolean birthDate;
    @XmlElement(required = true, type = Boolean.class, nillable = true)
    protected Boolean nationality;
    @XmlElement(required = true, type = Boolean.class, nillable = true)
    protected Boolean residence;
    @XmlElement(required = true, type = Boolean.class, nillable = true)
    protected Boolean email;
    @XmlElement(required = true, type = Boolean.class, nillable = true)
    protected Boolean birthDateForChildren;

    /**
     * Gets the value of the salutation property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isSalutation() {
        return salutation;
    }

    /**
     * Sets the value of the salutation property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setSalutation(Boolean value) {
        this.salutation = value;
    }

    /**
     * Gets the value of the name property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isName() {
        return name;
    }

    /**
     * Sets the value of the name property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setName(Boolean value) {
        this.name = value;
    }

    /**
     * Gets the value of the documentType property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isDocumentType() {
        return documentType;
    }

    /**
     * Sets the value of the documentType property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setDocumentType(Boolean value) {
        this.documentType = value;
    }

    /**
     * Gets the value of the documentNumber property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isDocumentNumber() {
        return documentNumber;
    }

    /**
     * Sets the value of the documentNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setDocumentNumber(Boolean value) {
        this.documentNumber = value;
    }

    /**
     * Gets the value of the documentExpireDate property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isDocumentExpireDate() {
        return documentExpireDate;
    }

    /**
     * Sets the value of the documentExpireDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setDocumentExpireDate(Boolean value) {
        this.documentExpireDate = value;
    }

    /**
     * Gets the value of the birthDate property.
     * 
     */
    public boolean isBirthDate() {
        return birthDate;
    }

    /**
     * Sets the value of the birthDate property.
     * 
     */
    public void setBirthDate(boolean value) {
        this.birthDate = value;
    }

    /**
     * Gets the value of the nationality property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isNationality() {
        return nationality;
    }

    /**
     * Sets the value of the nationality property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setNationality(Boolean value) {
        this.nationality = value;
    }

    /**
     * Gets the value of the residence property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isResidence() {
        return residence;
    }

    /**
     * Sets the value of the residence property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setResidence(Boolean value) {
        this.residence = value;
    }

    /**
     * Gets the value of the email property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isEmail() {
        return email;
    }

    /**
     * Sets the value of the email property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setEmail(Boolean value) {
        this.email = value;
    }

    /**
     * Gets the value of the birthDateForChildren property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isBirthDateForChildren() {
        return birthDateForChildren;
    }

    /**
     * Sets the value of the birthDateForChildren property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setBirthDateForChildren(Boolean value) {
        this.birthDateForChildren = value;
    }

}
