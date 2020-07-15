package com.virtusa.vshare.repository.impl;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;

import org.springframework.stereotype.Repository;

import com.virtusa.vshare.repository.LoginRepository;
import com.virtusa.vshare.model.Login;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@Repository
public class LoginRepositoryImpl implements LoginRepository {

    @PersistenceContext
    protected EntityManager entityManager;

    @Override
	public List<Login> openLogin (Login login){
    	final String className = "LoginRepositoryServiceImpl";
        log.info("Retrieving login details" + className);
        List<Login> list =null;
	    TypedQuery<Login> query=entityManager.createQuery("from Login where userName= :userName and passWord= :passWord ", Login.class);
	    query.setParameter("userName", login.getUsername());
	    query.setParameter("passWord", login.getPassword());
	    list= query.getResultList();
	    return list;
	}
}
