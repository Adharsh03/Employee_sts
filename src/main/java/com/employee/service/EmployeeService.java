package com.employee.service;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.employee.dao.EmployeeDao;
import com.employee.entity.Employee;

@Service
public class EmployeeService {
	@Autowired EmployeeDao ed;
	public String postEmp(List<Employee> e) {
		return ed.postEmp(e);
	}
	
	public Employee findById(int n) {
		return ed.findById(n);
	}
	
	public List<Employee> findAll() {
		return ed.findAll();
		
	}
	
	public String delete(int n) {
		return ed.delete(n);
	}
	
	public String update(int n, Employee e) {
		return ed.update(n,e);
	}
	
	public String patch(int n, Employee e) {
		return ed.patch(n,e);
	}
	
	public Employee getAgeMax() {
		List<Employee> x = ed.findAll();
		Employee e = x.stream().sorted(Comparator.comparing(Employee::getAge).reversed()).skip(1).findFirst().get();
		return e;
	}
	
	public List<Employee> getSalaryRange(int num1, int num2){
		List<Employee> x = ed.findAll();
		List<Employee> res = x.stream().filter(a->a.getSalary()>num1 && a.getSalary()<num2).collect(Collectors.toList());
		return res;
 	}
	
	public List<Object> getNameId(){
		return ed.getNameId();
	}
}
