package com.klu.HQLExample;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.Query;

public class DeleteProduct 
{
	public static void main(String args[]) 
	{
		Configuration cfg = new Configuration();
		cfg.configure("hibernate.cfg.xml");
		SessionFactory sf = cfg.buildSessionFactory();
		Session s = sf.openSession();
		Transaction tx = s.beginTransaction();
		Query qry = s.createQuery("delete from Product p where p.pid=103");
		int res = qry.executeUpdate();
		System.out.println("Record Deleted Successfully......");
		System.out.println("No of records are effected :" + res);

		tx.commit();
		sf.close();
		s.close();
	}
}
