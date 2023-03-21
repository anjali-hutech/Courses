package com.example.spring.courses.entity;


import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "courses")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Courses {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	private String courseName;
	private String description;
	private String trainer;
	private String trainerEmailId;
	private long durationInDays;
	
	
}
