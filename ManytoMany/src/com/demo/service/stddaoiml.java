package com.demo.service;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import com.demo.dao.StdDao;

import com.demo.pojo.Student;
import com.demo.pojo.course;
import com.demo.util.HibernetUtil;

public class stddaoiml implements StdDao {
	
	static SessionFactory sessionFactoryObj;
	static Session sessionObj;

	public void createQuestion(course cours,Student std) {
		Transaction tx = null;
		course cours1= null;
		
		try {
		// enble the session by calling opensesion method
		sessionObj = HibernetUtil.buildSessionFactory().openSession();
		tx = sessionObj.beginTransaction();
      sessionObj.persist(cours1);// insert into table and formed the sql query automaticall "insert into student values(?,?)
      sessionObj.persist(std);
      tx.commit();
	
		}catch(Exception e) {
			
			if (tx != null)
				tx.rollback();
			e.printStackTrace();
		}
		 finally {
				sessionObj.close();
			}
	}




	@Override
	public void createAnswers(Student std) {

		
	}




	@Override
	public void createcourse(course cours, Student std) {
		// TODO Auto-generated method stub
		
	}




	@Override
	public void Studentcourse(Student std) {
		// TODO Auto-generated method stub
		
	}







}
