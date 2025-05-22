package com.employee.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Table(name="emp_table")
@Entity
public class Employee {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id;
	private String name;
	private int salary;
	private String role;
	private int age;
	private String gender;
	
	public void setId(int id) {
		this.id=id;
	}
	
	public int getId() {
		return id;
	}
	
	public void setName(String name) {
		this.name=name;
	}
	
	public String getName() {
		return name;
	}
	
	public void setSalary(int salary) {
		this.salary=salary;
	}
	
	public int getSalary() {
		return salary;
	}
	
	public void setRole(String role) {
		this.role=role;
	}
						
	public String getRole() {
		return role;
	}
	
	public void setAge(int age) {
		this.age=age;
	}
	
	public int getAge() {
		return age;
	}
	
	public void setGender(String gender) {
		this.gender=gender;
	}
	
	public String getGender() {
		return gender;
	}
}
