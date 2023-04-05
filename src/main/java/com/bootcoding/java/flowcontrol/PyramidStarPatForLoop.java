package com.bootcoding.java.flowcontrol;
//Pattern Assignment-8
//WAP to print pyramid star pattern using nested for loop
//    *
//   ***
//  *****
// *******
public class PyramidStarPatForLoop {
    public static void main(String[] args) {
        int n = 4;
        for(int i = 1; i <= n; i++){
            for(int j = i; j <= n; j++){
                System.out.print(" ");
            }
            for(int k =1; k < i; k++){
                System.out.print("*");
            }
            for(int k = 1; k <= i; k++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
