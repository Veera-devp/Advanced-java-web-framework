package com.spring.SpringFrame2;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.spring.SpringFrame2.Student;
import com.spring.SpringFrame2.Employee;

/**
 * Hello world!
 *
 */
@SuppressWarnings("unused")
public class App 
{
    public static void main( String[] args )
    {
    	ApplicationContext context = new ClassPathXmlApplicationContext("Beans.xml");
        Student obj = (Student) context.getBean("sinfo");
        obj.getSname();
        obj.getRollno();
        Employee e =(Employee) context.getBean("einfo");
        e.getEname();
        e.getId();
    }
}
