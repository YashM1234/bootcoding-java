package com.bootcoding.java.flowcontrol;
//WAP to print only odd number from 1 to 100
public class OddNum1To100ForLoop {
    public static void main(String[] args) {
        for (int i = 1; i <= 100; i++) {
            if (i % 2 != 0) {
                System.out.println(i);
            }
        }
    }
}
