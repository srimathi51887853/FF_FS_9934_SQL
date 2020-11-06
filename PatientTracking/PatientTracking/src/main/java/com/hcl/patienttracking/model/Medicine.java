package com.hcl.patienttracking.model;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotEmpty;

/**
 * Topic:Spring_Hibernate
 * 
 * @author srimathi
 * 
 * This class has to get the details of medicine information such as id,medicine name,price,expiry date.
 *
 */
@Entity
@Table(name="medicine")
public class Medicine {
	@Id
	@Column(name="id")
	@GeneratedValue(strategy=GenerationType.IDENTITY)
   private int id;
	@Column
	@NotEmpty
   private String medicineName;
	@Column
  private  int price;
	@Column
   private Date expirydate;
   /**
    * This is for default constructor
    */
public Medicine() {
	super();
}
/**
 * This is for paramaterizedd constructor
 * @param id
 * @param medicineName
 * @param price
 * @param expirydate
 */
public Medicine(int id, String medicineName, int price, Date expirydate) {
	super();
	this.id = id;
	this.medicineName = medicineName;
	this.price = price;
	this.expirydate = expirydate;
}
public int getId() {
	return id;
}
public void setid(int id) {
	this.id =id;
}
public String getMedicineName() {
	return medicineName;
}
public void setMedicineName(String medicineName) {
	this.medicineName = medicineName;
}
public int getPrice() {
	return price;
}
public void setPrice(int price) {
	this.price = price;
}
public Date getExpirydate() {
	return expirydate;
}
public void setExpirydate(Date expirydate) {
	this.expirydate = expirydate;
}
}

