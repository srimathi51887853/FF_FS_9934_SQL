package com.hcl.patienttracking.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.hcl.patienttracking.model.Medicine;
import com.hcl.patienttracking.service.MedicineService;


@Component
@Controller
@RequestMapping("/medicine")
public class MedicineController {
	@Autowired
	MedicineService medicineservice;
	
	@RequestMapping(value="/registration",method=RequestMethod.POST)
	public ModelAndView add(@ModelAttribute Medicine medicine) {
		if (medicineservice.register(medicine)){
			return new ModelAndView("LoginSuccess");
		}else {
			return new ModelAndView("Loginfailure");
		}
	}
	
	@RequestMapping("/registration")
	public ModelAndView add() {
		return new ModelAndView("registration","user",new Medicine());
	}
	
}	