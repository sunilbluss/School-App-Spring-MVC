package com.my_school.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class CourseController {
	
	@RequestMapping(value = "/course", method = RequestMethod.GET)    
    public String showCourseView(Model m){
        return "course";   
    } 
	
	@RequestMapping(value = "/add-course", method = RequestMethod.GET)    
    public String addCourseView(Model m){
        return "add_course";   
    } 
	
}
