package com.bootcoding.java.flowcontrol;
//Pattern Assignment-3
//WAP to print mirrored right triangle star pattern using nested for loop
//        *
//      * *
//    * * *
//  * * * *
//* * * * *
public class MirrorRightTriStarPatForLoop {
    public static void main(String[] args) {
        int n = 5;
        for(int i = 1; i <= n; i++){
            for(int j = i; j <= n; j++){
                System.out.print("  ");
            }
            for(int k = 1; k <= i; k++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
