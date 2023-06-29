package com.bootcoding.java.string;
//String toCharArray() method
public class StringToCharArrayMethod {
    public static void main(String[] args) {
        /*
        25. toCharArray() method:
            This method converts the string to a char array and returns it.
            Syntax:
                string.toCharArray()
            Argument:
                It doesn't take any argument.
            Return value:
                Returns a character array.
         */

        //WAP to demonstrate toCharArray() method
        String str = "It is char array";
        char[] chArr = str.toCharArray();
        System.out.println(chArr);
    }
}
