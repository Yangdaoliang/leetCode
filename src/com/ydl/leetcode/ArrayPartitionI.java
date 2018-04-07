package com.ydl.leetcode;

import java.util.Arrays;

public class ArrayPartitionI {

    public static void main(String[] args){
        int[] test = {7,3,1,0,0,6};
        int res = arrayPairSum(test);
        System.out.println(res);
    }

    public static int arrayPairSum(int[] nums) {
        if(nums == null || nums.length == 0){
            return 0;
        }
        Arrays.sort(nums);
        int count = 0;
        int length = nums.length/2;
        int j = 0;
        for (int i = 0;i < length;i++){
            j = 2*i;
            count += nums[j];
        }
        return count;
    }
}
