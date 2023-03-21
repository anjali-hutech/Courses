package com.example.spring.courses.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.spring.courses.Responses.UserResponse;
import com.example.spring.courses.entity.service.UserService;
import com.example.spring.courses.model.UserDto;

import jakarta.mail.MessagingException;

@RestController
@RequestMapping("/api/v1")

public class UserController {
	
	@Autowired
	private UserService userService;

	@PostMapping("/userRegistration")
	public UserResponse userRegistration(@RequestBody UserDto dto) throws MessagingException
	{
		return  userService.registrationForUser(dto);
	}
}
