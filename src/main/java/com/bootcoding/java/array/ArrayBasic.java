package com.bootcoding.java.array;
//Array in java
public class ArrayBasic {
    public static void main(String[] args) {
        /*
        An array is a collection of similar types of data in a contiguous memory location.

        Array declaration: dataType[] arrayName;

        There are two ways to declare and initialise an array:
        1. 	Declare and Initialise at a same time:
	                int[] age = { 10, 20, 15, 13, 25 };

        2. 	First declare and then initialise:
            Declare:
	                int[] rollno = new int[3] ;
	        Initialise:
	                rollno[0] = 10;
	                rollno[1] = 20;
	                rollno[2] = 15;
         */

        //Declare and Initialize at a same time
        int[] age = { 10, 20, 15, 13, 25 };

        //Declare:
        int[] rollno = new int[3] ;
        //Initialize:
        rollno[0] = 10;
        rollno[1] = 20;
        rollno[2] = 15;

        System.out.println("Roll No. is " + rollno[0]);
        System.out.println("Roll No. is " + rollno[1]);
        System.out.println("Roll No. is " + rollno[2]);
        System.out.println("Age is " + age[0]);

        //Print array using for loop
        System.out.println("Print age using for loop:");
        for(int i = 0; i < age.length; i++){
            System.out.println("Age is " + age[i]);
        }

        //Print array in reverse order using for loop
        System.out.println("Print age in reverse order using for loop:");
        int n = age.length;
        for(int i = n-1; i >= 0; i--){
            System.out.println("Age is " + age[i]);

        }

    }
}
