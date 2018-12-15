package com.revature.pojos;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
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
@Table(name="ORDERS" , schema="pizza")
public class Orders {
	/************************************************
	 * serial Order_ID
	 * 
	 * 
	 * *********************************************/
	@Id
	@Column(name="order_id")
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int orderId;
	/************************************************
	 * Customer_Number
	 * 	has a OneToOne relation to the USERS table
	 * 
	 * *********************************************/
	@OneToOne
	@JoinColumn(name="user_id")
	private Users customerNumber;
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

	public Users getCustomerNumber() {
		return customerNumber;
	}
	public void setCustomerNumber(Users customerNumber) {
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
	public Orders(int orderId, Users customerNumber, double moneyTotal, int driverId) {
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
