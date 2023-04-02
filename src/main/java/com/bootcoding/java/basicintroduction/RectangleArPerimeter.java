package com.bootcoding.java.basicintroduction;
//WAP to print area and perimeter of a rectangle
public class RectangleArPerimeter {
    public static void main(String[] args) {
        String value = args[0];
        double width = Double.parseDouble(value);

        String value1 = args[1];
        double height = Double.parseDouble(value1);

        double ArRect = width*height;
        double PrmRect = 2*(width + height);

        System.out.println("The area of rectangle is " + width + " * " + height + " = " + ArRect);
        System.out.println("The perimeter of rectangle is 2"+ " * ( " + width + " + " + height + " ) = " + PrmRect);
    }
}
