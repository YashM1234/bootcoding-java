package com.bootcoding.java.string;

import java.util.ArrayList;

//String valueOf() method
public class StringValueOfMethod {
    public static void main(String[] args) {
        /*
        22. valueOf() method:
            This method returns the string representation of the argument passed.
            Syntax:
                String.valueOf(boolean b);
                String.valueOf(char ch);
                String.valueOf(char[] chArr);
                String.valueOf(double d);
                String.valueOf(float f);
                String.valueOf(int i);
                String.valueOf(long l);
                String.valueOf(Object o);
                Note: Here, String is a Class as valueOf() is a static method
            Argument:
                It takes single argument which we have to convert to a string.
            Return value:
                Returns the string representation of the argument passed.
         */

        //WAP to demonstrate valueOf() method
        //Convert integer to string
        int num1 = 50;
        System.out.println(String.valueOf(num1));

        //Convert character to string
        char ch = 'A';
        System.out.println(String.valueOf(ch));

        //Convert character array to string
        char[] chArr = {'H','E','L','L','O'};
        System.out.println(String.valueOf(chArr));

        //Convert substring of the char array tp string
        /*
        valueOf(char[] chArr, int offset, int length)
        Where,
        chArr - the character array
        offset - initial offset of the subarray
        count - the length of the subarray
         */
        String subStr = String.valueOf(chArr, 1, 4);
        System.out.println(subStr);

        //Convert object to string
        ArrayList<String> newObject = new ArrayList<String>();
        newObject.add("Who");
        newObject.add("Am");
        newObject.add("I");

        String result = String.valueOf(newObject);
        System.out.println(result);

    }
}
