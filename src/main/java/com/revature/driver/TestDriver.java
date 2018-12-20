package com.revature.driver;

import org.hibernate.Session;
import org.hibernate.Transaction;

import com.revature.pojos.Users;
import com.revature.util.SessionUtil;

public class TestDriver {

 public static void main(String[] args) {
		
		Session sess = SessionUtil.getSession();
		System.out.println("Session gotten!!!");
		
		Transaction tx = sess.beginTransaction();
		System.out.println("Transaction started");
		

		/*UserType ut=new UserType(1, "customer");
		Integer newUT= (Integer) sess.save(ut);*/
		
		/*Users nu = new Users(3, "haaa", "boooo", "habo", "boha", "7897456645",
				"uhi@", false, "dasfaf");
		System.out.println("User: "+ nu);
		
		
		Integer newId = (Integer) sess.save(nu);*/
		
		
		Users u = sess.get(Users.class, 3);

		
		System.out.println(u);

		
		
		
		
		/*UserType ut1= sess.get(UserType.class, 1);
		System.out.println("UserType: " + ut1);*/
		
		tx.commit();
		
		sess.close();

	}

}
