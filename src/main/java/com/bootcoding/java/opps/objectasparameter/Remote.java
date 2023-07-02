package com.bootcoding.java.opps.objectasparameter;
//Create a class Remote having three different type of remotes(color and price change for each type, brand same for all)
public class Remote {
    //State or fields
    String brand;
    String color;
    double price;

    //Behaviour or method
    public void print(){
        System.out.println("Color: " + color);
        System.out.println("Brand: " + brand);
        System.out.println("Price: " + price);
    }

    //Constructor
    public Remote(){

    }
    public Remote(String brand, String color, double price){
        this.brand = brand;
        this.color = color;
        this.price = price;
    }

    public static void main(String[] args) {

        for(int i = 0; i < 500; i++){
            System.out.println(i +1);
            createRemote("White", 95.00);
        }

        for(int i = 0; i < 250; i++){
            System.out.println(i +1);
            createRemote("Blue", 115.00);
        }

        for(int i = 0; i < 250; i++){
            System.out.println(i +1);
            createRemote("Black", 125.00);
        }
    }

    private static void createRemote(String color, double price) {
        Remote allRemote = new Remote();
        allRemote.color = color;
        allRemote.price = price;
        allRemote.brand = "Samsung";
        allRemote.print();
    }
}
