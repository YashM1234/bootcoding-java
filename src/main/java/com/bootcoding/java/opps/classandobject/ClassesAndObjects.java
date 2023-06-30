package com.bootcoding.java.opps.classandobject;
//Class and Object in java
public class ClassesAndObjects {
    public static void main(String[] args) {
        /*
          Object: It is any entity that has a state and behavior.
          CLass: A class is a blueprint for an object.
                 We can create many objects from a class.
                 Class Syntax:
                    accessModifier class ClassName{
                                       //members of the class i.e. fields/variables, methods
                                  }
          Object: It is any entity that has a state and behavior, it is called instance of a class.
                  Syntax to create an object for class:
                            className objectName = new className();

        Access members of a class:
                To access any member of class we use objectName along with (.) operator followed by a member to access.
                Syntax:
                     objectName.variableName;
                     objectName.methodName;
         */

        //WAP to access variable value and method using object concept

        //Creating object of class VarMethodPrinter
        VarMethodPrinter objPrint = new VarMethodPrinter();
        //Accessing method printInteger()
        objPrint.printInteger();
        //Accessing variable j
        System.out.println("Value of j is " + objPrint.j);

    }
}
//Creating class
class VarMethodPrinter {
    //Declare and initialise variable
    int i = 10;
    int j = 20;
    //Declare method
    void printInteger() {
        System.out.println("Value of i is " + i);
    }
}