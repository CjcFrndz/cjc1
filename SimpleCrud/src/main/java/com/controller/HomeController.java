package com.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.serviceI.ServiceI;

@Controller
public class HomeController {
ServiceI service;

@RequestMapping("/")
public String welcome()
{
	System.out.println("In welcome");
	return "Login";
}
	

}
