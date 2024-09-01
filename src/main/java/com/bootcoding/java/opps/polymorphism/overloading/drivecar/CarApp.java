package com.bootcoding.java.opps.polymorphism.overloading.drivecar;

public class CarApp {
    public static void main(String[] args) {
        Car carDrive = new Car();
        carDrive.drive(2.5,4,2);
        carDrive.print();
        carDrive.drive(5,20.5,6);
        carDrive.print();
        carDrive.drive(10.6,4);
        carDrive.print();
    }

}
