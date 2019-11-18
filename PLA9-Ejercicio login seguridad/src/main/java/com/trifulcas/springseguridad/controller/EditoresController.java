package com.trifulcas.springseguridad.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/editores")
public class EditoresController {

	@GetMapping("/")
	public String inicio() {
		return "index-editores";
	}
}
