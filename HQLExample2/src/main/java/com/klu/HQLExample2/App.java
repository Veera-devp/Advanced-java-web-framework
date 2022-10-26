package com.klu.HQLExample2;

import org.hibernate.Session;

import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.klu.HQLExample2.model.Product;

public class App 
{
    public static void main( String[] args )
    {
    	Configuration cfg = new Configuration();
    	cfg.configure("hibernate.cfg.xml");
    	SessionFactory sf = cfg.buildSessionFactory();
    	Session s = sf.openSession();
        Product p = new Product();
        p.setPid(105);
        p.setPname("Oppo");
        p.setPrice(57834);
        s.save(p);
        Transaction tx = s.beginTransaction();
        tx.commit();
        sf.close();
        s.close();
        
    }
}
