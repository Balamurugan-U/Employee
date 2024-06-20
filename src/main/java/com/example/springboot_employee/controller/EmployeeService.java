package com.example.springboot_employee.controller;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EmployeeService {
	@Autowired
	EmployeeRepository employeerepository;
	
	public Employee addEmployee(Employee employee)
	{
		return employeerepository.save(employee);
	}
	
	public List<Employee> allEmployee()
	{
		List<Employee> t = new ArrayList<Employee>();
		employeerepository.findAll().forEach(t::add);
		return t;
	}
	
	public Employee showSpeciEmployee(Integer id)
	{
		return employeerepository.findById(id).orElse(null);
	}
	
	public void deleteEmployee(Integer id)
	{
		employeerepository.deleteById(id);
	}
	
	public Employee updateEmployee(Integer id,String address) 
	{
	     Optional<Employee>employee = employeerepository.findById(id);
	     if(employee.isEmpty())
	     {
	    	 throw new RuntimeException("Account is not present");
	     }
	     Employee employeepresent = employee.get();
	     String string = employeepresent.getAddress();
	     employeepresent.setAddress(address);
	     employeerepository.save(employeepresent);
	     return employeepresent;
	     
	}

}
