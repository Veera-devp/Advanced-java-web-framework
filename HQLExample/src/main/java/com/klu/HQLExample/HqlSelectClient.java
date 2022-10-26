package com.klu.HQLExample;

import java.util.Iterator;
import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.klu.HQLExample.model.Product;

public class HqlSelectClient {
	
	public static void main(String[] args)
	{
		
		Configuration cfg = new Configuration();
		cfg.configure("hibernate.cfg.xml");
		
		SessionFactory sf = cfg.buildSessionFactory();
		Session s = sf.openSession();
		
		 Query qry = s.createQuery("select p from Product p");
		 
		 List l = qry.list();
		 
		 Iterator it = l.iterator();
		 System.out.println("Pid       Pname          Price");
		 System.out.println("--------------------------------");
		 while(it.hasNext())
		 {
			 Object o = it.next();
			 Product p = (Product)o;
			 
			 System.out.println(p.getPid()+"   "+p.getPname()+"   "+p.getPrice());	 
			 
		 }
	
		 
		 
		
		sf.close();
		s.close();
	}

}
