package com.revature.dao;

import com.revature.pojos.Orders;

public interface OrdersDAO {

	/*---------------------------------------------
	  * CRUD METHODS
	  * 
	  * -----------------------------------------*/
	     public void persist(Orders entity) ;
	     public void update(Orders entity) ;
	     public Orders findById(int id) ;
	     public void delete(Orders entity) ;
}
