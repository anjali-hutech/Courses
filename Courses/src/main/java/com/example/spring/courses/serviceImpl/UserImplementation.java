package com.example.spring.courses.serviceImpl;



import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.mail.javamail.MimeMessageHelper;
import org.springframework.stereotype.Service;

import com.example.spring.courses.Responses.UserResponse;
import com.example.spring.courses.entity.Users;
import com.example.spring.courses.entity.service.UserService;
import com.example.spring.courses.exception.ResourceNotFoundException;
import com.example.spring.courses.model.CoursesSelectDto;
import com.example.spring.courses.model.UserDto;
import com.example.spring.courses.repository.UserRepository;

import jakarta.mail.MessagingException;
import jakarta.mail.internet.MimeMessage;

@Service
public class UserImplementation implements UserService{

	@Autowired
	private UserRepository userRepository;
	
	@Autowired
	private ModelMapper mapper;
	
	@Autowired
	private JavaMailSender mailSender;
	
	
	//user Registration api
	
	@Override
	public UserResponse registrationForUser(UserDto dto) throws MessagingException {
		Users user=this.mapper.map(dto, Users.class);
		user.setUserName(dto.getUserName());
		user.setUserEmail(dto.getUserEmail());
		userRepository.save(user);
		String userName = user.getUserName();
		
		MimeMessage mimeMessage = mailSender.createMimeMessage();
		MimeMessageHelper mimeMessageHelper = new MimeMessageHelper(mimeMessage);
		mimeMessageHelper.setTo(user.getUserEmail());
		mimeMessageHelper.setSubject("User Registration Successfully done");
		String content = ("Dear " + userName
				+ "<br>Your Registration Successfully done.<br><br>");
			
		mimeMessage.setContent(content, "text/html; charset=utf-8");
		mailSender.send(mimeMessage);
		UserResponse us = mapper.map(user, UserResponse.class);
		return us;
		
	}
	
	
	@Override
	public String login(String emailId) throws ResourceNotFoundException {

		if (userRepository.findByEmail(emailId) == null) {
			throw new ResourceNotFoundException("You are not a register user ", 404);
		}
		return "Loggedin Sucessfully";
	}


	@Override
	public String SelectCourses(Long id,CoursesSelectDto dtos) {
		Users user=userRepository.findByuserId(id);
		user.setCourseName(null);
		return null;
	}
 
			
		
	

}
