package com.virtusa.vshare.repository.impl;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import com.virtusa.vshare.model.Login;
import com.virtusa.vshare.repository.RegisterRepository;
import lombok.extern.slf4j.Slf4j;

@Slf4j
public class RegisterRepositoryImpl implements RegisterRepository  {
	 @PersistenceContext
	    protected EntityManager entityManager;

	    @Override
		public Login registerUser(Login register){
	    	final String className = "RegisterRepositoryImpl";
	        log.info("Saving Registeration details" + className);
	    	entityManager.persist(register);
	    	return register;
		}

}
