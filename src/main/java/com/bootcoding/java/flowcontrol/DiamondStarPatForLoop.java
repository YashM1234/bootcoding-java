package com.bootcoding.java.flowcontrol;
//Pattern Assignment-9
//WAP to print diagonal star pattern using nested for loop
//     *
//    ***
//   *****
//  *******
// *********
//  *******
//   *****
//    ***
//     *
public class DiamondStarPatForLoop {
    public static void main(String[] args) {
        int n = 5;
        for(int i = 1; i <= n; i++){
            for(int j = i; j <= n; j++){
                System.out.print(" ");
            }
            for(int j = 1; j < i; j++){
                System.out.print("*");
            }
            for(int j = 1; j <= i; j++){
                System.out.print("*");
            }
            System.out.println();
        }
        for(int i = 1; i <= n-1; i++){
            System.out.print(" ");
            for(int j = 1; j <= i; j++){
                System.out.print(" ");
            }
            for(int j = i; j < n-1; j++){
                System.out.print("*");
            }
            for(int j = i; j <= n-1; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
