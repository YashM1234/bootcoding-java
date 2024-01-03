package com.bootcoding.java.opps.encapsulation.hospitaldemo.patient;

import com.bootcoding.java.opps.encapsulation.hospitaldemo.hospital.PatientHistory;
import com.bootcoding.java.opps.encapsulation.hospitaldemo.insurance.Insurance;

import java.util.Date;

public class Patient {
    public long pid;
    public String name;
    private String disease;
    public int age;
    public Date admitDate;
    public Date dischargeDate;
    Insurance patientInsurance;
    PatientHistory patientHistory;

    public long getPid() {
        return pid;
    }

    public void setPid(long pid) {
        this.pid = pid;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDisease() {
        return disease;
    }

    public void setDisease(String disease) {
        this.disease = disease;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Date getAdmitDate() {
        return admitDate;
    }

    public void setAdmitDate(Date admitDate) {
        this.admitDate = admitDate;
    }

    public Date getDischargeDate() {
        return dischargeDate;
    }

    public void setDischargeDate(Date dischargeDate) {
        this.dischargeDate = dischargeDate;
    }

    public Insurance getPatientInsurance() {
        return patientInsurance;
    }

    public void setPatientInsurance(Insurance patientInsurance) {
        this.patientInsurance = patientInsurance;
    }

    public PatientHistory getPatientHistory() {
        return patientHistory;
    }

    public void setPatientHistory(PatientHistory patientHistory) {
        this.patientHistory = patientHistory;
    }
    //            public void print() {
//            System.out.println("Patient Detail: ");
//            System.out.println("Patient Name: " + this.name);
//            System.out.println("Patient Age: " + this.age);
//            System.out.println("Policy Number: " + this.patientInsurance.getPolicyNumber());
//            System.out.println("Admission Date: " + this.admitDate);
//            System.out.println("Discharge Date: " + this.dischargeDate);
//            System.out.println();
//        }
}
