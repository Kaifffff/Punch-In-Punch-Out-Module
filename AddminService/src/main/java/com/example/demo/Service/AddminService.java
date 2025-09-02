package com.example.demo.Service;

import java.util.List;

import com.example.demo.Model.Addmin;

public interface AddminService {
	public Addmin register(Addmin addmin);
	public Addmin fetchAddmin(String email , String password);
	public List<Addmin> fetchAll();
	public void delete(Long id);

}
