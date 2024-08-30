package com.bootcoding.java.opps.polymorphism.overloading.buymobile;

public class Mobile {
    String companyName;
    int quantity;
    boolean caseCover;

    public void purchase(String companyName, int quantity, boolean caseCover){
        this.companyName = companyName;
        this.quantity = quantity;
        this.caseCover = caseCover;
    }
    public void purchase(int quantity, String companyName, boolean caseCover){
        this.quantity = quantity;
        this.companyName = companyName;
        this.caseCover = caseCover;
    }
    public void purchase(String companyName, int quantity){
        this.companyName = companyName;
        this.quantity = quantity;
    }
    public void print(){
        System.out.println("Company Name: " + companyName);
        System.out.println("Quantity: " + quantity);
        System.out.println("With case cover: " + caseCover);
    }
}
