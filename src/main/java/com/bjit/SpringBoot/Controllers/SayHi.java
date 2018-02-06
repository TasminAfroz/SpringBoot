package com.bjit.SpringBoot.Controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SayHi {
	@RequestMapping("/hello")
	public String hiprint() {
		return "hi";
	}

}
