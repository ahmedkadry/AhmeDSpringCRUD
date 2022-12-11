package com.java.springboot.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Entity
@NoArgsConstructor
public class Employee {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int empId;
	private String empName;
	private String deptName;

	public Employee(int empId, String empName, String deptName) {
		this.empId = empId;
		this.empName = empName;
		this.deptName = deptName;
	}
}