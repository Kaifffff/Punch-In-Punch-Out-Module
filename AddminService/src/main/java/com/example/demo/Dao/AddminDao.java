package com.example.demo.Dao;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.example.demo.Dao.Repo.AddminRepo;
import com.example.demo.Model.Addmin;
import com.example.demo.Model.Employee;
import com.example.demo.Service.AddminService;

@Service
public class AddminDao implements AddminService{
	
	@Autowired
	AddminRepo ar;
	
	@Autowired
	RestTemplate rt;

	@Override
	public Addmin register(Addmin addmin) {
		
		return ar.save(addmin);
	}

	@Override
	public List<Addmin> fetchAll() {
		List<Addmin> addmin = ar.findAll();
		for(Addmin a : addmin) {
			List<Employee> employee = rt.getForObject("http://localhost:9091/employees/fetchByAddminId/"+ a.getId(), ArrayList.class);
			a.setEmployee(employee);
		}
		return addmin;
	}

	@Override
	public Addmin fetchAddmin(String email, String password) {
		
	    Addmin addmin =	ar.findByEmailAndPassword(email, password);
	    long id = addmin.getId();
	    List<Employee> employee = rt.getForObject("http://localhost:9091/employees/fetchByAddminId/"+ id, ArrayList.class);
	    addmin.setEmployee(employee);
		return addmin;
				
	}


}
