package com.test;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EmployeeController {
	
	 @Autowired
	 private EmployeeRepository repository;
	
	@RequestMapping(value="/viewEmployee",method=RequestMethod.GET)
	public Iterable<Employee> viewEmployee(Model model) {
		Iterable<Employee> employees=repository.findAll();
		return employees;
	}
	
	@RequestMapping(value="/addEmployee",method=RequestMethod.POST)
	public String addEmployeeToDB(@RequestBody Employee employee) {
		repository.save(employee);
		return "Employee Added succesfully";
	}
}
