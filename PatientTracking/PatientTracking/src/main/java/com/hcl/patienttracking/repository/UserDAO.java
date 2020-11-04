package com.hcl.patienttracking.repository;

import org.springframework.stereotype.Component;

import com.hcl.patienttracking.model.User;



/**
 * 
 * Topic:Spring_Hibernate
 * 
 * This interface is used for declaring
 * a function for registering the user details
 * 
 * @author srimathi m
 *
 */
@Component
public interface UserDAO {
	boolean register(User user);
}




