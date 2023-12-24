package com.bootcoding.java.multithreading.simpleThreadExample.mythread;
import java.util.ArrayList;
import java.util.List;
//WAP to print Fibonacci series
public class FibonacciThread extends  Thread{
    public void run(){
        int fibOf = 5;
        //Method Calling
        List<Integer> fibSer = fibonacciSeries(fibOf);
        System.out.println("The Fibonacci series of " + fibOf + " is " + fibSer);
    }
    public static List<Integer> fibonacciSeries(int fibOf){
        List<Integer> list = new ArrayList<>();
        int series = 1;
        for(int i = 1; i <= fibOf; i++){
            series = series * i;
            list.add(series);
        }
        return list;
    }
}
