package com.hcl.patienttracking.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import com.hcl.patienttracking.model.Bill;
import com.hcl.patienttracking.repository.BillDAO;

@Component
@Service
public class BillService  {

	@Autowired
	BillDAO billDAO;
	public boolean register(Bill bill) {
		return billDAO.register(bill);
	}
	
	
}

