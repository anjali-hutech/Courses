package com.example.spring.courses.model;

import lombok.Data;

@Data
public class CoursesDto {

	private String courseName;
	private String description;
	private String trainer;
	private String trainerEmailId;
	private Long durationInDays;
}
