package com.hcl.patienttracking.repository;

import org.hibernate.Session;
import org.springframework.stereotype.Repository;

import com.hcl.patienttracking.model.Prescription;
import com.hcl.patienttracking.util.HibernateUtil;



@Repository
public class PrescriptionDAO {
	Prescription prescription=new Prescription();
	
	
	public boolean register(Prescription p) {
		Session session = HibernateUtil.getSessionFactory().openSession();
		session.beginTransaction();
		prescription.setId(p.getId());
		prescription.setMedicineId(p.getMedicineId());
		prescription.setPatientName(p.getPatientName());
		prescription.setQuantity(p.getQuantity());
		
		
		session.save(prescription);

        session.getTransaction().commit();
		HibernateUtil.shutdown();
		return true;
		
	}
}
