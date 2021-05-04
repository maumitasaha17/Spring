package com.cg.spring;

/*
 * SpringContainer -
 *    responsible for creating and maintaining objects
 *    Injecting dependencies
 *    
 * Ways to configure Spring Container
 *   1. using xml
 *   2. Annotation
 *   3. Java config
 *   
 * DI types:
 * 1. Constructor Injection (<constructor-arg value="" type="">)
 * 2. Setter Injection <property name="" value="">
 * 
 * how to read input from the properties file
 * 
 * **Bean scope
 * singleton - single shared instance of the bean
 * prototype - creates new instance for each container request
 * request - scoped to an HTTP web request. used for web apps
 * session - scoped to http we session. used for web apps
 * global-session - scoped to global http web session. used for web apps
 * 
 * 
 ***Bean Lifecyle
 * Container started 
 *  -> bean instantiated
 *    -> Dependencies Injected
 *      -> Internal spring processing
 *          -> custom Init method - calling business logic
 *             -> bean is ready to use
 *                -> container shutdown
 *                     -> custom destroy method - cleanup activity
 *                        -> stop
 * 
 */
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MyApp {

	public static void main(String[] args) {
		// Load the configuration into the SpringContainer/ApplicationContext
		ClassPathXmlApplicationContext context = 
			    new ClassPathXmlApplicationContext("applicationContext.xml");
		// Retrieve beans from the container
		Employee emp = context.getBean("empbean", Employee.class);
		Employee emp1 = context.getBean("empbean", Employee.class);
		
		System.out.println(emp==emp1); // true
		// Using beans, to perform various operation
		System.out.print(emp.getEmpName() + " ");
		System.out.print(emp.getEmpId() + " ");
		System.out.print(emp.getAddress() +" ");
		
		
		System.out.println();
		System.out.print(emp1.getEmpName() + " ");
		System.out.print(emp1.getEmpId() + " ");
		System.out.print(emp1.getAddress()+" ");
		
		
		
		// close
		context.close();

	}

}