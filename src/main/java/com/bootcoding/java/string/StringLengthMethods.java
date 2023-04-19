package com.bootcoding.java.string;
//String length() method
public class StringLengthMethods {
    public static void main(String[] args) {
        /*
           1. length() method:
                This method returns the number of character in a string.
                Syntax:
                    string.length();
                Argument:
                    Doesn't take any argument.
                Return value:
                    Return length of given string.
         */

        //WAP to demonstrate length() method
        String str1 = "return length";  //whitespace also consider
        String str2 = "newLine\n";      //newLine (\n) consider as single character
        System.out.println("The length of given string1 is " + str1.length());
        System.out.println("The length of given string2 is " + str2.length());
    }
}
