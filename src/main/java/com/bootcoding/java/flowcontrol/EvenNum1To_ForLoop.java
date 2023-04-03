package com.bootcoding.java.flowcontrol;
// WAP to print even number from 1 to given number
public class EvenNum1To_ForLoop {
    public static void main(String[] args) {
        int num = 50;
        for(int i = 1; i <= num; i++){
            if(i%2 == 0) {
                System.out.println(i);
            }
        }
    }
}
