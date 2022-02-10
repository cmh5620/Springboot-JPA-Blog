package com.min.blog.test;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;



@RestController
public class BlogControllertest {
	public String str = "dd      " ; 
	public BlogControllertest() {
		// TODO Auto-generated constructor stub
 
	}

	   
	@GetMapping("/login/hello2")
	public String Hello() { 
		return "<h1>test234</h1>ddaa" ;  
	}

}
