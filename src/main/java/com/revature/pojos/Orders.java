package com.revature.pojos;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;
/************************************************
 * Entity that connects to the ORDERS table
 * 
 * 
 * *********************************************/
@Entity
@Table(name="ORDERS")
public class Orders {
	/************************************************
	 * serial Order_ID
	 * 
	 * 
	 * *********************************************/
	@Id
	@Column(name="order_id")
	private int orderId;
	/************************************************
	 * Customer_Number
	 * 	has a OneToOne relation to the USERS table
	 * 
	 * *********************************************/
	@OneToOne
	@JoinColumn(name="user_id")
	private int customerNumber;
	/************************************************
	 * Monetary_Total
	 * 
	 * 
	 * *********************************************/
	@Column(name="monetary_total")
	private double moneyTotal;
	/************************************************
	 * Driver_ID
	 * 
	 * 
	 * *********************************************/
	@Column(name="driver_id")
	private int driverId;
	
	/************************************************
	 * GETTERS AND SETTERS
	 * 
	 * 
	 * *********************************************/
	public int getOrderId() {
		return orderId;
	}
	public void setOrderId(int orderId) {
		this.orderId = orderId;
	}
	public int getCustomerNumber() {
		return customerNumber;
	}
	public void setCustomerNumber(int customerNumber) {
		this.customerNumber = customerNumber;
	}
	public double getMoneyTotal() {
		return moneyTotal;
	}
	public void setMoneyTotal(double moneyTotal) {
		this.moneyTotal = moneyTotal;
	}
	public int getDriverId() {
		return driverId;
	}
	public void setDriverId(int driverId) {
		this.driverId = driverId;
	}
	public Orders() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Orders(int orderId, int customerNumber, double moneyTotal, int driverId) {
		super();
		this.orderId = orderId;
		this.customerNumber = customerNumber;
		this.moneyTotal = moneyTotal;
		this.driverId = driverId;
	}
	@Override
	public String toString() {
		return "Orders [orderId=" + orderId + ", customerNumber=" + customerNumber + ", moneyTotal=" + moneyTotal
				+ ", driverId=" + driverId + "]";
	}
	
	

}
