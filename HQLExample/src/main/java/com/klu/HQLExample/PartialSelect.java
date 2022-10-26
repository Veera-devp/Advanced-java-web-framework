package com.klu.HQLExample;

import java.util.Iterator;

import java.util.List;

import org.hibernate.query.Query;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class PartialSelect {

	public static void main(String[] args)
	{
		
		Configuration cfg = new Configuration();
		cfg.configure("hibernate.cfg.xml");
		
		SessionFactory sf = cfg.buildSessionFactory();
		Session s = sf.openSession();
		
		 Query qry = s.createQuery("select p.pid,p.pname from Product p");
		 
		 List l = qry.list();
		 
		 Iterator it = l.iterator();
		 System.out.println("Pid       Pname   ");
		 System.out.println("------------------");
		 while(it.hasNext())
		 {
			 Object o[] = (Object [])it.next();
			 
			 System.out.println(o[0]+"   "+o[1]+"   ");	 
			 
		 }
	
		 
		 
		
		sf.close();
		s.close();
	}
}
