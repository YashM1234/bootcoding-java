package com.bootcoding.java.array;
//WAP to find a minimum element in an array
public class ArrayMinElementFinder {
    public static void main(String[] args) {
        int[] arr = {7, 22, 19, 44, 5, 65, 66};
        int min = arr[0];

        for(int i = 1; i < arr.length; i++){
            if(arr[i] < min){
                min = arr[i];
            }
        }
        System.out.println("The minimum element in an array is " + min);
    }
}
