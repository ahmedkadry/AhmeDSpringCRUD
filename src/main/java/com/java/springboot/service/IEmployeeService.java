package com.java.springboot.service;

import java.util.List;

import com.java.springboot.entity.Employee;

public interface IEmployeeService {

	List<Employee> getAllEmployee();

	Employee getEmployeeById(int empId);

	void addEmployee(Employee employee);

	void updateEmployee(Employee employee, int empId);

	void deleteEmployee(int empId);

	List<Employee> getEmployeeByDept(String deptName);
}