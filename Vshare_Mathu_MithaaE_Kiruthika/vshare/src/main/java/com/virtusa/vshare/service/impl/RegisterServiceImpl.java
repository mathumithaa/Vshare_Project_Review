package com.virtusa.vshare.service.impl;


import org.springframework.beans.factory.annotation.Autowired;

import com.virtusa.vshare.service.RegisterService;
import com.virtusa.vshare.model.Login;
import com.virtusa.vshare.repository.RegisterRepository;
import lombok.extern.slf4j.Slf4j;

@Slf4j
public class RegisterServiceImpl implements RegisterService {
	 @Autowired
	 RegisterRepository repository;
	    
		@Override
		public Login registerUser(Login register) {
			final String className = "RegisterServiceImpl";
	        log.info("Saving Registeration details" + className);
			 return repository.registerUser(register);
		}
}
