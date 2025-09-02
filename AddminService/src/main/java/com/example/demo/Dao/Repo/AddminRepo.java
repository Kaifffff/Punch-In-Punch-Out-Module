package com.example.demo.Dao.Repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.Model.Addmin;

public interface AddminRepo extends JpaRepository<Addmin,Long> {
	
	public Addmin findByEmailAndPassword(String email , String password);
}
