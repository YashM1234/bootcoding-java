package com.bootcoding.java.opps.inheritance.electricmeter;

public class MeterApp {
    public static void main(String[] args) {
        //Creating an object for single phase meter
        SinglePhaseMeter spm = new SinglePhaseMeter();
        spm.brand = "Power India Meters";
        spm.type = "Single Phase Meter";
        spm.voltage = 240;
        spm.current = 5;
        spm.frequency = 50;
        spm.color = "Multi";
        spm.weight = 300;
        spm.price = 739.00;

        //Print single phase meter
        System.out.println("Brand: " + spm.brand);
        System.out.println("Type: " + spm.type);
        System.out.println("Voltage: " + spm.voltage);
        System.out.println("Current: " + spm.current);
        System.out.println("Frequency: " + spm.frequency);
        System.out.println("Color: " + spm.color);
        System.out.println("Weight: " + spm.weight);
        System.out.println("Price: " + spm.price);
        spm.meterCreate();
        spm.displayReading();
    }
}
