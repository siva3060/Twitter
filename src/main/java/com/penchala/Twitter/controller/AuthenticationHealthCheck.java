
package com.penchala.Twitter.controller;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.GetMapping;

@RestController
@RequestMapping("/")
public class AuthenticationHealthCheck{

	@GetMapping("/healthcheck")
	public String HealthCheck(){
		return "KEEP_ALIVE_OK";
		//end of method HealthCheck
	}
	//end of class HealthCheck
}
