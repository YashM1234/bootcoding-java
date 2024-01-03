package com.bootcoding.java.opps.encapsulation.hospitaldemo;

import com.bootcoding.java.opps.encapsulation.hospitaldemo.hospital.Hospital;
import com.bootcoding.java.opps.encapsulation.hospitaldemo.hospital.PatientHistory;
import com.bootcoding.java.opps.encapsulation.hospitaldemo.insurance.Insurance;
import com.bootcoding.java.opps.encapsulation.hospitaldemo.patient.Patient;

import java.util.Calendar;
import java.util.Date;
import java.util.UUID;
//Main hospital class
public class HospitalApp {
    public static void main(String[] args) {

        //Creating object of Hospital class
        Hospital orangeCity = new Hospital();
        //Setting value for hospital
        orangeCity.setName("Orange City Hospital");
        orangeCity.setId(UUID.randomUUID());
        orangeCity.setAddress("Nagpur");
        orangeCity.setServices("MultiSpecialist Hospital");
        //Getting value of hospital
        System.out.println("Hospital Detail: ");
        System.out.println("Hospital Name: " + orangeCity.getName());
        System.out.println("UUID: " + orangeCity.getId());
        System.out.println("Address: " + orangeCity.getAddress());
        System.out.println("Services: " + orangeCity.getServices());
        System.out.println();

        //Creating object of Patient class
        Patient ramesh = new Patient();
        //Setting value for Patient
        ramesh.setName("Ramesh");
        ramesh.setPid(1);
        ramesh.setAge(25);
        ramesh.setAdmitDate(getNextDate(3));
        ramesh.setDischargeDate(new Date());
        ramesh.setDisease("Cold");
        ramesh.setPatientHistory(new PatientHistory(2, "clear"));
        ramesh.setPatientInsurance(new Insurance("LIC", "Nagpur", 420));

        //Getting value of patient
        System.out.println("Patient Name: " + ramesh.getName());
        System.out.println("Patient ID: " + ramesh.getPid());
        System.out.println("Patient Insurance Policy Number: " + ramesh.getPatientInsurance().getPolicyNumber());
        System.out.println("Patient Age: " + ramesh.getAge());
        System.out.println("Patient Admit Date: " + ramesh.getAdmitDate());
        System.out.println("Patient Discharge Date: " + ramesh.getDischargeDate());
        System.out.println("Patient Disease: " + ramesh.getDisease());
        System.out.println("Patient visits in hospital: " + ramesh.getPatientHistory().getNumberOfVisits());
        System.out.println("Patient past payment status: " + ramesh.getPatientHistory().getPastPaymentStatus());
        System.out.println();

        //For other patient

        //Creating object of Hospital class
        Hospital blueCity = new Hospital();
        //Setting value for hospital
        blueCity.setName("Blue City Hospital");
        blueCity.setId(UUID.randomUUID());
        blueCity.setAddress("Nagpur");
        blueCity.setServices("MultiSpecialist Hospital");
        //Getting value of hospital
        System.out.println("Hospital Detail: ");
        System.out.println("Hospital Name: " + blueCity.getName());
        System.out.println("UUID: " + blueCity.getId());
        System.out.println("Address: " + blueCity.getAddress());
        System.out.println("Services: " + blueCity.getServices());
        System.out.println();

        //Creating object of Patient class
        Patient suresh = new Patient();
        //Setting value for Patient
        suresh.setName("Suresh");
        suresh.setPid(2);
        suresh.setAge(26);
        suresh.setAdmitDate(getNextDate(4));
        suresh.setDischargeDate(new Date());
        suresh.setDisease("Cough");
        suresh.setPatientHistory(new PatientHistory(5, "balance"));
        suresh.setPatientInsurance(new Insurance("LIC", "Nagpur", 421));

        //Getting value of patient
        System.out.println("Patient Name: " + suresh.getName());
        System.out.println("Patient ID: " + suresh.getPid());
        System.out.println("Patient Insurance Policy Number: " + suresh.getPatientInsurance().getPolicyNumber());
        System.out.println("Patient Age: " + suresh.getAge());
        System.out.println("Patient Admit Date: " + suresh.getAdmitDate());
        System.out.println("Patient Discharge Date: " + suresh.getDischargeDate());
        System.out.println("Patient Disease: " + suresh.getDisease());
        System.out.println("Patient visits in hospital: " + suresh.getPatientHistory().getNumberOfVisits());
        System.out.println("Patient past payment status: " + suresh.getPatientHistory().getPastPaymentStatus());

    }

    private static Date getNextDate(int days) {
        Calendar cal = Calendar.getInstance();
        cal.add(Calendar.DATE, days * -1);
        return  cal.getTime();
    }
}
