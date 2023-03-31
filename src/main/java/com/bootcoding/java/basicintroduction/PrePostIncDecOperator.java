package com.bootcoding.java.basicintroduction;

public class PrePostIncDecOperator {
    public static void main(String[] args) {

        //pre-Increment -->First Increment then read
        System.out.println("PRE-INCREMENT BY ONE");
        int preIncrement = 5;
        System.out.println("Initial Value: " + preIncrement );
        int result2 = 10 + ++preIncrement;
        System.out.println("result (10 + ++preIncrement) = " + result2);
        System.out.println();

        //post-Increment -->First read then Increment
        System.out.println("POST-INCREMENT BY ONE");
        int postIncrement = 5;
        System.out.println("Initial Value: " + postIncrement );
        int result1 = 10 + postIncrement++;
        System.out.println("result (10 + postIncrement++) = " + result1);
        System.out.println("Now it increase by 1: " + postIncrement);
        System.out.println();

        //pre-Decrement -->First Decrement then read
        System.out.println("PRE-DECREMENT BY ONE");
        int preDecrement = 5;
        System.out.println("Initial Value: " + preDecrement );
        int result4 = 10 + --preDecrement;
        System.out.println("result (10 + --preDecrement) = " + result4);
        System.out.println();

        //post-Decrement -->First read then Decrement
        System.out.println("POST-DECREMENT BY ONE");
        int postDecrement = 5;
        System.out.println("Initial Value: " + postDecrement );
        int result3 = 10 + postDecrement--;
        System.out.println("result (10 + postDecrement--) = " + result3);
        System.out.println("Now it decrease by 1: " + postDecrement);

    }
}
