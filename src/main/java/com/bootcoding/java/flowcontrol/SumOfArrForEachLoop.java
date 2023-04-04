package com.bootcoding.java.flowcontrol;
//WAP to print sum of elements in an array using for-each loop
public class SumOfArrForEachLoop {
    public static void main(String[] args) {
        int[] arr = {5, 8, 9, 7, -2, 6};
        int sum = 0;
        for(int newVar: arr){
            sum += newVar; //i.e sum = sum + newVar;
        }
        System.out.println("The sum of an array is " + sum);
    }
}
