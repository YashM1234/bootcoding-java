package com.bootcoding.java.array;
//WAP to print sum of odd element of an array  [7, 22, 19, 44, 45, 65, 66]
public class ArrayOddElementSumPrint {
    public static void main(String[] args) {
        int[] arr = {7, 22, 19, 44, 45, 65, 66};
        int sum = 0;
        for(int i = 0; i < arr.length; i++){
            if(arr[i]%2 != 0){
                sum = sum + arr[i];
            }
        }
        System.out.println("The sum of odd element in an array is " + sum);
    }
}
