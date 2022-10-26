package com.klu.HQLExample2;
import java.util.Iterator;
import java.util.List;
import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.criterion.Projections;
import com.klu.HQLExample2.model.Product;

public class HCQLProjections {
	
	public static void main(String[] args)
	{
		
		Configuration cfg = new Configuration();
		cfg.configure("hibernate.cfg.xml");
		
		SessionFactory sf = cfg.buildSessionFactory();
		Session s = sf.openSession();
		
		 //Query qry = s.createQuery("select p from Product p");
		
		Criteria crit = s.createCriteria(Product.class);
		
		//Criterion c = Restrictions.le("price",75000.0);
		
		//crit.addOrder(Order.asc("price"));
		//crit.addOrder(Order.desc("price"));
		
		//crit.setFirstResult(2);
		//crit.setMaxResults(2);
		
		crit.setProjection(Projections.property("pname"));
		
		
		 
		 List l = crit.list();
		 
		 Iterator it = l.iterator();
		 System.out.println("Pname    ");
		 System.out.println("---------");
		 while(it.hasNext())
		 {
			 Object o = it.next();
			 //Product p = (Product)o;
			 String str = (String)o;
			 //System.out.println(p.getPid()+"   "+p.getPname()+"   "+p.getPrice());
			 System.out.println(str);
			 
		 }
		sf.close();
		s.close();
	}

}
