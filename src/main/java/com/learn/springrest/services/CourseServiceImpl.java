package com.learn.springrest.services;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Qualifier;
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

	@Override
	public Course getCourse(long courseId) {

		// finding course
		Course c = null;
		for (Course course : list) {
			if (course.getCourseId() == courseId) {
				c = course;
				break;
			}
		}

		return c;
	}

	@Override
	public Course addCourse(Course course) {

		if (list.add(course))
			return course;
		else
			return null;
	}

	@Override
	public Course updateCourse(Course course,Long courseId) {
		
		list.forEach(c->{
			if(c.getCourseId()==courseId) {
				c.setCourseTitle(course.getCourseTitle());
				c.setCourseDescription(course.getCourseDescription());
				
			}
		});
			
		return course;
	}
	
	@Override
	public void deleteCourse(Long courseId) {
		
		try {
		list.forEach(c->{
			if(c.getCourseId()==courseId)
				list.remove(c);
			
		});
		}
		catch(Exception e) {
			System.out.println("exception");
		}
//		list.stream().filter(null)
	}
}
