package com.bootcoding.java.flowcontrol;
//WAP to check wither the numbers given by the user is palindrome or not
public class PalindromeNumCheckerWhileLoop {
    public static void main(String[] args) {
        //Take input from user
        for(int i = 0; i < args.length; i++){
            String value = args[i];
            int ui = Integer.parseInt(value);
            //As value of ui change after while loop hence we copy it to temp variable.
            int temp = ui;
            //Variable r is used to store reverse number
            int r = 0;
            //if input number is negative it is not a palindrome number
            if(ui < 0) {
                System.out.println(temp + " is not a palindrome number.");
            }
            //if input number is zero or positive
            else {
                //logic to reversing number
                while (ui != 0) {
                    r = r * 10 + ui % 10;
                    ui = ui / 10;
                }
                //To check if given number is equal to reverse number or not if true palindrome if false not palindrome.
                if (r == temp) {
                    System.out.println(temp + " is palindrome number.");
                } else {
                    System.out.println(temp + " is not a palindrome number.");
                }
            }
        }
    }
}
/* Logic:
let ui = 1234 --> user input
let r = 0 --> In this we store reverse ui number

i.e ui = 1234, r = 0
As value of ui change after every iteration and become 0 hence we copy value of ui in temp variable i.e temp = 1234.

Formula:
r = r*10 + ui%10;
ui = ui/10;

Iteration-1
 r = 0*10 + 1234%10 = 0 + 4 = 4
 ui = 123

Iteration-2
 r = 4*10 + 123%10 = 40 + 3 = 43
 ui = 12

Iteration-3
 r = 43*10 + 12%10 = 430 + 2 = 432
 ui = 1

Iteration-4
 r = 432*10 + 1%10 = 4320 + 1 = 4321
 ui = 0

Now value of r = 4321 and temp = 1234

We check if r == temp if true it is palindrome number if false it is not palindrome number.

Example of palindrome number is 1221, 58685, 7557, 656
*/
