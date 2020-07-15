package com.virtusa.vshare.dao;

import com.virtusa.vshare.model.Login;

public interface Login_validateDAO {
public Login insertUser(String theUser);
	
	public Login insertPassword(String thePassword);
	
	public Login insertAadhar(String theAadhar);
	
	public void save(Login theLogin_det);

}
