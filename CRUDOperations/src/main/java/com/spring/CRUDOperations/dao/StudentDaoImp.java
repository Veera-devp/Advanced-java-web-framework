package com.spring.CRUDOperations.dao;

import javax.sql.DataSource;

import org.springframework.jdbc.core.JdbcTemplate;

public class StudentDaoImp implements StudentDao 
{
	private DataSource dataSource;
    private JdbcTemplate jdbcTemplateObject;
    public void setDataSource(DataSource dataSource) 
    {
         this.dataSource = dataSource;
         this.jdbcTemplateObject = new JdbcTemplate(dataSource);
      }
	public void create() 
	{
		String SQL = "create table Student (id int, name varchar(20), age int )";
		jdbcTemplateObject.update(SQL);
		return;
	}

	public void insert(Integer id, String name, Integer age) 
	{
		String SQL = "insert into Student (id, name, age) values (?,?, ?)";
		jdbcTemplateObject.update(SQL, id, name, age);
		System.out.println("Created Record Id=" + id + "Name = " + name + " Age = " + age);
		return;
	}

	public void update(Integer id, Integer age) 
	{
		String SQL = "update Student set age = ? where id = ?";
		jdbcTemplateObject.update(SQL, age, id);
		System.out.println("Updated Record with ID = " + id);
		return;
	}

	public void delete(Integer id) 
	{
		String SQL = "delete from Student where id = ?";
		jdbcTemplateObject.update(SQL, id);
		System.out.println("Deleted Record with ID = " + id);
		return;
	}
}
