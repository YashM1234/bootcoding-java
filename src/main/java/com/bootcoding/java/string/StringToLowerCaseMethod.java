package com.bootcoding.java.string;
//String toLowerCase() method
public class StringToLowerCaseMethod {
    public static void main(String[] args) {
        /*
        7. toLowerCase() method:
            This method converts all characters in the string to lowercase.
            Syntax:
                string.toLowerCase();
            Argument:
                It doesn't take any argument.
            Return value:
                Returns string in lowercase.
         */

        //WAP to convert uppercase string to lowercase string
        String str1 = "to lowercase string";
        String str2 = "To LowerCase String";

        String str3 = str1.toLowerCase();
        String str4 = str2.toLowerCase();
        System.out.println(str3);
        System.out.println(str4);

        /*

         */
    }
}
