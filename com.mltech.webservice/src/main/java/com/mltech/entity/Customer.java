package com.mltech.entity;

import java.util.Date;

public class Customer {
	private long id;
	private String firstName;
	private String lastName;
	private Date birthDate;
	private Address homeAdress;
	
	

	public Customer() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	

	public Customer(long id, String firstName, String lastName, Date birthDate, Address homeAdress) {
		super();
		this.id = id;
		this.firstName = firstName;
		this.lastName = lastName;
		this.birthDate = birthDate;
		this.homeAdress = homeAdress;
	}



	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public Date getBirthDate() {
		return birthDate;
	}

	public void setBirthDate(Date birthDate) {
		this.birthDate = birthDate;
	}

	public Address getHomeAdress() {
		return homeAdress;
	}

	public void setHomeAdress(Address homeAdress) {
		this.homeAdress = homeAdress;
	}

}
