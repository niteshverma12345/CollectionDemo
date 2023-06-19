package com.education.Model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
@Entity
@Table(name="loginTBL")
public class StudentLogin {

	@Id
	@Column
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int stuId;
	
	private String name;
	public int getStuId() {
		return stuId;
	}
	public void setStuId(int stuId) {
		this.stuId = stuId;
	}
	@Column
	private String roll;
	
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getRoll() {
		return roll;
	}
	public void setRoll(String roll) {
		this.roll = roll;
	}
	@Override
	public String toString() {
		return "StudentLogin [stuId=" + stuId + ", name=" + name + ", roll=" + roll + "]";
	}
	
	
}
