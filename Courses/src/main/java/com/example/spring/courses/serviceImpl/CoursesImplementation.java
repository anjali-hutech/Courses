package com.example.spring.courses.serviceImpl;

import java.util.ArrayList;
import java.util.List;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.spring.courses.Responses.CourseResponse;
import com.example.spring.courses.Responses.CoursesNames;
import com.example.spring.courses.entity.Courses;
import com.example.spring.courses.entity.service.CoursesService;
import com.example.spring.courses.model.CoursesDto;
import com.example.spring.courses.repository.CoursesRepository;

@Service
public class CoursesImplementation implements CoursesService{

	@Autowired
	private CoursesRepository coursesRepository;
	
	@Autowired
	private ModelMapper mapper;
	
	
	 //adding The courses data impl
	@Override
	public CourseResponse addCourseses(CoursesDto dto) {
		Courses courses=new Courses();
		courses.setTrainer(dto.getTrainer());
		courses.setCourseName(dto.getCourseName());
		courses.setDescription(dto.getDescription());
		courses.setTrainerEmailId(dto.getTrainerEmailId());
		courses.setDurationInDays(dto.getDurationInDays());
		coursesRepository.save(courses);
		CourseResponse response=mapper.map(courses, CourseResponse.class);
		return response;
	}

//get All courses List
	@Override
	public List<CoursesNames> getAll() {
		List<Courses> courses=coursesRepository.findAll();
		List<CoursesNames> cou=new  ArrayList<>();
        for(Courses couse:courses)
		{
			CoursesNames names=mapper.map(couse, CoursesNames.class);
			names.getCourseName();
			names.getDescription();
			names.getDurationInDays();
			cou.add(names);
			
		}
		
		return cou;
	}

	
}
