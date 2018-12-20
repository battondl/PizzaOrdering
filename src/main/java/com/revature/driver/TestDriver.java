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
		Integer newUT= (Integer) sess.save(ut);
		
		Users nu = new Users(0, "", String lastName, String username, String password, String phoneNumber,
				String email, boolean isDriver, String adress);
		System.out.println("User: "+ nu);
		
		
		Integer newId = (Integer) sess.save(nu);*/
		
		
		Users u = sess.get(Users.class, 0);
		Users u2 = sess.get(Users.class, 1);
		Users u3 = sess.get(Users.class, 2);
		Users u4 = sess.get(Users.class, 3);
		
		System.out.println(u);
		System.out.println(u2);
		
		System.out.println(u3);
		
		System.out.println(u4);
		
		
		
		
		/*UserType ut1= sess.get(UserType.class, 1);
		System.out.println("UserType: " + ut1);*/
		
		tx.commit();
		
		sess.close();

	}

}
