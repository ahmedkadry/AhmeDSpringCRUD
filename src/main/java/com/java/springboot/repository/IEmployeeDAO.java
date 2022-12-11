package com.java.springboot.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.java.springboot.entity.Employee;

@Repository
public interface IEmployeeDAO extends JpaRepository<Employee, Integer> {

	List<Employee> findByDeptName(String deptName);
}