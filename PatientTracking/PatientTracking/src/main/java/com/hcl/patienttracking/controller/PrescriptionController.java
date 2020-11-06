package com.hcl.patienttracking.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;
import com.hcl.patienttracking.model.Prescription;
import com.hcl.patienttracking.service.PrescriptionService;


@Component
@Controller
@RequestMapping("/prescription")
public class PrescriptionController {
	@Autowired
	PrescriptionService prescriptionservice;
	
	@RequestMapping(value="/AddPrescription",method=RequestMethod.POST)
	public ModelAndView add(@ModelAttribute Prescription prescription) {
		if (prescriptionservice.register(prescription)){
			return new ModelAndView("LoginSuccess");
		}else {
			return new ModelAndView("Loginfailure");
		}
	}
	
	@RequestMapping("/AddPrescription")
	public ModelAndView add() {
		return new ModelAndView("AddPrescription","prescription",new Prescription());
	}
	
}	