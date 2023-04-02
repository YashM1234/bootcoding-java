package com.bootcoding.java.flowcontrol;

public class SwitchCase {
    public static void main(String[] args) {
      /*
          Syntax:
                switch(expression){
                    case value1:
                      //Statements
                      break;

                     case value2:
                       //Statements..
                       break;
                        .
                        .
                    default:
                       //default Statements..
                }
       */
        int num1 = 2;
        switch(num1){
            case 1:
                System.out.println("This is case number 1.");
                break;
            case 2:
                System.out.println("This is case number 2.");
                break;
            case 3:
                System.out.println("This is case number 3.");
                break;
            case 4:
                System.out.println("This is case number 4.");
                break;
            default:
                System.out.println("If no case match default execute.");
        }
    }
}
