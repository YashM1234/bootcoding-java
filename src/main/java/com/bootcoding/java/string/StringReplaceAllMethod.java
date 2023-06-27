package com.bootcoding.java.string;
//String replaceAll() method
public class StringReplaceAllMethod {
    public static void main(String[] args) {
        /*
        15. replaceAll() method:
            This method replaces each substring that matches the regex of the string with the specified text.
            Syntax:
                string.replaceAll(String regex, String replacement);
            Argument:
                It takes two argument.
                1. regex: it is a pattern/typical string that is to be replaced.
                2. replacement: a matching substring are replaced with this string.
            Return value:
                Returns new string where each occurrence of the matching substring is replaced with replacement string.
       */

        //WAP to demonstrate replaceAll() method
        String str1 = "This123is789replaced5542string";
        System.out.println(str1.replaceAll("\\d+", " "));

        String str2 = "This is   string    separated by only     one whitespace";
        System.out.println(str2.replaceAll(" +", " "));

        String str3 = "In+this,++we+replace+plus+or++++series+of+plus with whitespace";
        System.out.println(str3.replaceAll("\\++", " "));
    }
}
