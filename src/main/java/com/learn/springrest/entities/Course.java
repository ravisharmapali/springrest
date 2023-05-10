package com.learn.springrest.entities;
/**
 * @author Ravi Sharma
 * @apiNote Course entity classs
 * **/

public class Course {
	
	private Long courseId;
	
	private String courseTitle;
	
	private String courseDescription;

	
	public Course(Long courseId, String courseTitle, String courseDescription) {
		super();
		this.courseId = courseId;
		this.courseTitle = courseTitle;
		this.courseDescription = courseDescription;
	}


	public Long getCourseId() {
		return courseId;
	}


	public void setCourseId(Long courseId) {
		this.courseId = courseId;
	}


	public String getCourseTitle() {
		return courseTitle;
	}


	public void setCourseTitle(String courseTitle) {
		this.courseTitle = courseTitle;
	}


	public String getCourseDescription() {
		return courseDescription;
	}


	public void setCourseDescription(String courseDescription) {
		this.courseDescription = courseDescription;
	}


	@Override
	public String toString() {
		return "Course [courseId=" + courseId + ", courseTitle=" + courseTitle + ", courseDescription="
				+ courseDescription + "]";
	}
	
	
}
