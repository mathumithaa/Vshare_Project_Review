package com.virtusa.vshare.dao;

import java.util.List;

import com.virtusa.vshare.model.Register;


public interface RegisterDAO {


	
public List<Register> findAll();
	
	public Register insertUser(String theUser);
	
	public Register insertPassword(String thePassword);
	
	public Register insertAadhar(String theAadhar);
	
	public void save(Register theLogin_det);
	
} 

