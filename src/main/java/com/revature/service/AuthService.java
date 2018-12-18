package com.revature.service;

import org.hibernate.Session;
import org.hibernate.Transaction;
import org.springframework.stereotype.Service;

import com.revature.daoImpl.UsersDaoImpl;
import com.revature.pojos.Users;
import com.revature.util.SessionUtil;

@Service
public class AuthService {

public Users validateUser(Users user){
	
		UsersDaoImpl udi=new UsersDaoImpl();
		Users validUser = null;
		
		/*if ("radioftw".equals(user.getUsername()) && "howaboutgod".equals(user.getPassword())){
			validUser = user;
			validUser.setUsername("Jacob Somelastname");
		}*/
		Session sess = SessionUtil.getSession();
		System.out.println("Session gotten!!!");
		
		Transaction tx = sess.beginTransaction();
		System.out.println("Transaction started");
		
		validUser = (Users) udi.getUserByName(user.getUsername(), user.getPassword());
		System.out.println("the valid user: "+validUser);
		tx.commit();
		
		sess.close();
		
		return validUser;
		
	}
}
