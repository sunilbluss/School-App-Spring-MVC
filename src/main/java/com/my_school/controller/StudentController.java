package com.my_school.controller;

import javax.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.my_school.model.Course;
import com.my_school.model.Student;
import com.my_school.service.StudentService;

@Controller
public class StudentController {
	
	@Autowired
    private StudentService studentService;
	
	@RequestMapping(value = "/", method = RequestMethod.GET)    
    public String showStudentView(Model model){
		model.addAttribute("students", studentService.getAllStudents());
        return "student";   
    }  
	
	@RequestMapping(value = "/add-student", method = RequestMethod.GET)    
    public String showAddStudentView(Model model){
		model.addAttribute("student", new Student());
		model.addAttribute("status", null);
		model.addAttribute("msg", null);
        return "add_student";   
    } 
	
	@RequestMapping(value = "/add-student", method = RequestMethod.POST)    
    public String addStudent(@Valid @ModelAttribute("student") Student student, BindingResult result, Model model){
		if (result.hasErrors()) {
			model.addAttribute("status", "error");
			model.addAttribute("msg", "Something wrong. Try Again.");
            return "add_student";
        }
		studentService.addStudent(student);
		model.addAttribute("status", "success");
		model.addAttribute("msg", "Student added.");
		model.addAttribute("student", new Student());
        return "add_student";   
    }
	
	@RequestMapping(value="/delete-student/{id}",method = RequestMethod.GET)    
    public String deleteStudent(@PathVariable int id){   
		try {
			studentService.deleteStudent(id);
			return "redirect:/";    
		}
		catch(Exception e) {
			return "redirect:/";
		}
    } 
	
	@RequestMapping(value = "/edit-student/{id}", method = RequestMethod.GET)    
    public String showEditStudentView(Model model, @PathVariable int id){
		Student student = null;
		try {
			student = studentService.getStudentById(id);
		}
		catch(Exception e) {
			return "redirect:/";
		}
		model.addAttribute("student", student);
		model.addAttribute("status", null);
		model.addAttribute("msg", null);
        return "edit_student";   
    } 
	
	@RequestMapping(value = "/edit-student", method = RequestMethod.POST)    
    public String editStudent(@Valid @ModelAttribute("student") Student student, BindingResult result, Model model){
		if (result.hasErrors()) {
			model.addAttribute("status", "error");
			model.addAttribute("msg", "Something wrong. Try Again.");
            return "edit_student";
        }
		studentService.editStudent(student);
		model.addAttribute("status", "success");
		model.addAttribute("msg", "Student updated.");
        return "edit_student";   
    }
	
	@RequestMapping(value = "/student-course/{id}", method = RequestMethod.GET)    
    public String showStudentCourseView(Model model, @PathVariable int id){
		model.addAttribute("studentId", id);
		model.addAttribute("courses", studentService.getStudentCourses(id));
        return "student_courses";   
    } 
	
	@RequestMapping(value = "/student-course/add-course/{id}", method = RequestMethod.GET)    
    public String addStudentCourseView(Model model, @PathVariable int id){
		model.addAttribute("studentId", id);
		model.addAttribute("course", new Course());
		model.addAttribute("status", null);
		model.addAttribute("msg", null);
		model.addAttribute("courses", studentService.getCourses(id));
        return "add_student_course";   
    }
	
	@RequestMapping(value = "/student-course/add-course/{id}", method = RequestMethod.POST)    
    public String addStudentCourse(@Valid @ModelAttribute("course") Course course, BindingResult result, Model model, @PathVariable int id){
		model.addAttribute("courses", studentService.getCourses(id));
		model.addAttribute("studentId", id);
		if (result.hasErrors()) {
			model.addAttribute("status", "error");
			model.addAttribute("msg", "Something wrong. Try Again.");
            return "add_student_course";
        }
		studentService.addStudentCourse(id, course.getCourseId());
		model.addAttribute("status", "success");
		model.addAttribute("msg", "Student Course added.");
        return "add_student_course";   
    }
	
	@RequestMapping(value="/student-course/delete-course/{studentId}/{courseId}",method = RequestMethod.GET)    
    public String deleteStudentCourse(@PathVariable int studentId, @PathVariable int courseId){   
		try {
			studentService.deleteStudentCourse(studentId, courseId);
			return "redirect:/student-course/" + studentId;   
		}
		catch(Exception e) {
			return "redirect:/student-course/" + studentId;
		}
    } 

}
