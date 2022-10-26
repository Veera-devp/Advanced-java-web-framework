package com.spring.SpringFrame4;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App 
{
    public static void main( String[] args )
    {
        ApplicationContext context = new AnnotationConfigApplicationContext(BeanConfig.class);
        Student s= (Student) context.getBean("stu");
        s.setSname("Raghava");
        s.setId(2000030902);
        s.setDept("CSE");
        String a=s.getSname();
        int b=s.getId();
        String c=s.getDept();
        System.out.println("Student name : "+a);
        System.out.println("Student ID : "+b);
        System.out.println("Student department : "+c+"\n");
        
        Employee e= (Employee) context.getBean("emp");
        e.setEname("Rajesh");
        e.setId(5674);
        e.setSalary(10000);
        String ename=e.getEname();
        int eid=e.getId();
        int salary=e.getSalary();
        System.out.println("Employee name : "+ename);
        System.out.println("Employee ID : "+eid);
        System.out.println("Employee Salary : "+salary);
    }
}
