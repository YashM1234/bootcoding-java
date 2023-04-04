package com.bootcoding.java.flowcontrol;
//Continue Statement in Java
public class ContinueStatement {
    public static void main(String[] args) {
        /*
            continue statement is used to skip the current iteration of the loop.
            Syntax: continue;
         */

        //WAP to print number from 1 to 30 but don't print even number from 10 to 20
        int ui = 30;
        for(int i = 1; i <= ui; i++){
            if(i >= 10 && i <= 20 && i%2 == 0){
                continue;
            }
            System.out.println(i);
        }
        System.out.println();

        //WAP to print value of i and j using nested for loop but don't print value of i and j when i is odd number
        for(int i = 1; i <= 10; i++){
            for(int j = 1; j <= 10; j++){
                if(i%2 != 0){
                    continue;
                }
                System.out.println("i = " + i + ", " + "j = " + j);
            }
        }
        System.out.println();

        //WAP representing labeled continue statement
        //WAP printing the value of i and j using nested for loop but don't print value of i and j when i is divisible by 3.
        //Note: l1 --> label1 for outer loop and l =2 --> label2 for inner loop
        l1:
        for(int i = 1; i <= 10; i++){
            l2:
            for(int j = 1; j <= 10; j++){
                if(i%3 == 0){
                    continue l1;
                }
                System.out.println("i = " + i + ", " + "j = " + j);
            }
        }
    }
}
