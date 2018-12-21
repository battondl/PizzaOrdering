package com.revature.pojos;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;;
/******************************************
 * User Object that connects to the USERS table
 * 
  ****************************************/
@Entity
@Table(name="USERS", schema="pizza")
public class Users {
	/******************************************
	 * ID of the user 
	 * in the DB is a serial we should not mess with it
	 * has a Relation to ORDERS, DRIVERS and ADRESS
	  ***************************************/
	@Id
	@Column(name="user_id")
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int userId;
	
	/******************************************
	 * First Name
	 * 	
	  ***************************************/
	@Column(name="first_name")
	private String firstName;
	
	/******************************************
	 * Last Name
	 * 
	  ***************************************/
	@Column(name="last_name")
	private String lastName;
	
	/******************************************
	 * User_Name
	 * 	has unique constraint on the DB
	  ***************************************/
	@Column(name="username")
	private String username;
	
	/******************************************
	 * Password
	 * 
	  ***************************************/
	@Column(name="password")
	private String password;
	

	
	/******************************************
	 * Phone_Number
	 * 
	  ***************************************/
	@Column(name="phonenumber")
	private String phoneNumber;
	
	/******************************************
	 * email
	 * 
	  ***************************************/
	@Column(name="email")
	private String email;
	
	/******************************************
	 * isDriver
	 * 	a OneToMany connection to the 
	  ***************************************/
	@Column(name="is_driver")
	private boolean isDriver;
	
	@Column(name="address")
	private String address;

	
	/*******************************************
	 * GETTERS AND SETTERS
	 * 
	  ****************************************/
	public int getUserId() {
		return userId;
	}

	public void setUserId(int userId) {
		this.userId = userId;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}



	public String getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}


	public boolean isDriver() {
		return isDriver;
	}

	public void setDriver(boolean isDriver) {
		this.isDriver = isDriver;
	}
	

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public Users() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Users(int userId, String firstName, String lastName, String username, String password, String phoneNumber,
			String email, boolean isDriver, String address) {
		super();
		this.userId = userId;
		this.firstName = firstName;
		this.lastName = lastName;
		this.username = username;
		this.password = password;
		this.phoneNumber = phoneNumber;
		this.email = email;
		this.isDriver = isDriver;
		this.address = address;
	}

	@Override
	public String toString() {
		return "Users [userId=" + userId + ", firstName=" + firstName + ", lastName=" + lastName + ", username="
				+ username + ", password=" + password + ", phoneNumber=" + phoneNumber + ", email=" + email
				+ ", isDriver=" + isDriver + ", address=" + address + "]";
	}








	
	
	

}
