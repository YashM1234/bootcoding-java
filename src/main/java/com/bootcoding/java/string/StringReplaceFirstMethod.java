package com.bootcoding.java.string;
//String replaceFirst() method
public class StringReplaceFirstMethod {
    public static void main(String[] args) {
        /*
        16. replaceFirst() method:
            This method replaces the first substring that matches the regex of the string with the specified text.
            Syntax:
                string.replaceFirst(String regex, String replacement);
            Argument:
                It takes two argument.
                1. regex: it is a pattern/typical string that is to be replaced.
                2. replacement: a matching substring are replaced with this string.
            Return value:
                Returns new string where first occurrence of the matching substring is replaced with replacement string.
         */
        //WAP to demonstrate replaceFirst() method
        //WAP to demonstrate replaceAll() method
        String str1 = "This123replace2only2first2occurrence.";
        System.out.println(str1.replaceFirst("\\d+", " "));

        String str2 = "This    is   string   separated by only one whitespace   at   first   occurrence";
        System.out.println(str2.replaceFirst(" +", " "));

        String str3 = "In+++this,+we+replace+plus+or+series+of+plus+with+whitespace+at+first+occurrence";
        System.out.println(str3.replaceFirst("\\++", " "));
    }
}
