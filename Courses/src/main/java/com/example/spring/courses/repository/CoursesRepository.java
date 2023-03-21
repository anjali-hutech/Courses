package com.example.spring.courses.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.spring.courses.entity.Courses;

@Repository
public interface CoursesRepository extends JpaRepository<Courses, Long>{

}
