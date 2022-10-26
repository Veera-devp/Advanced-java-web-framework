package com.spring.SpringFrame4;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class StudentConfig 
{
    @Bean
    public Student stu() 
    {
    	return new Student();
    }
}
