package com.my_school.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class StudentController {
	
	@RequestMapping(value = "/", method = RequestMethod.GET)    
    public String showStudentView(Model m){
        return "student";   
    }  
	
	@RequestMapping(value = "/add-student", method = RequestMethod.GET)    
    public String showAddStudentView(Model m){
        return "add_student";   
    } 

}
