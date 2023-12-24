package com.bootcoding.java.multithreading.simpleThreadExample;
import com.bootcoding.java.multithreading.simpleThreadExample.mythread.FibonacciThread;
import com.bootcoding.java.multithreading.simpleThreadExample.mythread.PalindromeThread;
import com.bootcoding.java.multithreading.simpleThreadExample.mythread.PrimeNumberThread;
//WAP to demonstrate execution of multithreading
public class ThreadExecution {
    public static void main(String[] args) {
        Thread thread1 = new PrimeNumberThread();
        thread1.start();

        Thread thread2 = new FibonacciThread();
        thread2.start();

        Thread thread3 = new PalindromeThread();
        thread3.start();
    }
}
