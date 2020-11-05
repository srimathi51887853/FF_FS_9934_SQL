package com.hcl.patienttracking.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.hcl.patienttracking.model.Bill;
import com.hcl.patienttracking.service.BillService;



@Component
@Controller
@RequestMapping("/Bill")
public class BillController {
	@Autowired
	BillService billservice;
	
	@RequestMapping(value="/registration",method=RequestMethod.POST)
	public ModelAndView add(@ModelAttribute Bill bill) {
		if (billservice.register(bill)){
			return new ModelAndView("LoginSuccess");
		}else {
			return new ModelAndView("Loginfailure");
		}
	}
	
	@RequestMapping("/Registration")
	public ModelAndView add() {
		return new ModelAndView("Registration","user",new Bill());
	}
	
}	