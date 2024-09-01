package com.bootcoding.java.opps.polymorphism.overloading.drivecar;

public class Car {
    double distance;
    int members;
    int stopCount;

    public void drive(double distance, int members, int stopCount){
        this.distance = distance;
        this.members = members;
        this.stopCount = stopCount;
    }
    public void drive(int stopCount, double distance, int members){
        this.stopCount = stopCount;
        this.distance = distance;
        this.members = members;
    }
    public void drive(double distance, int members){
        this.distance = distance;
        this.members = members;
    }
    public void print(){
        System.out.println("Distance: " + distance);
        System.out.println("Members: " + members);
        System.out.println("Number of stops: " + stopCount);
    }
}
