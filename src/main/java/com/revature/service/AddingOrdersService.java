package com.revature.service;

import org.springframework.stereotype.Service;

import com.revature.daoImpl.OrdersDaoImpl;
import com.revature.pojos.Orders;

@Service
public class AddingOrdersService {

	public void addOrder(Orders order) {
		// TODO Auto-generated method stub
		System.out.println("inside the adding user");
		OrdersDaoImpl udi=new OrdersDaoImpl();
		Orders theOrder = order;
		System.out.println(theOrder);
		udi.persist(theOrder);

	}

}
