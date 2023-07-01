package com.bootcoding.java.opps.constructor;
//Create a class Switch and its constructor and pass parameters to get values of fields
public class Switch {
    //State or fields
    String brand;
    String color;
    String type;
    String material;
    String shape;
    int maxCurrent;
    double price;

    //Behaviour or methods
    public boolean checkStatus() {
        return false;
    }

    public void isOnOff() {
        if (!checkStatus()) {
            System.out.println("Switch is OFF!");
            System.out.println("Please ON the Switch!");
        } else {
            System.out.println("Switch is ON!");
            System.out.println("Please OFF the Switch!");
        }
    }

    //Creating parameterize constructor
    public Switch(String brand, String color, String type, String material, String shape, int maxCurrent, double price) {
        //Here we use this keyword to assign value of local variable to instance variable.
        this.brand = brand;
        this.color = color;
        this.type = type;
        this.material = material;
        this.shape = shape;
        this.maxCurrent = maxCurrent;
        this.price = price;
    }

    public static void main(String[] args) {
        //Creating object and passing values in constructor
        Switch oneWaySwitch = new Switch("rc electric india", "White", "One Way Switch", "Copper", "Rectangle", 16,100.00);
        //Accessing data members(fields)
        System.out.println("One Way Switch: ");
        System.out.println("Brand: " + oneWaySwitch.brand);
        System.out.println("Color: " + oneWaySwitch.color);
        System.out.println("Type: " + oneWaySwitch.type);
        System.out.println("Material: " + oneWaySwitch.material);
        System.out.println("Shape: " + oneWaySwitch.shape);
        System.out.println("Maximum Current: " + oneWaySwitch.maxCurrent + " A");
        System.out.println("Price: " + oneWaySwitch.price);
        //Accessing data members(methods)
        oneWaySwitch.checkStatus();
        oneWaySwitch.isOnOff();

    }
}
