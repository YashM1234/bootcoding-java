package com.bootcoding.java.flowcontrol;

public class IfStatement {
    public static void main(String[] args) {
        /* 1. If Statement
            Syntax: if(condition is true){
                        Statements..
                      }
        */
        int num1 = 10;
        int num2 = -10;
        int num3 = 0;

        if(num1 > 0){
            System.out.println("The given number is positive");
        }
        if(num2 < 0){
            System.out.println("The given number is negative");
        }
        if(num3 == 0){
            System.out.println("The given number is zero");
        }
        System.out.println();

        /* 2. If-else Statement
            Syntax: if(condition is true){
                        Statements..
                     }
                    else{
                        Statements..
                     }
        */
        if(num1 == num2){
            System.out.println("You entered two similar numbers.");
        }
        else{
            System.out.println("You entered two different numbers.");
        }
        System.out.println();

        /* 3. If-else-if Statement
            Syntax: if(condition1 is true){
                        Statements..
                     }
                     else if(condition2 is true){
                        Statements..
                     }
                     else if(condition3 is true){
                        Statements..
                     }
                     .
                     .
                     .
                    else{
                        Statements..
                     }
        */
        if(num1 > 0){
            System.out.println("The given number is positive.");
        }
        else if(num1 < 0){
            System.out.println("The given number is negative.");
        }
        else {
            System.out.println("The given number is zero.");
        }
    }
}
