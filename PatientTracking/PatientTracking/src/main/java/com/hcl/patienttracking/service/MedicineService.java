package com.hcl.patienttracking.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import com.hcl.patienttracking.model.Medicine;
import com.hcl.patienttracking.repository.MedicineDAO;

@Component
@Service
public class MedicineService  {

	@Autowired
	MedicineDAO medicineDAO;
	public boolean register(Medicine medicine) {
		return medicineDAO.register(medicine);
	}
	
	
}
