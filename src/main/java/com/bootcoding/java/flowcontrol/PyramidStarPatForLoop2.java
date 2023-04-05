package com.bootcoding.java.flowcontrol;
//Pattern Assignment-10
//WAP to print given pyramid star pattern using nested for loop
//   *
//  * *
// * * *
//* * * *
public class PyramidStarPatForLoop2 {
    public static void main(String[] args) {
        int n = 4;
        for(int i = 1; i <= n; i++){
            for(int j = i; j <= n; j++){
                System.out.print(" ");
            }
            for(int j = 1; j <= i; j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
