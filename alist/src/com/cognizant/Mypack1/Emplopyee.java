package com.cognizant.Mypack1;

public class Emplopyee {
	int id;
	String name;
	double salary;
	String address;
	public Emplopyee(int id, String name, double salary, String address) {
		super();
		this.id = id;
		this.name = name;
		this.salary = salary;
		this.address = address;
	}
	public int getId() {
		return id;
	}
	public String getName() {
		return name;
	}
	public double getSalary() {
		return salary;
	}
	public String getAddress() {
		return address;
	}
	}
