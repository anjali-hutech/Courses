package com.example.spring.courses.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.spring.courses.Responses.CourseResponse;
import com.example.spring.courses.Responses.CoursesNames;
import com.example.spring.courses.entity.service.CoursesService;
import com.example.spring.courses.model.CoursesDto;


@RestController
@RequestMapping("/api/v1")
public class CoursesController {

	@Autowired
	private CoursesService coursesService;
	
	@PostMapping("/addCourses")
	public CourseResponse courses(@RequestBody CoursesDto dto)
	{
		return coursesService.addCourseses(dto);
	}
	
	@GetMapping("get/All/CoursesList")
	public List<CoursesNames>  getAllNames()
	{
		return coursesService.getAll();
	}
	
}
