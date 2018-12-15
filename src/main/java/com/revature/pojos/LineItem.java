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
 * Entity that connects to the LINE_ITEM table
 * 
 * 
 * *********************************************/
@Entity
@Table(name="LINE_ITEM" , schema="pizza")
public class LineItem {
	/************************************************
	 * Line_Item_ID
	 * 	a serial id, don't mess with it
	 * 
	 * *********************************************/
	@Id
	@Column(name="line_item_id")
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int lineItemId;
	
	/************************************************
	 * Order_ID
	 * 	numeric value that has a OneToOne relation to
	 * 	the ORDERS table
	 * *********************************************/
	@OneToOne
	@JoinColumn(name="order_id")
	private Orders orderId;
	
	/************************************************
	 * Order_Description
	 * 
	 * 
	 * *********************************************/
	@Column(name="order_description")
	private String orderDescription;
	
	/************************************************
	 * Quantity
	 * 
	 * 
	 * *********************************************/
	@Column(name="quantity")
	private int quantity;
	
	/************************************************
	 * Price
	 * 
	 * 
	 * *********************************************/
	@Column(name="price")
	private double price;
	
	
	/************************************************
	 * GETTERS AND SETTERS
	 * 
	 * 
	 * *********************************************/
	public String getOrderDescription() {
		return orderDescription;
	}
	public void setOrderDescription(String orderDescription) {
		this.orderDescription = orderDescription;
	}
	public int getLineItemId() {
		return lineItemId;
	}
	public void setLineItemId(int lineItemId) {
		this.lineItemId = lineItemId;
	}

	public Orders getOrderId() {
		return orderId;
	}
	public void setOrderId(Orders orderId) {
		this.orderId = orderId;
	}
	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public LineItem() {
		super();
		// TODO Auto-generated constructor stub
	}
	public LineItem(int lineItemId, Orders orderId, String orderDescription, int quantity, double price) {
		super();
		this.lineItemId = lineItemId;
		this.orderId = orderId;
		this.orderDescription = orderDescription;
		this.quantity = quantity;
		this.price = price;
	}
	@Override
	public String toString() {
		return "LineItem [lineItemId=" + lineItemId + ", orderId=" + orderId + ", orderDescription=" + orderDescription
				+ ", quantity=" + quantity + ", price=" + price + "]";
	}

	
	
	
}
