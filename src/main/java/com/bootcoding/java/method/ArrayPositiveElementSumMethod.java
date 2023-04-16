package com.bootcoding.java.method;
//WAP to print the sum of all positive element in an array
public class ArrayPositiveElementSumMethod {
    public static void main(String[] args) {
        int[] arr = {1, 5, -3, 2, 11};

        //result hold the return value from method sumOfPositiveElement().
        int result = sumOfPositiveElement(arr);//Method calling

        System.out.println("The sum of all positive element in an array is " + result);
    }
    //Method Definition
    public static int sumOfPositiveElement(int[] arr){
        int sum = 0;
        for(int i = 0; i < arr.length; i++){
            if(arr[i] > 0){
                sum = sum + arr[i];
            }
        }
        return sum;
    }
}
