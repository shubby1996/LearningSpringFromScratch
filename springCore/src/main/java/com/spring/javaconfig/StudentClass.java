package com.spring.javaconfig;


import org.springframework.stereotype.Component;


@Component
public class StudentClass {
	

	private String name;
	private int id;
	private Address address;
	
	
	public String study() {
		return "XML removal Successful";
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public Address getAddress() {
		return address;
	}
	public void setAddress(Address address) {
		this.address = address;
	}
	@Override
	public String toString() {
		return "Student [name=" + name + ", id=" + id + ", address=" + address + "]";
	}
	
	

	
	
}
