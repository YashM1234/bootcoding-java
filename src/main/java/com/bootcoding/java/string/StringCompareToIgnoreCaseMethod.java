package com.bootcoding.java.string;
//String compareToIgnoreCase() method
public class StringCompareToIgnoreCaseMethod {
    public static void main(String[] args) {
        /*
        6. compareToIgnoreCase() method:
            This method compares two string on the basis of its unicode value i.e. in dictionary order (non case-sensitive).
            Syntax:
                string.compareToIgnoreCase(String str); //Here str is string to be compared
            Argument:
                It takes single argument.
            Return value:
                Return 0 if strings are equal(ignore case-sensitive), return -ve value if string comes before str argument,
                return +ve value if string comes after the str argument in dictionary order.
         */

        //WAP to demonstrate compareToIgnoreCase() method    //unicode value for characters
        String str1 = new String("Apple");            //[65, 112, 112, 108, 101]
        String str2 = new String("Apple");            //[65, 112, 112, 108, 101]
        String str3 = new String("apple");            //[97, 112, 112, 108, 101]
        String str4 = new String("Ball");             //[66, 97, 108, 108]
        int result ;

        result= str1.compareToIgnoreCase(str2);
        System.out.println(result);

        result = str1.compareToIgnoreCase(str3);
        System.out.println(result);

        result = str1.compareToIgnoreCase(str4);
        System.out.println(result);

        result = str4.compareToIgnoreCase(str1);
        System.out.println(result);
    }
}
