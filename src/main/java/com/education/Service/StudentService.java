package com.education.Service;

import java.util.List;

import com.education.Model.StudentDetail;
import com.education.Model.StudentLogin;

public interface StudentService {

	
	
	public void add(StudentDetail std);
	public List retrive(int pageId);
	public StudentDetail edite(int stuId);
	public void update(StudentDetail detail);
	public void removeData(int stuId);
	
	public List<StudentDetail> paginaction(int pagaNo);
	public StudentDetail login(StudentDetail detail);
	public int forgetPassword(StudentDetail detail);
	public List<StudentDetail> searchData(String findBase);
}
