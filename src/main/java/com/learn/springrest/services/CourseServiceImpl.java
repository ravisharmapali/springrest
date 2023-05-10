package com.learn.springrest.services;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.learn.springrest.entities.Course;

@Service
public class CourseServiceImpl implements ICourseService {

	List<Course> list;

	public CourseServiceImpl() {
		list = new ArrayList<>();
		list.add(new Course(115L, "Core Java", "Learn basics of Java"));
		list.add(new Course(116L, "Spring MVC", "Spring MVC complete"));

	}

	@Override
	public List<Course> getCourses() {

		return list;
	}

}
