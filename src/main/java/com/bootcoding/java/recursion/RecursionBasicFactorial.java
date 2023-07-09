package com.bootcoding.java.recursion;
/*
Recursion: A method that calls itself is known as a recursive method. And, this process is known as recursion.
Recursion uses stack (LIFO) when we are calling recursive method, it holds other statements in a stack.
 */
public class RecursionBasicFactorial {
    public static void main(String[] args) {
        int n = 5;
        //Method Calling
        int result = factorial(n);// Normal Calling
        System.out.println(result);
    }

    //Method Definition
    public static int factorial(int n){
        if(n == 0){
            return 1;
        }
        return n * factorial(n-1);//Recursive Calling
    }
}
