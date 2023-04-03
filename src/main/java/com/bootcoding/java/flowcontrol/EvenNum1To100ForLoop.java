package com.bootcoding.java.flowcontrol;
//WAP to print only even number from 1 to 100
public class EvenNum1To100ForLoop {
    public static void main(String[] args) {
        for(int i = 1; i<=100; i++){
            if(i%2 == 0){
                System.out.println(i);
            }
        }
    }
}
