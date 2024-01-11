package com.bootcoding.java.opps.encapsulation.studentresult.result;

public class Result {
    private String isPass;
    private double percentage;

    public String getIsPass() {
        return isPass;
    }

    public void setIsPass(String isPass) {
        this.isPass = isPass;
    }

    public double getPercentage() {
        return percentage;
    }

    public void setPercentage(double percentage) {
        this.percentage = percentage;
    }

    //To calculate total marks
    public double calPercentage(int[] marks) {
        double total = 0.0;
        double percentage = 0.0;
        for (int mark : marks) {
            total = total + mark;
        }
        percentage = total/marks.length;
        return percentage;
    }
    //Print Pass or Fail
    public String displayResult(){
        if(getPercentage() >= 35){
            return "Pass";
        }
        return "Fail";
    }
}
