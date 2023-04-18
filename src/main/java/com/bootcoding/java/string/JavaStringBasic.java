package com.bootcoding.java.string;
//Basic of String in java
public class JavaStringBasic {
    public static void main(String[] args) {
        /*
        String is a sequence of characters, in java whatever is in double quotes is considered as a string.
        In java String are not primitive type instead, all strings are object of a predefined class name String.
        And all string variable are instance of the String class.
        There are two ways to create a string in java:
        1. String literal:
                    String variableName = "string write here";
        2. Using new keyword:
                    String variableName = new String("string write here");
         */

        //WAP to create string using this two ways and print it
        //Creating string using String literal method
        String str = "This string is created using String literal.";
        System.out.println(str);

        //Creating string using new keyword
        String newStr = new String("This string is created using new keyword.");
        System.out.println(newStr);

        /*
         String literal vs Using new keyword:
                In java, the JVM maintains a string pool to store all of its strings inside the memory.
                The string pool helps in reusing the strings.

                In String literal, We directly provide the value of the string.Hence, compiler first check
                the string pool to see if the string already exists, if the string already exist new string
                is not created instead, new reference points to already existing string and
                if string doesn't exist the new string is created.

                While when we create string using new keyword, the value of the string is not directly provided.
                Hence, a new string is created even though same string is already exist in the memory pool.
         */



    }
}
