package com.zensar.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyController {
	
	@RequestMapping("/hello")
	public String sayHello() {
		return "<h1>Hello Jenkins from MyController</h1>";
	}

}
