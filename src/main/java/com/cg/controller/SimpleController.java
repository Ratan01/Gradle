package com.cg.controller;

import org.springframework.web.bind.annotation.GetMapping;

public class SimpleController {
	@GetMapping("/greet")
	public String greet() {
		return "welcom back";
	}
}
