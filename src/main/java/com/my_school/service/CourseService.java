package com.my_school.service;

import java.util.List;

import com.my_school.model.Course;

public interface CourseService {
	public void addCourse(Course c);
	public List<Course> getAllCourses();
	public int deleteCourse(int id);
	public Course getCourseById(int id);
	public void editCourse(Course c);
}
