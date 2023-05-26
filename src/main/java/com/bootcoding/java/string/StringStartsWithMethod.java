package com.bootcoding.java.string;
//String startsWith() method
public class StringStartsWithMethod {
    public static void main(String[] args) {
        /*
        9. startsWith() method:
            This method checks whether the string begins with the specified string or not.
            Syntax:
                string.startsWith(String str, int offset); //Here str is a string which we have to check with
                                                           //and offset is index from which we have to check.
            Argument:
                It takes two argument i.e. str and offset.
            Return value:
                Returns true if string begins with given str, returns false if string doesn't begin with given str.
         */

        //WAP to demonstrate startsWith() method
        String str = "This is string which we have to check";
        System.out.println(str.startsWith("This"));
        System.out.println(str.startsWith("Th"));
        System.out.println(str.startsWith("check"));
        //with offset argument
        System.out.println(str.startsWith("string", 8));
        System.out.println(str.startsWith("string", 6));

    }
}
