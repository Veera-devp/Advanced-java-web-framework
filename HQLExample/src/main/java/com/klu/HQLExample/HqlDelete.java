package com.klu.HQLExample;
import org.hibernate.query.Query;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class HqlDelete {
	public static void main(String[] args)
	{
		
		Configuration cfg = new Configuration();
		cfg.configure("hibernate.cfg.xml");
		
		SessionFactory sf = cfg.buildSessionFactory();
		Session s = sf.openSession();
		
		 Query qry = s.createQuery("delete from Product p where p.pid=103");
		 
		  
		 int res = qry.executeUpdate();
		  
	     System.out.println("Record Deleted Successfully......");
	     System.out.println("No of records are effected :"+res);
		 
		 
		
		sf.close();
		s.close();
	}

}
