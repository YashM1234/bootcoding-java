package com.bootcoding.java.method;
//WAP to calculate Addition(+), Subtraction(-), Multiplication(*), Division(/), Modulus(%) of N number given by user
public class CalculatorUsingMethod {
    public static void main(String[] args) {
        int num;
        int[] numArr = new int[args.length];

        for (int i = 0; i < args.length; i++){
            String value = args[i];
            num = Integer.parseInt(value);

            numArr[i] = num;
        }
        add(numArr);
        sub(numArr);
        multi(numArr);
        div(numArr);
        mod(numArr);
    }
    public static void add(int[] numArr){
        int addResult = 0;
        for(int i = 0; i < numArr.length; i++) {
            addResult += numArr[i];
        }
        System.out.println("The addition of numbers you entered is " + addResult);
    }
    public static void sub(int[] numArr){
        int subResult = numArr[0];
        for(int i = 1; i < numArr.length; i++) {
            subResult -= numArr[i];
        }
        System.out.println("The subtraction of numbers you entered is " + subResult);
    }
    public static void multi(int[] numArr){
        int multiResult = 1;
        for(int i = 0; i < numArr.length; i++) {
            multiResult *= numArr[i];
        }
        System.out.println("The multiplication of numbers you entered is " + multiResult);
    }
    public static void div(int[] numArr){
        double divResult = numArr[0];
        for(int i = 1; i < numArr.length; i++) {
            divResult /= numArr[i];
        }
        System.out.println("The division of numbers you entered is " + divResult);
    }
    public static void mod(int[] numArr){
        double modResult = numArr[0];
        for(int i = 1; i < numArr.length; i++) {
            modResult %= numArr[i];
        }
        System.out.println("The modulus of numbers you entered is " + modResult);
    }

}
