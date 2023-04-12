package com.bootcoding.java.array;
//Basic of multidimensional array
public class MDArrayBasic {
    public static void main(String[] args) {
        /*
        A multidimensional array is an array of array.
        1. 2-D Array: It is a collection of 1-D Array.
               1.Declaration and Initialisation at same time: int[][] arr = {
                                                                               {0, 1, 2},
                                                                               {3, 4, 5},
                                                                               {6, 7, 8}
                                                                            };
               This is 2-D Array with 3 row and 3 column i.e 3*3 = 9 Elements

               2. First Declare then Initialise:
                    Declaration:
                                int[][] arr = new int[2][3];
                    Initialise:
                            arr[0][0] = 1;
                            arr[0][1] = 2;
                            arr[0][2] = 3;
                            arr[1][0] = 4;
                            arr[1][1] = 5;
                            arr[1][2] = 6;
              This is 2-D Array with 2 row and 3 column i.e 2*3 = 6 Elements
         */
        //WAP to print 2-D Array
        int[][] arr = {
                {2, 4, 6},
                {1, 3, 5},
                {7, 8, 9}
        };

        for(int i = 0; i < arr.length; i++){
            for(int j = 0; j < arr[i].length; j++){
                System.out.println(arr[i][j]);
            }
        }
        /*
        2. 3-D Array: It is a collection of 2-D Array.
               1.Declaration and Initialisation at same time: int[][][] arr1 = {
                                                                               {{0, 1, 2},
                                                                               {3, 4, 5},
                                                                               {6, 7, 8}},

                                                                               {{10, 11, 12},
                                                                               {13, 14, 15},
                                                                               {16, 17, 18}}
                                                                            };
               This is 3-D Array with 2 Array of 3 row and 3 column i.e 2*3*3 = 18 Elements

               2. First Declare then Initialise:
                    Declaration:
                                int[][][] arr1 = new int[2][2][3];
                    Initialise:
                            arr1[0][0][0] = 1;
                            arr1[0][0][1] = 2;
                            arr1[0][0][2] = 3;
                            arr1[0][1][0] = 4;
                            arr1[0][1][1] = 5;
                            arr1[0][1][2] = 6;
                            arr1[1][0][0] = 7;
                            arr1[1][0][1] = 8;
                            arr1[1][0][2] = 9;
                            arr1[1][1][0] = 10;
                            arr1[1][1][1] = 11;
                            arr1[1][1][2] = 12;

              This is 3-D Array with 2 Array of 2 row and 3 column i.e 2*2*3 = 12 Elements
         */
        //WAP to print 3-D Array
        int[][][] arr1 = new int[2][2][3];
        arr1[0][0][0] = 1;
        arr1[0][0][1] = 2;
        arr1[0][0][2] = 3;
        arr1[0][1][0] = 4;
        arr1[0][1][1] = 5;
        arr1[0][1][2] = 6;
        arr1[1][0][0] = 7;
        arr1[1][0][1] = 8;
        arr1[1][0][2] = 9;
        arr1[1][1][0] = 10;
        arr1[1][1][1] = 11;
        arr1[1][1][2] = 12;

        for (int i = 0; i < 2; i++){
            for(int j = 0; j < 2; j++){
                for (int k =0; k < 3; k++){
                    System.out.println("arr1[" + i + "]"+ "[" + j + "]" + "[" + k + "]" +" = " + arr1[i][j][k]);
                }
            }
        }

    }
}
