package com.bootcoding.java.array;
//WAP to print element of an array if first index and last index values are same [7, 22, 19, 44, 45, 65, 7]
public class ArrayFstLstElementSame {
    public static void main(String[] args) {
        int[] arr = {7, 22, 19, 44, 45, 65, 7};
        int first = arr[0];
        int last = arr[arr.length-1];

        for(int i = 0; i < arr.length; i++){
            if(first == last){
                System.out.print(arr[i] + " ");
            }
        }
    }
}
