package com.example.spring.courses.Responses;

import lombok.Data;

@Data
public class CourseResponse {

	private String courseName;
	private String description;
	private String trainer;
	private String trainerEmailId;
	private long durationInDays;
}
