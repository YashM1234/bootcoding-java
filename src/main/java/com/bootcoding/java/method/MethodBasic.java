package com.bootcoding.java.method;
//Basic of methods in java
public class MethodBasic {
    public static void main(String[] args) {
        /*
          A method is a block of code that performs a specific task.
          1. Declaring Method:
             1. Minimum Syntax:
                    returnType methodName(){
                            //Method body
                     }

             2. Complete Syntax:
                    modifier static returnType methodName(parameter1, Parameter2, ...){
                            //Method body
                    }
          2. Calling Method:
             1. Minimum Syntax:
                    methodName();

             2. Complete Syntax:
                    returnType variableName = methodName(argument1, argument2, ...);
         */
    //Method Calling with no argument
        simplePrint();
    }
    //Method Definition/Declaration with no parameter
    public static void simplePrint(){
        System.out.println("This is simple method!");
    }
}
