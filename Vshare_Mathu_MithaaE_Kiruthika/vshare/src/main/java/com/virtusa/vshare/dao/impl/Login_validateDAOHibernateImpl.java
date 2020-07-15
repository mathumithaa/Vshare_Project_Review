package com.virtusa.vshare.dao.impl;

import java.util.List;

import javax.persistence.EntityManager;

import org.hibernate.Session;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.virtusa.vshare.dao.Login_validateDAO;
import com.virtusa.vshare.model.Login;

@Repository
public class Login_validateDAOHibernateImpl implements Login_validateDAO {



	
	
	//define fields for entity manager
		private EntityManager entityManager;
		
		//set up constructor injection
		@Autowired
		public Login_validateDAOHibernateImpl(EntityManager theEntityManager) {
			entityManager = theEntityManager;
		}

		

	@Override
	public Login insertUser(String theUser) {
		
		// get the current hibernate session
				Session currentSession = entityManager.unwrap(Session.class);
				
				//create a query
				Query<Login> theQuery = currentSession.createQuery("from Login_det",Login.class);
				
				//execute a query and get result List
				List<Login> users = theQuery.getResultList();
				
				//return users;
				return null;
		
	}

	@Override
	public Login insertPassword(String thePassword) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Login insertAadhar(String theAadhar) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void save(Login theLogin_det) {
		// TODO Auto-generated method stub
		
	} 

	
}
