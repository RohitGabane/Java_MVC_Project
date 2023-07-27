package com.example.demo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;

import jakarta.servlet.http.HttpServletRequest;

@Controller
public class TourController 
{
	@Autowired
	TourRepository srepository;
	@GetMapping("new_tour")
	public ModelAndView before()
	{
		Tour s=new Tour();
		return new ModelAndView("Tour","mytour",s);
	}
	@GetMapping("view_tour")
	public String getStudents(HttpServletRequest request)
	{
		List<Tour> tourlist=srepository.findAll();
		request.setAttribute("mylist", tourlist);
		return "ViewTour";
	}
	@PostMapping("new_tour")
	public String afterSubmit(Tour tour)
	{
		srepository.save(tour);
		return "success";
	}
}











