package com.bootcoding.java.string;
//String equalsIgnoreCase() method
public class StringEqualsIgnoreCaseMethod {
    public static void main(String[] args) {
        /*
        4. equalsIgnoreCase() method:
             This method return ture if two strings are equal else return false (non case-sensitive).
            Syntax:
                string.equals(String str); //Here str is string to be compared
            Argument:
                It takes single argument.
            Return value:
                Return boolean statement i.e. true if string are same ,false if string are different, false if str argument is null.
         */

        //WAP to demonstrate equalsIgnoreCase() method
        String str1 = new String("Same");
        String str2 = new String("Same");
        String str3 = new String("same");
        String str4 = new String("notSame");
        boolean result ;

        result= str1.equalsIgnoreCase(str2);
        System.out.println(result);

        result = str1.equalsIgnoreCase(str3);
        System.out.println(result);

        result = str1.equalsIgnoreCase(str4);
        System.out.println(result);

    }
}
