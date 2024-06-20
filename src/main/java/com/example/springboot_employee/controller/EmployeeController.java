package com.example.springboot_employee.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping
public class EmployeeController {
	
	@Autowired
	EmployeeService employeeservice;
	
	@PostMapping("/employee")
	public Employee addEmployee(@RequestBody Employee employee)
	{
		return employeeservice.addEmployee(employee);
	}
	@GetMapping("/employee")
	public List<Employee> allEmployee()
	{
	   return employeeservice.allEmployee();
	}
	@GetMapping("/employee/{id}")
	public Employee showSpecificEmployee(@PathVariable Integer id)
	{
		return employeeservice.showSpeciEmployee(id);
	}
	
	@DeleteMapping("/employee/{id}")
	public void deleteEmployee(@PathVariable Integer id)
	{
		employeeservice.deleteEmployee(id);
	}
	
	@PutMapping("/employee/{id}/{address}")
	public Employee updateEmployee(@PathVariable Integer id,@PathVariable String address)
	{
		return employeeservice.updateEmployee(id,address);
	}

}
