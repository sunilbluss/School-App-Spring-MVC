package com.my_school.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.my_school.dao.CourseDAOImpl;
import com.my_school.model.Course;

@Service
public class CourseServiceImpl implements CourseService {

	@Autowired
	private CourseDAOImpl courseDAO;
	
	public void setCourseDAO(CourseDAOImpl courseDAO) {
		this.courseDAO = courseDAO;
	}
	
	public void addCourse(Course c) {
		this.courseDAO.addCourse(c);
	}

	public List<Course> getAllCourses() {
		return this.courseDAO.getAllCourses();
	}

	public int deleteCourse(int id) {
		return this.courseDAO.deleteCourse(id);
	}

	public Course getCourseById(int id) {
		return this.courseDAO.getCourseById(id);
	}

	public void editCourse(Course c) {
		this.courseDAO.editCourse(c);
	}

}
