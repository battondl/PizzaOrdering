package com.revature.service;

import org.springframework.stereotype.Service;

import com.revature.daoImpl.UsersDaoImpl;
import com.revature.pojos.Users;

@Service
public class AuthService {

public Users validateUser(Users user){
	System.out.println("inside the AUTH");
		UsersDaoImpl udi=new UsersDaoImpl();
		
		Users validUser = null;
		
		validUser = (Users) udi.getUserByName(user.getUsername(), user.getPassword());
		System.out.println("the valid user: "+validUser);
		/*tx.commit();
		
		sess.close();
		*/
		return validUser;
	}

}
