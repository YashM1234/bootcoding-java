package com.bootcoding.java.recursion;
//WAP to find the maximum element from an array using recursion
public class MaxElementArrRecursion {
    public static void main(String[] args) {
        //Declare and initialise array
        int[] nums = {2, 4, 3, 1, 5};
        int max = nums[0];
        int index = 0;
        //Method Calling
        int x = maxElement(nums, max, index);
        System.out.println(x);
    }

    //Method Definition
    public static int maxElement(int[] nums,int max, int index ) {
        if(index == nums.length){
            return max;
        }
        if(max < nums[index]){
            max = nums[index];
        }

        //OR

//       max = Math.max(max, nums[index]);
        return maxElement(nums, max, ++index);
    }
}
