package com.example.demo.Dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.Model.Employee;
import com.example.demo.Repo.EmployeeRepo;
import com.example.demo.Service.EmployeeService;

@Service
public class EmployeeDao implements EmployeeService{
	
	@Autowired
	EmployeeRepo er;

	@Override
	public Employee save(Employee e) {
		
		return er.save(e);
	}

	@Override
	public List<Employee> all() {
	
		return er.findAll();
	}

	@Override
	public Employee find(Long id) {
		
		return er.findById(id).orElse(null);
	}

	@Override
	public void delete(Long id) {
		er.deleteById(id);
	}

}
