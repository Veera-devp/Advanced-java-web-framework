package com.spring.SpringFrame3;
import org.springframework.stereotype.Component;

@Component
public class Student {
	private String sname;
	private String rollno;

	public String getSname() {
		System.out.println(sname);
		return sname;
	}

	public void setSname(String sname) {
		this.sname = sname;
	}

	public String getRollno() {
		System.out.println(rollno);
		return rollno;
	}

	public void setRollno(String rollno) {
		this.rollno = rollno;
	}

}
