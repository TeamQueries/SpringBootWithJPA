package com.springboot.hibernate.controller;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.springboot.hibernate.dao.EmployeeDao;
import com.springboot.hibernate.model.Employee;

@RestController
@RequestMapping("/company")
public class EmployeeController {
	@Autowired
	EmployeeDao employeeDao;

	@PostMapping("/create")
	public Employee createEmployee(@Valid @RequestBody Employee employee) {

		return employeeDao.save(employee);
	}

	@GetMapping("/getAll")
	public List<Employee> getAllEmployee() {
		
		return employeeDao.findAll();
	}
}
