package com.learn.springrest.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.learn.springrest.entities.Course;
import com.learn.springrest.services.ICourseService;

@RestController
public class CourseController {
	
	@Autowired
	private ICourseService courseService;
	
	@GetMapping("/courses")
	public List<Course> getCourses(){
		
		 return courseService.getCourses();
		
	}
}
