package com.bootcoding.java.string;
//String toUpperCase() method
public class StringToUpperCaseMethod {
    public static void main(String[] args) {
        /*
        8. toUpperCase() method:
            This method converts all characters in the string to uppercase.
            Syntax:
                string.toUpperCase();
            Argument:
                It doesn't take any argument.
            Return value:
                Returns string in uppercase.
         */

        //WAP to convert lowercase string to uppercase string
        String str1 = "to uppercase string";
        String str2 = "To UpperCase String";

        String str3 = str1.toUpperCase();
        String str4 = str1.toUpperCase();
        System.out.println(str3);
        System.out.println(str4);
    }
}
