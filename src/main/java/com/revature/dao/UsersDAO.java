package com.revature.dao;

import com.revature.pojos.Users;

public interface UsersDAO {
	/*---------------------------------------------
	  * CRUD METHODS
	  * 
	  * -----------------------------------------*/
	     public void persist(Users entity);
	     public void update(Users entity);
	     public Users findById(int id);
	     public void delete(Users entity);
}
