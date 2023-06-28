package com.bootcoding.java.string;
//String replace() method
public class StringReplaceMethod {
    public static void main(String[] args) {
        /*
        14. replace() method:
            This method replace each matching occurrence of the old character/text in the string
            with the new character/text.
            Syntax:
                string.replace(char oldChar, char newChar);
                or
                string.replace(charSequence oldText, charSequence newText);
            Argument:
                It takes two argument.
                1. oldChar/oldText: the character/substring to be replaced in the string.
                2. newChar/newText: matching character/substring are replaced with this character/string.
            Return value:
                Returns new string with replaced character/text.
         */

        //WAP to demonstrate replace() method
        String str1 = "Hello, can you hear me.";
        System.out.println(str1.replace("hear", "seen"));

        String str2 = "a to b";
        System.out.println(str2.replace("b", "z"));

        String str3 = "bbbc";
        System.out.println(str3.replace("bb", "a"));

    }
}
