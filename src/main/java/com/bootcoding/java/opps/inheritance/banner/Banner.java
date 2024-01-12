package com.bootcoding.java.opps.inheritance.banner;

public class Banner {
    //fields
   String type;
   String material;
   String shape;
   String size;
   String color;
   String content;
   double price;

   //Behaviour
    public void createBanner(){
        System.out.println("Start Banner creating!");
    }
    public void bannerCreated(){
        System.out.println("Banner is created!");
    }

    //Constructor
    Banner(){
        System.out.println("let's start!");
    }
}
