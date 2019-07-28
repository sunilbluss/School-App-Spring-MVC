package com.my_school.dao;

import java.util.List;

import com.my_school.model.Course;


public interface CourseDAO {
	public int addCourse(Course c);
	public List<Course> getAllCourses();
	public int deleteCourse(int id);
	public Course getCourseById(int id);
	public int editCourse(Course c);
}
