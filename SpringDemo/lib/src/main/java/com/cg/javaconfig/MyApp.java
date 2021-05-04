package com.cg.javaconfig;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class MyApp {

	public static void main(String[] args) {
		
		AnnotationConfigApplicationContext context =
			      new AnnotationConfigApplicationContext(AppConfig.class);
		
		Employee emp = context.getBean("employee", Employee.class);
		Address addr = context.getBean("address", Address.class);
		emp.setEmpId(10001);
		emp.setEmpName("Sam");
		System.out.println(emp.getEmpId());
		System.out.println(emp.getEmpName());
		addr.setId(20001);
		addr.setCity("Chennai");
		System.out.println(emp.getAddress());
				
		
	}
}