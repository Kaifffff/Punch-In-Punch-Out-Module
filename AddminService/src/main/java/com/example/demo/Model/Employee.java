package com.example.demo.Model;

public class Employee {
	 private Long id;
	 private Long addminId;
	 private String name;
	 private String email;
	 private String password;
	 private String role;
	 public Long getId() {
		 return id;
	 }
	 public void setId(Long id) {
		 this.id = id;
	 }
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
	 public String getRole() {
		 return role;
	 }
	 public void setRole(String role) {
		 this.role = role;
	 }
	 @Override
	 public String toString() {
		return "Employee [id=" + id + ", addminId=" + addminId + ", name=" + name + ", email=" + email + ", password="
				+ password + ", role=" + role + "]";
	 }
	 
	 
}
