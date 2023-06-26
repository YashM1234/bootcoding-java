package com.bootcoding.java.string;
//String indexOf() method
public class StringIndexOfMethod {
    public static void main(String[] args) {
        /*
        18. indexOf() method:
            This method returns the index of the first occurrence of the specified character/substring within the string.
            Syntax:
                string.indexOf(int ch, int fromIndex);
                or
                string.indexOf(String str, int fromIndex);
            Argument:
                It takes two argument.
                1. ch/str: the character/string whose starting index is to be found.
                2. fromIndex: start character/string searching from this index.
            Return value:
                Returns the index of the first occurrence of the specified character/string, if not found it returns -1.
         */

        //WAP to demonstrate indexOf() method
        String str1 = "This is string and we demonstrate indexOf method on this string";
        //searching index of character
        System.out.println(str1.indexOf('i'));
        //searching index of substring
        System.out.println(str1.indexOf("string"));
        //Start searching from index 3
        System.out.println(str1.indexOf('i', 3));
        //Start searching from index 9
        System.out.println(str1.indexOf("string",9));
        //search character which is not present in string
        System.out.println(str1.indexOf('y'));
        //search substring which is not present in string
        System.out.println(str1.indexOf("noWordFound"));

    }
}
