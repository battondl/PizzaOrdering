package com.revature.service;

import org.springframework.stereotype.Service;

import com.revature.daoImpl.UsersDaoImpl;
import com.revature.pojos.Users;

@Service
public class AddingUsersService {
	
	public void addUser(Users user){
		System.out.println("inside the adding user");
			UsersDaoImpl udi=new UsersDaoImpl();
			Users validUser = user;
			System.out.println(validUser);
			udi.persist(user);

		}
}
