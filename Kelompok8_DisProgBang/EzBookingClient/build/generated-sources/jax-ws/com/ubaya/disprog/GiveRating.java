
package com.ubaya.disprog;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * &lt;p&gt;Java class for give_rating complex type.
 * 
 * &lt;p&gt;The following schema fragment specifies the expected content contained within this class.
 * 
 * &lt;pre&gt;
 * &amp;lt;complexType name="give_rating"&amp;gt;
 *   &amp;lt;complexContent&amp;gt;
 *     &amp;lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&amp;gt;
 *       &amp;lt;sequence&amp;gt;
 *         &amp;lt;element name="id_reservasi" type="{http://www.w3.org/2001/XMLSchema}int"/&amp;gt;
 *         &amp;lt;element name="bintang" type="{http://www.w3.org/2001/XMLSchema}int"/&amp;gt;
 *       &amp;lt;/sequence&amp;gt;
 *     &amp;lt;/restriction&amp;gt;
 *   &amp;lt;/complexContent&amp;gt;
 * &amp;lt;/complexType&amp;gt;
 * &lt;/pre&gt;
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "give_rating", propOrder = {
    "idReservasi",
    "bintang"
})
public class GiveRating {

    @XmlElement(name = "id_reservasi")
    protected int idReservasi;
    protected int bintang;

    /**
     * Gets the value of the idReservasi property.
     * 
     */
    public int getIdReservasi() {
        return idReservasi;
    }

    /**
     * Sets the value of the idReservasi property.
     * 
     */
    public void setIdReservasi(int value) {
        this.idReservasi = value;
    }

    /**
     * Gets the value of the bintang property.
     * 
     */
    public int getBintang() {
        return bintang;
    }

    /**
     * Sets the value of the bintang property.
     * 
     */
    public void setBintang(int value) {
        this.bintang = value;
    }

}
