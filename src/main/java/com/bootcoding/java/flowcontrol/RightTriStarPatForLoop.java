package com.bootcoding.java.flowcontrol;
//Pattern Assignment-1
//WAP to print right triangle star pattern using nested for loop
//*
//* *
//* * *
//* * * *
//* * * * *
public class RightTriStarPatForLoop {
    public static void main(String[] args) {
        int n = 5;
        for(int i = 1; i <= n; i++){
            for(int j = 1; j <= i; j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
//Note: For Increasing triangle boundary is 1 to i in inner loop;