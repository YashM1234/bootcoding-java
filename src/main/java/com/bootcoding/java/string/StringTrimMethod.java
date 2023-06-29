package com.bootcoding.java.string;
//String trim() method
public class StringTrimMethod {
    public static void main(String[] args) {
        /*
        20. trim() method:
            This method removes any whitespaces in the string which are present only at starting and ending.
            Syntax:
                string.trim();
            Argument:
                It doesn't take any argument.
            Return value:
                Returns a string with leading(starting) and trailing(ending) whitespace removed,
                if whitespaces is at middle and not at staring/ending, it returns original string.
         */

        //WAP to demonstrate trim() method
        String str1 = "   See this  ";
        System.out.println(str1.trim());

        String str2 = "  Now     see  this    ";
        System.out.println(str2.trim());

        String str3 = "Also  see   this";
        System.out.println(str3.trim());

        String str4 = "  \nFinally\nsee\nthis\n\n";
        System.out.println(str4.trim());
    }
}
