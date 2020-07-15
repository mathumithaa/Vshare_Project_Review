package com.virtusa.vshare.service.impl;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.virtusa.vshare.service.LoginService;
import com.virtusa.vshare.model.Login;
import com.virtusa.vshare.repository.LoginRepository;
import lombok.extern.slf4j.Slf4j;

@Slf4j
@Service
public class LoginServiceImpl implements LoginService {

    @Autowired
    LoginRepository repository;
    
	@Override
	public List<Login> openLogin(Login login) {
		final String className = "LoginServiceImpl";
        log.info("Retrieving login details" + className);
		 return repository.openLogin(login);
	}
}
