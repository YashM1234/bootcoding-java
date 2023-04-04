package com.bootcoding.java.flowcontrol;
//WAP to print the n terms of a harmonic series and their sum
public class HarmonicSeriesForLoop {
    public static void main(String[] args) {
        String value = args[0];
        int n = Integer.parseInt(value);

        double result = 0.0;
        for(int i = 1; i <= n; i++){
            result = result + (1.0/i);
            System.out.print(1 + "/" + i + " + ");
        }
        System.out.println();
        System.out.println("Sum of Series up to " + n + " terms is " + result);
    }
}
