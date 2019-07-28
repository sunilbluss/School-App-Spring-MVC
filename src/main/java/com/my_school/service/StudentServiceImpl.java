package com.my_school.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.my_school.dao.StudentDAOImpl;
import com.my_school.model.Course;
import com.my_school.model.Student;

@Service
public class StudentServiceImpl implements StudentService{
	
	@Autowired
	private StudentDAOImpl studentDAO;

	public void setStudentDAO(StudentDAOImpl studentDAO) {
		this.studentDAO = studentDAO;
	}

	public void addStudent(Student s) {
		this.studentDAO.addStudent(s);
	}

	public List<Student> getAllStudents() {
		return this.studentDAO.getAllStudents();
	}

	public int deleteStudent(int id) {
		return this.studentDAO.deleteStudent(id);
	}

	public Student getStudentById(int id) {
		return this.studentDAO.getStudentById(id);
	}

	public void editStudent(Student s) {
		this.studentDAO.editStudent(s);
		
	}

	public List<Course> getStudentCourses(int id) {
		return this.studentDAO.getStudentCourses(id);
	}

	public List<Course> getCourses(int id) {
		return this.studentDAO.getCourses(id);
	}

	public void addStudentCourse(int studentId, int courseId) {
		this.studentDAO.addStudentCourse(studentId, courseId);
	}

	public int deleteStudentCourse(int studentId, int courseId) {
		return this.studentDAO.deleteStudentCourse(studentId, courseId);
	}

}
