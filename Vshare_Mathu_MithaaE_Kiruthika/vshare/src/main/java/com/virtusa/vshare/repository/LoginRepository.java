package com.virtusa.vshare.repository;

import java.util.List;

import com.virtusa.vshare.model.Login;

public interface LoginRepository {
	List<Login> openLogin(Login login);
}
