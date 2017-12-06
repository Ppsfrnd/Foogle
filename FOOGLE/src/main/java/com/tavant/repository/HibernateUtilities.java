package com.tavant.repository;



import org.hibernate.HibernateException;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class HibernateUtilities {
	
	private static SessionFactory sessionFactory;
	static {
		try {
			Configuration configuration = new Configuration().configure("hibernate.cfg.xml");
			sessionFactory = configuration.buildSessionFactory();
		} catch (HibernateException e) {
			// TODO: handle exception
			System.err.println(e.getMessage());
		}
	}

	public static SessionFactory getSessionFactory() {
		return sessionFactory;
	}

}
