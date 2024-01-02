package com.bootcoding.java.opps.constructor.chaining;
//WAP to demonstrate the constructor chaining
public class Marker {
    private String company;
    private String color;
    private double price;
    //Constructor overloading
    public Marker(){
        System.out.println("Default constructor!");
    }
    public Marker(String company){
        this();
        System.out.println("This is single parameterised constructor!");
    }
    public Marker(String company, String color){
        this(company);
        System.out.println("This is two parameterised constructor!");
    }
    public Marker(String company, String color, double price){
        this(company, color);
        System.out.println("This is three parameterised constructor!");
    }

    public static void main(String[] args) {
        Marker marker = new Marker("MarkerX", "Red", 10.50);
    }
}
