
package com.ubaya.disprog;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * &lt;p&gt;Java class for restaurant complex type.
 * 
 * &lt;p&gt;The following schema fragment specifies the expected content contained within this class.
 * 
 * &lt;pre&gt;
 * &amp;lt;complexType name="restaurant"&amp;gt;
 *   &amp;lt;complexContent&amp;gt;
 *     &amp;lt;extension base="{http://disprog.ubaya.com/}myModel"&amp;gt;
 *       &amp;lt;sequence&amp;gt;
 *         &amp;lt;element name="alamatRestaurant" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="id" type="{http://www.w3.org/2001/XMLSchema}int"/&amp;gt;
 *         &amp;lt;element name="max_table" type="{http://www.w3.org/2001/XMLSchema}int"/&amp;gt;
 *         &amp;lt;element name="namaPemilik" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="namaRestaurant" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="totalBintang" type="{http://www.w3.org/2001/XMLSchema}int"/&amp;gt;
 *         &amp;lt;element name="total_Pelanggan" type="{http://www.w3.org/2001/XMLSchema}int"/&amp;gt;
 *         &amp;lt;element name="usernameRestaurant" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&amp;gt;
 *       &amp;lt;/sequence&amp;gt;
 *     &amp;lt;/extension&amp;gt;
 *   &amp;lt;/complexContent&amp;gt;
 * &amp;lt;/complexType&amp;gt;
 * &lt;/pre&gt;
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "restaurant", propOrder = {
    "alamatRestaurant",
    "id",
    "maxTable",
    "namaPemilik",
    "namaRestaurant",
    "totalBintang",
    "totalPelanggan",
    "usernameRestaurant"
})
public class Restaurant
    extends MyModel
{

    protected String alamatRestaurant;
    protected int id;
    @XmlElement(name = "max_table")
    protected int maxTable;
    protected String namaPemilik;
    protected String namaRestaurant;
    protected int totalBintang;
    @XmlElement(name = "total_Pelanggan")
    protected int totalPelanggan;
    protected String usernameRestaurant;

    /**
     * Gets the value of the alamatRestaurant property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAlamatRestaurant() {
        return alamatRestaurant;
    }

    /**
     * Sets the value of the alamatRestaurant property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAlamatRestaurant(String value) {
        this.alamatRestaurant = value;
    }

    /**
     * Gets the value of the id property.
     * 
     */
    public int getId() {
        return id;
    }

    /**
     * Sets the value of the id property.
     * 
     */
    public void setId(int value) {
        this.id = value;
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
     * Gets the value of the namaPemilik property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNamaPemilik() {
        return namaPemilik;
    }

    /**
     * Sets the value of the namaPemilik property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNamaPemilik(String value) {
        this.namaPemilik = value;
    }

    /**
     * Gets the value of the namaRestaurant property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNamaRestaurant() {
        return namaRestaurant;
    }

    /**
     * Sets the value of the namaRestaurant property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNamaRestaurant(String value) {
        this.namaRestaurant = value;
    }

    /**
     * Gets the value of the totalBintang property.
     * 
     */
    public int getTotalBintang() {
        return totalBintang;
    }

    /**
     * Sets the value of the totalBintang property.
     * 
     */
    public void setTotalBintang(int value) {
        this.totalBintang = value;
    }

    /**
     * Gets the value of the totalPelanggan property.
     * 
     */
    public int getTotalPelanggan() {
        return totalPelanggan;
    }

    /**
     * Sets the value of the totalPelanggan property.
     * 
     */
    public void setTotalPelanggan(int value) {
        this.totalPelanggan = value;
    }

    /**
     * Gets the value of the usernameRestaurant property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUsernameRestaurant() {
        return usernameRestaurant;
    }

    /**
     * Sets the value of the usernameRestaurant property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUsernameRestaurant(String value) {
        this.usernameRestaurant = value;
    }

}
