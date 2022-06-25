
package com.ubaya.disprog;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * &lt;p&gt;Java class for UpdateReport complex type.
 * 
 * &lt;p&gt;The following schema fragment specifies the expected content contained within this class.
 * 
 * &lt;pre&gt;
 * &amp;lt;complexType name="UpdateReport"&amp;gt;
 *   &amp;lt;complexContent&amp;gt;
 *     &amp;lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&amp;gt;
 *       &amp;lt;sequence&amp;gt;
 *         &amp;lt;element name="account_username" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="id_resto" type="{http://www.w3.org/2001/XMLSchema}int"/&amp;gt;
 *         &amp;lt;element name="qualityOfService" type="{http://www.w3.org/2001/XMLSchema}double"/&amp;gt;
 *         &amp;lt;element name="food_quality" type="{http://www.w3.org/2001/XMLSchema}double"/&amp;gt;
 *         &amp;lt;element name="review" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&amp;gt;
 *       &amp;lt;/sequence&amp;gt;
 *     &amp;lt;/restriction&amp;gt;
 *   &amp;lt;/complexContent&amp;gt;
 * &amp;lt;/complexType&amp;gt;
 * &lt;/pre&gt;
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "UpdateReport", propOrder = {
    "accountUsername",
    "idResto",
    "qualityOfService",
    "foodQuality",
    "review"
})
public class UpdateReport {

    @XmlElement(name = "account_username")
    protected String accountUsername;
    @XmlElement(name = "id_resto")
    protected int idResto;
    protected double qualityOfService;
    @XmlElement(name = "food_quality")
    protected double foodQuality;
    protected String review;

    /**
     * Gets the value of the accountUsername property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAccountUsername() {
        return accountUsername;
    }

    /**
     * Sets the value of the accountUsername property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAccountUsername(String value) {
        this.accountUsername = value;
    }

    /**
     * Gets the value of the idResto property.
     * 
     */
    public int getIdResto() {
        return idResto;
    }

    /**
     * Sets the value of the idResto property.
     * 
     */
    public void setIdResto(int value) {
        this.idResto = value;
    }

    /**
     * Gets the value of the qualityOfService property.
     * 
     */
    public double getQualityOfService() {
        return qualityOfService;
    }

    /**
     * Sets the value of the qualityOfService property.
     * 
     */
    public void setQualityOfService(double value) {
        this.qualityOfService = value;
    }

    /**
     * Gets the value of the foodQuality property.
     * 
     */
    public double getFoodQuality() {
        return foodQuality;
    }

    /**
     * Sets the value of the foodQuality property.
     * 
     */
    public void setFoodQuality(double value) {
        this.foodQuality = value;
    }

    /**
     * Gets the value of the review property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReview() {
        return review;
    }

    /**
     * Sets the value of the review property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReview(String value) {
        this.review = value;
    }

}
