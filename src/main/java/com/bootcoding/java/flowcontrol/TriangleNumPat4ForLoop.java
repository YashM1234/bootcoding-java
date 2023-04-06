package com.bootcoding.java.flowcontrol;
//Pattern Assignment-11
//WAP to print given number pattern using nested for loop
//    1
//   2 3
//  4 5 6
// 7 8 9 10
public class TriangleNumPat4ForLoop {
    public static void main(String[] args) {
        int n = 4;
        int k = 1;
        for(int i = 1; i <= n; i++){
            for(int j = i; j <= n; j++){
                System.out.print(" ");
            }
            for(int j = 1; j <= i; j++){
                System.out.print(k + " ");
                k++;
            }
            System.out.println();
        }

    }
}
