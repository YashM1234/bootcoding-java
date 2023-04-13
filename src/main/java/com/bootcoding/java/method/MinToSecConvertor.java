package com.bootcoding.java.method;
//WAP to convert minute into second using method
public class MinToSecConvertor {
    public static void main(String[] args) {
        //To take input value for base
        String value1 = args[0];
        int minute = Integer.parseInt(value1);
        //result hold the return value from method minToSec().
        int result = minToSec(minute);//Method calling

        System.out.println(minute + " minute = " + result + " second");
    }
    //Method Definition
    public static int minToSec(int m){
        int sec;
        sec = m*60;
        return sec;
    }
}
