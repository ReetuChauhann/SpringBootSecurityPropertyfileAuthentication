package com.reetu.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class Mycontroller {
	
	@RequestMapping("/")
	public String homepage() {
		return "index";
	}

}
