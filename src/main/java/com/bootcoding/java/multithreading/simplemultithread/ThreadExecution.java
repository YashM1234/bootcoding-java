package com.bootcoding.java.multithreading.simplemultithread;

import com.bootcoding.java.multithreading.simplemultithread.thread.PrintAlphabet;
import com.bootcoding.java.multithreading.simplemultithread.thread.PrintNumber;
import com.bootcoding.java.multithreading.simplemultithread.thread.PrintSpecialSymbol;

public class ThreadExecution {
    public static void main(String[] args) {
        Thread thread1 = new PrintNumber();
        thread1.start();

        Thread thread2 = new PrintAlphabet();
        thread2.start();

        Thread thread3 = new PrintSpecialSymbol();
        thread3.start();
    }
}
