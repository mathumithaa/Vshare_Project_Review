package com.virtusa.vshare.dao.impl;

import java.util.List;

import javax.persistence.EntityManager;

import org.hibernate.Session;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.virtusa.vshare.dao.RegisterDAO;
import com.virtusa.vshare.model.Register;

@Repository
public class RegisterDAOHibernateImpl implements RegisterDAO {
	
	
	//define fields for entity manager
		private EntityManager entityManager;
		
		//set up constructor injection
		@Autowired
		public RegisterDAOHibernateImpl(EntityManager theEntityManager) {
			entityManager = theEntityManager;
		}

		@Override	
	@Transactional
	public List<Register> findAll() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Register insertUser(String theUser) {
		
		// get the current hibernate session
				Session currentSession = entityManager.unwrap(Session.class);
				
				//create a query
				Query<Register> theQuery = currentSession.createQuery("from Login_det",Register.class);
				
				//execute a query and get result List
				List<Register> users = theQuery.getResultList();
				
				//return users;
				return null;
		
	}

	@Override
	public Register insertPassword(String thePassword) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Register insertAadhar(String theAadhar) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void save(Register theLogin_det) {
		// TODO Auto-generated method stub
		
	} 

	
}
