package com.bootcoding.java.array;
//WAP to check whether the given element is present in an array or not
public class ArrayElementPresent {
    public static void main(String[] args) {
        for(int i = 0; i < args.length; i++){
            String value = args[i];
            int n = Integer.parseInt(value);

            int[] arr = {5, 1, 3, 8, 6, 9, 4};
            for(int j = 0; j < arr.length; j++){
                if(arr[j] == n){
                    System.out.println(arr[j] + " is present in an array.");
                }
            }
        }
    }
}
