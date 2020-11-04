package com.hcl.patienttracking.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
//import javax.validation.constraints.NotEmpty;
//import javax.validation.constraints.Pattern;

//import org.hibernate.validator.constraints.Range;

/**
  * Topic Spring_Hibernate
  * 
  * @author srimathi
  * 
  * This class has to create the user information contains name,age ,gender,phone number.
  *
  */
@Entity
@Table(name="User")
public class User {
	@Id
	@Column(name="id")
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id;
	@Column//(name="FIRST_NAME")
	private String firstName;
	//@NotEmpty
	@Column//(name="LAST_NAME")
	private String lastName;
	//@NotEmpty
	@Column//(name="AGE")
	 private int age;
	//@NotEmpty
	@Column//(name="GENDER")
	  private String gender;
    //@NotEmpty
	@Column//(name="PHONE_NUMBER")
	 long phoneNumber;
	@Column//(name="ROLEID")
	//@Range(min=1)
	private int roleId;
   
  
   /**
    * This is for default constructor
    */
   public User() {
	super();
}
   /**
    * This is for parameterized constructor
    * @param firstName
    * @param lastName
    * @param age
    * @param gender
    * @param phoneNumber
    */
public User(int id,String firstName, String lastName, int age, String gender, long phoneNumber,int roleId) {
	super(); 
	this.firstName = firstName;
	this.lastName = lastName;
	this.age = age;
	this.gender = gender;
	this.phoneNumber = phoneNumber;
}

public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public String getFirstName() {
	return firstName;
}
public void setFirstName(String firstName) {
	this.firstName = firstName;
}
public String getLastName() {
	return lastName;
}
public void setLastName(String lastName) {
	this.lastName = lastName;
}
public int getAge() {
	return age;
}
public void setAge(int age) {
	this.age = age;
}
public String getGender() {
	return gender;
}
public void setGender(String gender) {
	this.gender = gender;
}
public long getPhoneNumber() {
	return phoneNumber;
}
public void setPhoneNumber(long phoneNumber) {
	this.phoneNumber = phoneNumber;
}
public int getRoleId() {
	return roleId;
}
public void setRoleId(int roleId) {
	this.roleId = roleId;
}
}

