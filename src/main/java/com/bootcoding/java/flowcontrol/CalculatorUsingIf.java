package com.bootcoding.java.flowcontrol;
//WAP to find Addition(+), Subtraction(-), Multiplication(*), Division(/), Modulus(%) of two number using if statement
public class CalculatorUsingIf {
    public static void main(String[] args) {
        //Take User Input using CLI
        String value = args[0];
        int num1 = Integer.parseInt(value);

        String value1 = args[1];
        char operator = value1.charAt(0);

        String value2 = args[2];
        int num2 = Integer.parseInt(value2);

        int result;

        if(operator == '+'){
            result = num1 + num2;
            System.out.println( num1 +" "+ operator +" "+ num2 +" = " + result);
        }
        if(operator == '-'){
            result = num1 - num2;
            System.out.println( num1 +" "+ operator +" "+ num2 +" = " + result);
        }
        if(operator == '*'){
            result = num1 * num2;
            System.out.println( num1 +" "+ operator +" "+ num2 +" = " + result);
        }
        if(operator == '/'){
            result = num1 / num2;
            System.out.println( num1 +" "+ operator +" "+ num2 +" = " + result);
        }
        if(operator == '%'){
            result = num1 % num2;
            System.out.println( num1 +" "+ operator +" "+ num2 +" = " + result);
        }
    }
}
