package com.bootcoding.java.array;
//WAP to print element of an array if second index and second last index values are same [7, 22, 19, 44, 45, 22, 17]
public class ArraySecAndLstSecEleSame {
    public static void main(String[] args) {
        int[] arr = {7, 22, 19, 44, 45, 22, 17};
        int second = arr[1];
        int sLast = arr[arr.length-2];

        for(int i = 0; i < arr.length; i++){
            if(second == sLast){
                System.out.print(arr[i] + " ");
            }
        }
    }
}
