package com.hcl.patienttracking.service;

import com.hcl.patienttracking.model.User;

/**
 * This has to create the interface for user service
 * 
 * @author srimathi
 *
 */

public interface UserService {

	boolean register(User user);
	boolean login(User user);
	
}