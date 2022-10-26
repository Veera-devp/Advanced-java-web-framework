package com.klu.HQLExample2;

import java.util.Iterator;
import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.criterion.Criterion;
import org.hibernate.criterion.Order;
import org.hibernate.criterion.Restrictions;


import com.klu.HQLExample2.model.Product;
public class SelectUpdatePrice 
{
    public static void main( String[] args )
    {
    	Configuration cfg = new Configuration();
        cfg.configure("hibernate.cfg.xml");
        
        SessionFactory sf = cfg.buildSessionFactory();
        Session s = sf.openSession();
        
        @SuppressWarnings("deprecation")
		Criteria crit = s.createCriteria(Product.class);
        Criterion c = Restrictions.le("price",75000.0);
        crit.addOrder(Order.asc("price"));
        @SuppressWarnings("rawtypes")
		List l = crit.list();
         
         @SuppressWarnings("rawtypes")
		Iterator it = l.iterator();
         System.out.println("Pid       Pname          Price");
         System.out.println("--------------------------------");
         while(it.hasNext())
         {
           Object o = it.next();
           Product p = (Product)o;
           
           System.out.println(p.getPid()+"   "+p.getPname()+"   "+p.getPrice());   
           
         }
    }
}
