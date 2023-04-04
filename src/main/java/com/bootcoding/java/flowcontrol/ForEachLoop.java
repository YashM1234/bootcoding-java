package com.bootcoding.java.flowcontrol;
//for-each loop in java

public class ForEachLoop {
    public static void main(String[] args) {
/*
  for-each loop is used to iterate through elements of arrays and collections (like ArrayList).
  It is also known as the enhanced for loop.
  Syntax:   for(dataType item : array) {
                ...
             }
 */
        int[] arr = {5, 9, 7, -8, 10};
        //print array using for each loop
        for(int newVar: arr){
            System.out.println(newVar);
        }
    }
}
