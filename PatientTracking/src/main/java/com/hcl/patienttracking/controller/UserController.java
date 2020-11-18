package com.hcl.patienttracking.controller;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.hcl.patienttracking.model.User;
import com.hcl.patienttracking.service.UserServiceImpl;
/**
 * 
 * This controller class has to give the controller to server
 * 
 * @author srimathi
 *
 */

@Component
@Controller
@RequestMapping("/user")
public class UserController {
	@Autowired
	UserServiceImpl userService;
	
    @RequestMapping(value = "/registration", method = RequestMethod.POST)
	public ModelAndView add(@ModelAttribute @Valid User user,BindingResult result) {
		if(result.hasErrors()) {
		//if (userService.register(user))
			return new ModelAndView("registration");
		}
		else {
			if(userService.register(user)) {
				return new ModelAndView("LoginSuccess");
			}
			else {
			return new ModelAndView("Loginfailure");
			}
	}
    }
	
	@RequestMapping("/registration")
	public ModelAndView add() {
		return new ModelAndView("registration","user",new User());
	}
	
	@RequestMapping(value = "/AddClerk", method = RequestMethod.POST)
	public ModelAndView add1(@ModelAttribute User user) {
			if(userService.register(user)) {
				return new ModelAndView("LoginSuccess");
			}
			else {
			return new ModelAndView("Loginfailure");
			}
	}
	
	@RequestMapping("/AddClerk")
	public ModelAndView add1() {
		return new ModelAndView("AddClerk","user",new User());
	}
	
	

	 @RequestMapping(value = "/Login", method = RequestMethod.POST)
		public ModelAndView add2(@ModelAttribute @Valid User user,BindingResult result) {
				if(userService.login(user)) {
					System.out.println("loginsuccess");
					return new ModelAndView("LoginSuccess");
				}
				else {
				return new ModelAndView("Loginfailure");
				}
	    }
	 
	 @RequestMapping("/Login")
		public ModelAndView add2() {
			return new ModelAndView("Login","user",new User());
		}
	 @RequestMapping(value = "/AddDoctor", method = RequestMethod.POST)
		public ModelAndView add3(@ModelAttribute User user) {
				if(userService.register(user)) {
					return new ModelAndView("LoginSuccess");
				}
				else {
				return new ModelAndView("Loginfailure");
				}
		}
		
		@RequestMapping("/AddDoctor")
		public ModelAndView add3() {
			return new ModelAndView("AddDoctor","user",new User());
		}
	
		 @RequestMapping(value = "/AddPatient", method = RequestMethod.POST)
			public ModelAndView add4(@ModelAttribute User user) {
					if(userService.register(user)) {
						return new ModelAndView("LoginSuccess");
					}
					else {
					return new ModelAndView("Loginfailure");
					}
			}
			
			@RequestMapping("/AddPatient")
			public ModelAndView add4() {
				return new ModelAndView("AddPatient","user",new User());
			}
}	