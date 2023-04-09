package com.bootcoding.java.array;
//WAP to print element of an array which are divisible by 3 & 5
public class ArrayNumDivBy3And5 {
    public static void main(String[] args) {
        int[] arr = {7, 15, 19, 44, 75, 65, 66};

        for(int i = 0; i < arr.length; i++) {
            if (arr[i] % 3 == 0 && arr[i] % 5 == 0) {
                System.out.println("The elements divisible by 3 & 5 is " + arr[i]);
            }
        }
    }
}
