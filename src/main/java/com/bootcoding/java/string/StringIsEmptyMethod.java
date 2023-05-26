package com.bootcoding.java.string;
//String isEmpty() method
public class StringIsEmptyMethod {
    public static void main(String[] args) {
        /*
        12. isEmpty() method:
            This method checks whether the string is empty or not.
            Syntax:
                string.isEmpty();
            Argument:
                It doesn't take any argument.
            Return value:
                Returns true if string is empty i.e. length is zero, returns false if string is not empty.
         */

        //WAP to demonstrate isEmpty() method
        String str1 = "Non-empty string";
        String str2 = "";
        String str3 = " ";

        System.out.println(str1.isEmpty());
        System.out.println(str2.isEmpty());
        System.out.println(str3.isEmpty());
    }
}
