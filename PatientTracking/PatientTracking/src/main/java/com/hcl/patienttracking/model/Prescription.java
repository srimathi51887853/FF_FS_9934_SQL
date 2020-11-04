package com.hcl.patienttracking.model;

/**
 * 
 * Topic:Spring_Hibernate
 * 
 * @author srimathi
 * 
 * This class has to get the prescription details as patientid,patientname,quantity,medicineid.
 *
 */
public class Prescription {
int patientId;
int medicineId;
String patientName;
int Quantity;
/**
 * This is for default constructor
 */
public Prescription() {
	super();
}
/**
 * This is for paramaterized constructor
 * @param patientId
 * @param medicineId
 * @param patientName
 * @param quantity
 */
public Prescription(int patientId, int medicineId, String patientName, int quantity) {
	super();
	this.patientId = patientId;
	this.medicineId = medicineId;
	this.patientName = patientName;
	Quantity = quantity;
}
public int getPatientId() {
	return patientId;
}
public void setPatientId(int patientId) {
	this.patientId = patientId;
}
public int getMedicineId() {
	return medicineId;
}
public void setMedicineId(int medicineId) {
	this.medicineId = medicineId;
}
public String getPatientName() {
	return patientName;
}
public void setPatientName(String patientName) {
	this.patientName = patientName;
}
public int getQuantity() {
	return Quantity;
}
public void setQuantity(int quantity) {
	Quantity = quantity;
}
}
