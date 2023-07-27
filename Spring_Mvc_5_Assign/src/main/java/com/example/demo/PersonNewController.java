package com.example.demo;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;

import jakarta.servlet.http.HttpSession;
@Controller
public class PersonNewController {
	@GetMapping("/")
	public String home()
	{
		return "Home";
	}
	@GetMapping("person")
	public ModelAndView before()
	{
 		Person defaultPerson=new Person();
	
		return new ModelAndView("person","myperson",defaultPerson);
	}
	
	@PostMapping("person")
	public String afterSubmit(
		@ModelAttribute("mb") Person person,HttpSession session) 
	{
		session.setAttribute("val",2000);
		return "View";
	}
}
