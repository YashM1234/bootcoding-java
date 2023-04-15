package com.bootcoding.java.method;
//WAP to find a minimum element in an array using method
public class ArrayMinElementMethod {
    public static void main(String[] args) {
        int[] arr = {10, 2, 56, 0, -35, 20};
        int result = findMinElement(arr);//Method calling with 1 argument
        System.out.println("The minimum element in an given array is " + result);
    }
    //Method Declaration
    public static int findMinElement(int[] arr){
        int min = arr[0];
        for(int i = 1; i< arr.length; i++){
            if(min > arr[i]){
                min = arr[i];
            }
        }
        return min;
    }
}
