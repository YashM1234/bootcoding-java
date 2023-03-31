package com.bootcoding.java.flowcontrol;
//WAP to print if a given number is divisible by 3 or 5 or both using if-else-if
public class Assignment2NumDivBy {
    public static void main(String[] args) {
        int num1 = 15;

        if (num1 % 3 == 0 && num1 % 5 == 0) {
            System.out.println("The given number is " + num1 + " and it is divisible by both 3 and 5.");
        }
        else if (num1 % 3 == 0) {
            System.out.println("The given number is " + num1 + " and it is divisible by 3.");
        }
        else if (num1 % 5 == 0) {
            System.out.println("The given number is " + num1 + " and it is divisible by 5.");
        }
        else {
            System.out.println("The given number is " + num1 + " and it is not divisible by either 3 or 5.");
        }
    }
}