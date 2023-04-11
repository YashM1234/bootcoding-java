package com.bootcoding.java.array;
//WAP to copy the half elements on one array into second array and print the second array
public class ArrayHalfElementCopy {
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
        //int[] arr = {7, 24, 19, 44, 45, 22, 17, 77};
        int n = arr.length/2;
        //Creating newArr
        int[] newArr = new int[n];

        //Copy half element of an array
        for(int i = 0; i < newArr.length; i++){
            newArr[i] = arr[i];
        }
        //Print newArr
        for(int i = 0; i < newArr.length; i++){
            System.out.print(newArr[i] + " ");
        }
    }
}
