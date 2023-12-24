package com.bootcoding.java.multithreading.simpleThreadExample.mythread;
//WAP to check given number is palindrome or not
public class PalindromeThread extends Thread{
    public void run(){
        int[] numbers = {1221, 1123, 22522};
        palindrome(numbers);
    }

    public static void palindrome(int[] numbers){
        //logic to reversing number
        for(int number: numbers) {
            int reverseNum = 0;
            int temp = number;
            while (temp != 0) {
                reverseNum = reverseNum * 10 + temp % 10;
                temp = temp / 10;
            }
            //To check if given number is equal to reverse number or not if true palindrome if false not palindrome.
            if (reverseNum == number) {
                System.out.println(number + " is palindrome number.");
            } else {
                System.out.println(number + " is not a palindrome number.");
            }
        }
    }
}
