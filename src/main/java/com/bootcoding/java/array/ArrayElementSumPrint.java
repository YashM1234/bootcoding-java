package com.bootcoding.java.array;
//WAP to print sum of all element of an array  [7, 22, 19, 44, 45, 65, 66]
public class ArrayElementSumPrint {
    public static void main(String[] args) {
        int[] arr = {7, 22, 19, 44, 45, 65, 66};
        int sum = 0;
        for(int i = 0; i < arr.length; i++){
            sum = sum + arr[i];
        }
        System.out.println("The sum of an array is " + sum);
    }
}
