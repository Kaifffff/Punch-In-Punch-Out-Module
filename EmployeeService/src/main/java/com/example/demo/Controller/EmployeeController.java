package com.example.demo.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.Model.Employee;
import com.example.demo.Service.EmployeeService;

@RestController
@RequestMapping("/employees")
public class EmployeeController {

	 @Autowired
     EmployeeService es;
	
	 @PostMapping("/register")
	 public Employee add(@RequestBody Employee e){
		 return es.save(e);
	 }
	 
	 @GetMapping("/fetchAll")
	 public List<Employee> all(){
		 return es.all();
     }
	 
	 @GetMapping("/fetchById/{id}") 
	 public Employee one(@PathVariable Long id){
		 return es.find(id);
     }
	 
	 @DeleteMapping("/DeleteById/{id}") 
	 public String del(@PathVariable Long id){
		 es.delete(id);
		 return "Deleted";
     }
}
