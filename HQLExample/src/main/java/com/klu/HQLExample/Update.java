package com.klu.HQLExample;
import java.util.Iterator;

import java.util.List;

import org.hibernate.query.Query;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class Update {
	
	public static void main(String[] args)
	{
		
		Configuration cfg = new Configuration();
		cfg.configure("hibernate.cfg.xml");
		
		SessionFactory sf = cfg.buildSessionFactory();
		Session s = sf.openSession();
		
		 Query qry = s.createQuery("update Product p set p.price=? where p.pid=103");
		 qry.setParameter(0,90000.0);
		  
		 int res = qry.executeUpdate();
		  
	     System.out.println("Record Updated Successfully......");
	     System.out.println("No of records are effected :"+res);
		 
		 
		
		sf.close();
		s.close();
	}

}






