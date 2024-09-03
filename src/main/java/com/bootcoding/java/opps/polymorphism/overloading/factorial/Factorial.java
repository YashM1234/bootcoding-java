package com.bootcoding.java.opps.polymorphism.overloading.factorial;
//Class containing all logic to get factorial of n numbers "Method Overloading
public class Factorial {
    //get factorial of single number
    public int getFactorial(int num){
        int fact = 1;
        while(num > 0){
            fact = fact * num;
            num--;
        }
        return fact;
    }

    //get factorial of n number
    public int[] getFactorial(int[] nums){
        int[] factArr = new int[nums.length];
        for(int i = 0; i < nums.length; i++){
            factArr[i] = getFactorial(nums[i]);
        }
        return factArr;
    }

    //get factorial from starting number to end number
    public int[] getFactorial(int startNum, int endNum){
        int[] factArr = new int[(endNum-startNum)+1];
        for(int i = startNum; i <= endNum; i++){
            factArr[i-startNum] = getFactorial(i);
        }
        return factArr;
    }
}
