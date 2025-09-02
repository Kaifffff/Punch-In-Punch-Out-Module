package com.example.demo.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.Model.Addmin;
import com.example.demo.Service.AddminService;

@RestController
@RequestMapping("/addmin")
public class AddminController {
	
	@Autowired
	AddminService as;
	
	@PostMapping("/register")
	public Addmin register(@RequestBody Addmin addmin) {
		return as.register(addmin);
	}
	
	@GetMapping("/fetchByEmailAndPassword")
	public Addmin fetchByEmailAndPassword(@RequestParam String email , @RequestParam String password) {
		return as.fetchAddmin(email , password);
	}
	
	@GetMapping("/fetchAll")
	public List<Addmin> fetchAll() {
		return as.fetchAll();
	}
	
	@DeleteMapping("/delete/{id}")
	public String delete(@PathVariable Long id) {
		as.delete(id);
		return "Addmin Deleted";
	}
}
