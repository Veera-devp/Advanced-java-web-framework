package com.klu.HQLExample;

import org.hibernate.Session;

import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.klu.HQLExample.model.Product;

public class App 
{
    public static void main( String[] args )
    {
    	Configuration cfg = new Configuration();
    	cfg.configure("hibernate.cfg.xml");
    	SessionFactory sf = cfg.buildSessionFactory();
    	Session s = sf.openSession();
        Product p = new Product();
        p.setPid(103);
        p.setPname("Nothing");
        p.setPrice(40000);
        s.save(p);
        Transaction tx = s.beginTransaction();
        tx.commit();
        sf.close();
        s.close();
        
    }
}
