package com.revature.pojos;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
/****************************************
 * Entity that connects to the ADRESS table
 * 
 ************************************** */
@Entity
@Table(name="ADRESS" , schema="pizza")
public class Adress {
	/****************************************
	 * ID of the address
	 * in the DB is a serial we should not mess with it
	 * 
	 ************************************** */
	@Id
	@Column(name="adress_id")
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int adressId;
	
	/****************************************
	 * Country
	 * 
	 ************************************** */
	@Column(name="country")
	private String country;
	
	/****************************************
	 * State
	 * 
	 ************************************** */
	@Column(name="state")
	private String state;
	
	/****************************************
	 * City
	 * 
	 ************************************** */
	@Column(name="city")
	private String city;
	
	/****************************************
	 * Address Line 
	 * 
	 ************************************** */
	@Column(name="adress_line")
	private String adressLine;
	
	/****************************************
	 * Address Line 2
	 * 
	 ************************************** */
	@Column(name="adress_line_2")
	private String adressLine2;
	
	/****************************************
	 * Zip code
	 * 
	 ************************************** */
	@Column(name="zip")
	private String zipcode;
	
	/****************************************
	 * User_id
	 * 	has a ManyToOne relationship to the USER table
	 * to the userId primary key
	 ************************************** */
	@ManyToOne
	@JoinColumn(name="user_id")
	private Users userId;
	
	/****************************************
	 * GETTERS AND SETTERS
	 * 
	 ************************************** */
	public int getAdressId() {
		return adressId;
	}
	public void setAdressId(int adressId) {
		this.adressId = adressId;
	}
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getAdressLine() {
		return adressLine;
	}
	public void setAdressLine(String adressLine) {
		this.adressLine = adressLine;
	}
	public String getAdressLine2() {
		return adressLine2;
	}
	public void setAdressLine2(String adressLine2) {
		this.adressLine2 = adressLine2;
	}
	public String getZipcode() {
		return zipcode;
	}
	public void setZipcode(String zipcode) {
		this.zipcode = zipcode;
	}

	public Users getUserId() {
		return userId;
	}
	public void setUserId(Users userId) {
		this.userId = userId;
	}
	public Adress() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Adress(int adressId, String country, String state, String city, String adressLine, String adressLine2,
			String zipcode, Users userId) {
		super();
		this.adressId = adressId;
		this.country = country;
		this.state = state;
		this.city = city;
		this.adressLine = adressLine;
		this.adressLine2 = adressLine2;
		this.zipcode = zipcode;
		this.userId = userId;
	}
	@Override
	public String toString() {
		return "Adress [adressId=" + adressId + ", country=" + country + ", state=" + state + ", city=" + city
				+ ", adressLine=" + adressLine + ", adressLine2=" + adressLine2 + ", zipcode=" + zipcode + ", userId="
				+ userId + "]";
	}

	
	
}
