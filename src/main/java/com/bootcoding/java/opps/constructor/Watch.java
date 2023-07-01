package com.bootcoding.java.opps.constructor;
import java.time.LocalDate;
import java.time.LocalTime;
//Create a class Watch and its constructor and pass parameters to get values of fields
public class Watch {
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
    //Create parameterized constructor
    public Watch(String brand, String type, String color, String material, String shape, double dialSize, double price){
        //Here we use this keyword to assign value of local variable to instance variable.
        this.brand = brand;
        this.type = type;
        this.color = color;
        this.material = material;
        this.shape = shape;
        this.dialSize = dialSize;
        this.price = price;
    }

    public static void main(String[] args) {
        //Creating object and passing values in constructor
        Watch wristWatch = new Watch("Titan", "Classic", "Black", "Steal", "Circular", 38.00, 12000.00);
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
    }
}
