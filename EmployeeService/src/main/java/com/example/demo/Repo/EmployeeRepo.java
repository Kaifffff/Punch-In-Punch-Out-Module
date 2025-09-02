package com.example.demo.Repo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.Model.Employee;

public interface EmployeeRepo extends JpaRepository<Employee , Long>{
	public Employee findByEmail(String email);
	public Employee findByEmailAndPassword(String email , String password);
	public List<Employee> findByAddminId(Long addminId);
}
