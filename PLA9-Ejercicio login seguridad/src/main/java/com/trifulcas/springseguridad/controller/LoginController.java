
package com.trifulcas.springseguridad.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class LoginController {

	@GetMapping("/login")
	public String formLogin() {
		return "login";
	}

	@GetMapping("/prohibido")
	public String prohibido() {
		return "prohibido";
	}
}
