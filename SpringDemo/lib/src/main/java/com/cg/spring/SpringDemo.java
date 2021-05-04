  
package com.cg.spring;
/*
 * Spring Framework
 *  To develop enterprise applications 
 *    J2ee/spring framework
 *    
 *  expensive
 *  complexity in development of application
 *  long time
 *  testing difficult
 *  1999
 *  
 *  Spring frames
 *  light weight framework - Pojo
 *  testing will be easy
 *  cheaper
 *  provides number of helper classes to develop application
 *  removes boiler plate code
 *  2004
 *  Rod Jhonson
 *  
 *  Spring Modules
  Data Access/Integration                  WEB (MVC)
  JDBC, ORM, OXM, JMS		        Web      Servlet
      Transactions                      Portlet  Struts
  (communicate with db)
  
   AOP              |        Aspects       |    Instrumentation
        - Add functionality to objects declaratively - Logging, Security, transactions etc., 
   -----------------------------------------------------------
                     Spring Core Container
   Core   |     Beans    |       Context           |    Expression language
        (IOC & DI)          (Internationalization)        
   -----------------------------------------------------------
   ____________________________________________________________
                         Test (Provides support testing JUnit/TestNG)			       
   ____________________________________________________________
 *  
 *  
 * Employee & Address
 *  class Employee {
 *  	private int id;
 *      private String name;
 *      
 *      Address address;
 *      // constructors
 *      // getters and setters
 *  
 *  }
 *  
 *  class Address {
 *     private int id;
 *     private String city;
 *  
 *     // constructors
 *     // getters and setters
 *  
 *  }
 *  
 *  class App {
 *  	public static void main(String[] args) {
 *  		Employee emp = new Employee();
 *          Address addr = new Address();
 *          emp.setId();
 *          emp.setName();
 *          emp.setAddr(addr);
 *          Employee emp = new Employee(address);
 *          
 *          
 *          addr.setCity();
 *          addr.setId();
 *          
 *          // Factory design - applicationContext.xml
 *          
 *          emp.setAddr(addr)
 *          emp.getAddr();
 *          
 *      }
 *  
 *  }
 * 
 */



public class SpringDemo {

	public static void main(String[] args) {
		

	}

}