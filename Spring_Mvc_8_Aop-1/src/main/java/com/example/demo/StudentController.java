package com.example.demo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;

import jakarta.servlet.http.HttpServletRequest;

@Controller
public class StudentController 
{
	@Autowired
	StudentRepository srepository;
	@GetMapping("new_student")
	public ModelAndView before()
	{
		Student s=new Student();
		return new ModelAndView("Student","mystudent",s);
	}
	@GetMapping("view_student")
	public String getStudents(HttpServletRequest request)
	{
		List<Student> studentlist=srepository.findAll();
		request.setAttribute("mylist", studentlist);
		return "View";
	}
	@PostMapping("new_student")
	public String afterSubmit(Student student)
	{
		srepository.save(student);
		return "success";
	}
}











