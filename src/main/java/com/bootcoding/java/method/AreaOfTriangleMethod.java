package com.bootcoding.java.method;
//WAP in which function takes the base and height of a triangle as parameter and return its area
public class AreaOfTriangleMethod {
    public static void main(String[] args) {
        //To take input value for base
        String value1 = args[0];
        int base = Integer.parseInt(value1);
        //To take input value for height
        String value2 = args[1];
        int height = Integer.parseInt(value2);
        //result hold the return value from method areaOfTriangle().
        double result = areaOfTriangle(base, height);//Method calling

        System.out.println("The area of triangle is " + result);
    }
    //Method Definition
    public static double areaOfTriangle(int b, int h){
        double ArOfTri;
        ArOfTri = (b*h)/2.0;
        return ArOfTri;
    }
}
