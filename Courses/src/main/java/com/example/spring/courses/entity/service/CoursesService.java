package com.example.spring.courses.entity.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.example.spring.courses.Responses.CourseResponse;
import com.example.spring.courses.Responses.CoursesNames;
import com.example.spring.courses.model.CoursesDto;

@Service
public interface CoursesService {

	public CourseResponse addCourseses(CoursesDto dto);
	
	public  List<CoursesNames> getAll();
	
}
