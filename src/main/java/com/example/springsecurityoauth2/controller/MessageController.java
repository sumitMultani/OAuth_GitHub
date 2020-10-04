package com.example.springsecurityoauth2.controller;

import java.security.Principal;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MessageController {

	@GetMapping("/message")
	public String getMessage(Principal principal) {
		return principal.getName()+" Open Authorization is successfull using github credentials.";
	}
}
