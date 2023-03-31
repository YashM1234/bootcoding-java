package com.bootcoding.java.basicintroduction;

public class Operators {
    public static void main(String[] args) {
        /* Operators are symbols that perform operations on variables and values.
            Operators in Java can be classified into 5 types:
            1. Arithmetic Operators
            2. Assignment Operators
            3. Relational Operators
            4. Logical Operators
            5. Unary Operators
            6. Bitwise Operators
         */
        //variable declare and initialise
        int num1 = 15;
        int num2 = 5;
        //1. Arithmetic Operators
        //1. Addition(+)
        System.out.println("The addition of " + num1 + " and " + num2 + " is " + (num1+num2));
        //2. Subtraction(-)
        System.out.println("The Subtraction of " + num1 + " and " + num2 + " is " + (num1-num2));
        //3. Multiplication(*)
        System.out.println("The Multiplication of " + num1 + " and " + num2 + " is " + (num1*num2));
        //4. Division(/)
        System.out.println("The Division of " + num1 + " and " + num2 + " is " + (num1/num2));
        //5. Modulus(%)
        System.out.println("The Modulus of " + num1 + " and " + num2 + " is " + (num1%num2));
        System.out.println();

        //2. Assignment Operators
        int newNum; //Variable declaration
        //assign value of num1 to newNum
        newNum = num1;
        System.out.println("The value of newNum is " + newNum);
        // newNum += num2 --means--> newNum = newNum + num2
        newNum += num2;
        System.out.println("The new value of newNum is " + newNum);
        System.out.println();

        //3. Relational Operators
        //1. == operator
        System.out.println(num1 == num2);

        //2. != operator
        System.out.println(num1 != num2);

        //3. > operator
        System.out.println(num1 > num2);

        //4. < operator
        System.out.println(num1 < num2);

        //5. >= operator
        System.out.println(num1 >= num2);

        //6. <= operator
        System.out.println(num1 <= num2);
        System.out.println();

        //4. Logical Operators
        //1. && operator " if both condition true output is true "
        System.out.println(num1 > num2 && num1 < newNum);

        //1. || operator " if any one condition true output is true "
        System.out.println(num1 > num2 || num2 > newNum);

        //1. ! operator " if condition is false output is true "
        System.out.println(!(num1 == num2));
        System.out.println();

        //5. Unary Operators
        //Increment and Decrement operator
        System.out.println("Before increment: num1 = " + num1);
        ++num1;
        System.out.println("After increment: num1 = " + num1);
        System.out.println("Before decrement: num2 = " + num2);
        --num2;
        System.out.println("After decrement: num2 = " + num2);

    }
}
