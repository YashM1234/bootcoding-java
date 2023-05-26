package com.bootcoding.java.string;
//String split() method
public class StringSplitMethod {
    public static void main(String[] args) {
        /*
        13. split() method:
            This method divides the string at the specified regex and returns an array of substrings.
            Syntax:
                string.split(String regex, int limit);
            Argument:
                It takes two argument.
                1. regex: the string is divided at this regex.
                2. limit: controls the number of resulting substrings.
            Return value:
                Returns an array of substring.
         */

        //WAP to demonstrate split() method
        String str1 = "This is string which we split";
        String[] strArr1 = str1.split(" "); // ["This", "is", "string", "which", "we", "split"]
        for(int i = 0; i< strArr1.length; i++) {
            System.out.println(strArr1[i]);
        }
        System.out.println();

        String str2 = "Split:this:string:at:colon";
        String[] strArr2 = str2.split(":");
        for(int i = 0; i < strArr2.length; i++){
            System.out.println(strArr2[i]);
        }
        System.out.println();

        String str3 = "Split+this+string+at+plus+operator";
        String[] strArr3 = str3.split("\\+"); //we need to escape special characters
            for(int i = 0; i < strArr2.length; i++){
                System.out.println(strArr3[i]);
            }
        System.out.println();

        //Apply limit in resulting substring
        String str4 = "We:apply:limit:and:see:what:happened";
        String[] strArr4 = str4.split(":", 3); //["We", "apply", "limit:and:see:what:happened"]
        for(int i = 0; i < strArr4.length; i++){
            System.out.println(strArr4[i]);
        }
        System.out.println();

    }
}
