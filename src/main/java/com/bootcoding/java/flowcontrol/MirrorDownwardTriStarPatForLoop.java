package com.bootcoding.java.flowcontrol;
//Pattern Assignment-4
//WAP to print mirrored downward triangle star patter using nested for loop
// * * * * *
//   * * * *
//     * * *
//       * *
//         *
public class MirrorDownwardTriStarPatForLoop {
    public static void main(String[] args) {
        int n = 5;
        for(int i = 1; i <= n; i++){
            for(int j = 1; j <= i; j++){
                System.out.print("  ");
            }
            for(int k = i; k <= n; k++){
                System.out.print("* ");
            }

            System.out.println();
        }
    }
}
