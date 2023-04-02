package com.bootcoding.java.flowcontrol;

public class NestedIfElseStatement {
    public static void main(String[] args) {
        //Nested if-else --means--> if-else statement inside if-else statement.
        /* Syntax:
                    //Outer if-else block
                    if(condition){
                        //Inner if-else block
                        if(condition){
                            statements...
                        }
                        else{
                            statements...
                        }
                    }
                    else{
                        //Inner if-else block
                        if(condition){
                            statements...
                        }
                        else{
                            statements...
                        }
                    }
         */
        //WAP to print largest number of 3 integer numbers
        int num1 = 10;
        int num2 = 22;
        int num3 = 20;
        int lNum;

        if(num1 >= num2) {
            if (num1 >= num3) {
               lNum = num1;
            } else {
                lNum = num3;
            }
        }
        else{
            if(num2 >= num3){
                lNum = num2;
            }
            else {
                lNum = num3;
            }
        }
        System.out.println("The largest number is " + lNum);
    }
}
