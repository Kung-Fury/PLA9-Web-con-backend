package com.trifulcas.springseguridad.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/")
public class LoginIndexController {
	@GetMapping("/index-login")
	public String LoginIndex() {
		return "index-login";
	}
}
