package com.revature.daoImpl;

import org.hibernate.Session;
import org.hibernate.Transaction;

import com.revature.dao.OrdersDAO;
import com.revature.pojos.Orders;
import com.revature.util.SessionUtil;

public class OrdersDaoImpl implements OrdersDAO{

	     public void persist(Orders entity) {
	    	 Session sess = SessionUtil.getSession();
	    	 System.out.println("Session gotten!!!");
			 Transaction tx = sess.beginTransaction();
	         sess.save(entity);
	         tx.commit();
			 sess.close();
	 
	     }
	     public void update(Orders entity) {
	    	 Session sess = SessionUtil.getSession();
	         sess.update(entity);
	 
	     }
	 
	    public Orders findById(int id) {
	    	 Session sess = SessionUtil.getSession();
	    	 Orders us = (Orders) sess.get(Orders.class, id);
	         return us;
	 
	     }
	     public void delete(Orders entity) {
	    	 Session sess = SessionUtil.getSession();
	         sess.delete(entity);
	 
	     }
}
