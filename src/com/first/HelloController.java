package com.first;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.ui.ModelMap;
@Controller
public class HelloController {

	@RequestMapping(value="/hello",method=RequestMethod.GET)
	public String printHello(ModelMap map)
	{
		map.addAttribute("message", "Hello Spring MVC Framework");
		return "hello";
	}
}
