package com.hcl.patienttracking.model;

/**
 * Topic: Spring_Hibernate
 * 
 * @author srimathi
 * 
 * This class has to create the bill for a patients
 *
 */
public class Bill {
int prescriptionId;
int medicineId;
String medicineName;
int quantity;
int Amount;
/**
 * This is for default constructor
 */
public Bill() {
	super();
}
/**
 * This is for paramaterzed constructor
 * 
 * @param prescriptionId
 * @param medicineId
 * @param medicineName
 * @param quantity
 * @param amount
 */
public Bill(int prescriptionId, int medicineId, String medicineName, int quantity, int amount) {
	super();
	this.prescriptionId = prescriptionId;
	this.medicineId = medicineId;
	this.medicineName = medicineName;
	this.quantity = quantity;
	Amount = amount;
}
public int getPrescriptionId() {
	return prescriptionId;
}
public void setPrescriptionId(int prescriptionId) {
	this.prescriptionId = prescriptionId;
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
