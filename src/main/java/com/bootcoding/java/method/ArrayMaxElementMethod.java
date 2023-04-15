package com.bootcoding.java.method;
//WAP to find maximum element in an array using method
public class ArrayMaxElementMethod {
    public static void main(String[] args) {
        int[] arr = {10, 2, 56, 0, -35, 20};
        int result = findMaxElement(arr);//Method calling with 1 argument
        System.out.println("The maximum element in an given array is " + result);
    }
    //Method Declaration
    public static int findMaxElement(int[] arr){
        int max = arr[0];
        for(int i = 1; i< arr.length; i++){
            if(max < arr[i]){
                max = arr[i];
            }
        }
        return max;
    }
}
