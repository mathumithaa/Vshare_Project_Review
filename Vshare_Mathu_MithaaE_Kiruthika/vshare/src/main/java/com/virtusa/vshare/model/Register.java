package com.virtusa.vshare.model;

import javax.persistence.Entity;
import javax.persistence.GenerationType;
import javax.persistence.Table;
import javax.persistence.Id;
import javax.persistence.GeneratedValue;
import javax.persistence.Column;


public class Register {
	
	//define fields
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="username")
	private String username;
	
	@Column(name="password")
	private String password;

	@Column(name="email")
	private String email;
	
	@Column(name="aadhar")
	private String aadhar;
	
	//define constructors
		public Register()
		{
			
		}
		
		public Register(String username, String password, String email, String aadhar) {
			super();
			this.username = username;
			this.password = password;
			this.email = email;
			this.aadhar = aadhar;
		}
		
		
		//define getter and setter
		public String getUsername() {
			return username;
		}
		public void setUsername(String username) {
			this.username = username;
		}

		public String getPassword() {
			return password;
		}
		public void setPassword(String password) {
			this.password = password;
		}
		
		public String getEmail() {
			return email;
		}
		public void setEmail(String email) {
			this.email = email;
		}
		
		public String getAadhar() {
			return aadhar;
		}

		public void setAadhar(String aadhar) {
			this.aadhar = aadhar;
		}

		//define toString
		

}


	

	
