package com.bootcoding.java.string;
//String intern() method
public class StringInternMethod {
    public static void main(String[] args) {
        /*
        26. intern() method:
            This method returns a canonical representation of the string object.
            Syntax:
                string.intern()
            Argument:
                It doesn't take any argument.
            Return value:
                Returns a canonical representation of the string.
            Note: The String interning ensures that all strings having the same contents use the same memory.
         */

        //WAP to demonstrate intern() method
        String str1 = new String("same");
        String str2 = new String("same");
        System.out.println(str1 == str2);
      //Note: Here, the result is false, both str1 and str2 have the same content. However,
      //      they are not equal because they don't share the same memory.
      //      So we use intern() method, so that same memory is used for string having the same content.
        str1 = str1.intern();
        str2 = str2.intern();
        System.out.println(str1 == str2);

    }
}
