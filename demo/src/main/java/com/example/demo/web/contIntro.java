package com.example.demo.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class contIntro {

	@RequestMapping("/intro")
	public String getIntro() {
		return "intro";
	}
}
