package com.bootcoding.java.method;
/*
WAP and Create a function that takes the number of wins, draws and losses (3 parameters) and calculates the number of points a football team has obtained so far.
- wins get 3 points
- draws get 1 point
- losses get 0 points
 */
public class PointCalMethod {
    public static void main(String[] args) {
        //To take input value for wins
        String value1 = args[0];
        int wins = Integer.parseInt(value1);

        //To take input value for draws
        String value2 = args[1];
        int draws = Integer.parseInt(value2);

        //To take input value for losses
        String value3 = args[2];
        int losses = Integer.parseInt(value3);

        //result hold the return value from method wdlPointCalculator()
        int result = wdlPointCalculator(wins, draws, losses);//Method calling
        System.out.println("The total point of football team is " + result);
    }
    //Method Definition
    public static int wdlPointCalculator(int w, int d, int l){
        int total = w*3 + d*1 + l*0;
        return total;
    }
}
