package com.bootcoding.java.multithreading.simpleThreadExample.mythread;
import java.util.ArrayList;
import java.util.List;
//WAP to print prime number
public class PrimeNumberThread extends Thread{
    public void run(){
        List<Integer> primeNumber = findPrimeNumber(1, 100);
        for(int number: primeNumber){
            System.out.println("This is prime number: " + number);
        }
    }
    public static List<Integer> findPrimeNumber(int start, int end){
        List<Integer> list = new ArrayList<>();
        for(int i = start; i <= end; i++){
            if(checkPrime(i)){
                list.add(i);
            }
        }
        return list;
    }
    public static boolean checkPrime(int num){
        if(num == 0 || num == 1){
            return false;
        }
        if(num == 2 || num == 3){
            return true;
        }
        if(num % 2 == 0 || num % 3 == 0){
            return false;
        }
        for(int d = 5; d <= Math.sqrt(num); d = d + 6){
            if(num % d == 0 || num % (d + 2) == 0){
                return false;
            }
        }
        return true;
    }
}
