package com.bootcoding.java.recursion;
//WAP to find the minimum element from an array using recursion
public class MinElementArrRecursion {
    public static void main(String[] args) {
        //Declare and initialise array
        int[] nums = {2, 4, 3, 10, 5, 1};
        int min = nums[0];
        int index = 0;
        //Method Calling
        int x = minElement(nums, min, index);
        System.out.println(x);
    }

    //Method Definition
    public static int minElement(int[] nums,int min, int index ) {
        if(index == nums.length){
            return min;
        }
        if(min > nums[index]){
            min = nums[index];
        }

        //OR

//        min = Math.min(min, nums[index]);
        return minElement(nums, min, ++index);
    }
}
