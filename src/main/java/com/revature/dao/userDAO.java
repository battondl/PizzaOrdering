package com.revature.dao;

import org.hibernate.Session;

import com.revature.pojos.Users;
import com.revature.util.SessionUtil;

public class userDAO {
	/*---------------------------------------------
	  * CRUD METHODS
	  * 
	  * -----------------------------------------*/
	     public void persist(Users entity) {
	    	 Session sess = SessionUtil.getSession();
	         sess.save(entity);
	 
	     }
	     public void update(Users entity) {
	    	 Session sess = SessionUtil.getSession();
	         sess.update(entity);
	 
	     }
	 
	    public Users findById(int id) {
	    	 Session sess = SessionUtil.getSession();
	    	 Users us = (Users) sess.get(Users.class, id);
	         return us;
	 
	     }
	     public void delete(Users entity) {
	    	 Session sess = SessionUtil.getSession();
	         sess.delete(entity);
	 
	     }
}
