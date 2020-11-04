package com.hcl.patienttracking.repository;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.Transaction;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import com.hcl.patienttracking.model.User;
import com.hcl.patienttracking.util.HibernateUtil;

/**
 * Day#:44
 * 
 * This class is to get connection with database.
 * 
 * @author srimathi m
 *
 */

@Repository
public class UserDAOImpl implements UserDAO {
	User user=new User();
	
	
	public boolean register(User u) {
		Session session = HibernateUtil.getSessionFactory().openSession();
		session.beginTransaction();
		user.setFirstName(u.getFirstName());
		user.setLastName(u.getLastName());
		user.setAge(u.getAge());
		user.setGender(u.getGender());
		user.setPhoneNumber(u.getPhoneNumber());
		user.setRoleId(u.getRoleId());
		session.save(user);

        session.getTransaction().commit();
		HibernateUtil.shutdown();
		return true;
		
	}
	
	
	//public List<User> list() {
	//	 Session session = HibernateUtil.getSessionFactory().openSession();
	//	 List<User> resultList = session.createQuery("from User").list();
	//	 session.close();
     //    return resultList ;
	//}
	
}


