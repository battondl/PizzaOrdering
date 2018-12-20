package com.revature.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.revature.pojos.Users;
import com.revature.service.AuthService;


@RestController
@CrossOrigin(origins = "*")
public class LoginCtrl {

	@Autowired
	private AuthService authService;
	
	
	@RequestMapping(value="/login", method=RequestMethod.GET)
	public String loginGet(HttpSession sess){
		
		if (sess.getAttribute("user") != null){
			return "home";
		}
		
		return "login";
	}
	
	@PostMapping(path = "/login")
	public ResponseEntity<Users> loginPost(@RequestBody Users users) {
		System.out.println("INSIDE THE POST");
		System.out.println(users.toString());
		Users authUser = authService.validateUser(users);
		System.out.println(authUser);
		
		if(authUser != null) {
			return ResponseEntity.status(HttpStatus.ACCEPTED).body(users);
		}
		return ResponseEntity.status(HttpStatus.UNAUTHORIZED).body(null);
	}
	@PostMapping(path = "/createaccount")
	public void addingUser(@RequestBody Users users) {
		System.out.println("INSIDE THE POST for adding users");
		System.out.println(users.toString());
		authService.addUser(users);
		System.out.println("Done");
	}
}
