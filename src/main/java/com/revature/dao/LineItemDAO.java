package com.revature.dao;

import com.revature.pojos.LineItem;

public interface LineItemDAO {
	/*---------------------------------------------
	  * CRUD METHODS
	  * 
	  * -----------------------------------------*/
	     public void persist(LineItem entity);
	     public void update(LineItem entity);
	     public LineItem findById(int id);
	     public void delete(LineItem entity);
}
