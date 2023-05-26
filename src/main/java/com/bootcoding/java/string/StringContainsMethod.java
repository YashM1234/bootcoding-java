package com.bootcoding.java.string;
//String contains() method
public class StringContainsMethod {
    public static void main(String[] args) {
        /*
        11. contains() method:
            This method checks whether the specified string is present in the string or not.
            Syntax:
                string.contains(CharSequence ch); //Here ch is a sequence of character which we have to check.
            Argument:
                It takes single argument i.e. ch
            Return value:
                Returns true if string contains the specified character,
                returns false if string doesn't contain the specified character.
         */

        //WAP to demonstrate contains() method
        String str = "This is string";
        boolean result;

        result = str.contains("is");
        System.out.println(result);

        result = str.contains("h");
        System.out.println(result);

        result = str.contains("absence");
        System.out.println(result);

        result = str.contains("");
        System.out.println(result);
    }
}
