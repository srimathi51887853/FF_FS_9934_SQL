package com.hcl.patienttracking.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * Topic: Spring_Hibernate
 * 
 * @author srimathi
 * 
 * This class has to create the bill for a patients
 *
 */
@Entity
@Table(name="Bill")
   public class Bill {
	@Id
	@Column
   private int medicineId;
	@Column
    private String medicineName;
	@Column
	private String patientName;
	@Column
	private int Amount;
	@Column
   private int quantity;
/**
 * This is for default constructor
 */
public Bill() {
	super();
}
/**
 * This is for paramaterized constructor
 * 
 * @param prescriptionId
 * @param medicineId
 * @param medicineName
 * @param quantity
 * @param amount
 */
public Bill(int medicineId, String medicineName, String patientName,int quantity, int amount) {
	super();
	this.medicineId = medicineId;
	this.medicineName = medicineName;
	this.patientName = patientName;
	this.quantity = quantity;
	Amount = amount;
}
public int getMedicineId() {
	return medicineId;
}
public void setMedicineId(int medicineId) {
	this.medicineId = medicineId;
}
public String getMedicineName() {
	return medicineName;
}
public void setMedicineName(String medicineName) {
	this.medicineName = medicineName;
}
public String getPatientName() {
	return patientName;
}
public void setPatientName(String patientName) {
	this.patientName = patientName;
}
public int getQuantity() {
	return quantity;
}
public void setQuantity(int quantity) {
	this.quantity = quantity;
}
public int getAmount() {
	return Amount;
}
public void setAmount(int amount) {
	Amount = amount;
}

}
