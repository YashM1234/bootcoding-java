package com.bootcoding.java.opps.polymorphism.overloading.addition;
//Class containing all logics to perform addition of 2 or 3 Integer/Fractional number
public class PerformAddition {
    //Two Integer number
    int add(int n1, int n2){
        return n1 + n2;
    }
    //Two Fractional number
    double add(double n1, double n2){
        return n1 + n2;
    }
    //One Integer and One Fractional number
    double add(int n1, double n2){
        return n1 + n2;
    }
    //One Fractional and One Integer number
    double add(double n1, int n2){
        return n1 + n2;
    }
    //Three Integer number
    int add(int n1, int n2, int n3){
        return n1 + n2 + n3;
    }
    //Three Fractional number
    double add(double n1, double n2, double n3){
        return n1 + n2 + n3;
    }
    //One Integer and Two Fractional number
    double add(int n1, double n2, double n3){
        return n1 + n2 + n3;
    }
    //One Integer and Two Fractional number
    double add(double n1, int n2, double n3){
        return n1 + n2 + n3;
    }
    //One Integer and Two Fractional number
    double add(double n1, double n2, int n3){
        return n1 + n2 + n3;
    }
    //Two Integer and One Fractional number
    double add(int n1, int n2, double n3){
        return n1 + n2 + n3;
    }
    //Two Integer and One Fractional number
    double add(int n1, double n2, int n3){
        return n1 + n2 + n3;
    }
    //Two Integer and One Fractional number
    double add(double n1, int n2, int n3){
        return n1 + n2 + n3;
    }
}
