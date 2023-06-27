package com.bootcoding.java.string;
//String matches() method
public class StringMatchesMethod {
    public static void main(String[] args) {
        /*
        23. matches() method:
            This method checks whether the string matches the given regular expression or not.
            Syntax:
                string.matches(String regex);
            Argument:
                It takes single argument which is regular expression.
            Return value:
                Returns boolean value true/false i.e. if matches true else false
         */

        //WAP to demonstrate matches() method
        String regex1 = "^p.....m$";
        System.out.println("program".matches(regex1));
        System.out.println("programming".matches(regex1));
        System.out.println("Program".matches(regex1));

        String regex2 = "^[0-9]+$";
        System.out.println("135790".matches(regex2));
        System.out.println("026a".matches(regex2));
        System.out.println("12 98".matches(regex2));
    }
}
