package com.bootcoding.java.opps.encapsulation.hospitaldemo.insurance;

public class Insurance {
    private String companyName;
    private String companyAddress;
    private long policyNumber;

    public Insurance(String companyName, String companyAddress, long policyNumber){
        this.companyName = companyName;
        this.companyAddress = companyAddress;
        this.policyNumber = policyNumber;
    }

    public String getCompanyName() {
        return companyName;
    }

    public String getCompanyAddress() {
        return companyAddress;
    }

    public long getPolicyNumber() {
        return policyNumber;
    }
}
