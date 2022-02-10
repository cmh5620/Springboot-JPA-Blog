package com.min.blog.test;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class HttpControllertest {
	private String username   = null ; 
	  
	@GetMapping("/http/get") 
	public String getTest(@RequestParam String id, @RequestParam String username ) {
		return "get요청  id :"+id +"name : "+username; 
	//	return "get요청  id :" ;     
     
	}
	  
	@GetMapping("/http/get2") 
	public String getTest2( ) {
		return "ssss" ; 
	//	return "get요청  id :" ;     
   
	}

	
	
	
	
	
	
	@PostMapping("/http/post")
	public String postTest() {	
		  
		return "post요청     "; 
	}

	@PutMapping("/http/put")
	public String putTest() {
		return "put요청";
	}
//
//	@DeleteMapping("/http/del")
//	public String deleteTest() {
//		return "delete요청   ";
//	}

}
