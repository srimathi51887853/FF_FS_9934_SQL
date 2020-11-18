package com.hcl.patienttracking.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;
import com.hcl.patienttracking.model.Prescription;
import com.hcl.patienttracking.repository.PrescriptionDAO;

@Component
@Service
public class PrescriptionService  {

	@Autowired
	PrescriptionDAO prescriptionDAO;
	public boolean register(Prescription prescription) {
		return prescriptionDAO.register(prescription);
	}
	
	
}
