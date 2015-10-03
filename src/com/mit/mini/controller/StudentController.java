package com.mit.mini.controller;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.mit.mini.model.Student;
import com.mit.mini.model.StudentLogin;
import com.mit.mini.service.StudentService;

@Controller
public class StudentController {

	@Autowired
	StudentService studentService;
	
	@RequestMapping("/hello")
	public ModelAndView helloWorld(){
		String message="Hello Spring MVC how r u";
//		Sring a = new String
		return new ModelAndView("hellopage","message",message);
	}
	@RequestMapping("/bye")
	public ModelAndView bye(){
		String message="bye Spring MVC take care";
//		Sring a = new String
		return new ModelAndView("login","message",message);
	}
	
	@RequestMapping(value="/login", method=RequestMethod.GET)
	public String login(Model model) {			
		StudentLogin studentLogin = new StudentLogin();		
		model.addAttribute("studentLogin", studentLogin);
		return "login";
	}
	
	@RequestMapping(value="/signup", method=RequestMethod.GET)
	public String signup(Model model) {
		Student student = new Student();		
		model.addAttribute("student", student);		
		return "signup";
	}
//	@RequestMapping(value="/signup", method=RequestMethod.POST)
//	public String signup(@Valid @ModelAttribute("student") Student student, BindingResult result, Model model) {		
//		if(result.hasErrors()) {
//			return "signup";
//		} else if(studentService.findByUserName(student.getUserName())) {
//			model.addAttribute("message", "User Name exists. Try another user name");
//			return "signup";
//		} else {
//			studentService.save(student);
//			model.addAttribute("message", "Saved student details");
//			return "redirect:login.html";
//		}
//	}
}
