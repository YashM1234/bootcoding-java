package com.bootcoding.java.flowcontrol;
//WAP in java to print cube of the number up to given integer
public class FindCubeOfNNumForLoop {
    public static void main(String[] args) {
        String value = args[0];
        int n = Integer.parseInt(value);

        for(int i = 1; i <= n; i++){
            System.out.println(" The cube of " + i + " is " + (i*i*i));
        }
    }
}
