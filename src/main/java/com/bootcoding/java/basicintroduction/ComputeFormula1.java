package com.bootcoding.java.basicintroduction;
// Write a Java program to compute a specified formula.
//Specified Formula : 4.0 * (1 - (1.0/3) + (1.0/5) - (1.0/7) + (1.0/9) - (1.0/11))
public class ComputeFormula1 {
    public static void main(String[] args) {
        double i = 1.0;
        double a = 4.0;
        int b = 3;
        int c = 5;
        int d = 7;
        int e = 9;
        int f = 11;
        double result = (a * (1 - (i/b) + (i/c) - (i/d) + (i/e) - (i/f)));
        System.out.println("The result is "+ result);
    }
}
