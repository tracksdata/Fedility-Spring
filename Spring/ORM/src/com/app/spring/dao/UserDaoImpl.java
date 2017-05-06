package com.app.spring.dao;

import javax.transaction.Transactional;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.app.spring.entities.User;

@Repository("userDao")
public class UserDaoImpl {

	
	@Autowired
	private SessionFactory sf;
	
	@Transactional
	public void saveUser(User user){
		Session ses=sf.getCurrentSession();
		ses.save(user);
		System.out.println("---- user Saved to DB");
	}
	
}
