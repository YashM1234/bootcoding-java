package com.bootcoding.java.string;
//String lastIndexOf() method
public class StringLastIndexOfMethod {
    public static void main(String[] args) {
        /*
        19. lastIndexOf() method:
            This method returns the index of the last occurrence of the specified character/substring within the string.
            Syntax:
                string.indexOf(int ch, int toIndex);
                or
                string.indexOf(String str, int toIndex);
            Argument:
                It takes two argument.
                1. ch/str: the character/string whose last index is to be found.
                2. toIndex: stop character/string searching at this index.
            Return value:
                Returns the index of the last occurrence of the specified character/string, if not found it returns -1.
         */

        //WAP to demonstrate lastIndexOf() method
        String str1 = "This is string and we demonstrate lastIndexOf method on this string";
        //searching index of character
        System.out.println(str1.lastIndexOf('i'));
        //searching index of substring
        System.out.println(str1.lastIndexOf("string"));
        //stop searching at index 3
        System.out.println(str1.lastIndexOf('i', 3));
        //stop searching at index 15
        System.out.println(str1.lastIndexOf("string",15));
        //search character which is not present in string
        System.out.println(str1.lastIndexOf('y'));
        //search substring which is not present in string
        System.out.println(str1.lastIndexOf("noWordFound"));
    }
}
