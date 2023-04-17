package com.bootcoding.java.method;
//Method overloading in java
public class MethodOverloading {
    public static void main(String[] args) {
        /*
        Method overloading means two or more methods may have the same name
        if they differ in parameters(i.e. parameters can differ by numbers or data type or both)
        Note that method overloading is not associated with the return type of method.
        Example: void overloadMethod(int num1){
                    System.out.println("Method with one argument: " + num1);
                    }
                 void overloadMethod(int num1, int num2){
                    System.out.println("Method with two argument: " + num1 + " and " + num2);
                    }
                 void overloadMethod(double num1, int num2){
                    System.out.println("Method with two argument: " + num1 + " and " + num2);
                    }

        This all three method have the same name " overloadMethod() " but the number of parameter passed is different
        in method1 and method2, in method2 and method3 number of parameter passed is same
        but data type of parameters are different.
         */
        //WAP for addition of two numbers and three numbers use method overloading concept
        sum(5, 10); //Calling method with 2 argument of type int
        sum(8, 2, 10);//Calling method with 3 argument of type int
        sum(8.9, 5, 20);//Calling method with 3 argument, 1 of type double and 2 of type int
    }
    //Method declaring with 2 parameter of type int
    public static void sum(int num1, int num2){
        System.out.println(num1 + " + " + num2 + " = " + (num1 + num2));
    }
    //overloading sum() method with 3 parameter of type int
    public static void sum(int num1, int num2, int num3){
        System.out.println(num1 + " + " + num2 + " + " + num3 + " = " + (num1 + num2 + num3));
    }
    //overloading sum() with 1 parameter of type double and 2 parameter of type int
    public static void sum(double num1, int num2, int num3){
        System.out.println(num1 + " + " + num2 + " + " + num3 + " = " + (num1 + num2 + num3));
    }

}
