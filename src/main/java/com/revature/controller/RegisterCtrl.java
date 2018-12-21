package com.revature.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.revature.pojos.Users;
import com.revature.service.AddingUsersService;

@RestController
@CrossOrigin(origins = "*")
public class RegisterCtrl {
	
	@Autowired
	private AddingUsersService aus;
	
	@PostMapping(path = "/createaccount")
	public void addingUser(@RequestBody Users users) {
		System.out.println("INSIDE THE POST for adding users");
		System.out.println(users.toString());
		aus.addUser(users);
		System.out.println("Done");
	}
}
