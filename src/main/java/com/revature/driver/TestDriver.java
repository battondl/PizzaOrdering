package com.revature.driver;

import org.hibernate.Session;
import org.hibernate.Transaction;

import com.revature.pojos.UserType;
import com.revature.pojos.Users;
import com.revature.util.SessionUtil;

public class TestDriver {

	public static void main(String[] args) {
		
		Session sess = SessionUtil.getSession();
		System.out.println("Session gotten!!!");
		
		Transaction tx = sess.beginTransaction();
		System.out.println("Transaction started");
		

		/*UserType ut=new UserType(1, "customer");
		Integer newUT= (Integer) sess.save(ut);
		
		Users nu = new Users(1, "firstGuy", "lastname", "NumOne", "password", ut,
				"123-456-7891", "firstGuy@gmail.com", false);
		System.out.println("User: "+ nu);
		
		
		Integer newId = (Integer) sess.save(nu);*/
		
		
		Users u = sess.get(Users.class, 2);

		
		System.out.println(u);
		
		
		
		/*UserType ut= sess.get(UserType.class, 1);
		System.out.println("UserType: " + ut);*/
		
		tx.commit();
		
		sess.close();

	}

}
