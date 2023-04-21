package com.bootcoding.java.string;
//String endsWith() method
public class StringEndsWithMethod {
    public static void main(String[] args) {
        /*
        10. endsWith() method:
            This method checks whether the string ends with the specified string or not.
            Syntax:
                string.endsWith(String str); //Here str is a string which we have to check with.
            Argument:
                It takes single argument i.e. str
            Return value:
                Returns true if string ends with given str, returns false if string doesn't end with given str.
         */

        //WAP to demonstrate endsWith() method
        String str = "This is string which we have to check";
        System.out.println(str.endsWith("check"));
        System.out.println(str.endsWith("ech"));
        System.out.println(str.endsWith("This"));
        System.out.println(str.endsWith("is"));
    }
}
