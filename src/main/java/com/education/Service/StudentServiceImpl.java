package com.education.Service;

import java.util.List;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.education.Dao.StudentDao;
import com.education.Model.StudentDetail;
import com.education.Model.StudentLogin;
@Service
public class StudentServiceImpl implements StudentService {

	
	private StudentDao studentDao;
	
	
	
	public void setStudentDao(StudentDao studentDao) {
		this.studentDao = studentDao;
	}



	@Override
	@Transactional
	public void add(StudentDetail std) {
		this.studentDao.add(std);
		
	}



	@Override
	public List retrive(int pageId) {
		
		return this.studentDao.retrive(pageId);
	}



	@Override
	public StudentDetail edite(int stuId) {
		
		return this.studentDao.edite(stuId);
	}



	@Override
	public void update(StudentDetail detail) {

this.studentDao.update(detail);
		
	}



	@Override
	@Transactional
	public void removeData(int stuId) {
		this.studentDao.removeData(stuId);
		
	}



	@Override
	public List<StudentDetail> paginaction(int pagaNo) {
		
		return this.studentDao.paginaction(pagaNo);
	}



	@Override
	public StudentDetail login(StudentDetail detail) {
	return this.studentDao.login(detail);
		
	}



	@Override
	public int forgetPassword(StudentDetail detail) {
		 return this.studentDao.forgetPassword(detail);
		
	}



	@Override
	public List<StudentDetail> searchData(String findBase) {

		return this.studentDao.searchData(findBase);
	}






	


	





	



	
}
