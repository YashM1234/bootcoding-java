package com.bootcoding.java.opps.polymorphism.overloading.buymobile;

public class MobileApp {
    public static void main(String[] args) {

        Mobile mobilePurchase = new Mobile();
        mobilePurchase.purchase("Realme", 1, true);
        mobilePurchase.print();
        mobilePurchase.purchase(1, "Apple", false);
        mobilePurchase.print();
        mobilePurchase.purchase("Vivo", 2);
        mobilePurchase.print();
    }
}
