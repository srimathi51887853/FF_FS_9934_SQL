package com.hcl.patienttracking.model;

/**
 * TOpic: Spring_Hibernate
 * 
 * @author srimathi
 * 
 * This class contains role information consists of user,doctor,clerk,patient details.
 *
 */
public class Role {
 int id;
 String user;
 String doctor;
 String clerk;
 String patient;
 /**
  * This is default constructor.
  */
public Role() {
	super();
}
/**
 * This is parameterized constructor
 * @param id
 * @param user
 * @param doctor
 * @param clerk
 * @param patient
 */
public Role(int id, String user, String doctor, String clerk, String patient) {
	super();
	this.id = id;
	this.user = user;
	this.doctor = doctor;
	this.clerk = clerk;
	this.patient = patient;
}
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public String getUser() {
	return user;
}
public void setUser(String user) {
	this.user = user;
}
public String getDoctor() {
	return doctor;
}
public void setDoctor(String doctor) {
	this.doctor = doctor;
}
public String getClerk() {
	return clerk;
}
public void setClerk(String clerk) {
	this.clerk = clerk;
}
public String getPatient() {
	return patient;
}
public void setPatient(String patient) {
	this.patient = patient;
}
}
