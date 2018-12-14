package com.revature.pojos;

import java.awt.Image;

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
@Table(name="DRIVERS")
public class Drivers {
	/************************************************
	 * Driver_ID 
	 * 	number that has a OneToOne relation with the 
	 * 	USERS table (user_id)
	 * *********************************************/
	@Id
	@OneToOne
	@JoinColumn(name="user_id")
	private int driverId;
	
	/************************************************
	 * Driver_Photo
	 * 
	 * 
	 * *********************************************/
	@Column(name="driver_photo")
	private Image driverPhoto;
	
	/************************************************
	 * GETTERS AND SETTERS
	 * 
	 * 
	 * *********************************************/
	public int getDriverId() {
		return driverId;
	}
	public void setDriverId(int driverId) {
		this.driverId = driverId;
	}
	public Image getDriverPhoto() {
		return driverPhoto;
	}
	public void setDriverPhoto(Image driverPhoto) {
		this.driverPhoto = driverPhoto;
	}
	public Drivers() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Drivers(int driverId, Image driverPhoto) {
		super();
		this.driverId = driverId;
		this.driverPhoto = driverPhoto;
	}
	
	
}
