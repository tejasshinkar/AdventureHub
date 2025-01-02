package com.example.adventureHub.entity;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "customers")
public class Customer {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	int custid;
	String fname;
	String lname;
	String aadhaar;
	String street;
	String pincode;

	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "userid")
	User users;

//	@JsonIgnoreProperties("customers")
	@ManyToOne
	@JoinColumn(name="cityid")
	City cities;
	
	public Customer() {
		super();
	}

	public Customer(int custid, String fname, String lname, String aadhaar, String street, String pincode, User users,
			City cities) {
		super();
		this.custid = custid;
		this.fname = fname;
		this.lname = lname;
		this.aadhaar = aadhaar;
		this.street = street;
		this.pincode = pincode;
		this.users = users;
		this.cities = cities;
		
	}

	public int getCustid() {
		return custid;
	}

	public void setCustid(int custid) {
		this.custid = custid;
	}

	public String getFname() {
		return fname;
	}

	public void setFname(String fname) {
		this.fname = fname;
	}

	public String getLname() {
		return lname;
	}

	public void setLname(String lname) {
		this.lname = lname;
	}

	public String getAadhaar() {
		return aadhaar;
	}

	public void setAadhaar(String aadhaar) {
		this.aadhaar = aadhaar;
	}

	public String getStreet() {
		return street;
	}

	public void setStreet(String street) {
		this.street = street;
	}

	public String getPincode() {
		return pincode;
	}

	public void setPincode(String pincode) {
		this.pincode = pincode;
	}

	public User getUsers() {
		return users;
	}

	public void setUsers(User users) {
		this.users = users;
	}

	public City getCities() {
		return cities;
	}

	public void setCities(City cities) {
		this.cities = cities;
	}

	
}
