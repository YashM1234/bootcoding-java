package com.bootcoding.java.flowcontrol;
//WAP to print sum of even number from 1 to given number
public class SumOfEvenNumForLoop {
    public static void main(String[] args) {
        int num = 10;
        int sum = 0;
        for (int i = 1; i<=num; i++){
            if(i%2 == 0){
                sum = sum + i;
            }
        }
        System.out.println("The sum of even number from 1 to given number is " + sum);
    }
}
