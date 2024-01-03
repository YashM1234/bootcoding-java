package com.bootcoding.java.opps.encapsulation.hospitaldemo.hospital;

public class PatientHistory {
    private int numberOfVisits;
    private String pastPaymentStatus;

    public PatientHistory(int numberOfVisits, String pastPaymentStatus){
        this.numberOfVisits = numberOfVisits;
        this.pastPaymentStatus = pastPaymentStatus;
    }

    public int getNumberOfVisits() {
        return numberOfVisits;
    }

    public String getPastPaymentStatus() {
        return pastPaymentStatus;
    }
}
