package com.RESTAPIapp.entity;

import com.fasterxml.jackson.annotation.JsonBackReference;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;

@Entity
public class Laptop {
	@Id
	private int laptopid;
	private String brand;
	
	@OneToOne(mappedBy = "laptop")
	@JsonBackReference
	private Student student;

	public Laptop(int laptopid, String brand, Student student) {
		super();
		this.laptopid = laptopid;
		this.brand = brand;
		this.student = student;
	}

	public Laptop() {
		super();
		// TODO Auto-generated constructor stub
	}

	public int getLaptopid() {
		return laptopid;
	}

	public void setLaptopid(int laptopid) {
		this.laptopid = laptopid;
	}

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public Student getStudent() {
		return student;
	}

	public void setStudent(Student student) {
		this.student = student;
	}

	@Override
	public String toString() {
		return "Laptop [laptopid=" + laptopid + ", brand=" + brand + ", student=" + student + "]";
	}
	
	


}
