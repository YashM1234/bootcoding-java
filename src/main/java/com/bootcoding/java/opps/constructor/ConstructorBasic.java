package com.bootcoding.java.opps.constructor;
//Basic of Constructors in java
public class ConstructorBasic {
    /*
    Constructor: It is similar to a method that is invoked when an object of the class is created.
                 A constructor has the same name as that of the class and does not have any return type.
    Syntax:
            class ClassName{
                    ClassName() {
                        //constructor body
                    }
           }
    Types of constructor: There are three types of constructor-
                          1. No-Arg Constructor
                          2. Parameterized Constructor
                          3. Default Constructor
    Note: 1. If a class doesn't have a constructor, the Java compiler automatically creates a default constructor
          during run-time. The default constructor initializes instance variables with default values.
          2. A constructor cannot be abstract or static or final.
          3. A constructor can be overloaded but can not be overridden.
     */
    //Create instance variables
    int x;
    String str;

    //Create a constructor with no-arg
    public ConstructorBasic(){
                  System.out.println("Constructor Called!");
    }
    //Create a parameterized constructor
    public ConstructorBasic(int x, String str){
        //Here we use this keyword to assign value of local variable to instance variable.
        this.x = x;
        this.str = str;
    }
    public static void main(String[] args) {
        //Creating an object of the ConstructorBasic class (no-arg)
        ConstructorBasic obj1 = new ConstructorBasic();
        //Accessing the data members
        System.out.println("Value of x is " + obj1.x);
        System.out.println("String is " + obj1.str);

        System.out.println();

        //Creating an object of the ConstructorBasic class (with parameter)
        ConstructorBasic obj2 = new ConstructorBasic(3, "\"Types of Constructor\"");
        //Accessing the data members
        System.out.println("Value of x is " + obj2.x);
        System.out.println("String is " + obj2.str);
    }
}
