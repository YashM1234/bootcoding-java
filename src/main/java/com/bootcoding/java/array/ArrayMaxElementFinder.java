package com.bootcoding.java.array;
//WAP to find maximum element in an array
public class ArrayMaxElementFinder {
    public static void main(String[] args) {
        int[] arr = {77, 22, 19, 44, 75, 65, 66};
        int max = arr[0];

        for(int i = 1; i < arr.length; i++){
            if(arr[i] > max){
                max = arr[i];
            }
        }
        System.out.println("The maximum element in an array is "+ max);
    }
}
