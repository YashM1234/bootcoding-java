package com.bootcoding.java.string;
//String substring() method
public class StringSubstringMethod {
    public static void main(String[] args) {
        /*
         17. substring() method:
            This method extracts a substring from the string.
            Syntax:
                string.substring(int startIndex, endIndex);
            Argument:
                It takes two argument.
                1. startIndex: the beginning index.
                2. endIndex: the ending index.
            Return value:
                Returns a substring from the given string, i.e. begins with startIndex and terminate with endIndex-1.
         */

        //WAP to demonstrate a substring() method
        String str1 = "substring example";

        System.out.println(str1.substring(0));
        System.out.println(str1.substring(0, 9));
        System.out.println(str1.substring(0, 3));
        System.out.println(str1.substring(10, 14));

    }
}
