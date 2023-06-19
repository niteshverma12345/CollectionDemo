package com.education.Model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "StudnteTbl")
public class StudentDetail {
	@Id
	@Column(name = "stuId")
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int stuId;
	private int roll_number;
	@Column
	private String name;
	@Column
	private String address;
	@Column
	private String userName;
	@Column
	private String empPassword;
	
	
	
	public int getStuId() {
		return stuId;
	}

	public void setStuId(int stuId) {
		this.stuId = stuId;
	}

	@Column

	private String city;

	public int getRoll_number() {
		return roll_number;
	}

	public void setRoll_number(int roll_number) {
		this.roll_number = roll_number;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getSchl() {
		return schl;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	
	public void setSchl(String schl) {
		this.schl = schl;
	}

	@Column
	private String schl;



	public String getEmpPassword() {
		return empPassword;
	}

	public void setEmpPassword(String empPassword) {
		this.empPassword = empPassword;
	}

	@Override
	public String toString() {
		return "StudentDetail [stuId=" + stuId + ", roll_number=" + roll_number + ", name=" + name + ", address="
				+ address + ", userName=" + userName + ", empPassword=" + empPassword + ", city=" + city + ", schl="
				+ schl + "]";
	}



	



	



	
	

}
