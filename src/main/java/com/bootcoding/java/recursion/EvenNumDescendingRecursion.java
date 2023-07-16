package com.bootcoding.java.recursion;
//WAP to print even number in descending order from 1 to n
public class EvenNumDescendingRecursion {
    public static void main(String[] args) {
        int n = 10;
        //Method Calling
        displayEvenNumDescending(n);
    }

    //Method Definition
    public static void displayEvenNumDescending(int n){
        if(n == 0){
            return;
        }
        if(n%2 == 0){
            System.out.println(n);
        }
        displayEvenNumDescending(n-1);
    }
}
