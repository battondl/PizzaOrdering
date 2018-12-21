package com.revature.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.revature.pojos.Orders;
import com.revature.service.AddingOrdersService;
import com.revature.util.TextMessaging;

@RestController
@CrossOrigin(origins = "*")
public class OrderListCtrl {

	@Autowired
	private AddingOrdersService aos;
	
	@PostMapping(path = "/menu")
	public void addingOrder(@RequestBody Orders order) {
		System.out.println("INSIDE THE POST for adding orders");
		System.out.println(order.toString());
		aos.addOrder(order);
		TextMessaging mt = new TextMessaging();
		String mess= "Hello "+order.getCustomerId().getFirstName()+
				", we are procesing your order of a "+order.getDescription()+" pizza now.";
		mt.sendMessage(mess,order.getCustomerId().getPhoneNumber());
		System.out.println("Done");
	}
}
