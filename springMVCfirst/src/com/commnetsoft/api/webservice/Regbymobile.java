
package com.commnetsoft.api.webservice;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

/**
 * <p>
 * Java class for anonymous complex type.
 * 
 * <p>
 * The following schema fragment specifies the expected content contained within
 * this class.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="servicecode" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="time" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="sign" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="mobilephone" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="datatype" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = { "servicecode", "time", "sign", "mobilephone", "datatype" })
@XmlRootElement(name = "regbymobile")
public class Regbymobile {

	@XmlElement(required = true, nillable = true)
	protected String servicecode;
	@XmlElement(required = true, nillable = true)
	protected String time;
	@XmlElement(required = true, nillable = true)
	protected String sign;
	@XmlElement(required = true, nillable = true)
	protected String mobilephone;
	@XmlElement(required = true, nillable = true)
	protected String datatype;

	/**
	 * Gets the value of the servicecode property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getServicecode() {
		return servicecode;
	}

	/**
	 * Sets the value of the servicecode property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setServicecode(String value) {
		this.servicecode = value;
	}

	/**
	 * Gets the value of the time property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getTime() {
		return time;
	}

	/**
	 * Sets the value of the time property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setTime(String value) {
		this.time = value;
	}

	/**
	 * Gets the value of the sign property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getSign() {
		return sign;
	}

	/**
	 * Sets the value of the sign property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setSign(String value) {
		this.sign = value;
	}

	/**
	 * Gets the value of the mobilephone property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getMobilephone() {
		return mobilephone;
	}

	/**
	 * Sets the value of the mobilephone property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setMobilephone(String value) {
		this.mobilephone = value;
	}

	/**
	 * Gets the value of the datatype property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getDatatype() {
		return datatype;
	}

	/**
	 * Sets the value of the datatype property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setDatatype(String value) {
		this.datatype = value;
	}

}
