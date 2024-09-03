package com.bootcoding.java.opps.polymorphism.overloading.factorial;
import java.util.Arrays;
//Class which supply user input to factorial class
public class FactorialApp {
    public static void main(String[] args) {
        Factorial factorial = new Factorial();
        //For single number
        int fact = factorial.getFactorial(5);
        System.out.println("Factorial of given number is: " + fact);
        System.out.println();

        //For multiple number i.e for array
        int[] nums = {2, 3, 4, 5, 6};
        int[] factArr = factorial.getFactorial(nums);
        System.out.println("Factorial array of given array is: " + Arrays.toString(factArr));
        System.out.println();

        //From start number to end number
        int[] factSE = factorial.getFactorial(4, 6);
        System.out.println("Factorial from start number to end number is: " + Arrays.toString(factSE));
        System.out.println();
    }
}
