package com.example.spring.courses.entity.service;

import org.springframework.stereotype.Service;

import com.example.spring.courses.Responses.UserResponse;
import com.example.spring.courses.exception.ResourceNotFoundException;
import com.example.spring.courses.model.CoursesSelectDto;
import com.example.spring.courses.model.UserDto;

import jakarta.mail.MessagingException;

@Service
public interface UserService {

	public UserResponse registrationForUser(UserDto dto) throws MessagingException;
	
	public String login(String emailId) throws ResourceNotFoundException ;

	public String SelectCourses(Long id,CoursesSelectDto dtos);
	
}
