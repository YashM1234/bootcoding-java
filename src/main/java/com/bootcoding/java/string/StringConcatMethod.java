package com.bootcoding.java.string;
//String concat() method
public class StringConcatMethod {
    public static void main(String[] args) {
         /*
        2. concat() method:
            This method concatenates/joins two string and return it.
            Syntax:
                string.concat(String str); //Here str is string to be joined
            Argument:
                It takes single argument.
            Return value:
                Return concatenated string.
         */

        //WAP to demonstrate concat() method
        String str1 = "This is ";
        String str2 = "Concatenated string";
        System.out.println(str1.concat(str2));

        //Note: In java, we can also join two or more string or string and non-string value using + operator.
        int nonString = 1;
        System.out.println(str1 + str2 + nonString);
    }
}
