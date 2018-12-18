package com.revature.daoImpl;

import java.util.List;

import javax.persistence.Query;

import org.hibernate.Session;

import com.revature.dao.UsersDAO;
import com.revature.pojos.Users;
import com.revature.util.SessionUtil;

public class UsersDaoImpl implements UsersDAO{

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
	     
	     
	     public Users getUserByName(String name, String password) {
	    	 Users user =null;
	    	 Session sess = SessionUtil.getSession();
	    	 Query query= sess.createQuery("FROM Users u where u.username= :usP and u.password= :pasP");
	    	 query.setParameter("usP", name);
	    	 query.setParameter("pasP", password);
	    	 user =(Users) query.getSingleResult();
	    	 System.out.println(user);
			return user;
	    	 
	     }
}
