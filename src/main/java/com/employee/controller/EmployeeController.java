	package com.employee.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.employee.entity.Employee;
import com.employee.service.EmployeeService;

@RestController
@RequestMapping(value="/emp/api")
public class EmployeeController {
	@Autowired EmployeeService es;
	
//	@PostMapping(value="/postSingleEmp")
//	public String postEmp(@RequestBody Employee e) {
//		return es.postEmp(e);
//	}

	@PostMapping(value="/postMultipleEmp")
	public String postMultipleEmp(@RequestBody List<Employee> e) {
		return es.postEmp(e);
	}
	
	@GetMapping(value="/findById/{n}")
	public Employee findById(@PathVariable int n) {
		return es.findById(n);
	}
	
	@GetMapping(value="/findAll")
	public List<Employee> findAll(){
		return es.findAll();
	}
	
	@DeleteMapping(value="/deleteById/{n}")
	public String delete(@PathVariable int n) {
		return es.delete(n);
	}
	
	
	@PutMapping(value="/update/{n}")
	public String update(@PathVariable int n, @RequestBody Employee e) {
		return es.update(n,e);
	}
	
	@PatchMapping(value="/patch/{n}")
	public String patch(@PathVariable int n, @RequestBody Employee e) {
		return es.patch(n,e);
	}
	
	@GetMapping(value="/getSecondMaximum")
	public Employee getAgeMax() {
		return es.getAgeMax();
	}
	
	@GetMapping(value="/getSalaryRange/{num1}/{num2}")
	public List<Employee> getSalaryRange(@PathVariable int num1, @PathVariable int num2){
		return es.getSalaryRange(num1,num2);
	}
	
	
	@GetMapping(value="/getNameId")
	public List<Object> getNameId(){
		return es.getNameId();
	}
}
