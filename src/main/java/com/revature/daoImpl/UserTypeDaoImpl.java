package com.revature.daoImpl;

import org.hibernate.Session;

import com.revature.dao.UserTypeDAO;
import com.revature.pojos.UserType;
import com.revature.util.SessionUtil;

public class UserTypeDaoImpl implements UserTypeDAO{
	/*---------------------------------------------
	  * CRUD METHODS
	  * 
	  * -----------------------------------------*/
	     public void persist(UserType entity) {
	    	 Session sess = SessionUtil.getSession();
	         sess.save(entity);
	 
	     }
	     public void update(UserType entity) {
	    	 Session sess = SessionUtil.getSession();
	         sess.update(entity);
	 
	     }
	 
	    public UserType findById(int id) {
	    	 Session sess = SessionUtil.getSession();
	    	 UserType us = (UserType) sess.get(UserType.class, id);
	         return us;
	 
	     }
	     public void delete(UserType entity) {
	    	 Session sess = SessionUtil.getSession();
	         sess.delete(entity);
	     }
}
