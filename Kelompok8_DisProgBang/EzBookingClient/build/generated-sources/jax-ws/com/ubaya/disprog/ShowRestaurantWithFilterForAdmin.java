
package com.ubaya.disprog;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * &lt;p&gt;Java class for showRestaurantWithFilterForAdmin complex type.
 * 
 * &lt;p&gt;The following schema fragment specifies the expected content contained within this class.
 * 
 * &lt;pre&gt;
 * &amp;lt;complexType name="showRestaurantWithFilterForAdmin"&amp;gt;
 *   &amp;lt;complexContent&amp;gt;
 *     &amp;lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&amp;gt;
 *       &amp;lt;sequence&amp;gt;
 *         &amp;lt;element name="namaFilter" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="valueFilter" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="SortBy" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&amp;gt;
 *       &amp;lt;/sequence&amp;gt;
 *     &amp;lt;/restriction&amp;gt;
 *   &amp;lt;/complexContent&amp;gt;
 * &amp;lt;/complexType&amp;gt;
 * &lt;/pre&gt;
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "showRestaurantWithFilterForAdmin", propOrder = {
    "namaFilter",
    "valueFilter",
    "sortBy"
})
public class ShowRestaurantWithFilterForAdmin {

    protected String namaFilter;
    protected String valueFilter;
    @XmlElement(name = "SortBy")
    protected String sortBy;

    /**
     * Gets the value of the namaFilter property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNamaFilter() {
        return namaFilter;
    }

    /**
     * Sets the value of the namaFilter property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNamaFilter(String value) {
        this.namaFilter = value;
    }

    /**
     * Gets the value of the valueFilter property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getValueFilter() {
        return valueFilter;
    }

    /**
     * Sets the value of the valueFilter property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setValueFilter(String value) {
        this.valueFilter = value;
    }

    /**
     * Gets the value of the sortBy property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSortBy() {
        return sortBy;
    }

    /**
     * Sets the value of the sortBy property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSortBy(String value) {
        this.sortBy = value;
    }

}
