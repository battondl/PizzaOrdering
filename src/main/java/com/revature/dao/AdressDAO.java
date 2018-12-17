package com.revature.dao;

import com.revature.pojos.Drivers;

public interface AdressDAO {

	     public void persist(Drivers entity);
	     public void update(Drivers entity) ;
	     public Drivers findById(int id);
	     public void delete(Drivers entity);
}
