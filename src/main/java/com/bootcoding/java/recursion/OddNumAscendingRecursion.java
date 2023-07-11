package com.bootcoding.java.recursion;
//WAP to print odd number using in ascending order using recursion
public class OddNumAscendingRecursion {
    public static void main(String[] args) {
        int n = 10;
        //Method Calling
        displayOddNumAscending(n);
    }

    //Method Definition
    public static void displayOddNumAscending(int n){
        if(n == 0){
            return;
        }
        displayOddNumAscending(n-1);
        if(n%2 != 0){
            System.out.println(n);
        }
    }
}
