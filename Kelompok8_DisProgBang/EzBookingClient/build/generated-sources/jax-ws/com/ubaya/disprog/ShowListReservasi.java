
package com.ubaya.disprog;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * &lt;p&gt;Java class for showListReservasi complex type.
 * 
 * &lt;p&gt;The following schema fragment specifies the expected content contained within this class.
 * 
 * &lt;pre&gt;
 * &amp;lt;complexType name="showListReservasi"&amp;gt;
 *   &amp;lt;complexContent&amp;gt;
 *     &amp;lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&amp;gt;
 *       &amp;lt;sequence&amp;gt;
 *         &amp;lt;element name="idRestaurant" type="{http://www.w3.org/2001/XMLSchema}int"/&amp;gt;
 *         &amp;lt;element name="usernameAccount" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&amp;gt;
 *       &amp;lt;/sequence&amp;gt;
 *     &amp;lt;/restriction&amp;gt;
 *   &amp;lt;/complexContent&amp;gt;
 * &amp;lt;/complexType&amp;gt;
 * &lt;/pre&gt;
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "showListReservasi", propOrder = {
    "idRestaurant",
    "usernameAccount"
})
public class ShowListReservasi {

    protected int idRestaurant;
    protected String usernameAccount;

    /**
     * Gets the value of the idRestaurant property.
     * 
     */
    public int getIdRestaurant() {
        return idRestaurant;
    }

    /**
     * Sets the value of the idRestaurant property.
     * 
     */
    public void setIdRestaurant(int value) {
        this.idRestaurant = value;
    }

    /**
     * Gets the value of the usernameAccount property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUsernameAccount() {
        return usernameAccount;
    }

    /**
     * Sets the value of the usernameAccount property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUsernameAccount(String value) {
        this.usernameAccount = value;
    }

}
