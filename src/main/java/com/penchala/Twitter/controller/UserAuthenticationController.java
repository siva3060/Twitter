
package com.penchala.Twitter.controller;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController 
@RequestMapping
public class UserAuthenticationController{


	public String  ValidateUser(String userName,String password){
		//return authenticate(userName,password);
		//end of validateUser 
		return "IN_PROGRESS";
	}
	//end of class UserAuthenticationController 
}
