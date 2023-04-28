package com.bootcoding.java.string;
//String compareTo() method
public class StringCompareToMethod {
    public static void main(String[] args) {
        /*
        5. compareTo() method:
            This method compares two string on the basis of its unicode value i.e. in dictionary order (case-sensitive).
            Syntax:
                string.compareTo(String str); //Here str is string to be compared
            Argument:
                It takes single argument.
            Return value:
                Return 0 if strings are equal(case-sensitive), return -ve value if string comes before str argument,
                return +ve value if string comes after the str argument in dictionary order.

         */

        //WAP to demonstrate compareTo() method    //unicode value for characters
        String str1 = new String("Apple"); //[65, 112, 112, 108, 101]
        String str2 = new String("Apple"); //[65, 112, 112, 108, 101]
        String str3 = new String("apple"); //[97, 112, 112, 108, 101]
        String str4 = new String("Ball");  //[66, 97, 108, 108]
        int result ;

        result= str1.compareTo(str2);
        System.out.println(result);

        result = str1.compareTo(str3);
        System.out.println(result);

        result = str1.compareTo(str4);
        System.out.println(result);

        result = str4.compareTo(str1);
        System.out.println(result);
    }
}
