package com.example.bookzy.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BookzyController {

	@RequestMapping("/bookzy")
	public String index() {
		return "Welcome to Bookzy application !";
	}
}
