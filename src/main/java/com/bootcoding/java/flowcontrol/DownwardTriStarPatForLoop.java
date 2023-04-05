package com.bootcoding.java.flowcontrol;
//Pattern Assignment-2
//WAP to print downward triangle star pattern using nested for loop
//* * * * *
//* * * *
//* * *
//* *
//*
public class DownwardTriStarPatForLoop {
    public static void main(String[] args) {
        int n = 5;
        for(int i = 1; i <= n; i++){
            for(int j = i; j <= n; j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
//Note: For Decreasing triangle boundary is i to n in inner loop;