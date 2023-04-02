package com.bootcoding.java.flowcontrol;
//WAP to print sum of all number given by user using for loop
public class SumOfAllNumForLoop {
    public static void main(String[] args) {
        int sum = 0;
        for(int i = 0; i < args.length; i++){ //args.length take length of array(args)
            String uis = args[i];
            int ui = Integer.parseInt(uis);
            sum = sum + ui;
        }
        System.out.println("Sum of all number is " + sum);
    }
}
