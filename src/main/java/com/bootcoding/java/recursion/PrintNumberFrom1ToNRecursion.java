package com.bootcoding.java.recursion;
//WAP to print a number from 1 to n using recursion
public class PrintNumberFrom1ToNRecursion {
    public static void main(String[] args) {
        int n = 10;
        //Method Calling
        System.out.println("Display number in Ascending order: ");
        displayNumAscending(n);
        System.out.println("Display number in Descending order: ");
        displayNumDescending(n);
    }

    //Method Definition
    //Display number in Ascending Order
    public static void displayNumAscending(int n){
        if(n == 0){
            return;
        }
        displayNumAscending(n-1);
        System.out.println(n);
    }

    //Method Definition
    //Display number in Descending Order
    public static void displayNumDescending(int n){
        if(n == 0){
            return;
        }
        System.out.println(n);
        displayNumDescending(n-1);
    }
}
