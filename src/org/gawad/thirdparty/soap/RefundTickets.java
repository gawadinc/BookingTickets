
package org.gawad.thirdparty.soap;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for refundTickets complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="refundTickets">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="refundTicket" type="{https://demo.contentrail.com/ws/SoapApi/0.1/}refundTicket" maxOccurs="unbounded"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "refundTickets", propOrder = {
    "refundTicket"
})
public class RefundTickets {

    @XmlElement(required = true)
    protected List<RefundTicket> refundTicket;

    /**
     * Gets the value of the refundTicket property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the refundTicket property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRefundTicket().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link RefundTicket }
     * 
     * 
     */
    public List<RefundTicket> getRefundTicket() {
        if (refundTicket == null) {
            refundTicket = new ArrayList<RefundTicket>();
        }
        return this.refundTicket;
    }

}
