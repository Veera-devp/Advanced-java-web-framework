package com.spring.CRUDOperations.dao;
import java.util.List;
import javax.sql.DataSource;
import com.spring.CRUDOperations.model.Student;
public interface StudentDao 
{
	
	public void setDataSource(DataSource ds);
    public void create();
    public void insert(Integer id,String name, Integer age);
    //public List<Student> listStudents();
    public void update(Integer id, Integer age);
    public void delete(Integer id);
}
