package com.bootcoding.java.string;
//String equals() method
public class StringEqualsMethod {
    public static void main(String[] args) {
         /*
        3. equals() method:
            This method return ture if two strings are equal else return false (case-sensitive).
            Syntax:
                string.equals(String str); //Here str is string to be compared
            Argument:
                It takes single argument.
            Return value:
                Return boolean statement i.e. true if string are same ,false if string are different, false if str argument is null.
         */

        //WAP to demonstrate equals() method
        String str1 = new String("Same");
        String str2 = new String("Same");
        String str3 = new String("same");
        boolean result ;

        result= str1.equals(str2);
        System.out.println(result);

        result = str1.equals(str3);
        System.out.println(result);

        /*
        Note: In java, if we use == operator to check string is equal or not, it checks the reference
              to string objects are equal or not.
         */

        String str4 = str1; //Here str1 and str4 both referring the same object.

        result = (str1 == str2);
        System.out.println(result);

        result = (str1 == str4);
        System.out.println(result);
    }
}
