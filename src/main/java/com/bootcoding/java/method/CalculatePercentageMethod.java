package com.bootcoding.java.method;
//WAP to calculate percentage of given marks
public class CalculatePercentageMethod {
    public static void main(String[] args) {
        int subject;
        int[] sub = new int[args.length];//Declaring array of name sub
        //Take input from user via CLA
        for(int i = 0; i < args.length; i++){
            String value = args[i];
            subject = Integer.parseInt(value);
            System.out.println("You enter mark for subject s" + (i+1) + " is " + subject);
            sub[i] = subject; //Initialising the array of name sub with values in subject given by user
        }
        System.out.println();
        //Method Calling
        double result = percentageCalculator(sub);
        System.out.println("The percentage is " + result + "%");
    }
    //Method Definition
    public static double percentageCalculator(int[] sub){
        int sum = 0;
        double percentage = 0.0;
        double n = sub.length;

        for(int i = 0; i < sub.length; i++ ){
            sum = sum + sub[i];
        }

        percentage = sum/n;

        return percentage;
    }
}
