package com.revature.driver;

import org.hibernate.Session;
import org.hibernate.Transaction;

import com.revature.pojos.Orders;
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
		
		/*Users nu = new Users(0, "David", "Batton", "hippie", "hippie", "5204836069",
				"hippie@email.com", false, "123-hippie street");
		
		sess.save(nu);
		
		Users nu2 = new Users(0, "Zxander", "Rodriguez", "blorg", "password", "7874479811",
				"zd@live.com", false, "126-tttt-pppp");
		
		sess.save(nu2);*/
		

		/*UserType ut1= sess.get(UserType.class, 1);
		System.out.println("UserType: " + ut1);*/
		
		/////////////////////////////////////////////////////////
		/*Users rand = sess.get(Users.class, 10);
		
		Orders o = new Orders(0, rand, "one pizza", 10.99);
		
		sess.save(o);
		
		System.out.println("order" + o);*/
		
		/*Orders o = sess.get(Orders.class, 1);
		System.out.println("order" + o);*/
		
		tx.commit();
		
		sess.close();

	}

}
