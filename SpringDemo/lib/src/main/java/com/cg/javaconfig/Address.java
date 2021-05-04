package com.cg.javaconfig;


public class Address { 
	// Fields
	private int id;
	private String city;

	// Constructors
	public Address() {
	}

	public Address(int id, String city) {
		this.id = id;
		this.city = city;
	}

	// Getters & Setters
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	@Override
	public String toString() {
		return "Address [id=" + id + ", city=" + city + "]";
	}

}