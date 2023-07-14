package com.bootcoding.java.recursion;
//WAP to print the fibonacci series of given number using recursion
public class FibonacciSeriesRecursion {
    public static void main(String[] args) {
        int fibOf = 13;
        //Method Calling
        int result = fibonacciSeries(fibOf);
        System.out.println(result);
    }
    //Method Definition
    public static int fibonacciSeries(int fibOf){
        if(fibOf == 0) {
            return 0;
        }
        if(fibOf == 1) {
            return 1;
        }
        return fibonacciSeries(fibOf-1) + fibonacciSeries(fibOf-2);
    }
}
