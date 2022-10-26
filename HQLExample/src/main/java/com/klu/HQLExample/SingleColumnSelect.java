package com.klu.HQLExample;
import java.util.Iterator;

import java.util.List;

import org.hibernate.query.Query;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class SingleColumnSelect 
{
	
	public static void main(String[] args)
	{
		
		Configuration cfg = new Configuration();
		cfg.configure("hibernate.cfg.xml");
		
		SessionFactory sf = cfg.buildSessionFactory();
		Session s = sf.openSession();
		
		 Query qry = s.createQuery("select p.pid from Product p");
		 
		 List l = qry.list();
		 
		 Iterator it = l.iterator();
		 System.out.println("Pid        ");
		 System.out.println("------------------");
		 while(it.hasNext())
		 {
			 Integer i = (Integer)it.next();
			 
			 System.out.println(i.intValue());	 
			 
		 }
	
		 
		 
		
		sf.close();
		s.close();
	}

}
