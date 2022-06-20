package com.spring.javaconfig;

import org.springframework.stereotype.Component;

@Component
public class Address {


	private int house_number;
	private String street;
	private String locality;
	private String city;
	
	public int getHouse_number() {
		return house_number;
	}
	public void setHouse_number(int house_number) {
		this.house_number = house_number;
	}
	public String getStreet() {
		return street;
	}
	public void setStreet(String street) {
		this.street = street;
	}
	public String getLocality() {
		return locality;
	}
	public void setLocality(String locality) {
		this.locality = locality;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	
	@Override
	public String toString() {
		return "Address [house_number=" + house_number + ", street=" + street + ", locality=" + locality + ", city="
				+ city + "]";
	}
	
	
}
