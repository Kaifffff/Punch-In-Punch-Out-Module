package com.example.demo.Model;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Transient;

@Entity
public class Addmin {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long addminId;
	private String name;
	private String email;
	private String password;
	
	@Transient
	private List<Employee> employee = new ArrayList<>();

	public Long getAddminId() {
		return addminId;
	}

	public void setAddminId(Long addminId) {
		this.addminId = addminId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public List<Employee> getEmployee() {
		return employee;
	}

	public void setEmployee(List<Employee> employee) {
		this.employee = employee;
	}

	@Override
	public String toString() {
		return "Addmin [addminId=" + addminId + ", name=" + name + ", email=" + email + ", password=" + password
				+ ", employee=" + employee + "]";
	}

	
	
	

}
