package com.bootcoding.java.opps.inheritance.banner;

public class BannerApp {
    public static void main(String[] args) {
        //Create an object of hanging banner
        HangingBanner hangingBanner = new HangingBanner();
        hangingBanner.type = "Hanging Banner";
        hangingBanner.material = "Leather";
        hangingBanner.shape = "Rectangle";
        hangingBanner.size = "740 * 120";
        hangingBanner.color = "Blue";
        hangingBanner.content = "Welcome to javaStar!";
        hangingBanner.price = 750.00;

        //Printing banner
        hangingBanner.createBanner();
        System.out.println("Banner type: " + hangingBanner.type);
        System.out.println("Banner material: " + hangingBanner.material);
        System.out.println("Banner shape: " + hangingBanner.shape);
        System.out.println("Banner size: " + hangingBanner.size);
        System.out.println("Banner color: " + hangingBanner.color);
        System.out.println("Banner content: " + hangingBanner.content);
        System.out.println("Banner price: " + hangingBanner.price);
        hangingBanner.bannerCreated();
        System.out.println();


    }
}
