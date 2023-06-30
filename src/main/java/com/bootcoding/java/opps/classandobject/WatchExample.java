package com.bootcoding.java.opps.classandobject;
import java.time.*;
//WAP to create a class and object for Watch
public class WatchExample {
    //State or fields
    String brand;
    String type;
    String color;
    String material;
    String shape;
    double dialSize;
    double price;

    //behaviour or methods
    public void displayTime(){
        //Creating time object
        LocalTime lTime = LocalTime.now();
        //Display the current time
        System.out.println(lTime);
    }
    public void displayDate(){
        //Creating date object
        LocalDate lDate = LocalDate.now();
        //Display the current date
        System.out.println(lDate);
    }

    public static void main(String[] args) {
        //Creating object for wrist Watch
        WatchExample wristWatch = new WatchExample();
        //Assigning value to variable
        wristWatch.brand = "Titan";
        wristWatch.type = "Classic";
        wristWatch.color = "Black";
        wristWatch.material = "Steal";
        wristWatch.shape = "Circular";
        wristWatch.dialSize = 38.00;
        wristWatch.price = 12000.00;

        //Creating object for wall Watch
        WatchExample wallWatch = new WatchExample();
        //Assigning value to variable
        wallWatch.brand = "RenoX";
        wallWatch.type = "Classic";
        wallWatch.color = "Brown";
        wallWatch.material = "Plastic";
        wallWatch.shape = "Circular";
        wallWatch.dialSize = 40000.00;
        wallWatch.price = 1200.00;

        //Accessing data members(fields)
        System.out.println("Wrist Watch: ");
        System.out.println("Brand: " + wristWatch.brand);
        System.out.println("Type: " + wristWatch.type);
        System.out.println("Color: " + wristWatch.color);
        System.out.println("Material: " + wristWatch.material);
        System.out.println("Shape: " + wristWatch.shape);
        System.out.println("DialSize:" + wristWatch.dialSize);
        System.out.println("Price: " + wristWatch.price);
        //Accessing data members(methods)
        wristWatch.displayTime();
        wristWatch.displayDate();

        System.out.println();

        //Accessing data members(fields)
        System.out.println("Wall Watch: ");
        System.out.println("Brand: " + wallWatch.brand);
        System.out.println("Type: " + wallWatch.type);
        System.out.println("Color: " + wallWatch.color);
        System.out.println("Material: " + wallWatch.material);
        System.out.println("Shape: " + wallWatch.shape);
        System.out.println("DialSize:" + wallWatch.dialSize);
        System.out.println("Price: " + wallWatch.price);
        //Accessing data members(methods)
        wallWatch.displayTime();
        wallWatch.displayDate();

    }
}
