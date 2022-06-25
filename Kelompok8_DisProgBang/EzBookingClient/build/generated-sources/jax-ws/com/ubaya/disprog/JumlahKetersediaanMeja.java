
package com.ubaya.disprog;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * &lt;p&gt;Java class for jumlahKetersediaanMeja complex type.
 * 
 * &lt;p&gt;The following schema fragment specifies the expected content contained within this class.
 * 
 * &lt;pre&gt;
 * &amp;lt;complexType name="jumlahKetersediaanMeja"&amp;gt;
 *   &amp;lt;complexContent&amp;gt;
 *     &amp;lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&amp;gt;
 *       &amp;lt;sequence&amp;gt;
 *         &amp;lt;element name="idRestaurant" type="{http://www.w3.org/2001/XMLSchema}int"/&amp;gt;
 *         &amp;lt;element name="tanggal_pesan" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&amp;gt;
 *       &amp;lt;/sequence&amp;gt;
 *     &amp;lt;/restriction&amp;gt;
 *   &amp;lt;/complexContent&amp;gt;
 * &amp;lt;/complexType&amp;gt;
 * &lt;/pre&gt;
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "jumlahKetersediaanMeja", propOrder = {
    "idRestaurant",
    "tanggalPesan"
})
public class JumlahKetersediaanMeja {

    protected int idRestaurant;
    @XmlElement(name = "tanggal_pesan")
    protected String tanggalPesan;

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
     * Gets the value of the tanggalPesan property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTanggalPesan() {
        return tanggalPesan;
    }

    /**
     * Sets the value of the tanggalPesan property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTanggalPesan(String value) {
        this.tanggalPesan = value;
    }

}
