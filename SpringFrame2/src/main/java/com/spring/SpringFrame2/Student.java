package com.spring.SpringFrame2;

public class Student {
	private String sname;
	private String rollno;

	public String getSname() {
		System.out.println("-----Student Data-----");
		System.out.println(sname);
		return sname;
	}

	public void setSname(String sname) {
		this.sname = sname;
	}

	public String getRollno() {
		System.out.println(rollno+"\n");
		return rollno;
	}

	public void setRollno(String rollno) {
		this.rollno = rollno;
	}

}
