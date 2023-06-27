package com.bootcoding.java.string;
import java.util.ArrayList;

//String join() method
public class StringJoinMethod {
    public static void main(String[] args) {
        /*
        24. join() method:
            This method returns a new string with the given elements joined with the specified delimiter.
            Syntax:
                String.join(CharSequence delimiter, Iterable elements);
                or
                String.join(CharSequence delimiter, CharSequence... elements);
                Here, String is a class as join() is static method.
            Argument:
                It takes two argument.
                a. delimiter: the delimiter to be joined with the elements.
                b. elements: elements to be joined
            Return value:
                Returns a joined string.
         */

        //WAP to demonstrate join() method
        String strResult1 = String.join("-", "Who", "Am", "I");
        System.out.println(strResult1);

        String str1 = "Who";
        String str2 = "Am";
        String str3 = "I";
        String  strResult2 = String.join(" ", str1, str2, str3);
        System.out.println(strResult2);

        String[] strArr = {"Who", "Am", "I"};
        String strResult3 = String.join("", strArr);
        System.out.println(strResult3);

        ArrayList<String> newObject = new ArrayList<String>();
        newObject.add("I");
        newObject.add("Don't");
        newObject.add("Know.");
        String strResult4 = String.join(" ", newObject);
        System.out.println(strResult4);
    }
}
