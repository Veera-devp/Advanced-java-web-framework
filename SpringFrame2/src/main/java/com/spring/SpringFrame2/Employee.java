package com.spring.SpringFrame2;

public class Employee {
	private String ename;
	private String id;

	public String getEname() {
		System.out.println("-----Employee Data-----");
		System.out.println(ename);
		return ename;
	}

	public void setEname(String ename) {
		this.ename = ename;
	}

	public String getId() {
		System.out.println(id);
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

}
