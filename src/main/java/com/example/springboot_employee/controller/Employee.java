package com.example.springboot_employee.controller;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table
public class Employee {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
    @Column
	private String name;
    @Column
	private String address;
    @Column
	private Long phno;
    @Column
	private Double salary;
    
    
    
	
	public Employee(String name, String address, Long phno, Double salary) {
		super();
		this.name = name;
		this.address = address;
		this.phno = phno;
		this.salary = salary;
	}




	public Employee() {
		// TODO Auto-generated constructor stub
	}




	public Integer getId() {
		return id;
	}




	public void setId(Integer id) {
		this.id = id;
	}




	public String getName() {
		return name;
	}




	public void setName(String name) {
		this.name = name;
	}




	public String getAddress() {
		return address;
	}




	public void setAddress(String address) {
		this.address = address;
	}




	public Long getPhno() {
		return phno;
	}




	public void setPhno(Long phno) {
		this.phno = phno;
	}




	public Double getSalary() {
		return salary;
	}




	public void setSalary(Double salary) {
		this.salary = salary;
	}
	
	

}
