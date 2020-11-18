package com.hcl.patienttracking.repository;

import org.hibernate.Session;
import org.springframework.stereotype.Repository;

import com.hcl.patienttracking.model.Bill;
import com.hcl.patienttracking.util.HibernateUtil;

@Repository
public class BillDAO {
	Bill bill=new Bill();
	
	
	public boolean register(Bill bill) {
		Session session = HibernateUtil.getSessionFactory().openSession();
		session.beginTransaction();
		
		session.save(bill);

        session.getTransaction().commit();
		HibernateUtil.shutdown();
		return true;
		
	}
}