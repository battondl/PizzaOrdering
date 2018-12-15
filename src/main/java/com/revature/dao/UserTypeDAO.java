package com.revature.dao;

import com.revature.pojos.UserType;

public interface UserTypeDAO {
	/*---------------------------------------------
	  * CRUD METHODS
	  * 
	  * -----------------------------------------*/
	     public void persist(UserType entity);
	     public void update(UserType entity) ;
	     public UserType findById(int id);
	     public void delete(UserType entity);
}
