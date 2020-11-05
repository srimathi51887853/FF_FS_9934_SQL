package com.hcl.patienttracking.repository;

import org.hibernate.Session;
import org.springframework.stereotype.Repository;

import com.hcl.patienttracking.model.Medicine;
import com.hcl.patienttracking.util.HibernateUtil;


@Repository
public class MedicineDAO {
	Medicine medicine=new Medicine();
	
	
	public boolean register(Medicine medicine) {
		Session session = HibernateUtil.getSessionFactory().openSession();
		session.beginTransaction();
		
		session.save(medicine);

        session.getTransaction().commit();
		HibernateUtil.shutdown();
		return true;
		
	}
}