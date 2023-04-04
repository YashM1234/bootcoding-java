package com.bootcoding.java.flowcontrol;
//WAP to calculate factorial of multiple number given by user using CLA
public class FindFactorialOfMultiNumForLoop {
    public static void main(String[] args) {
        for(int i = 0; i < args.length; i++){
            String value = args[i];
            int n = Integer.parseInt(value);

            int m = n;
            int fact = 1;
            for( int j = n; j>1; j--){
                fact = fact * n;
                n--;
            }
            System.out.println("The factorial of " + m + " is " + fact);
        }
    }
}
/* Note:
1. Suppose user input value 4, it stores in the form of string in value variable when then convert into integer and store in variable n i.e n = 4.
2. We copy value of n in m i.e m = 4 as we need unchanged value of factorial number to print  as value of n decreases/changes.
3. We initialize fact = 1.
4. for loop-->  (j = 4; j > 1; j--) --> fact  = fact * n;			  n--;
  Iteration: 1. (j = 4; 4 > 1; j--) --> fact  =   1  * 4; --> fact = 4;   n-- i.e n=3;
  Iteration: 2. (j = 3; 3 > 1; j--) --> fact  =   4  * 3; --> fact = 12;  n-- i.e n=2;
  Iteration: 3. (j = 2; 2 > 1; j--) --> fact  =  12  * 2; --> fact = 24;  n-- i.e n=1;
  Iteration: 2. (j = 1; 1 > 1; j--) --> condition false loop exit.
  we get value fact = 24 as result.
*/