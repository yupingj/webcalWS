package com.mltech.entity;

public class Address {

	private String street;
	private String streetNum;
	private String city;
	private String zipcode;
	private String state;
	
	
	

	public Address() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Address(String street, String streetNum, String city, String zipcode, String state) {
		super();
		this.street = street;
		this.streetNum = streetNum;
		this.city = city;
		this.zipcode = zipcode;
		this.state = state;
	}

	public String getStreet() {
		return street;
	}

	public void setStreet(String street) {
		this.street = street;
	}

	public String getStreetNum() {
		return streetNum;
	}

	public void setStreetNum(String streetNum) {
		this.streetNum = streetNum;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getZipcode() {
		return zipcode;
	}

	public void setZipcode(String zipcode) {
		this.zipcode = zipcode;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

}
