package com.education.Controller;

import java.util.ArrayList;

//import org.springframework.stereotype.Controller;

//import org.springframework.web.bind.annotation.ModelAttribute;
//import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.bind.annotation.RequestMethod;
//
//import com.education.Model.StudentDetail;
//import com.education.Service.StudentService;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.hibernate.validator.constraints.pl.REGON;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.education.Model.StudentDetail;
import com.education.Model.StudentLogin;
import com.education.Service.StudentService;

@Controller
public class StudentController {
	private StudentService studentService;

	List<StudentDetail> al = new ArrayList<StudentDetail>();

	@Autowired(required = true)
	@Qualifier(value = "studentService")

	public void setStudentService(StudentService studentService) {
		this.studentService = studentService;

	}

//# AddData//

	@RequestMapping("/registractionForm")
	public String registrationForm()

	{
		return "registrationForm1";
	}

	@RequestMapping("/regisData")
	public String regisData(@ModelAttribute("StudentDetail") StudentDetail std) {

		this.studentService.add(std);

		return "redirect:login";
	}

//#DataRetrive//

	@RequestMapping("/getData")
	public String retrive(Model model) {
		int pageId = 5;
		model.addAttribute("empData", this.studentService.retrive(pageId));

		return "viewData";

	}

//#Edite Data//
	@RequestMapping("/edite/{stuId}")

	public String edite(@PathVariable int stuId, Model model) {
		model.addAttribute("detail", this.studentService.edite(stuId));

		return "editeForm";
	}
	// #UpdateData//

	@RequestMapping("/update")
	public String updateData(@ModelAttribute("StudentDetail") StudentDetail detail) {

		System.out.println(detail);
		this.studentService.update(detail);
		return "redirect:getData";
	}

//#DeleteData//

	@RequestMapping("delete/{stuId}")
	public String removeData(@PathVariable int stuId) {
		System.out.println("Hello");
		this.studentService.removeData(stuId);

		return "viewData";

	}

	// # Pagination//

	@RequestMapping("/NextData/{pagaNo}")
	public String priviewsdata(@PathVariable int pagaNo, Model model) {
		System.out.println(pagaNo);
		int pageNumber = pagaNo;

		int temp = pagaNo - 1;
		if (pagaNo == 1) {

		} else {
			pagaNo = (pagaNo - 1) * 5;
			pagaNo = pagaNo + 1;
		}

		al = this.studentService.paginaction(pagaNo);
		System.out.println("Student List is " + al);
		if (al.size() < 1) {
			model.addAttribute("page", temp);
			return "NoRecord";
		} else {
			model.addAttribute("empData", al);
			return "Page";
		}
	}

	// #Login//
	@RequestMapping("/login")
	public String userLogin() {
		return "LoginForm";

	}

	@RequestMapping("/LogiController")
	public String loginData(@ModelAttribute("StudentDetail") StudentDetail detail, Model model) {

		StudentDetail result = this.studentService.login(detail);
		System.out.println(result);
		if (result != null) {

			return "redirect:getData";
		} else {

			model.addAttribute("msg", " Incorrect Username and Password ");
			return "LoginForm";
		}

	}

	@RequestMapping("/logout")
	public String userLogOut() {
		System.out.println("hello");
		return "LogingForm";

	}
	
	@RequestMapping("/forgetpassword")
	public String forgetPass() {

		return "forgetForm";
	}

	@RequestMapping("/recoverPass")
	public String resetPass(@ModelAttribute("StudentDetail") StudentDetail detail, Model model) {
		int result = this.studentService.forgetPassword(detail);

		if (result == 1) {
			model.addAttribute("msg", "password reset successfully");
			return "LoginForm";
		} else {
			model.addAttribute("msg", "Incorrect username and rollNumber");
			return "forgetForm";
		}

	}

	@RequestMapping("/searchRecord")
	public String searchData(HttpServletRequest request, Model model) {

		String findBase = request.getParameter("searchData");
		al = this.studentService.searchData(findBase);

		if (al.size() >= 1) {
			model.addAttribute("empData", al);
			return "viewData";
		} else {
			return "NoRecord";
		}
	}

}
