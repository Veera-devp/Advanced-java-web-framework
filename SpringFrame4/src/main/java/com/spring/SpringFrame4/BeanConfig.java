package com.spring.SpringFrame4;

import org.springframework.context.annotation.Bean;

public class BeanConfig 
{
	@Bean
    public Student stu() 
    {
    	return new Student();
    }
	@Bean
	public Employee emp()
	{
		return new Employee();
	}
}
