package com.relevel.backend.porter.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PorterController {

	@GetMapping("/ping")
	public String ping() {
		return "Ping is Successful";
	}
}

