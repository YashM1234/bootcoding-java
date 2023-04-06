package com.bootcoding.java.flowcontrol;
//Pattern Assignment-5
//WAP to print given number pattern using nested for loop
//1
//22
//333
//4444
public class TriangleNumPat1ForLoop {
    public static void main(String[] args) {
        int n = 4;
        for(int i = 1; i <= n; i++){
            for(int j = 1; j <= i; j++){
                System.out.print(i);
            }
            System.out.println();
        }
    }
}
