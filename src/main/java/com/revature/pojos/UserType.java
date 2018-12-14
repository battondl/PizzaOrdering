package com.revature.pojos;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
/***************************************
 * Entity that connects to the USER_TYPE
 * table
 * 
 * ************************************/
@Entity
@Table(name="USER_TYPE")
public class UserType {
	/**************************************
	 * Type_ID
	 * 	number that identifies the id for what 
	 * 	role the user are
	 * has a OneToOne relation with the USERS table
	 * ***********************************/
	@Id
	@Column(name="type_id")
	private int typeId;
	/**************************************
	 * Name
	 * 
	 * 
	 * ***********************************/
	@Column(name="name")
	private String name;
	
	/*************************************
	 * GETERS AND SETTERS
	 * 
	 * **********************************/
	public int getTypeId() {
		return typeId;
	}
	public void setTypeId(int typeId) {
		this.typeId = typeId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public UserType() {
		super();
		// TODO Auto-generated constructor stub
	}
	public UserType(int typeId, String name) {
		super();
		this.typeId = typeId;
		this.name = name;
	}
	
	
}
