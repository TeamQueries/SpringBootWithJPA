package com.springboot.hibernate.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.springboot.hibernate.model.Employee;
import com.springboot.hibernate.repositary.EmployeeRepositary;

@Service
public class EmployeeDao {
	@Autowired
	EmployeeRepositary empRepo;

	public Employee save(Employee employee) {

		return empRepo.save(employee);
	}

	public List<Employee> findAll() {

		return empRepo.findAll();
	}

	/*
	 * public Employee findOne(Long empid) {
	 * 
	 * return empRepo.findById(empid); }
	 */

	public void delete(Employee employee) {
		
		empRepo.delete(employee);
	}
}
