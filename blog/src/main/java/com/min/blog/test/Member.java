package com.min.blog.test;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Member {

	private String username  ;
	private String password ; 
	private String email ;        
	 
	
	public Member(String username, String password, String email) {
 
		this.username = username;  
		this.password = password;    
		this.email = email;    
	} 
	
	
}
