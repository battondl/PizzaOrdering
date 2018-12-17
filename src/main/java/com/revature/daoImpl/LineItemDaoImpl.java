package com.revature.daoImpl;

import org.hibernate.Session;

import com.revature.dao.LineItemDAO;
import com.revature.pojos.LineItem;
import com.revature.util.SessionUtil;

public class LineItemDaoImpl implements LineItemDAO{

	     public void persist(LineItem entity) {
	    	 Session sess = SessionUtil.getSession();
	         sess.save(entity);
	 
	     }
	     public void update(LineItem entity) {
	    	 Session sess = SessionUtil.getSession();
	         sess.update(entity);
	 
	     }
	 
	    public LineItem findById(int id) {
	    	 Session sess = SessionUtil.getSession();
	    	 LineItem us = (LineItem) sess.get(LineItem.class, id);
	         return us;
	 
	     }
	     public void delete(LineItem entity) {
	    	 Session sess = SessionUtil.getSession();
	         sess.delete(entity);
	 
	     }
}
