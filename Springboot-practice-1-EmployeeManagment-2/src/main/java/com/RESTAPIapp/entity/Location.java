package com.RESTAPIapp.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;

@Entity
@Table(name="emp_loc")
public class Location {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int locid;
	private String city;
	private int pincode;
	
	//@OneToOne
	private Employee employee;
	
	
	
	public Location(int locid, String city, int pincode) {
		super();
		locid = locid;
		this.city = city;
		this.pincode = pincode;
		
		
	}
	public Location() {
		super();
		// TODO Auto-generated constructor stub
	}
	public int getLocid() {
		return locid;
	}
	public void setLocid(int locid) {
		locid = locid;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public int getPincode() {
		return pincode;
	}
	public void setPincode(int pincode) {
		this.pincode = pincode;
	}
	@Override
	public String toString() {
		return "Location [Locid=" + locid + ", city=" + city + ", pincode=" + pincode + "]";
	}
	

}
