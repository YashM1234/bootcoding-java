package com.bootcoding.java.array;
//WAP to copy the elements of one array given by user into another array and print the array
public class ArrayCopyUsingForLoop {
    public static void main(String[] args) {
        //Declare an array of length n i.e. length = user input
        int[] arr = new int[args.length];
        //Take input as an array from user of length n
        for(int i = 0; i < args.length; i++){
            String value = args[i];
            int a = Integer.parseInt(value);
            //Store user input values into an array
            arr[i] = a;
        }
        //Or we can use this array if we don't want to take input from user
        // int[] arr = {7, 24, 19, 44, 45, 22, 17};

       //Declare a new array in which we copy input array
        int[] newArr = new int[arr.length];
        //Copy input array into new array
        for(int i = 0; i < arr.length; i++) {
            newArr[i] = arr[i];
        }
        //Print new array
        for (int i = 0; i < newArr.length; i++){
            System.out.print(newArr[i]+ " ");
        }
    }
}
