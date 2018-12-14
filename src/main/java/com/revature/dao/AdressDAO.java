package com.revature.dao;

import org.hibernate.Session;

import com.revature.pojos.Drivers;
import com.revature.util.SessionUtil;

public class AdressDAO {

	/*---------------------------------------------
	  * CRUD METHODS
	  * 
	  * -----------------------------------------*/
	     public void persist(Drivers entity) {
	    	 Session sess = SessionUtil.getSession();
	         sess.save(entity);
	 
	     }
	     public void update(Drivers entity) {
	    	 Session sess = SessionUtil.getSession();
	         sess.update(entity);
	 
	     }
	 
	    public Drivers findById(int id) {
	    	 Session sess = SessionUtil.getSession();
	    	 Drivers us = (Drivers) sess.get(Drivers.class, id);
	         return us;
	 
	     }
	     public void delete(Drivers entity) {
	    	 Session sess = SessionUtil.getSession();
	         sess.delete(entity);
	 
	     }
}
