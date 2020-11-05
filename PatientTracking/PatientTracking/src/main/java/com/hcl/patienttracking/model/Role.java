package com.hcl.patienttracking.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * TOpic: Spring_Hibernate
 * 
 * @author srimathi
 * 
 * This class contains role information consists of roleid,name
 *
 */
@Entity
@Table(name="Role")
public class Role {
	@Id
	@Column(name="id")
	@GeneratedValue(strategy=GenerationType.IDENTITY)
 private int id;
	@Column
 private String name;
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
public Role(int id, String name) {
	super();
	this.id = id;
	this.name= name;
}
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
}
