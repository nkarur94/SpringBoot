package com.spring.project.HelloWorld;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController  //error on using controller annotation
public class Control {
	@RequestMapping("/web")
	public String view() {
		return "hello from bridgelabz";
		
	}
	

}
