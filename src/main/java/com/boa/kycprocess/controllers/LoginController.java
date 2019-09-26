package com.boa.kycprocess.controllers;

import java.security.Principal;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;


@Controller
public class LoginController {
   
	
	
	
	  @GetMapping("/login") public String login(){ return "login"; }
	  
	  @GetMapping("/error") 
	  public String error(Model model) { 
		  model.addAttribute("loginError", true);
		  return "error"; }
	 
	 
	 
	
}
