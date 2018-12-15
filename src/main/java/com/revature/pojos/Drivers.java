package com.revature.pojos;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

/************************************************
 * Entity that connects to the DRIVERS table
 * 
 * 
 * *********************************************/
@Entity
@Table(name="DRIVERS" , schema="pizza")
public class Drivers implements Serializable{
	/************************************************
	 * Driver_ID 
	 * 	number that has a OneToOne relation with the 
	 * 	USERS table (user_id)
	 * *********************************************/
	@Id
	@OneToOne
	@JoinColumn(name="user_id")
	private Users driverId;
	
	/************************************************
	 * Driver_Photo
	 * 
	 * 
	 * *********************************************/
	@Column(name="driver_photo")
	private String driverPhoto;
	
	/************************************************
	 * GETTERS AND SETTERS
	 * 
	 * 
	 * *********************************************/


	public Users getDriverId() {
		return driverId;
	}
	public String getDriverPhoto() {
		return driverPhoto;
	}
	public void setDriverPhoto(String driverPhoto) {
		this.driverPhoto = driverPhoto;
	}
	public void setDriverId(Users driverId) {
		this.driverId = driverId;
	}

	public Drivers() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Drivers(Users driverId, String driverPhoto) {
		super();
		this.driverId = driverId;
		this.driverPhoto = driverPhoto;
	}
	@Override
	public String toString() {
		return "Drivers [driverId=" + driverId + ", driverPhoto=" + driverPhoto + "]";
	}


	
}
