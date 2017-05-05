package com;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component("app")
public class App {

	@Autowired
	@Qualifier(value="c2")
	private MyInter mi;
	public void myData(){
		System.out.println("--- App myData initialized");
		mi.getInfo();
	}
	
}