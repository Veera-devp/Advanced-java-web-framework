package com.spring.SpringFrame3;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext();
    	context.scan("com.spring.SpringFrame3");
    	context.refresh();
    	Student o = (Student)context.getBean(Student.class);
    	o.setSname("Raghava");
    	o.setRollno("2000030902");
    	o.getSname();
    	o.getRollno();
    }
}
