package com.bootcoding.java.opps.inheritance.electricmeter;

public class Meter {
    //Fields
    String brand;
    String type;
    int voltage;
    int current;
    int frequency;
    String color;
    int weight;
    double price;

    //Behaviour
    public void meterCreate(){
        System.out.println("Meter created!");
    }
    public void displayReading(){
        System.out.println("Display Reading!");
    }
}
