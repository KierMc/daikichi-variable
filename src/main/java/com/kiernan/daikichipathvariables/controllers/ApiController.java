package com.kiernan.daikichipathvariables.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ApiController {

	public ApiController() {
		// TODO Auto-generated constructor stub
	}
	
	@RequestMapping("/daikichi")
	public String daikichi() {
		return "Welcome";
	}
	
	@RequestMapping(value="/daikichi/today", method=RequestMethod.GET)
	public String daikichiToday() {
		return "Today you will find luck in all your endeavors";
	}
	
	@GetMapping("/daikichi/tomorrow")
	public String daikichiTomorrow () {
		return "Tomorrow, an opportunity will arise, so be sure to be open to new ideas";
	}
	

}
