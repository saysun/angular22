package com.aysun.controller;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Student_Info {
	
	@Id
	private int rollNo;
	private String name;
	public int getRollNo() {
		return rollNo;
	}
	public void setRollNo(int rollNo) {
		this.rollNo = rollNo;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}

}
