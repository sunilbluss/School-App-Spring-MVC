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
import com.my_school.service.CourseService;

@Controller
public class CourseController {
	
	@Autowired
    private CourseService courseService;
	
	@RequestMapping(value = "/course", method = RequestMethod.GET)    
    public String showCourseView(Model model){
		model.addAttribute("courses", courseService.getAllCourses());
        return "course";   
    }  
	
	@RequestMapping(value = "/course/add-course", method = RequestMethod.GET)    
    public String showAddCourseView(Model model){
		model.addAttribute("course", new Course());
		model.addAttribute("status", null);
		model.addAttribute("msg", null);
        return "add_course";   
    } 
	
	@RequestMapping(value = "/course/add-course", method = RequestMethod.POST)    
    public String addCourse(@Valid @ModelAttribute("course") Course course, BindingResult result, Model model){
		if (result.hasErrors()) {
			model.addAttribute("status", "error");
			model.addAttribute("msg", "Something wrong. Try Again.");
            return "add_course";
        }
		courseService.addCourse(course);
		model.addAttribute("status", "success");
		model.addAttribute("msg", "Course added.");
		model.addAttribute("course", new Course());
        return "add_course";   
    }
	
	@RequestMapping(value="/course/delete-course/{id}",method = RequestMethod.GET)    
    public String delete(@PathVariable int id){ 
		try {
			courseService.deleteCourse(id);
			return "redirect:/course";
		}
		catch (Exception e) {
			return "redirect:/course";
		}  
    } 
	
	@RequestMapping(value = "/course/edit-course/{id}", method = RequestMethod.GET)    
    public String showEditCourseView(Model model, @PathVariable int id){
		Course course = null;
		try {
			course = courseService.getCourseById(id);
		}
		catch(Exception e) {
			return "redirect:/course";
		}
		model.addAttribute("course", course);
		model.addAttribute("status", null);
		model.addAttribute("msg", null);
        return "edit_course";   
    } 
	
	@RequestMapping(value = "/course/edit-course", method = RequestMethod.POST)    
    public String editCourse(@Valid @ModelAttribute("course") Course course, BindingResult result, Model model){
		if (result.hasErrors()) {
			model.addAttribute("status", "error");
			model.addAttribute("msg", "Something wrong. Try Again.");
            return "edit_course";
        }
		courseService.editCourse(course);
		model.addAttribute("status", "success");
		model.addAttribute("msg", "Course updated.");
        return "edit_course";   
    }
	
}
