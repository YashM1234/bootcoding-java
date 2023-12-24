package com.bootcoding.java.multithreading.mainthread;

public class MainThread {
    public static void main(String[] args) {
        System.out.println("Execution of main thread!");
        System.out.println(Thread.currentThread().getName());
        System.out.println(Thread.currentThread().getPriority());
        System.out.println(Thread.currentThread().getThreadGroup());
    }
}
