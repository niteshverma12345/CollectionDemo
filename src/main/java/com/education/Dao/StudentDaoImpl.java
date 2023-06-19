package com.education.Dao;

import org.springframework.stereotype.Repository;
import java.sql.SQLException;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

//import org.apache.jasper.tagplugins.jstl.core.ForEach;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;

import com.education.Model.StudentDetail;
import com.education.Model.StudentLogin;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
//import org.springframework.stereotype.Repository;

@Repository
public class StudentDaoImpl implements StudentDao {
	boolean result;
	private SessionFactory sessionFactory;

	JdbcTemplate jdbcTemplate;

	public void setSessionFactory(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}

	@Override
	public void add(StudentDetail std) {
		System.out.println(std);
		Session session = this.sessionFactory.openSession();
		session.save(std);

	}

	@Override
	public List retrive(int pageId) {
		Session session = this.sessionFactory.openSession();
		List<StudentDetail> li = new ArrayList<StudentDetail>();
		Query q = session.createQuery("from StudentDetail");
		q.setFirstResult(1);
		q.setMaxResults(5);
		li = q.list();

		return li;
	}

	@Override
	public StudentDetail edite(int stuId) {
		Session session = this.sessionFactory.openSession();
		StudentDetail detail = (StudentDetail) session.get(StudentDetail.class, new Integer(stuId));
		return detail;
	}

	@Override
	public void update(StudentDetail detail) {
		Session session = this.sessionFactory.openSession();
		Query q = session.createQuery("from StudentDetail");
		List<StudentDetail> recordList = new ArrayList<StudentDetail>();
		recordList = q.list();
		Iterator<StudentDetail> itr = recordList.iterator();
		while (itr.hasNext()) {
			StudentDetail studentRecord = itr.next();
			if (studentRecord.getStuId() == detail.getStuId()) {
				System.out.println(" Old record is " + studentRecord);
				System.out.println("New record is " + detail);
//				session.saveOrUpdate(detail);
			}
		}

		System.out.println("Data update");
	}

	@Override
	public void removeData(int stuId) {

		Session session = this.sessionFactory.getCurrentSession();
		StudentDetail Student = (StudentDetail) session.get(StudentDetail.class, new Integer(stuId));
		System.out.println(Student);

		session.delete(Student);
		System.out.println("Data Remove Successfully");

	}

	@Override
	public List<StudentDetail> paginaction(int pagaNo) {
		Session session = this.sessionFactory.openSession();
		Query q = session.createQuery("From StudentDetail");
		List<StudentDetail> dataList = new ArrayList<StudentDetail>();

		List<StudentDetail> dataList1 = new ArrayList<StudentDetail>();

		dataList1 = q.list();

		q.setFirstResult(pagaNo);
		q.setMaxResults(5);
		dataList = q.list();

		return dataList;
	}

	@Override
	public StudentDetail login(StudentDetail detail) {
		StudentDetail studentDetail = null;
		String userName = detail.getUserName();
		String password = detail.getEmpPassword();
		Session session = this.sessionFactory.openSession();
		String s = "from StudentDetail where userName =:u and empPassword=:p ";
		Query q = session.createQuery(s);
		System.out.println(q);
		q.setParameter("u", userName);
		q.setParameter("p", password);

		studentDetail = (StudentDetail) q.uniqueResult();

		return studentDetail;
	}

	@Override
	public int forgetPassword(StudentDetail detail) {
		StudentDetail studentDetail;
		int roll_number = detail.getRoll_number();
		String userName = detail.getUserName();
		String empPass = detail.getEmpPassword();

		Session session = this.sessionFactory.openSession();

		System.out.println("hello Data");
		String updateData = "update StudentDetail set empPassword =:p where  userName=:u and roll_number=:r";
		Query up = session.createQuery(updateData);

		up.setParameter("u", userName);
		up.setParameter("r", roll_number);
		up.setParameter("p", empPass);
		int res = up.executeUpdate();

		return res;
	}

	@Override
	public List<StudentDetail> searchData(String findBase) {
		System.out.println(findBase);
		Session session = this.sessionFactory.openSession();
		Query q = (Query) session.createQuery("from StudentDetail where name like '%" + findBase + "%'");
		List<StudentDetail> dataList = new ArrayList<StudentDetail>();
		dataList = q.list();
		
		return dataList;
	}
}
