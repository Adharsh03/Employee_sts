package com.employee.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.employee.entity.Employee;
import com.employee.repository.EmployeeRepository;

@Repository
public class EmployeeDao {
	@Autowired EmployeeRepository er;
	public String postEmp(List<Employee> e) {
		er.saveAll(e);
		return "Saved Successfully";
	}
	
	public Employee findById(int n) {
		return er.findById(n).get();
	}
	
	public List<Employee> findAll(){
		return er.findAll();
	}
	
	public String delete(int n) {
		er.deleteById(n);
		
		return "Deleted SuccessFully";
	}
	
	public String update(int n, Employee e) {
		Employee x = er.findById(n).get();
		
		x.setName(e.getName());
		x.setSalary(e.getSalary());
		x.setRole(e.getRole());
		x.setAge(x.getAge());
		x.setGender(e.getGender());
		er.save(x);
		return "Updated Succesfully";
		
	}
	
	public String patch(int n, Employee e) {
		Employee x=er.findById(n).get();
		x.setSalary(e.getSalary());
		er.save(x);
		return "Patched Successfully";
	}
	
	public List<Object> getNameId(){
		return er.getNameId();
	}
}
