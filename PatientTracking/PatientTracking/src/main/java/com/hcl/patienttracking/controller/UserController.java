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
	
}	