package com.my_school.service;

import java.util.List;

import com.my_school.model.Course;
import com.my_school.model.Student;

public interface StudentService {
	
	public void addStudent(Student s);
	public List<Student> getAllStudents();
	public int deleteStudent(int id);
	public Student getStudentById(int id);
	public void editStudent(Student s);
	public List<Course> getStudentCourses(int id);
	public List<Course> getCourses(int id);
	public void addStudentCourse(int studentId, int courseId);
	public int deleteStudentCourse(int studentId, int courseId);
}
