package com.bootcoding.java.opps.encapsulation.studentresult.student;

import com.bootcoding.java.opps.encapsulation.studentresult.result.Result;

public class Student {
    private int rollNo;
    private String name;
    private int standard;
    public int[] marks = new int[5];
    public Result studentResult;

    public int getRollNo() {
        return rollNo;
    }

    public void setRollNo(int rollNo) {
        this.rollNo = rollNo;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getStandard() {
        return standard;
    }

    public void setStandard(int standard) {
        this.standard = standard;
    }

}
