package com.bootcoding.java.multithreading.simplemultithread.thread;

public class PrintNumber extends Thread{
    public void run(){
        for(int i = 0; i < 100; i++){
            System.out.println("Printing Numbers!");
        }
    }
}
