package com.bootcoding.java.recursion;
//WAP to count the number of digit in the given number using recursion
public class CountNumberOfDigitsRecursion {
    public static void main(String[] args) {
        int num = 1239;
        //Method Calling
        int count = countDigit(num);
        System.out.println(count);
    }

    //Method Definition
    public static int countDigit(int num){
        if(num == 0){
            return 0;
        }
        return 1 + countDigit(num/10);
    }
}
