package com.first;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class StudentController {
	
	
	@RequestMapping(value="/student.do",method=RequestMethod.GET)
	public ModelAndView student()
	{
		return new ModelAndView("student","student",new Student());
	}
	@RequestMapping(value="/addStudent.do",method=RequestMethod.POST)
	public ModelAndView addStudent(@ModelAttribute("student")Student student)
	{
		//map.addAttribute("name","ramu");
		//map.addAttribute("age",30);
		//map.addAttribute("id",234);
		//return "result";
		return new ModelAndView("result","student",student);
	}

}
