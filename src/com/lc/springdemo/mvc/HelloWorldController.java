package com.lc.springdemo.mvc;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HelloWorldController {
	
	//controller method to show the form
	@RequestMapping("/showForm")
	public String showForm() {
		return "helloworld-form";
	}
	//controller method to process the form
	@RequestMapping("/processForm")
	public String processForm() {
		return "helloworld";
	}
}
