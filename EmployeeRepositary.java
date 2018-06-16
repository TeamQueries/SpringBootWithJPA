package com.springboot.hibernate.repositary;

import org.springframework.data.jpa.repository.JpaRepository;

import com.springboot.hibernate.model.Employee;

public interface EmployeeRepositary extends JpaRepository<Employee, Long>{

}
