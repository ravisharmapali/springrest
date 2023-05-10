package com.learn.springrest.services;

import java.util.List;

import com.learn.springrest.entities.Course;

public interface ICourseService {

	public List<Course> getCourses();

	public Course getCourse(long courseId);

	public Course addCourse(Course course);
}
