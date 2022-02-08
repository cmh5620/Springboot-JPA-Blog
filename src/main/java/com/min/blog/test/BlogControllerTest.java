package com.min.blog.test;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BlogControllerTest {

	public BlogControllerTest() {
		// TODO Auto-generated constructor stub

	}
	
	@GetMapping("/login/hello")
	public String Hello() {
		return "<h1>test</h1>" ; 
	}

}
