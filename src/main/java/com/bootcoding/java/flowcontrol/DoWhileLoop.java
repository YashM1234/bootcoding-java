package com.bootcoding.java.flowcontrol;
//do...while loop in java
public class DoWhileLoop {
    public static void main(String[] args) {
        /*
        do...while loop is similar to while loop but in do...while loop
        body is executed once before test the condition.
        Syntax: do{
                    //body of loop
                } while(condition is true);
         */

        //WAP to print numbers from 1 to given number
        int i = 1;
        int ui = 5;

        do{
            System.out.println(i);
            i++;
        } while (i <= ui);
    }
}
