
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
 *         &lt;element name="username" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="idnum" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="sex" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="nation" type="{http://www.w3.org/2001/XMLSchema}string"/>
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
@XmlType(name = "", propOrder = { "servicecode", "time", "sign", "username", "idnum", "sex", "nation", "datatype" })
@XmlRootElement(name = "valiidcard")
public class Valiidcard {

	@XmlElement(required = true, nillable = true)
	protected String servicecode;
	@XmlElement(required = true, nillable = true)
	protected String time;
	@XmlElement(required = true, nillable = true)
	protected String sign;
	@XmlElement(required = true, nillable = true)
	protected String username;
	@XmlElement(required = true, nillable = true)
	protected String idnum;
	@XmlElement(required = true, nillable = true)
	protected String sex;
	@XmlElement(required = true, nillable = true)
	protected String nation;
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
	 * Gets the value of the username property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getUsername() {
		return username;
	}

	/**
	 * Sets the value of the username property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setUsername(String value) {
		this.username = value;
	}

	/**
	 * Gets the value of the idnum property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getIdnum() {
		return idnum;
	}

	/**
	 * Sets the value of the idnum property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setIdnum(String value) {
		this.idnum = value;
	}

	/**
	 * Gets the value of the sex property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getSex() {
		return sex;
	}

	/**
	 * Sets the value of the sex property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setSex(String value) {
		this.sex = value;
	}

	/**
	 * Gets the value of the nation property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getNation() {
		return nation;
	}

	/**
	 * Sets the value of the nation property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setNation(String value) {
		this.nation = value;
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
