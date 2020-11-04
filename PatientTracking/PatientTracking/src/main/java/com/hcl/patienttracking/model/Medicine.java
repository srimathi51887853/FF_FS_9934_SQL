package com.hcl.patienttracking.model;
import java.util.Date;

/**
 * Topic:Spring_Hibernate
 * 
 * @author srimathi
 * 
 * This class has to get the details of medicine information such as medicineid,medicinename,price,expirydate.
 *
 */
public class Medicine {
   int medicineId;
   String medicineName;
   int price;
   Date expirydate;
   /**
    * This is for default constructor
    */
public Medicine() {
	super();
}
/**
 * This is for paramaterizedd constructor
 * @param medicineId
 * @param medicineName
 * @param price
 * @param expirydate
 */
public Medicine(int medicineId, String medicineName, int price, Date expirydate) {
	super();
	this.medicineId = medicineId;
	this.medicineName = medicineName;
	this.price = price;
	this.expirydate = expirydate;
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

