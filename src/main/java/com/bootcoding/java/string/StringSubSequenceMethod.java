package com.bootcoding.java.string;
//String subSequence() method
public class StringSubSequenceMethod {
    public static void main(String[] args) {
        /*
         27. subSequence() method:
            This method returns a character sequence (a subsequence) from the string.
            Syntax:
                string.subSequence(int startIndex, endIndex);
            Argument:
                It takes two argument.
                1. startIndex: the beginning index.
                2. endIndex: the ending index.
            Return value:
                Returns a charSequence from the given string, i.e. begins with startIndex and terminate with endIndex-1.
         */

        //WAP to demonstrate a subSequence() method
        String str1 = "subSequence example";

        System.out.println(str1.subSequence(0, 11));
        System.out.println(str1.subSequence(0, 3));
        System.out.println(str1.subSequence(12, 16));
    }
}
