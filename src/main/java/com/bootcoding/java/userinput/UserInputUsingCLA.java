package com.bootcoding.java.userinput;
//WAP to get input from user using command line argument and print that number
public class UserInputUsingCLA {
    public static void main(String[] args) {
        //Take input from user as integer
        String value1 = args[0];
        int num1 = Integer.parseInt(value1);

        //Take input from user as double
        String value2 = args[1];
        double num2 = Double.parseDouble(value2);

        //Take input from user as float
        String value3 = args[2];
        float num3 =Float.parseFloat(value3);

        //Take input from user as character
        String value4 = args[3];
        char char1 = value4.charAt(0);

        //Take input from user as boolean
        String value5 = args[4];
        boolean bool = Boolean.parseBoolean(value5);

        //Take input from user as String
        String value6 = args[5];

        System.out.println("Input from user as integer is " + num1);
        System.out.println("Input from user as double is " + num2);
        System.out.println("Input from user as float is " + num3);
        System.out.println("Input from user as character is " + char1);
        System.out.println("Input from user as boolean is " + bool);
        System.out.println("Input from user as String is " + value6);

    }
}
