
package com.ubaya.disprog;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * &lt;p&gt;Java class for updateDataRestaurant complex type.
 * 
 * &lt;p&gt;The following schema fragment specifies the expected content contained within this class.
 * 
 * &lt;pre&gt;
 * &amp;lt;complexType name="updateDataRestaurant"&amp;gt;
 *   &amp;lt;complexContent&amp;gt;
 *     &amp;lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&amp;gt;
 *       &amp;lt;sequence&amp;gt;
 *         &amp;lt;element name="ownerName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="nama_resto" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="alamat" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="max_table" type="{http://www.w3.org/2001/XMLSchema}int"/&amp;gt;
 *         &amp;lt;element name="id_restaurant" type="{http://www.w3.org/2001/XMLSchema}int"/&amp;gt;
 *       &amp;lt;/sequence&amp;gt;
 *     &amp;lt;/restriction&amp;gt;
 *   &amp;lt;/complexContent&amp;gt;
 * &amp;lt;/complexType&amp;gt;
 * &lt;/pre&gt;
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "updateDataRestaurant", propOrder = {
    "ownerName",
    "namaResto",
    "alamat",
    "maxTable",
    "idRestaurant"
})
public class UpdateDataRestaurant {

    protected String ownerName;
    @XmlElement(name = "nama_resto")
    protected String namaResto;
    protected String alamat;
    @XmlElement(name = "max_table")
    protected int maxTable;
    @XmlElement(name = "id_restaurant")
    protected int idRestaurant;

    /**
     * Gets the value of the ownerName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOwnerName() {
        return ownerName;
    }

    /**
     * Sets the value of the ownerName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOwnerName(String value) {
        this.ownerName = value;
    }

    /**
     * Gets the value of the namaResto property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNamaResto() {
        return namaResto;
    }

    /**
     * Sets the value of the namaResto property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNamaResto(String value) {
        this.namaResto = value;
    }

    /**
     * Gets the value of the alamat property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAlamat() {
        return alamat;
    }

    /**
     * Sets the value of the alamat property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAlamat(String value) {
        this.alamat = value;
    }

    /**
     * Gets the value of the maxTable property.
     * 
     */
    public int getMaxTable() {
        return maxTable;
    }

    /**
     * Sets the value of the maxTable property.
     * 
     */
    public void setMaxTable(int value) {
        this.maxTable = value;
    }

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

}
