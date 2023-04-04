package com.bootcoding.java.flowcontrol;

//Break Statement in Java
public class BreakStatement {
    public static void main(String[] args) {
        /*
        break statement is used to terminate the loop immediately and control moves to next statement.
        Syntax: break;
         */
        //WAP to print numbers from 1 to 3 irrespective of user input
        int ui = 5;
        for(int i = 1; i <= ui; i++){
            if(i == 4){
                break;
            }
            System.out.println(i);
        }
        System.out.println();

        //WAP printing the value of i and j using nested for loop but don't print value of i and j for i = 3
        for (int i = 1; i <= ui; i++){
            for(int j = 1; j <= ui; j++){
                if(i == 3){
                    break;    //This break statement terminate inner for loop
                }
                System.out.println("i = " + i + ", " + "j = " + j);
            }
        }
        System.out.println();

        //WAP representing labeled break statement
        //WAP printing the value of i and j using nested for loop but stop printing value when i = 3
        //Note: l1 --> label1 for outer loop and l =2 --> label2 for inner loop
        l1:
        for (int i = 1; i <= ui; i++){
            l2:
            for(int j = 1; j <= ui; j++){
                if(i == 3){
                    break l1;   //This break statement terminate outer for loop
                }
                System.out.println("i = " + i + ", " + "j = " + j);
            }
        }
        System.out.println();


    }
}
