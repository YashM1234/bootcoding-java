package com.bootcoding.java.flowcontrol;
//Pattern Assignment-6
//WAP to print given number pattern using nested for loop
//1
//12
//123
//1234
public class TriangleNumPat2ForLoop {
    public static void main(String[] args) {
        int n = 4;
        for(int i = 1; i <= n; i++){
            for(int j = 1; j <= i; j++){
                System.out.print(j);
            }
            System.out.println();
        }
    }
}
