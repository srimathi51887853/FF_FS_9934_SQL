################################## START OF SQL SCRIPT #############################
#                                                                                  #
# DAY # :44                                                                        #
#                                                                                  #
#                                                                                  #
# THIS SCRIPT IS USED FOR CREATING THE PATIENT TRACE WHICH HAS TO CREATE THE USER  #
# REGISTRATION,GETTING CLERK DETIALS,DOCTOR DETAILS,PATIENT DETAILS, MEDICINE      #
# INFORMTION,PRESCRIPTION DETAILS,BILL PAYMENTS.alter                              #
#                                                                                  #
# AUTHOR: SRIMATHI.M                                                               #
#                                                                                  #
############################# END OF SQL SCRIPT ####################################
create database Patient_Tracking;
use Patient_Tracking;
create table role(id int NOT NULL,name varchar(20));
insert into role values(1,"User");
insert into role values(2,"Clerk");
insert into role values(3,"Doctor");
insert into role values(4,"Patient");
create table User(id int auto_increment PRIMARY KEY,
FIRST_NAME VARCHAR(20) NOT NULL PRIMARY KEY,
LAST_NAME VARCHAR(20) NOT NULL,
AGE INT NOT NULL,
GENDER VARCHAR(10),
PHONE_NUMBER INT NOT NULL,
ROLEID INT,FOREIGN KEY(ROLEID) REFERENCES ROLE(ID));
CREATE TABLE MEDICINE(ID INT PRIMARY KEY,
MEDICINE_NAME VARCHAR(20) NOT NULL,
EXPIRYDATE DATE NOT NULL,
PRICE INT NOT NULL);
CREATE TABLE PRESCRIPTION(ID INT PRIMARY KEY,
MEDICINE_ID INT,FOREIGN KEY(MEDICINE_ID) REFERENCES MEDICINE(ID),
QUANTITY INT, 
PATIENT_NAME VARCHAR(20) NOT NULL);
CREATE TABLE BILL(
 MEDICINE_ID INT,FOREIGN KEY(MEDICINE_ID) REFERENCES MEDICINE(ID),
 MEDICINE_NAME VARCHAR(20) REFERENCES MEDICINE(MEDICINE_NAME),
 AMOUNT INT NOT NULL,
 QUANTITY INT NOT NULL);
