package com.product.dao;

import javax.transaction.Transactional;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.product.entities.Employee;

@Repository("emp")
public class EmployeeDaoImpl {

	@Autowired
	private SessionFactory sessionFactory;

	// @Transactional
	public void saveEmployee(Employee emp) {
		Session ses = sessionFactory.openSession();

		ses.save(emp);
		
		System.out.println("--- Emp Saved");
	}

}
