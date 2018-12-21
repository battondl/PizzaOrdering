package com.revature.pojos;

import java.io.Serializable;

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
  *********************************************/
@Entity
@Table(name="ORDERS" , schema="pizza")
public class Orders implements Serializable{
	/************************************************
	 * serial Order_ID
	 * 	order id generated automatically
	 * 
	  *********************************************/
	@Id
	@Column(name="order_id")
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int orderId;
	/************************************************
	 * Customer_Number
	 * 	has a ManyToOne relation to the user_id on the USERS table
	 * @PrimaryKeyJoinColumn
	  *********************************************/
	@OneToOne
	@JoinColumn(name="user_id")
	private Users customerId;
	/************************************************
	 * Monetary_Total
	 * 	total amount of the order itself
	 * 	(don't we get this from the line item)
	  *********************************************/
	@Column(name="description")
	private String description;
	/************************************************
	 * Driver_ID
	 * 	id connected to the user table but no user is driver
	 * 	so its pointless
	  *********************************************/
	@Column(name="price")
	private double price;
	
	/************************************************
	 * GETTERS AND SETTERS
	 * 
	 * 
	  *********************************************/
	public int getOrderId() {
		return orderId;
	}
	public void setOrderId(int orderId) {
		this.orderId = orderId;
	}
	public Users getCustomerId() {
		return customerId;
	}
	public void setCustomerId(Users customerId) {
		this.customerId = customerId;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public Orders(int orderId, Users customerId, String description, double price) {
		super();
		this.orderId = orderId;
		this.customerId = customerId;
		this.description = description;
		this.price = price;
	}
	public Orders() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "Orders [orderId=" + orderId + ", customerId=" + customerId + ", description=" + description
				+ ", price=" + price + "]";
	}
	

	
	
	

}
