package com.bootcoding.java.basicintroduction;
//Ternary Operator in java
public class TernaryOperator {
    public static void main(String[] args) {
        /*
        The ternary operator (conditional operator) is shorthand for the if-then-else statement.
        Syntax:
                variable = Condition ? ifTrue Statement : ifFalse Statement ;
         */
        //WAP to print leap year or not based on user input days in february month(user input only 28 or 29)
        String value = args[0];
        int febDay = Integer.parseInt(value);

        String result;
        //use ternary operator
        result = (febDay == 29) ? "Leap year" : "Not a leap year" ;
        System.out.println(result);
    }
}
