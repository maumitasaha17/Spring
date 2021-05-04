package com.cg.mvc;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HelloController {
	
	@RequestMapping("/viewForm")
	public String viewForm() {
		return "hello-form";
	}
	
	@RequestMapping("/processForm")
	public String processForm() {
		return "hello";
	}
}