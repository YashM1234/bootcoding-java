package com.bootcoding.java.flowcontrol;
//WAP to print multiplication table of given number
public class MultiplicationTableForLoop {
    public static void main(String[] args) {
        //Take User input via CLA
        String value = args[0];
        int num = Integer.parseInt(value);

        for(int i = 1; i <= 10; i++){
            System.out.println(num + " * " + i + " = " + (num*i));
        }
    }
}
