package com.bootcoding.java.string;
//String charAt() method
public class StringCharAtMethod {
    public static void main(String[] args) {
        /*
        21. charAt() method:
            This method returns the character at the specified index.
            Syntax:
                string.charAt(int index);
            Argument:
                It takes single argument.
            Return value:
                Returns the character at the specified index.
         */

        //WAP to demonstrate charAt() method
        String str1 = "In this, we find character at specified index";
        System.out.println(str1.charAt(0));
        System.out.println(str1.charAt(10));
        //System.out.println(str1.charAt(100)); //throws StringIndexOutOfBoundsException
        //System.out.println(str1.charAt(-1)); //throws StringIndexOutOfBoundsException
    }
}
