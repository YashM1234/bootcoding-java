package com.bootcoding.java.string;
//String hashCode() method
public class StringHashCodeMethod {
    public static void main(String[] args) {
        /*
         28. hashCode() method:
            This method returns a hash code(object's memory address) for the string.
            Syntax:
                string.hashCode();
            Argument:
                It doesn't take any argument.
            Return value:
                Returns a hashcode, which is an int value, of the string.
         */

        //WAP to demonstrate a hashCode() method
        String str1 = "hashCode";
        String str2 = "hashCode example";
        String str3 = "";

        System.out.println(str1.hashCode());
        System.out.println(str2.hashCode());
        System.out.println(str3.hashCode());
      //Note: two equal string has same hash code.
    }
}
