package com.employee.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.employee.entity.Employee;

public interface EmployeeRepository extends JpaRepository<Employee,Integer> {
	@Query(value="select name,id from emp_table;", nativeQuery=true)
	public List<Object> getNameId();
}
