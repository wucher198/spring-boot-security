package com.usf.myjava.springbootsecurity.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/")
public class MainController {
	@GetMapping({"/", "/main"})
	public String main(ModelMap model) {
		return "main";
	}
	
	@GetMapping("/settings")
	public String settings(ModelMap model) {
		return "settings";
	}
	
}
