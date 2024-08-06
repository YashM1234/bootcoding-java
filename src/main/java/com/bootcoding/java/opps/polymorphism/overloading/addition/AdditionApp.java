package com.bootcoding.java.opps.polymorphism.overloading.addition;
//Class calling overloading method
public class AdditionApp {
    public static void main(String[] args) {
        PerformAddition performAddition = new PerformAddition();
        int iSum = performAddition.add(2,5);
        System.out.println(iSum);

        double fSum = performAddition.add(2.5, 3.7);
        System.out.println(fSum);

        fSum = performAddition.add(5, 5.5);
        System.out.println(fSum);

        iSum = performAddition.add(4, 9, 7);
        System.out.println(iSum);

        fSum = performAddition.add(4.2, 6.8, 9.4);
        System.out.println(fSum);

        fSum = performAddition.add(88, 9.2, 7);
        System.out.println(fSum);

        fSum = performAddition.add(1.55, 60, 99);
        System.out.println(fSum);
    }
}
