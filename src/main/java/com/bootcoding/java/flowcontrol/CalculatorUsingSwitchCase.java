package com.bootcoding.java.flowcontrol;
//WAP to find Addition(+), Subtraction(-), Multiplication(*), Division(/), Modulus(%) of two number using switch case statement
public class CalculatorUsingSwitchCase {
    public static void main(String[] args) {
        //Take User Input using CLI
        String value = args[0];
        int num1 = Integer.parseInt(value);

        String value1 = args[1];
        char operator = value1.charAt(0);

        String value2 = args[2];
        int num2 = Integer.parseInt(value2);

        int result;

        switch (operator){
            case '+':
                result = num1 + num2;
                System.out.println( num1 +" "+ operator +" "+ num2 +" = " + result);
                break;
            case '-':
                result = num1 - num2;
                System.out.println( num1 +" "+ operator +" "+ num2 +" = " + result);
                break;
            case '*':
                result = num1 * num2;
                System.out.println( num1 +" "+ operator +" "+ num2 +" = " + result);
                break;
            case '/':
                result = num1 / num2;
                System.out.println( num1 +" "+ operator +" "+ num2 +" = " + result);
                break;
            case '%':
                result = num1 % num2;
                System.out.println( num1 +" "+ operator +" "+ num2 +" = " + result);
                break;
            default:
                System.out.println("Please provide correct input!");
        }
    }
}
