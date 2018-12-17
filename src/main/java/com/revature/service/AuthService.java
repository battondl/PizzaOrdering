package com.revature.service;

import org.springframework.stereotype.Service;

import com.revature.pojos.Users;
@Service
public class AuthService {

public Users validateUser(Users user){
		
		Users validUser = null;
		
		if ("radioftw".equals(user.getUsername()) && "howaboutgod".equals(user.getPassword())){
			validUser = user;
			validUser.setUsername("Jacob Somelastname");
		}
		
		return validUser;
		
	}
}
