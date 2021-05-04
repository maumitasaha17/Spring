package com.cg.annotation;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

/*
 * @PostConstruct
 * @PreDestroy
 * @Component
 * @Scope("prototype")
 * @Autowired
 * @Qualifier
 * 
 * interface Address {}
 * class PermAddress implements Address{}
 * class TempAddress implements Address{}
 * 
 * @Autowired
 * @Qualifier("permAddress")
 * private Address address;
 * 
 */
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;


@Component("employeeComponent")
public class Employee {
	private int empId;
	private String empName;
	
	@Autowired
	private Address address; // Field Injection
	
	// Constructors
	public Employee() {}
	public Employee(int empId, String empName) {
		this.empId = empId;
		this.empName = empName;
	}
	public Employee(int empId, String empName, Address address) {
		this.empId = empId;
		this.empName = empName;
		this.address = address;
	}
	
	 
	public Employee(Address address) {
		this.address = address;
	}
	// Getters and Setters
	
	public int getEmpId() {
		return empId;
	}
	public void setEmpId(int empId) {
		this.empId = empId;
	}
	public String getEmpName() {
		return empName;
	}
	public void setEmpName(String empName) {
		this.empName = empName;
	}
	public Address getAddress() {
		return address;
	}
	
	public void setAddress(Address address) {
		this.address = address;
	}
	
	void setup() {
		System.out.println("setup method");
	}
	
	void destroy() {
		System.out.println("destroy method");
	}
	
	@PostConstruct
	public void init() {
		System.out.println("init method");
	}
	@PreDestroy
	public void destroy1() {
		System.out.println("destroy method");
	}
	@Override
	public String toString() {
		return "Employee [empId=" + empId + ", empName=" + empName + ", address=" + address + "]";
	}
}