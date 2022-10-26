package com.spring.CRUDOperations;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.spring.CRUDOperations.dao.StudentDaoImp;

public class App 
{
    public static void main( String[] args )
    {
    	ApplicationContext context = new ClassPathXmlApplicationContext("Beans.xml");
    	StudentDaoImp s = (StudentDaoImp)context.getBean("raghava");
    	s.insert(1,"Raghava", 19);
    	s.insert(2,"Dinesh", 21);
    	s.insert(3,"Rajesh", 20);
    }
}
