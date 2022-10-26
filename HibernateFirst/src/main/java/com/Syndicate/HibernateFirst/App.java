package com.Syndicate.HibernateFirst;
import org.hibernate.SessionFactory;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.Syndicate.HibernateFirst.model.Employee;

public class App 
{
	public static void main(String[] args) throws Exception
	{
		SessionFactory factory = new Configuration().configure().buildSessionFactory();
		Employee em = new Employee("Dinesh", "Nana", 7000);
		Session session = factory.openSession();
		Transaction tn = session.beginTransaction();
		session.save(em);
		tn.commit();
		session.close();
		factory.close();
		
	}
}
/*Hibernate:
~~~~~~~~~~

- JPA = used to write transaction type of DATA using Java (no need SQL Queries)
- ORM = Converts java(pojo) class into JDBC code and connects to multiple-database <whearas in JDBC,, there is a lot of internal process>
  - need to specify a configuration via XML to do like that
- one of the ORM tool is HIBERNATE: uses Java class and XML configuration and connects to multiple-database
  - Persistant data = Perminant data
  - Persistant object = the class that has registered in XML in order to connect to database


Steps while using HYBERNATE
1. Configuration = 
   - Database coneection via *hibernate.cfg.xml*
   - hibernate-mapping = Link the java-class (Persistant class)
     + 2 types: XML Based, Annotation Based
2. Session Factory = To start Code running (like session.beginTransation) and catch ERRORS  */